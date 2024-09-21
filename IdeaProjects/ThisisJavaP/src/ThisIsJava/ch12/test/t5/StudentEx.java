package ThisIsJava.ch12.test.t5;

import java.util.HashSet;
import java.util.Set;

public class StudentEx {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student 수 : " + hashSet.size());
    }
}
