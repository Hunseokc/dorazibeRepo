package ThisIsJava.ch14.sec07.ex3;

public class InterruptEx {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
