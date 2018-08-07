package com.yasong.yin.playinggo.common;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

    String desc();
}
