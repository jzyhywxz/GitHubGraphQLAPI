package com.zzw.github.graphql.parser;

import com.google.gson.*;
import com.zzw.github.graphql.schema.scalars.*;
import com.zzw.github.graphql.schema.scalars.Boolean;
import com.zzw.github.graphql.schema.scalars.Float;
import com.zzw.github.graphql.schema.scalars.String;

import java.lang.reflect.Type;

/**
 * Created by zzw on 2018/6/9.
 */
public class ScalarTypeAdapter {
    public static class BooleanTypeConverter implements JsonSerializer<Boolean>, JsonDeserializer<Boolean> {
        public JsonElement serialize(Boolean aBoolean, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(aBoolean.getValue());
        }

        public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new Boolean(jsonElement.getAsBoolean());
        }
    }

    public static class DateTimeTypeConverter implements JsonSerializer<DateTime>, JsonDeserializer<DateTime> {
        public JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(dateTime.getValue());
        }

        public DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new DateTime(jsonElement.getAsString());
        }
    }

    public static class FloatTypeConverter implements JsonSerializer<Float>, JsonDeserializer<Float> {
        public JsonElement serialize(Float aFloat, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(aFloat.getValue());
        }

        public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new Float(jsonElement.getAsDouble());
        }
    }

    public static class GitObjectIDTypeConverter implements JsonSerializer<GitObjectID>, JsonDeserializer<GitObjectID> {
        public JsonElement serialize(GitObjectID gitObjectID, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(gitObjectID.getValue());
        }

        public GitObjectID deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new GitObjectID(jsonElement.getAsString());
        }
    }

    public static class GitSSHRemoteTypeConverter implements JsonSerializer<GitSSHRemote>, JsonDeserializer<GitSSHRemote> {
        public JsonElement serialize(GitSSHRemote gitSSHRemote, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(gitSSHRemote.getValue());
        }

        public GitSSHRemote deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new GitSSHRemote(jsonElement.getAsString());
        }
    }

    public static class GitTimestampTypeConverter implements JsonSerializer<GitTimestamp>, JsonDeserializer<GitTimestamp> {
        public JsonElement serialize(GitTimestamp gitTimestamp, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(gitTimestamp.getValue());
        }

        public GitTimestamp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new GitTimestamp(jsonElement.getAsString());
        }
    }

    public static class HTMLTypeConverter implements JsonSerializer<HTML>, JsonDeserializer<HTML> {
        public JsonElement serialize(HTML html, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(html.getValue());
        }

        public HTML deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new HTML(jsonElement.getAsString());
        }
    }

    public static class IDTypeConverter implements JsonSerializer<ID>, JsonDeserializer<ID> {
        public JsonElement serialize(ID id, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(id.getValue());
        }

        public ID deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new ID(jsonElement.getAsString());
        }
    }

    public static class IntTypeConverter implements JsonSerializer<Int>, JsonDeserializer<Int> {
        public JsonElement serialize(Int anInt, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(anInt.getValue());
        }

        public Int deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new Int(jsonElement.getAsInt());
        }
    }

    public static class StringTypeConverter implements JsonSerializer<String>, JsonDeserializer<String> {
        public JsonElement serialize(String string, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(string.getValue());
        }

        public String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new String(jsonElement.getAsString());
        }
    }

    public static class URITypeConverter implements JsonSerializer<URI>, JsonDeserializer<URI> {
        public JsonElement serialize(URI uri, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(uri.getValue());
        }

        public URI deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new URI(jsonElement.getAsString());
        }
    }

    public static class X509CertificateTypeConverter implements JsonSerializer<X509Certificate>, JsonDeserializer<X509Certificate> {
        public JsonElement serialize(X509Certificate x509Certificate, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(x509Certificate.getValue());
        }

        public X509Certificate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new X509Certificate(jsonElement.getAsString());
        }
    }
}
