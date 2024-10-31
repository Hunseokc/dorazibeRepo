package ThisIsJava.ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        System.out.println("중복 제거 only");
        list.stream()
                .distinct()
                .forEach( name -> System.out.println(name));
        System.out.println();

        System.out.println("조건부 출력");
        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("중복 제거 후 출력");
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
