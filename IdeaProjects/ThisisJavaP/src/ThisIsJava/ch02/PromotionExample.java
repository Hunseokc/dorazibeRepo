package ThisIsJava.ch02;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        char charValue = 'A';
        intValue = charValue;
        System.out.println("intValue's UniCode : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);
    }
}
