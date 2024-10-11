package ThisIsJava.ch15.sec04.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 맵은 키 기준이니 값이 95로 바뀌어 저장
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        String key = "홍길동";
        // map의 get 메소드 : key로 value 찾기
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // keySet 메소드 : Set 컬렉션에 모든 Key를 담아 리턴
        Set<String> keySet = map.keySet();

        // key & value 획득 반복 시행 [반복 획득 -> iterator]
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();  // key 하나 가져오기
            Integer v = map.get(k);         // key로 value get
            System.out.println(k + " : " + v);
        }

        // entrySet = key, value 쌍으로 구성된 Entry 객체로 이루어진 entrySet 리턴
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        // Set<Entry<String, Integer>>같은 구조도
        // Set에 들어갈 타입이 String, Integer 타입으로 구성된 Entry 객체라는 의미

        // 반복 순환(=iter)하며 key value 획득
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
