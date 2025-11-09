package org.example;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)      // keep at runtime so we can inspect via reflection
@Target(ElementType.METHOD)              // applicable to methods only
@interface MyCustomAnnotation {
    String value() default "default-value";
    int number() default 0;
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.