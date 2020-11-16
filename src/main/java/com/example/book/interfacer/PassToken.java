package com.example.book.interfacer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 用来跳过验证的PassToken
 * */
@Target({ElementType.METHOD,ElementType.TYPE})  // 注解的作用目标
@Retention(RetentionPolicy.RUNTIME)
public @interface PassToken {
    boolean required() default true;
}
