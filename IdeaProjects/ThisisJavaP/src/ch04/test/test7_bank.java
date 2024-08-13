package ch04.test;

import java.util.Scanner;

public class test7_bank {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        Outter:
        while (true) {
            System.out.println("---------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.print("선택>");
            int inputNum = scanner.nextInt();

            switch (inputNum) {
                case 1: {   // 예금
                    System.out.print("예금액>");
                    scanner.nextLine();
                    inputNum = scanner.nextInt();
                    result += inputNum;
                    break;
                }
                case 2: {  // 출금
                    System.out.print("출금액>");
                    scanner.nextLine();
                    inputNum = scanner.nextInt();
                    result -= inputNum;
                    break;
                }
                case 3: {  // 잔고
                    System.out.print("잔고>" + result);
                    System.out.println();
                    break;
                }
                case 4: {   // 종료
                    break Outter;
                }

            }
        }
    }
}