package ThisIsJava.ch13.sec05;

public class GenericEx {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>(new Person()));
    }
}
