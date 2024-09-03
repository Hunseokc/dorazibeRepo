package ThisIsJava.ch08.sec05;

public interface RemoteControl {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    void turnOn();
    void turnOff();
    void setVol(int volume);

    default void setMute (boolean mute) {
        if (mute) {
            System.out.println("음소거");
            setVol(MIN_VOL);
        } else {
            System.out.println("음소거 해제");
        }
    }
}
