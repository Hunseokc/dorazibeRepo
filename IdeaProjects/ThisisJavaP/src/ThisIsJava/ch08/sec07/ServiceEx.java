package ThisIsJava.ch08.sec07;

public class ServiceEx {
    public static void main(String[] args) {
        Service service = new ServiceImple();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
