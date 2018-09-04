package com.zzw.github.graphql.parser;

import com.zzw.github.graphql.schema.Metadata;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zzw on 2018/6/9.
 */
public class GGParser {
    private static final GitHubGraphQLGson GSON = GitHubGraphQLGson.getInstance();

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        return GSON.fromJson(json, classOfT);
    }

    public static <T> Object[] get(T value, Class<T> type, String input) {
        if ((value == null) || (type == null) || (input == null)) {
            return null;
        }

        Object currValue = value;
        Class currType = type;

        if (currType.isInterface()) {
            currType = downcast(currType, currValue);
            if (currType == null) {
                return null;
            }
        }

        List<String> fieldStrings = findFieldStrings(input);
        if ((fieldStrings == null) || (fieldStrings.isEmpty())) {
            return null;
        }

        for (String fieldString : fieldStrings) {
            if ((currValue == null) || (currType == null)) {
                return null;
            }

            String fieldName = findFieldName(fieldString);
            if (fieldName == null) {
                return null;
            }

            Method method = getMethod(currType, fieldName);
            if (method == null) {
                return null;
            }

            try {
                method.setAccessible(true);
                currValue = method.invoke(currValue);
                currType = method.getReturnType();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
            if ((currValue == null) || (currType == null)) {
                return null;
            }

            if (currType.isArray()) {
                String arrayIndex = findArrayIndex(fieldString);
                if (arrayIndex != null) {
                    int index = Integer.parseInt(arrayIndex);
                    if ((index >= 0) && (index < Array.getLength(currValue))) {
                        currValue = Array.get(currValue, index);
                        currType = currType.getComponentType();
                    } else {
                        return null;
                    }
                }
            }
            if ((currValue == null) || (currType == null)) {
                return null;
            }

            if (currType.isInterface()) {
                currType = downcast(currType, currValue);
                if ((currValue == null) || (currType == null)) {
                    return null;
                }
            }
        }

        return new Object[]{ currType, currValue };
    }

    private static Class downcast(Class type, Object value) {
        if ((type == null) || (value == null)) {
            return type;
        }

        try {
            Field field = Metadata.class.getDeclaredField("__typename");
            field.setAccessible(true);
            String typeName = (String) field.get(value);
            if (typeName != null) {
                return Class.forName("com.zzw.github.graphql.schema.objects." + typeName);
            }
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }

        return type;
    }

    private static Method getMethod(Class type, String fieldName) {
        if ((type == null) || (fieldName == null)) {
            return null;
        }

        String methodName = "get" + upperInitials(fieldName);
        Method method = null;
        try {
            method = type.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e1) {
            try {
                Class superType = type.getSuperclass();
                if (superType != null) {
                    method = superType.getDeclaredMethod(methodName);
                }
            } catch (NoSuchMethodException e2) {
//                e2.printStackTrace();
            }
        }
        return method;
    }

    private static List<String> findFieldStrings(String input) {
        List<String> result = new ArrayList<String>();

        Matcher matcher = Pattern.compile("/").matcher(input);
        int endIndex = 0;
        while (matcher.find()) {
            int begIndex = matcher.start();
            if (begIndex > endIndex) {
                result.add(input.substring(endIndex, begIndex));
            }
            endIndex = matcher.end();
        }
        if (input.length() > endIndex) {
            result.add(input.substring(endIndex));
        }

        return result;
    }

    private static String findFieldName(String input) {
        Matcher matcher = Pattern.compile("[_a-zA-Z]+\\w*").matcher(input);

        if (matcher.find()) {
            int begIndex = matcher.start();
            int endIndex = matcher.end();
            if (endIndex > begIndex) {
                return input.substring(begIndex, endIndex);
            }
        }

        return null;
    }

    private static String findArrayIndex(String input) {
        Matcher matcher = Pattern.compile("\\[\\d+\\]").matcher(input);

        if (matcher.find()) {
            int begIndex = matcher.start() + 1;
            int endIndex = matcher.end() - 1;
            if (endIndex > begIndex) {
                return input.substring(begIndex, endIndex);
            }
        }

        return null;
    }

    private static String upperInitials(String word) {
        word = getAlphabeticWord(word);
        if (word == null) {
            return null;
        }

        char initials = word.charAt(0);
        if ((initials >= 'a') && (initials <= 'z')) {
            return ((char) (initials - 'a' + 'A')) + word.substring(1);
        } else {
            return word;
        }
    }

    private static String getAlphabeticWord(String word) {
        if ((word == null) || (word.length() <= 0)) {
            return null;
        }

        String alphabeticWord = word;
        while (alphabeticWord.length() > 0) {
            char initials = alphabeticWord.charAt(0);
            if ((initials >= 'a') && (initials <= 'z')) {
                break;
            } else {
                alphabeticWord = alphabeticWord.substring(1);
            }
        }

        return (alphabeticWord.length() > 0) ? alphabeticWord : null;
    }
}
