package cn.al.myBatisSelf.AnnotationSelf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义Select注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {
    String value();
}
