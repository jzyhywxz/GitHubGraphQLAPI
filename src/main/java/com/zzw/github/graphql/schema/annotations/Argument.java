package com.zzw.github.graphql.schema.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zzw on 2018/3/1.
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {
    String name();
    String type();
    NonNull nonNull() default @NonNull;
    Description description() default @Description;
}
