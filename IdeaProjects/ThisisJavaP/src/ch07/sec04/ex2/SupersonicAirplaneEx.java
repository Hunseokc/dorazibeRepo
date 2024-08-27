package ch07.sec04.ex2;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane superAir = new SupersonicAirplane();
        superAir.takeOff();
        superAir.fly();
        superAir.flyMode = SupersonicAirplane.SUPERSONIC;
        superAir.fly();
        superAir.flyMode = SupersonicAirplane.NORMAL;
        superAir.fly();
        superAir.land();
    }
}
