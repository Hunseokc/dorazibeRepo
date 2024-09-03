package ThisIsJava.ch06.test.test20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args){
    Account[] accArr = new Account[100];
    Scanner scanner = new Scanner(System.in);
    int choiceNum = 0;
    int cnt = 0;
    String accNum;
    String accName;
    int balance;

    POP : while (true){
        System.out.println("----------------------");
        System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
        System.out.println("----------------------");
        System.out.print("선택>");
        choiceNum = scanner.nextInt();
        scanner.nextLine();

        if ((1<choiceNum && choiceNum<5) && cnt==0){
            System.out.println("계좌 생성 필요");
            continue;
        }

        switch (choiceNum) {
            case 1:
                Account account = new Account();
                accArr[cnt] = account;

                System.out.println("------------");
                System.out.println("계좌생성");
                System.out.println("------------");

                Retype : while (true){
                System.out.print("계좌번호 : ");
                accNum = scanner.nextLine();

                for (int i = 0; i <= cnt; i++) {
                    if (accNum.equals(accArr[i].getAccountNum())) {
                        System.out.print("동일한 계좌번호 존재, 다시 입력하세요");
                        continue Retype;
                    }
                }
                accArr[cnt].setAccountNum(accNum);
                break;
                }

                System.out.print("계좌주 : ");
                accName = scanner.nextLine();
                accArr[cnt].setName(accName);

                System.out.print("초기입금액 : ");
                balance = scanner.nextInt();
                accArr[cnt].setBalance(balance);

                System.out.println("결과 : 계좌 생성 완료");

                cnt++;
                break;
            case 2:
                System.out.println("------------");
                System.out.println("계좌목록");
                System.out.println("------------");
                for (int i = 0; i <= cnt; i++) {
                    accArr[i].PrintAll();
                }
                break;
            case 3:
                System.out.println("------------");
                System.out.println("예금");
                System.out.println("------------");
                System.out.print("계좌번호 : ");
                accNum = scanner.nextLine();
                scanner.nextLine();

                System.out.print("예금액 : ");
                balance = scanner.nextInt();
                for (int i = 0; i <= cnt; i++) {
                    if (accNum.equals(accArr[i].getAccountNum())) {
                        int result = accArr[i].getBalance() + balance;
                        accArr[i].setBalance(result);
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("------------");
                System.out.println("예금");
                System.out.println("------------");
                System.out.print("계좌번호 : ");
                accNum = scanner.nextLine();
                scanner.nextLine();

                System.out.print("출금액 : ");
                balance = scanner.nextInt();

                if (balance > accArr[cnt].getBalance()) {
                    System.out.println("가진 돈보다 많은 액수 입력");
                    break;
                } else {
                    for (int i = 0; i <= cnt; i++) {
                        if (accNum.equals(accArr[i].getAccountNum())) {
                            int result = balance - accArr[i].getBalance();
                            accArr[i].setBalance(result);
                            break;
                        }
                    }
                }
                break;
            case 5:
                System.out.println("프로그램 종료");
                break POP;
        }
    }
    }
}
