package ThisIsJava.ch13.sec05;

public class GenericE {
    public static void main(String[] args) {
        // Course1 : 모든 사람 가능 (?)
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // Course2 : 학생만 가능 (? extend Student)
        // Course.registerCourse2(new Applicant<Person>(new Person()));
        // Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // Course3 : 학생 제외 나머지 가능 (?super Worker)
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
        //Course.registerCourse3(new Applicant<HightStudent>(new HightStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();
    }
}
