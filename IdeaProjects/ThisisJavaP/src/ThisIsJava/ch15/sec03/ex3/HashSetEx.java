package ThisIsJava.ch15.sec03.ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // 가져올게 있으면
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for (String element : set) {
            System.out.println(element);
        }
    }
}