package ThisIsJava.ch16.sec05.ex3;

public class ConstructorReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1( Member::new );

        // toString으로 인해 객체 정보 16진수 뱉지만 오버라이딩해서 info 반환
        System.out.println(m1);
        System.out.println();

        Member m2 = person.getMember2( Member :: new );
        System.out.println(m2);
    }
}
