package ch06.test.test20;

public class Account {
    private String accountNum;
    private String name;
    private int balance;
    static final int MIN_BALANCE = 0;

    public String setAccountNum(String accountNum){
        this.accountNum = accountNum;
        return accountNum;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public int setBalance (int balance){
        if (balance<=0) {
            System.out.println("잘못된 값 시도");
            return this.balance;
        } else {
            this.balance = balance;
            return balance;
        }
    }

    public String getAccountNum(){
        return accountNum;
    }
    public String getName(){
        return name;
    }
    public int getBalance (){
        return balance;
    }

    public void PrintAll () {
        System.out.println(this.accountNum + "    " + this.name + "    " + this.balance);
    }

}
