package ThisIsJava.ch03.test;

public class test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        System.out.println(y);
    }
}
