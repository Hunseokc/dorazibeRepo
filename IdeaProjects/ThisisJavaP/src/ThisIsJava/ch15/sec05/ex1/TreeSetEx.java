package ThisIsJava.ch15.sec05.ex1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for (Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수 : " + scores.first());
        System.out.println("가장 높은 점수 : " + scores.last());
        System.out.println("95점 미만 점수 : " + scores.lower(95));
        System.out.println("95점 초과 점수 : " + scores.higher(95));
        System.out.println("95점 이하 점수 : " + scores.floor(95));
        System.out.println("85점 이상 점수 : " + scores.ceiling(85));
        System.out.println();

        // 내림차순 정렬
        // TreeSet.descendingSet -> 내림차순으로 정렬하여 Set으로 리턴
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 범위 검색 ( 80 이상 )
        // 이상 / 초과 여부는 매개값(true false)
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 범위 검색 ( 80 이상 90 미만)
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
    }
}
