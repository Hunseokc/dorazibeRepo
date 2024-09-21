package ThisIsJava.ch12.sec07;

public class MathEx {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("올림 v1 : " + v1);
        System.out.println("내림 v2 : " + v2);

        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("최대 v3 : " + v3);
        System.out.println("최소 v4 : " + v4);

        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v5 = temp2 / 100.0;
        System.out.println("반올림 v5 : " + v5);
    }
}
