package ThisIsJava.ch12.sec03.ex2;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍");
        // HashSet에 Student 객체 저장
        hashSet.add(s1);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student s2 = new Student(1,"홍");
        hashSet.add(s2);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student s3 = new Student(2,"홍");
        hashSet.add(s3);
        System.out.println("저장된 객체 수 : " + hashSet.size());

    }
}
