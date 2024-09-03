package ThisIsJava.ch08.sec05;

public class RCEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVol(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVol(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
