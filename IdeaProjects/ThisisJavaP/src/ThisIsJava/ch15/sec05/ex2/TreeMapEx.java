package ThisIsJava.ch15.sec05.ex2;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 50);
        treeMap.put("zoo", 80);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        // 정렬된 엔트리 반복문으로 하나씩 가져오기
        Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        // 특정 키 탐색하여 가져오기
        Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어 : " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println("ever 앞 단어 : " + entry.getKey() + "-" + entry.getValue() + "\n");

        // 내림차순 정렬
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for (Entry<String, Integer> e : descendingEntrySet) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println();

        // 범위 검색
        System.out.println("[c-h 사이의 단어 검색]");
        // c는 포함하고 h는 포함하지 않는 범위로 탐색
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
        // NavigableMap안에 Entry로 구성된건 맞지만, Entry로 꺼내려면 메소드가 필요한거
        for (Entry<String, Integer> e : rangeMap.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
