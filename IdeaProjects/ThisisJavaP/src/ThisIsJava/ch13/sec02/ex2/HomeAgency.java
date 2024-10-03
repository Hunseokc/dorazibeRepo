package ThisIsJava.ch13.sec02.ex2;

// 제네릭 타입 인터페이스를 구현하는 대리점 클래스 Agency 클래스
public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
