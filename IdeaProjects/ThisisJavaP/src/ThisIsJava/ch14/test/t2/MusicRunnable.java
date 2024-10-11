package ThisIsJava.ch14.test.t2;

public class MusicRunnable extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<3; i++) {
            System.out.println("음악을 재생");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
