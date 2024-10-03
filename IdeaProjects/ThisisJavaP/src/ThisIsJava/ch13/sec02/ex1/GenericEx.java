package ThisIsJava.ch13.sec02.ex1;

public class GenericEx {
    public static void main(String[] args) {
        // product1 객체는 K = Tv, M = String 파라미터
        Product<Tv, String> product1 = new Product<>(); // new는 타입 명시X

        // Setter 매개값 올바른 입력(타입) 필수
        product1.setKind(new Tv());
        product1.setModel("스마트TV");

        // Getter 리턴값  = Tv String 타입
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        // K = Car M = String
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV");

        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
