package ch07.sec04.ex1;

public class Computerex {
    public static void main(String[] args) {
        int r = 10;

        Calculator myCal = new Calculator();
        System.out.println("원 면적 : "+myCal.areaCircle((double)r));
        System.out.println();

        Computer myCom = new Computer();
        System.out.println("원 면적 : "+myCom.areaCircle((double)r));
    }
}
