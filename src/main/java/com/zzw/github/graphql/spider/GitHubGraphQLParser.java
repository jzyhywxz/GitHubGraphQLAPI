package com.zzw.github.graphql.spider;

import com.zzw.github.graphql.schema.annotations.*;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Xpath2Selector;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zzw on 2018/6/9.
 */
public class GitHubGraphQLParser {
    public static final String PACKAGE_PREFIX = "com.zzw.github.graphql.schema.";
    public static final String SRCFILE_PREFIX = "com/zzw/github/graphql/schema/";
    private static final String CONTENT_PREFIX = "//div[@class='content col-md-8']";

    private String mUrlPrefix;
    private List<String> mLinks;
    private String mLink;
    private String mPath;
    private String mCode;

    public GitHubGraphQLParser(String urlPrefix) {
        this.mUrlPrefix = urlPrefix;
    }

    public List<String> getLinks() { return mLinks; }
    public String getLink() { return mLink; }
    public String getPath() { return mPath; }
    public String getCode() { return mCode; }

    public void parse(String url, String rawHtml) throws Exception {
        if ((url == null) || (rawHtml == null)) {
            return;
        }

        mLinks = null;
        mLink = null;
        mPath = null;
        mCode = null;

        Html html = new Html(rawHtml);

        // extract links
        extractLinks(html);
        mLink = url;

        String category = url.substring(mUrlPrefix.length());
        if (category.matches("object/.+")) {
            extractObject(html, "objects");
        } else if (category.matches("query")) {
            extractObject(html, "query");
        } else if (category.matches("interface/.+")) {
            extractInterface(html);
        } else if (category.matches("enum/.+")) {
            extractEnum(html);
        } else if (category.matches("union/.+")) {
            extractUnion(html);
        } else if (category.matches("scalar/.+")) {
            extractScalar(html);
        } else if (category.matches("input_object/.+")) {
            extractInputObject(html);
        } else if (category.matches("mutation/.+")) {
            extractMutation(html);
        }
    }

    private void extractLinks(Html html) throws Exception {
        List<String> links = html.links().all();
        if ((links == null) || (links.isEmpty())) {
            return;
        }

        mLinks = new ArrayList<String>();
        for (String link : links) {
            if (link.startsWith("/v4/") && (!link.contains("#"))) {
                String s = link.substring("/v4/".length());
                if (s.matches("interface/.+") || s.matches("input_object/.+") ||
                        s.matches("object/.+") || s.matches("mutation/.+") ||
                        s.matches("union/.+") || s.matches("scalar/.+") ||
                        s.matches("query") || s.matches("enum/.+")) {
                    if (s.endsWith("/")) {
                        s = s.substring(0, s.length() - 1);
                    }
                    mLinks.add(mUrlPrefix + s);
                }
            }
        }
    }

    private void extractObject(Html html, String category) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, category);
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);
        // components
        List<String> components = html.xpath(CONTENT_PREFIX + "/h2/a/@id").all();

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public class ").append(className);

        // metadata
        if (category.equals("objects")) {
            builder.append(" extends ").append(PACKAGE_PREFIX).append("Metadata");
        }

        // implements
        if (components.contains("implements")) {
            builder.append(" implements ");
            List<String> implPacks = html.xpath(CONTENT_PREFIX + "/ul/li/code/a/@href").all();
            List<String> implTypes = html.xpath(CONTENT_PREFIX + "/ul/li/code/a/text()").all();
            for (int i = 0; i < implPacks.size(); i++) {
                String absType = getAbsolutionType(implPacks.get(i), implTypes.get(i));
                if (i == 0) {
                    builder.append(absType);
                } else {
                    builder.append(", ").append(absType);
                }
            }
        }

        builder.append(" {");

        // connections
        if (components.contains("connections")) {
            List<String> connIds = html.xpath(CONTENT_PREFIX + "//span[@class='field-name connection-name anchored']/@id").all();
            for (String connId : connIds) {
                extractArguments(builder, html, connId);
                extractFieldNonNull(builder, html, connId, "/code/a/text()");
                extractFieldDescription(builder, html, connId);
                extractField(builder, html, connId, "/code/a/@href",
                        "/code/a/text()", "/text()");
            }
        }

        // fields
        if (components.contains("fields")) {
            List<String> fieldIds = html.xpath(CONTENT_PREFIX + "//span[@class='field-name anchored']/@id").all();
            if (components.contains("connections")) {
                List<String> connIds = html.xpath(CONTENT_PREFIX + "//span[@class='field-name connection-name anchored']/@id").all();
                fieldIds.removeAll(connIds);
            }
            for (String fieldId : fieldIds) {
                extractArguments(builder, html, fieldId);
                extractFieldNonNull(builder, html, fieldId, "/code/a/text()");
                extractFieldDescription(builder, html, fieldId);
                extractField(builder, html, fieldId, "/code/a/@href",
                        "/code/a/text()", "/text()");
            }
        }

        builder.append("}");

        mPath = SRCFILE_PREFIX + category + "/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractInterface(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "interfaces");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        // implemented by
        List<String> implPacks = html.xpath(CONTENT_PREFIX + "/ul/li/code/a/@href").all();
        List<String> implTypes = html.xpath(CONTENT_PREFIX + "/ul/li/code/a/text()").all();
        if ((implPacks != null) && (implPacks.size() > 0)) {
            builder.append("@ImplementedBy({");
            for (int i = 0; i < implPacks.size(); i++) {
                String absType = getAbsolutionType(implPacks.get(i), implTypes.get(i));
                builder.append("\n        \"").append(absType).append("\",");
            }
            builder.append("\n})\n");
        }

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public interface ").append(className).append(" {");

        // fields
        List<String> fieldIds = html.xpath(CONTENT_PREFIX + "//span[@class='field-name anchored']/@id").all();
        if ((fieldIds != null) && (fieldIds.size() > 0)) {
            for (String fieldId : fieldIds) {
                extractArguments(builder, html, fieldId);
                extractFieldNonNull(builder, html, fieldId, "/code/a/text()");
                extractFieldDescription(builder, html, fieldId);

                String prefix = "//span[@id='" + fieldId + "']";
                String fieldPack = html.xpath(prefix + "/code/a/@href").toString();
                String fieldType = html.xpath(prefix + "/code/a/text()").toString();
                String fieldName = html.xpath(prefix + "/text()").toString();

                String absType = getAbsolutionType(fieldPack, fieldType);
                String varName = getVariableName(fieldName);

                builder.append("\n    public ").append(absType).append(" get").
                        append(upperInitials(varName)).append("();");
                builder.append("\n    public void set").append(upperInitials(varName)).append("(").
                        append(absType).append(" ").append(varName).append(");\n");
            }
        }

        builder.append("}");

        mPath = SRCFILE_PREFIX + "interfaces/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractEnum(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "enums");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public enum ").append(className).append(" {\n");

        // values
        List<String> enumItems = html.xpath(CONTENT_PREFIX + "/h4[@class='name anchored']/text()").all();
        List<String> enumDescs = html.xpath(CONTENT_PREFIX + "/div[@class='description-wrapper']/p/text()").all();
        if ((enumItems != null) && (enumItems.size() > 0)) {
            for (int i = 0; i < enumItems.size(); i++) {
                builder.append("    @Description(\"").append(enumDescs.get(i)).append("\")\n");
                builder.append("    ").append(enumItems.get(i)).append(",\n");
            }
        }

        builder.append("}");

        mPath = SRCFILE_PREFIX + "enums/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractUnion(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "unions");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        // extract values
        String prefix = CONTENT_PREFIX + "/ul/li/a";
        List<String> fieldPacks = html.xpath(prefix + "/@href").all();
        List<String> fieldTypes = html.xpath(prefix + "/text()").all();
        if ((fieldPacks != null) && (fieldPacks.size() > 0)) {
            builder.append("@ImplementedBy({");
            for (int i = 0; i < fieldPacks.size(); i++) {
                String absType = getAbsolutionType(fieldPacks.get(i), fieldTypes.get(i));
                builder.append("\n        \"").append(absType).append("\",");
            }
            builder.append("\n})\n");
        }

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public interface ").append(className).append(" {\n");

        builder.append("}");

        mPath = SRCFILE_PREFIX + "unions/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractScalar(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "scalars");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        builder.append("@Description(\"").append(classDescription).append("\")\n").
                append("public class ").append(className).append(" {\n").
                append("    private java.lang.String value;\n").
                append("    public ").append(className).append("(java.lang.String value) { this.value = value; }\n").
                append("    public java.lang.String getValue() { return value; }\n").
                append("    public void setValue(java.lang.String value) { this.value = value; }\n").
                append("    @Override\n").
                append("    public java.lang.String toString() { return value; }\n").
                append("}");

        mPath = SRCFILE_PREFIX + "scalars/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractInputObject(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "inputobjects");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public class ").append(className).append(" {");

        // fields
        List<String> fieldIds = html.xpath(CONTENT_PREFIX + "/div[@class='field-entry my-4']/span[@class='field-name anchored']/@id").all();
        if ((fieldIds != null) && (fieldIds.size() > 0)) {
            for (String fieldId : fieldIds) {
                extractArguments(builder, html, fieldId);
                extractFieldNonNull(builder, html, fieldId, "/code/a/text()");
                extractFieldDescription(builder, html, fieldId);
                extractField(builder, html, fieldId, "/code/a/@href",
                        "/code/a/text()", "/text()");
            }
        }

        builder.append("}");

        mPath = SRCFILE_PREFIX + "inputobjects/" + className + ".java";
        mCode = builder.toString();
    }

    private void extractMutation(Html html) throws Exception {
        StringBuilder builder = new StringBuilder();

        // package and imports
        addHeader(builder, "mutations");
        // class name
        String className = extractClassName(html);
        // class description
        String classDescription = extractClassDescription(html);

        builder.append("@Description(\"").append(classDescription).append("\")\n");
        builder.append("public class ").append(className).append(" {");

        // input/return fields
        List<String> fieldIds = html.xpath(CONTENT_PREFIX + "/div[@class='field-entry my-4']/span[@class='field-name anchored']/@id").all();
        if ((fieldIds != null) && (fieldIds.size() > 0)) {
            for (String fieldId : fieldIds) {
                extractArguments(builder, html, fieldId);
                extractFieldNonNull(builder, html, fieldId, "/code/a/text()");
                extractFieldDescription(builder, html, fieldId);
                extractField(builder, html, fieldId, "/code/a/@href",
                        "/code/a/text()", "/text()");
            }
        }

        builder.append("}");

        mPath = SRCFILE_PREFIX + "mutations/" + className + ".java";
        mCode = builder.toString();
    }

    private void addHeader(StringBuilder builder, String category) {
        // package
        builder.append("package ").append(PACKAGE_PREFIX).append(category).append(";\n\n");
        // import
        builder.append("import ").append(Argument.class.getName()).append(";\n");
        builder.append("import ").append(Arguments.class.getName()).append(";\n");
        builder.append("import ").append(Description.class.getName()).append(";\n");
        builder.append("import ").append(ImplementedBy.class.getName()).append(";\n");
        builder.append("import ").append(NonNull.class.getName()).append(";\n\n");
    }

    private String extractClassName(Html html) throws Exception {
        String className = html.xpath(CONTENT_PREFIX + "/h1/text()").toString().trim();
        return upperInitials(className);
    }

    private String extractClassDescription(Html html) throws Exception {
        String classDescription;
        String previewNotice = html.xpath(CONTENT_PREFIX + "/div[@class='notice my-2 p-3 preview-notice']/p/text()").toString();
        if (previewNotice != null) {
            classDescription = html.xpath(CONTENT_PREFIX + "/p[2]/text()").toString().trim();
        } else {
            classDescription = html.xpath(CONTENT_PREFIX + "/p[1]/text()").toString().trim();
        }
        return classDescription;
    }

    private void extractArguments(StringBuilder builder, Html html, String id) throws Exception {
        String argPrefix = "//span[@id='" + id + "']/../div[@class='description-wrapper']" +
                "/table[@class='arguments']/tbody/tr";
        List<String> argPacks = html.selectList(new Xpath2Selector(argPrefix + "/td[2]/code/a/@href")).all();
        List<String> argTypes = html.selectList(new Xpath2Selector(argPrefix + "/td[2]/code/a/text()")).all();
        List<String> argNames = html.selectList(new Xpath2Selector(argPrefix + "/td[1]/code/text()")).all();
        List<String> argDescs = html.selectList(new Xpath2Selector(argPrefix + "/td[3]/p/text()")).all();

        if ((argPacks != null) && (argPacks.size() > 0)) {
            builder.append("\n    @Arguments({");
            for (int i = 0; i < argPacks.size(); i++) {
                String absType = getAbsolutionType(argPacks.get(i), argTypes.get(i));
                String varName = getVariableName(argNames.get(i));
                String nonNull = getNonNull(argTypes.get(i));
                String descrip = argDescs.get(i).trim();
                builder.append("\n        @Argument(name=\"").append(varName).
                        append("\", type=\"").append(absType).
                        append("\", nonNull=@NonNull(\"").append(nonNull).
                        append("\"), description=@Description(\"").append(descrip).append("\")),");
            }
            builder.append("\n    })");
        }
    }

    private void extractFieldNonNull(StringBuilder builder, Html html, String id, String typePath) throws Exception {
        String fieldType = html.xpath("//span[@id='" + id + "']" + typePath).toString().trim();
        String nonNull = getNonNull(fieldType);
        if (nonNull.length() > 0) {
            builder.append("\n    @NonNull(\"").append(nonNull).append("\")");
        }
    }

    private void extractFieldDescription(StringBuilder builder, Html html, String id) throws Exception {
        String fieldDescription = html.select(new Xpath2Selector("//span[@id='" + id +
                "']/../div[@class='description-wrapper']/p/text()")).toString();
        if ((fieldDescription != null) && (fieldDescription.length() > 0)) {
            builder.append("\n    @Description(\"").append(fieldDescription).append("\")");
        }
    }

    private void extractField(StringBuilder builder, Html html, String id, String packPath, String typePath, String namePath) throws Exception {
        String prefix = "//span[@id='" + id + "']";

        String fieldPack = html.xpath(prefix + packPath).toString();
        String fieldType = html.xpath(prefix + typePath).toString();
        String fieldName = html.xpath(prefix + namePath).toString();

        String absType = getAbsolutionType(fieldPack, fieldType);
        String varName = getVariableName(fieldName);

        builder.append("\n    private ").append(absType).append(" ").append(varName).append(";");
        builder.append("\n    public ").append(absType).append(" get").append(upperInitials(varName)).
                append("() { return this.").append(varName).append("; }");
        builder.append("\n    public void set").append(upperInitials(varName)).append("(").
                append(absType).append(" ").append(varName).append(") { this.").
                append(varName).append(" = ").append(varName).append("; }\n");
    }

    private String getAbsolutionType(String pack, String type) {
        String prefix = pack.substring(4);
        if (prefix.contains("/")) {
            prefix = prefix.substring(0, prefix.indexOf("/"));
        }
        if (prefix.equals("input_object")) {
            prefix = "inputobject";
        }
        if (!prefix.equals("query")) {
            prefix += "s";
        }

        String combine = PACKAGE_PREFIX + prefix + ".";

        while (type.contains("!")) {
            int index = type.indexOf("!");
            type = type.substring(0, index) + type.substring(index + 1, type.length());
        }

        if (type.contains("[")) {
            int index1 = type.indexOf("[");
            int index2 = type.indexOf("]");
            type = type.substring(0, index1) + type.substring(index1 + 1, index2) + type.substring(index2 + 1, type.length());
            combine = combine + upperInitials(type) + "[]";
        } else {
            combine = combine + upperInitials(type);
        }

        return combine;
    }

    private String getVariableName(String name) {
        Matcher matcher = Pattern.compile("[a-zA-Z_]+[\\w_]+").matcher(name);
        matcher.find();
        int begIndex = matcher.start();
        int endIndex = matcher.end();
        return name.substring(begIndex, endIndex);
    }

    private String getNonNull(String type) {
        if (type.matches("\\[[\\w_]+!\\]!")) {
            return "[!]!";
        } else if (type.matches("\\[[\\w_]+!\\]")) {
            return "[!]";
        } else if (type.matches("\\[?[\\w_]+\\]?!")) {
            return "!";
        } else {
            return "";
        }
    }

    private String upperInitials(String word) {
        char initials = word.charAt(0);
        if ((initials >= 'a') && (initials <= 'z')) {
            return ((char) (initials - 'a' + 'A')) + word.substring(1);
        } else {
            return word;
        }
    }
}
