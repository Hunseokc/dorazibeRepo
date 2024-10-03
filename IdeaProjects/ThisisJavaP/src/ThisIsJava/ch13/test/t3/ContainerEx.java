package ThisIsJava.ch13.test.t3;

public class ContainerEx {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println(name1);
        System.out.println(job);

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 6);
        String name2 = container2.getKey();
        int value = container2.getValue();
        System.out.println(name2);
        System.out.println(value);
    }
}
