package ch06.sec08.ex1;

public class CalculatorExam {
    public static void main(String[] argus) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int resultPlus = myCalc.plus(5,6);
        System.out.println("덧셈 결과 : " + resultPlus);

        int x = 10;
        int y = 4;
        double resultDivide = myCalc.divide(x,y);
        System.out.println(("나눗셈 결과 : " + resultDivide));

        myCalc.powerOff();
    }
}
