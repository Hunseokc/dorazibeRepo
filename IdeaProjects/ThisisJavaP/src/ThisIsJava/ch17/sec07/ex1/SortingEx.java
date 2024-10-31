package ThisIsJava.ch17.sec07.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEx {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.printf("%s : %d\n", s.getName(), s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.printf("%s : %d\n", s.getName(), s.getScore()));
    }
}
