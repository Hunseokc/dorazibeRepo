package ch06.sec08.ex4;

public class CalcuExam {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        double result1 = myCal.areaRectangle(10);
        double result2 = myCal.areaRectangle(10,20);

        System.out.println("정사각형 : " + result1);
        System.out.println("직사각형 : " + result2);
    }
}
