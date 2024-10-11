package ThisIsJava.ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        // Map<Integer, String> map = new HashMap<>(); -> 경합 발생

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run()  {
                // 객체 1000개 추가
                for (int i = 1; i<=1000; i++) {
                //  map    int  String
                    map.put(i, "내용"+i);
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run()  {
                // 객체 1000개 추가
                for (int i = 1001; i<=2000; i++) {
                    //  map    int  String
                    map.put(i, "내용"+i);
                }
            }
        };
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch ( Exception e ) {}

        int size = map.size();
        System.out.println("총 객체 수 : " + size);
    }
}
