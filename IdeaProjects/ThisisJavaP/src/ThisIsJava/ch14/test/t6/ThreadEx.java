package ThisIsJava.ch14.test.t6;

public class ThreadEx {
    public static void main(String[] args) {
    Thread thread = new MovieThread();
    thread.start();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {}

    thread.interrupt();
    }
}
