package ThisIsJava.ch15.sec05.ex3;

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        // Person 객체 삽입
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        // 객체 for문으로 하나씩 가져오기
        for (Person p : treeSet) {
            System.out.println(p.name + " : " + p.age);
        }
    }
}
