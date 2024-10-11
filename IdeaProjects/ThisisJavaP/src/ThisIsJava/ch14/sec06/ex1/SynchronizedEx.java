package ThisIsJava.ch14.sec06.ex1;

public class SynchronizedEx {
    public static void main(String[] args) {
        // 동기화 메소드를 가진 객체
        Calculator calculator = new Calculator();

        // 동기화 메소드는 공유되지 않기 때문에 점유 주체 변경으로 인한
        // 데이터 저장 문제가 없음
        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}
