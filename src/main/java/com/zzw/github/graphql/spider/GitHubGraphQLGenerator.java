package com.zzw.github.graphql.spider;

import com.zzw.github.graphql.schema.annotations.*;
import com.zzw.tools.io.OkTextWriter;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by zzw on 2018/7/25.
 */
public class GitHubGraphQLGenerator {
    public static void generateManager(String pathPrefix, final String className) {
        File[] files = new File(pathPrefix).listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                String filename = pathname.getName();
                return (!filename.equals(className + ".java"));
            }
        });
        if ((files == null) || (files.length <= 0)) {
            return;
        }

        OkTextWriter writer = new OkTextWriter();
//        writer.open(System.out);
        writer.open(pathPrefix + className + ".java");
        String category = new File(pathPrefix).getName();
        writer.println("package " + GitHubGraphQLParser.PACKAGE_PREFIX + category + ";\n");
        writer.println("public class " + className + " {");

        try {
            for (int i = 0; i < files.length; i++) {
                String filename = files[i].getName();
                filename = filename.substring(0, filename.indexOf("."));
                String clazzName = GitHubGraphQLParser.PACKAGE_PREFIX + category + "." + filename;
                Class clazz = Class.forName(clazzName);
                Annotation annotation = clazz.getAnnotation(ImplementedBy.class);

                writer.println("    public static final Class[] " + filename + "_TYPES = new Class[]{");
                if ((annotation != null) && (annotation instanceof ImplementedBy)) {
                    ImplementedBy implementedBy = (ImplementedBy) annotation;
                    String[] values = implementedBy.value();
                    if ((values != null) && (values.length > 0)) {
                        for (String value : values) {
                            writer.println("            " + value + ".class,");
                        }
                    }
                }
                writer.println("    };");
                if (i < (files.length - 1)) {
                    writer.println();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        writer.println("}");
        writer.close();
    }

    public static void generateMutation(String pathPrefix, final String className) {
        File[] files = new File(pathPrefix).listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                String filename = pathname.getName();
                return (!filename.equals(className + ".java"));
            }
        });
        if ((files == null) || (files.length <= 0)) {
            return;
        }

        OkTextWriter writer = new OkTextWriter();
//        writer.open(System.out);
        writer.open(pathPrefix + className + ".java");
        String category = new File(pathPrefix).getName();
        writer.println("package " + GitHubGraphQLParser.PACKAGE_PREFIX + category + ";\n");
        writer.println("import " + Argument.class.getName() + ";");
        writer.println("import " + Arguments.class.getName() + ";");
        writer.println("import " + Description.class.getName() + ";");
        writer.println("import " + NonNull.class.getName() + ";\n");
        writer.println("public class " + className + " {");

        for (int i = 0; i < files.length; i++) {
            String simpleClazzName = files[i].getName();
            if (simpleClazzName.equals("MutationEntry.java") || simpleClazzName.equals("Mutation.java")) {
                continue;
            }
            simpleClazzName = simpleClazzName.substring(0, simpleClazzName.indexOf("."));

            try {
                String clazzName = GitHubGraphQLParser.PACKAGE_PREFIX + "mutations." + simpleClazzName;
                Class clazz = Class.forName(clazzName);
                Field field = clazz.getDeclaredField("input");
                if (field != null) {
                    writer.println("    @Arguments({");
                    writer.println("        @Argument(name=\"input\", type=\"" +
                            field.getType().getName() +
                            "\", nonNull=@NonNull(\"!\"), description=@Description(\"\")),");
                    writer.println("    })");
                }
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }

            String lowerClazzName = lowerInitials(simpleClazzName);
            writer.println("    private " + simpleClazzName + " " + lowerClazzName + ";");
            writer.println("    public " + simpleClazzName + " get" + simpleClazzName + "() { return " + lowerClazzName + "; }");
            writer.println("    public void set" + simpleClazzName + "(" + simpleClazzName + " " + lowerClazzName + ") { this." + lowerClazzName + " = " + lowerClazzName + "; }");
            if (i < (files.length -1)) {
                writer.println();
            }
        }

        writer.println("}");
        writer.close();
    }

    public static void generateEntry(String pathPrefix, String className) {
        OkTextWriter writer = new OkTextWriter();
//        writer.open(System.out);
        writer.open(pathPrefix + className + ".java");

        String category = new File(pathPrefix).getName();
        String simpleClazzName = upperInitials(category);
        if (simpleClazzName.endsWith("s")) {
            simpleClazzName = simpleClazzName.substring(0, simpleClazzName.length() - 1);
        }

        writer.println("package " + GitHubGraphQLParser.PACKAGE_PREFIX + category + ";\n");
        writer.println("public class " + className + " {");
        writer.println("    private " + simpleClazzName + " data;");
        writer.println("    private " + GitHubGraphQLParser.PACKAGE_PREFIX + "Error[] errors;");
        writer.println();
        writer.println("    public " + simpleClazzName + " getData() { return data; }");
        writer.println("    public void setData(" + simpleClazzName + " data) { this.data = data; }");
        writer.println();
        writer.println("    public " + GitHubGraphQLParser.PACKAGE_PREFIX + "Error[] getErrors() { return errors; }");
        writer.println("    public void setErrors(" + GitHubGraphQLParser.PACKAGE_PREFIX + "Error[] errors) { this.errors = errors; }");
        writer.println("}");
        writer.close();
    }

    public static void generateMetadata(String pathPrefix, final String className) {
        File[] files = new File(pathPrefix).listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                String filename = pathname.getName();
                return (!filename.equals(className + ".java"));
            }
        });
        if ((files == null) || (files.length <= 0)) {
            return;
        }

        OkTextWriter writer = new OkTextWriter();
//        writer.open(System.out);
        writer.open(new File(pathPrefix).getParent() + File.separator + className + ".java");
        String pkg = GitHubGraphQLParser.PACKAGE_PREFIX;
        pkg = pkg.substring(0, pkg.length() - 1);
        writer.println("package " + pkg + ";\n");
        writer.print("public class " + className + " implements");

        try {
            String category = new File(pathPrefix).getName();
            for (int i = 0; i < files.length; i++) {
                String filename = files[i].getName();
                filename = filename.substring(0, filename.indexOf("."));
                String clazzName = GitHubGraphQLParser.PACKAGE_PREFIX + category + "." + filename;
                Class clazz = Class.forName(clazzName);
                if (clazz.isInterface()) {
                    if (i == 0) {
                        writer.print(" " + clazz.getName());
                    } else {
                        writer.print(", " + clazz.getName());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        writer.println(" {");
        writer.println("protected String __typename;");
        writer.println("public String getTypename() { return __typename; }");
        writer.println("public void setTypename(String typename) { this.__typename = typename; }");
        writer.println("}");
        writer.close();
    }

    private static String upperInitials(String word) {
        char initials = word.charAt(0);
        if ((initials >= 'a') && (initials <= 'z')) {
            return ((char) (initials - 'a' + 'A')) + word.substring(1);
        } else {
            return word;
        }
    }

    private static String lowerInitials(String word) {
        char initials = word.charAt(0);
        if ((initials >= 'A') && (initials <= 'Z')) {
            return ((char) (initials - 'A' + 'a')) + word.substring(1);
        } else {
            return word;
        }
    }
}
