package ch07.sec4.ex1;

public class Computer extends Calculator{
    @Override
    public double areaCircle (double r) {
        System.out.println("Computer 객체 메소드 실행");
        return Math.PI * r * r;
    }
}
