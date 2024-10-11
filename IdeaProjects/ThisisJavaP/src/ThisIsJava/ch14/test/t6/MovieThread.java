package ThisIsJava.ch14.test.t6;

public class MovieThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("동영상 재생");
            if (isInterrupted()) {break;}
        }
    }
}
