package ThisIsJava.ch12.sec12;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    // 선 종류
    String value() default "-";

    // 출력 횟수
    int number() default 15;
}

