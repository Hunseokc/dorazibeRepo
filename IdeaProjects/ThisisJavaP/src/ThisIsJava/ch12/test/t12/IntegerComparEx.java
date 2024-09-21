package ThisIsJava.ch12.test.t12;

public class IntegerComparEx {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println( obj1 == obj2);
        // == != 연산 허용 범위 밖
        // System.out.println( obj3 == obj4);
        System.out.println( obj3.equals(obj4));
    }
}
