package com.zzw.github.graphql.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zzw.github.graphql.schema.interfaces.*;
import com.zzw.github.graphql.schema.unions.*;

import java.lang.reflect.Field;

/**
 * Created by zzw on 2018/6/9.
 */
public class GitHubGraphQLGson {
    public static final String PACKAGE_PREFIX = "com.zzw.github.graphql.schema";

    private Gson gson;
    private static GitHubGraphQLGson instance;

    public static GitHubGraphQLGson getInstance() {
        if (instance == null) {
            synchronized (GitHubGraphQLGson.class) {
                if (instance == null) {
                    instance = new GitHubGraphQLGson();
                }
            }
        }
        return instance;
    }

    private GitHubGraphQLGson() {
        GsonBuilder builder = new GsonBuilder();

        registerScalarTypeAdapters(builder);
        registerInterfaceTypeAdapters(builder);
        registerUnionTypeAdapters(builder);

        builder.serializeNulls();

        gson = builder.create();
    }

    private void registerScalarTypeAdapters(GsonBuilder builder) {
        Class[] clazzes = ScalarTypeAdapter.class.getDeclaredClasses();
        if ((clazzes != null) || (clazzes.length > 0)) {
            try {
                for (Class clazz : clazzes) {
                    java.lang.String clazzName = clazz.getSimpleName();
                    java.lang.String aClazzName = PACKAGE_PREFIX + ".scalars." +
                            clazzName.substring(0, clazzName.length() - "TypeConverter".length());
                    Class aClazz = Class.forName(aClazzName);
                    Object aObject = clazz.newInstance();
                    builder.registerTypeAdapter(aClazz, aObject);
                }
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
        }
    }

    private void registerInterfaceTypeAdapters(GsonBuilder builder) {
        Field[] fields = InterfaceManager.class.getDeclaredFields();
        if ((fields != null) || (fields.length > 0)) {
            try {
                for (Field field : fields) {
                    field.setAccessible(true);
                    java.lang.String fieldName = field.getName();
                    java.lang.String clazzName = PACKAGE_PREFIX + ".interfaces." + fieldName.substring(0, fieldName.indexOf("_"));
                    Class clazz = Class.forName(clazzName);
                    Class[] fieldValue = (Class[]) field.get(null);
                    builder.registerTypeAdapter(clazz, new DownwardsTypeConverter(fieldValue));
                }
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void registerUnionTypeAdapters(GsonBuilder builder) {
        Field[] fields = UnionManager.class.getDeclaredFields();
        if ((fields != null) || (fields.length > 0)) {
            try {
                for (Field field : fields) {
                    field.setAccessible(true);
                    java.lang.String fieldName = field.getName();
                    java.lang.String clazzName = PACKAGE_PREFIX + ".unions." + fieldName.substring(0, fieldName.indexOf("_"));
                    Class clazz = Class.forName(clazzName);
                    Class[] fieldValue = (Class[]) field.get(null);
                    builder.registerTypeAdapter(clazz, new DownwardsTypeConverter(fieldValue));
                }
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    public java.lang.String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public <T> T fromJson(java.lang.String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
