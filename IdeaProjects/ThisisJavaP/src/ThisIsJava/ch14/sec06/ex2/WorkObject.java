package ThisIsJava.ch14.sec06.ex2;

public class WorkObject {
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify();    // 다른 스레드 실행 대기 상태로
        try {
            wait();  // 본인 일시 정지 상태로
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();
        try {
            wait();
        }catch (InterruptedException e) {}
    }
}
