package ThisIsJava.ch14.sec05.ex1;

import java.awt.*;

public class SleepEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e) {}
        }
    }
}
