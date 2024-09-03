package ThisIsJava.ch08.sec04;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio off");
    }

    @Override
    public void setVol(int volume) {
        if (volume>RemoteControl.MAX_VOL) {
            this.volume = RemoteControl.MAX_VOL;
        } else if (volume<RemoteControl.MIN_VOL) {
            this.volume = RemoteControl.MIN_VOL;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }
}
