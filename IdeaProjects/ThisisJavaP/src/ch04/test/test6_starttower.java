package ch04.test;

public class test6_starttower {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 5; i++){
            cnt = i;
            while (cnt > 0){
            System.out.print("*");
            --cnt;
            }
            System.out.println();
        }
    }
}
