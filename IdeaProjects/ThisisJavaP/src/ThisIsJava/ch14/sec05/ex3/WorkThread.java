package ThisIsJava.ch14.sec05.ex3;

public class WorkThread extends Thread {
    public boolean work = true;

    public WorkThread(String name) {
        // thread 자식 클래스니까 Thread 메소드인
        // getName, setName 사용 가능
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + ": 작업처리");
            } else {
                System.out.println("false");
                Thread.yield();
            }
        }
    }
}
