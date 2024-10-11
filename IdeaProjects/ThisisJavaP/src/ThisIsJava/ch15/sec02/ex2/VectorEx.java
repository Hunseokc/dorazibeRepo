package ThisIsJava.ch15.sec02.ex2;

import ThisIsJava.ch15.sec02.ex1.Board;

import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();
        // if List<Board> list = new ArrayList<>(); -> 오류 발생
        // 두 스레드가 동시에 add -> 인덱스 지정이 안되니까 두 스레드가 같은 주소에 대한
        // 경합이 발생

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i<=1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i<=2000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {}

        // 저장된 총 객체 개수
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();
    }
}
