package ThisIsJava.ch17.test.t8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_grouping_to_job {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        // 그룹핑 -> groupingBy
        Map<String, List<Member>> groupingMap = list.stream()
                        .collect(Collectors.groupingBy(
                                s->s.getJob() ));

        System.out.println("[개발자]");
        List<Member> develop = groupingMap.get("개발자");
        develop.stream()
                .forEach(s->System.out.println(s.toString()));
        System.out.println();

        System.out.println("[디자이너]");
        List<Member> designer = groupingMap.get("디자이너");
        designer.stream()
                .forEach(s->System.out.println(s.toString()));
    }
}
