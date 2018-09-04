package com.zzw.github.graphql.parser;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zzw on 2018/6/9.
 */
public class DownwardsTypeConverter<T> implements JsonDeserializer<T> {
    private Class[] subtypes;

    public DownwardsTypeConverter(Class[] subtypes) {
        this.subtypes = subtypes;
    }

    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Set<String> anchorSet = jsonElement.getAsJsonObject().keySet();
        if ((anchorSet != null) && (anchorSet.contains("__typename"))) {
            String downwardsType = jsonElement.getAsJsonObject().get("__typename").getAsString();
//            System.out.println("downwardsType:" + downwardsType);
            try {
                Class clazz = Class.forName("com.zzw.github.graphql.schema.objects." + downwardsType);
                return jsonDeserializationContext.deserialize(jsonElement, clazz);
            } catch (ClassNotFoundException e) {
                return null;
            }
        } else {
            Class clazz = clearDownwards(anchorSet, subtypes);
            if (clazz != null) {
                return jsonDeserializationContext.deserialize(jsonElement, clazz);
            } else {
                return null;
            }
        }
    }

    public List<Class> fuzzyDownwards(Set<String> anchorSet, Class[] candidate) {
        List<Class> result = new ArrayList<Class>();

        for (Class clazz : candidate) {
            Set<String> fields = getFields(clazz);
            if (isAllContained(anchorSet, fields)) {
                result.add(clazz);
            }
        }

        return result;
    }

    public Class clearDownwards(Set<String> anchorSet, Class[] candidate) {
        List<Class> result = fuzzyDownwards(anchorSet, candidate);
        if (result != null && result.size() > 0) {
            return result.get(0);
        } else {
            return null;
        }
    }

    private Set<String> getFields(Class clazz) {
        Set<String> fieldNames = new HashSet<String>();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            fieldNames.add(name);
        }

        return fieldNames;
    }

    private boolean isAllContained(Set<String> anchorSet, Set<String> checkSet) {
        for (String anchorItem : anchorSet) {
            if (!checkSet.contains(anchorItem)) {
                return false;
            }
        }
        return true;
    }
}
