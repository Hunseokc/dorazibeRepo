package ThisIsJava.ch06.test.test19;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int setBalance(int balance) {
        if (balance <= MAX_BALANCE && balance >= MIN_BALANCE) {
            this.balance = balance;
            return balance;
        } else {
            return this.balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
