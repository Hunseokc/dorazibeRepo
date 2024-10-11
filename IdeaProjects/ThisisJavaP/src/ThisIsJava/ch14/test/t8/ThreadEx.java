package ThisIsJava.ch14.test.t8;

public class ThreadEx {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);
        thread.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) {};
    }
}
