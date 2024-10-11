package ThisIsJava.ch14.sec09.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        // 5개 기본값이고 스레드를 없애지 않는 스레드풀
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 작업 생성과 처리 요청
        // 스레드풀 종료
        executorService.shutdown();
    }
}
