package ThisIsJava.ch16.sec05.ex1;

public class MethodReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();
        // (x, y) -> Computer :: staticMethod X !!!!!!
        person.action( Computer :: staticMethod );

        Computer com = new Computer();
        person.action( com :: instanceMethod );
    }
}
