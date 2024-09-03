package ch08.sec08;

public class MultiInterfaceImpleEx {
    public static void main(String[] args){
        RemoteControl rc = new SmartTv();

        rc.turnOn();
        rc.turnOff();

        Searchable sc = new SmartTv();

        sc.search("http:/youtube.com");
    }
}
