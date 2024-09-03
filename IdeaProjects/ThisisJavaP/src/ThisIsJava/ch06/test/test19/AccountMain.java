package ThisIsJava.ch06.test.test19;

import ThisIsJava.ch06.sec13.ex2.pack1.A;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(1000);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : "+account.getBalance());
    }
}
