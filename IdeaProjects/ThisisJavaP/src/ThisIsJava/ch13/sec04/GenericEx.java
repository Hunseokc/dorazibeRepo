package ThisIsJava.ch13.sec04;

public class GenericEx {
    // Number로 제한된 파라미터의 제네릭 클래스
    public static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        // ####Value() 메소드 : 포장형 객체의 값을 지정된 타입으로 반환
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        boolean result1 = compare(10,20); // 매개값에 의해 T = Integer
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(4.5, 4.5); // 매개값에 의해 T = Double
        System.out.println(result2);
    }
}
