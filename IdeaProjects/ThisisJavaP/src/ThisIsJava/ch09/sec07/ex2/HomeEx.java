package ThisIsJava.ch09.sec07.ex2;

public class HomeEx {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();
        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방 on");
            }

            @Override
            public void turnOff() {
                System.out.println("난방 off");
            }
        });
    }
}
