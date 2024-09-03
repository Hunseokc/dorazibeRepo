package ThisIsJava.ch03.test;

public class test7 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
        // double y = 2.0; -> else 문 시행
        double z = 5 % y;
        if ( Double.isNaN(z) )
        {
            System.out.println("NaN 발생. 0.0으로 나눌 수 없습니다");
        }
        else
        {
            double result = z + 10;
            System.out.println("결과 : " + result);
        }
    }
}
