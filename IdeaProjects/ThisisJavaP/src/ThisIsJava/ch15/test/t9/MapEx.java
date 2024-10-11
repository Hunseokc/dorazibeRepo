package ThisIsJava.ch15.test.t9;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;     // 최고 점수 id
        int maxScore = 0;       // 최고 점수 저장
        int totalScore = 0;     // 점수 합계 저장

        // entry 하나씩 꺼내와서 value 가져오기
        int size = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            totalScore += entry.getValue();
            size++;
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("평균 점수 : " + totalScore/size);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최고 점수를 받은 아이디 : " + name);
    }
}
