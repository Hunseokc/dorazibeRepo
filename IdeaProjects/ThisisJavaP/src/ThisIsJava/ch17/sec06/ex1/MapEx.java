package ThisIsJava.ch17.sec06.ex1;

import java.util.ArrayList;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 85));
        list.add(new Student("홍길동", 92));
        list.add(new Student("홍길동", 87));

        list.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
        for (Student student : list) {
            System.out.println(student.getScore());
        }
    }
}
