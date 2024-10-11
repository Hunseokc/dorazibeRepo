package ThisIsJava.ch15.sec08;

import java.util.*;

public class ImmutableEx {
    public static void main(String[] args) {
        // of() 메소드
        List<String> immutableList1 = List.of("A", "B", "C");
        // immutableList1.add("D") 불가능

        Set<String> immutableSet1 = Set.of("A", "B", "C");

        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C");

        // copyOf() 메소드
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로 불변 List 생성
        String[] arr = { "A" , "B", "C" };
        List<String> immutableList3 = Arrays.asList(arr);
    }
}
