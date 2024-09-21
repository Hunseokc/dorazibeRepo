package ThisIsJava.ch12.sec06;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        int value = obj;
        System.out.println("value : " + value);

        int result = obj + 100;
        System.out.println("result : " + result);

        String str = "A";
        char c = str.charAt(0);
        System.out.println(c);
    }
}
