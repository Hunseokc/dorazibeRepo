package ch04.test;

public class test4_whileMathrandom {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        while (num1 + num2 != 5) {
            num1 = (int)(Math.random() * 6) + 1;
            num2 = (int)(Math.random() * 6) + 1;
                System.out.printf("주사위 두개의 결과 : (%d, %d)\n", num1, num2);
            }
        System.out.printf("눈의 합 5 : (%d + %d) = %d\n", num1, num2, num1+num2);
    }
}
