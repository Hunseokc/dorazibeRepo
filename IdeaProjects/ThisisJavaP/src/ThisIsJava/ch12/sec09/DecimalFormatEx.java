package ThisIsJava.ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatEx {
    public static void main(String[] args) {
        double num = 1234567.89;
        DecimalFormat df;

        // 소수점 없이
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        // 소수점 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
    }
}
