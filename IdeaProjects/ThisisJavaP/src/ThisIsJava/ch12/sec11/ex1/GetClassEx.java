package ThisIsJava.ch12.sec11.ex1;

public class GetClassEx {
    public static void main(String[] args) throws Exception {
        Class[] clazzs = new Class[3];

        clazzs[0] = Car.class;


        clazzs[1] = Class.forName("ThisIsJava.ch12.sec11.ex1.Car");

        Car car = new Car();
        clazzs[2] = car.getClass();

        for (Class c : clazzs){
            System.out.println("패키지 : " + c.getPackage().getName());
            System.out.println("클래스 간단 이름 : " + c.getSimpleName());
            System.out.println("클래스 전체 이름 : " + c.getName());
        }
    }
}
