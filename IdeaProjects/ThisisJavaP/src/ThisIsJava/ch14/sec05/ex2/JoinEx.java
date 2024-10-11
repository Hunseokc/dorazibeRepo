package ThisIsJava.ch14.sec05.ex2;

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            // main 일시정지하고 sumThread 실행 - 연산
            sumThread.join();
        } catch (InterruptedException e) {   }
        System.out.println("1-100 합 : " + sumThread.getSum());
    }
}
