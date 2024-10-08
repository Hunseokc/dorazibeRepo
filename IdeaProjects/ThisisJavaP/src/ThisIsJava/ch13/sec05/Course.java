package ThisIsJava.ch13.sec05;

public class Course {

    // 모든 사람 등록 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName()+ "이(가) Course1 등록");
    }

    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName()+ "이(가) Course2 등록");
    }

    // 학생이 아닌 사람과 직장인만 등록 가능
    public static void registerCourse3(Applicant<?super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName()+ "이(가) Course3 등록");
    }
}


