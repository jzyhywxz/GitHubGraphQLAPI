package com.zzw.github.graphql.builder;

import com.zzw.github.graphql.parser.GGParser;
import com.zzw.github.graphql.schema.annotations.*;
import com.zzw.github.graphql.spider.GitHubGraphQLParser;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzw on 2018/8/23.
 */
public class TypeUtil {
    public static List<String> getDeclaredIdentifiers(Class clazz) {
        List<String> identifiers = new ArrayList<String>();

        if (clazz == null) {
            // do nothing
        } else if (clazz.isInterface()) {
            Method[] methods = clazz.getDeclaredMethods();
            if ((methods != null) && (methods.length > 0)) {
                for (Method method : methods) {
                    String methodName = method.getName();
                    if (methodName.startsWith("get")) {
                        String identifier = methodName.substring(3);
                        identifier = lowerInitials(identifier);
                        identifiers.add(identifier);
                    }
                }
            }
        } else if (clazz.isEnum()) {
            Object[] constants = clazz.getEnumConstants();
            if ((constants != null) && (constants.length > 0)) {
                for (Object constant : constants) {
                    identifiers.add(constant.toString());
                }
            }
        } else {
            Field[] fields = clazz.getDeclaredFields();
            if ((fields != null) && (fields.length > 0)) {
                for (Field field : fields) {
                    identifiers.add(field.getName());
                }
            }
        }

        return identifiers;
    }

    public static boolean isOverride(Class clazz, String identifier) {
        if ((clazz == null) || (identifier == null)) {
            return false;
        }

        Class[] implClasses = clazz.getInterfaces();
        if ((implClasses == null) || (implClasses.length <= 0)) {
            return false;
        }

        for (Class implClass : implClasses) {
            try {
                Method method = implClass.getDeclaredMethod("get" + upperInitials(identifier));
                if (method != null) {
                    return true;
                }
            } catch (Exception e) {
                // do nothing
            }
        }
        return false;
    }

    public static Class getDeclaredClass(Class clazz, String identifier) {
        if ((clazz == null) || (identifier == null)) {
            return clazz;
        }

        Class[] implClasses = clazz.getInterfaces();
        if ((implClasses == null) || (implClasses.length <= 0)) {
            return clazz;
        }

        for (Class implClass : implClasses) {
            try {
                Method method = implClass.getDeclaredMethod("get" + upperInitials(identifier));
                if (method != null) {
                    return implClass;
                }
            } catch (Exception e) {
                // do nothing
            }
        }
        return clazz;
    }

    public static int getNonNull(String required) {
        if (required.equals("!")) {
            return GraphQLArgument.NONNULL_OUTER_ONLY;
        } else if (required.equals("[!]")) {
            return GraphQLArgument.NONNULL_INNER_ONLY;
        } else if (required.equals("[!]!")) {
            return GraphQLArgument.NONNULL_OUTER_ONLY + GraphQLArgument.NONNULL_INNER_ONLY;
        } else {
            return 0;
        }
    }

    public static Class getArgType(Class clazz, String identifier, String argument) {
        if ((clazz == null) || (identifier == null) || (argument == null)) {
            return null;
        }

        Argument[] arguments = getArguments(clazz, identifier);
        if ((arguments != null) && (arguments.length > 0)) {
            for (Argument arg : arguments) {
                if (arg.name().equals(argument)) {
                    String typeName = arg.type();
                    Class type = null;
                    try {
                        type = Class.forName(typeName);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    return type;
                }
            }
        }
        return null;
    }

    public static Object getArgValue(Class argType, String valueString) {
        if ((argType == null) || (valueString == null)) {
            return null;
        }

        if (valueString.startsWith("$")) {
            try {
                if (argType.isArray()) {
                    return Array.newInstance(argType.getComponentType(), 0);
                } else if (argType.isEnum()) {
                    Field[] values = argType.getDeclaredFields();
                    if ((values != null) && (values.length > 0)) {
                        return values[0].get(null);
                    } else {
                        return null;
                    }
                } else if (TypeUtil.isScalar(argType)) {
                    if (argType == com.zzw.github.graphql.schema.scalars.Boolean.class) {
                        return new com.zzw.github.graphql.schema.scalars.Boolean(true);
                    } else if (argType == com.zzw.github.graphql.schema.scalars.Float.class) {
                        return new com.zzw.github.graphql.schema.scalars.Float(0);
                    } else if (argType == com.zzw.github.graphql.schema.scalars.Int.class) {
                        return new com.zzw.github.graphql.schema.scalars.Int(0);
                    } else {
                        Constructor constructor = argType.getDeclaredConstructor(String.class);
                        if (constructor != null) {
                            return constructor.newInstance("");
                        } else {
                            return null;
                        }
                    }
                } else {
                    return argType.newInstance();
                }
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
            return null;
        } else {
            return GGParser.fromJson(valueString, argType);
        }
    }

    public static Class getType(Class clazz, String identifier) {
        if ((clazz == null) || (identifier == null)) {
            return null;
        }

        if (clazz.isInterface()) {
            try {
                String newIdentifier = "get" + upperInitials(identifier);
                Method method = clazz.getDeclaredMethod(newIdentifier);
                if (method != null) {
                    return method.getReturnType();
                }
            } catch (NoSuchMethodException e1) {
                try {
                    String[] implementedBys = TypeUtil.getImplementedBy(clazz);
                    if ((implementedBys != null) && (implementedBys.length > 0)) {
                        String newIdentifier = "." + identifier;
                        for (String implementedBy : implementedBys) {
                            if (implementedBy.endsWith(newIdentifier)) {
                                return Class.forName(implementedBy);
                            }
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            try {
                Field field = clazz.getDeclaredField(identifier);
                if (field != null) {
                    return field.getType();
                }
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
        }

        return null;
    }

    public static String getTypeName(Class clazz, String identifier) {
        Class type = getType(clazz, identifier);
        if (type == null) {
            return null;
        }

        if (type.isArray()) {
            Class componentType = type.getComponentType();
            String typeName = "[]";
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
                typeName = "[]" + typeName;
            }
            return componentType.getSimpleName() + typeName;
        } else {
            return type.getSimpleName();
        }
    }

    public static String getDescription(Class clazz, String identifier) {
        Annotation annotation = getAnnotation(clazz, identifier, Description.class);
        if (annotation != null) {
            return ((Description) annotation).value();
        } else {
            return null;
        }
    }

    public static String getNonNull(Class clazz, String identifier) {
        Annotation annotation = getAnnotation(clazz, identifier, NonNull.class);
        if (annotation != null) {
            return ((NonNull) annotation).value();
        } else {
            return null;
        }
    }

    public static Argument[] getArguments(Class clazz, String identifier) {
        Annotation annotation = getAnnotation(clazz, identifier, Arguments.class);
        if (annotation != null) {
            return ((Arguments) annotation).value();
        } else {
            return null;
        }
    }

    public static String[] getImplementedBy(Class clazz) {
        Annotation annotation = getAnnotation(clazz, null, ImplementedBy.class);
        if (annotation != null) {
            return ((ImplementedBy) annotation).value();
        } else {
            return null;
        }
    }

    private static Annotation getAnnotation(Class clazz, String identifier, Class annotationClass) {
        if ((clazz == null) || (annotationClass == null)) {
            return null;
        }

        if (identifier == null) {
            return clazz.getDeclaredAnnotation(annotationClass);
        }

        try {
            if (clazz.isInterface()) {
                String newIdentifier = "get" + upperInitials(identifier);
                Method method = clazz.getDeclaredMethod(newIdentifier);
                if (method != null) {
                    return method.getDeclaredAnnotation(annotationClass);
                }
            } else {
                Field field = clazz.getDeclaredField(identifier);
                if (field != null) {
                    return field.getDeclaredAnnotation(annotationClass);
                }
            }
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        } catch (NoSuchMethodException e2) {
//            e2.printStackTrace();
        }

        return null;
    }

    public static String upperInitials(String word) {
        char initials = word.charAt(0);
        if ((initials >= 'a') && (initials <= 'z')) {
            return ((char) (initials - 'a' + 'A')) + word.substring(1);
        } else {
            return word;
        }
    }

    public static String lowerInitials(String word) {
        char initials = word.charAt(0);
        if ((initials >= 'A') && (initials <= 'Z')) {
            return ((char) (initials - 'A' + 'a')) + word.substring(1);
        } else {
            return word;
        }
    }

    public static boolean isQuery(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "query.");
    }

    public static boolean isMutation(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "mutations.");
    }

    public static boolean isObject(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "objects.");
    }

    public static boolean isInterface(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "interfaces.");
    }

    public static boolean isEnum(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "enums.");
    }

    public static boolean isUnion(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "unions.");
    }

    public static boolean isInputObject(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "inputobjects.");
    }

    public static boolean isScalar(Class clazz) {
        if (clazz == null) {
            return false;
        }
        return clazz.getName().startsWith(GitHubGraphQLParser.PACKAGE_PREFIX + "scalars.");
    }
}
