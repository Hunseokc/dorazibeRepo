package ch03;

public class IncreaseDecreaseOperatiorExam {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x );
        y--;
        --y;
        System.out.println("y=" + y );
        System.out.println("----------------");
        z = x++;
        System.out.println("z=" + z );
        System.out.println("x=" + x );
        System.out.println("----------------");
        z = ++x;
        System.out.println("z=" + z );
        System.out.println("x=" + x );

    }
}
