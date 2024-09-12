package ThisIsJava.ch11.sec06;

public class Account {
    private long balance;

    public Account() {};

    // getter
    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money) {
        balance += money;
    }

    // 출금 (부족 시 사용자 정의 예외 출력)
    public void withdraw (int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고 부족 : " + (money - balance) + "필요");
        }
        balance -= money;
    }

}
