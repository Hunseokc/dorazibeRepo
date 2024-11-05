package ThisIsJava.ch17.sec12.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김지비", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        // 이름, 점수 tuple Map
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(s->s.getName(), s->s.getScore())
                        );
        System.out.println(map);
    }
}
