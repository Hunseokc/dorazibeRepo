package ThisIsJava.ch17.test.t5;

import java.util.Arrays;
import java.util.List;

public class Ex_filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(s-> (s.contains("java") || s.contains("Java"))                )
                .filter(a -> a.toLowerCase().contains("java"))
                .forEach(s -> System.out.println(s));
    }
}
