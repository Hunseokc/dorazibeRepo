package ch06.sec10.ex1;

public class CalculatorExam {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.printf("result1 : %f\n", result1);
        System.out.printf("result2 : %d\n", result2);
        System.out.printf("result3 : %d\n", result3);
    }
}
