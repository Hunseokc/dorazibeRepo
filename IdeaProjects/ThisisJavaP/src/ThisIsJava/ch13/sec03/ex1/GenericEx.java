package ThisIsJava.ch13.sec03.ex1;

public class GenericEx {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        // Box 클래스의 private 필드 T = int 100
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String value = box2.getT();
        System.out.println(value);
    }
}
