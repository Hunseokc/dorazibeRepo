package ThisIsJava.ch16.test.t9;

public class Ex {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static double avg(Function<Student> function) {
        double sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        double result = sum / (double) students.length;
        return result;
    }

    public static void main(String[] args) {
        double englishAvg = avg( Student::getEnglishScore );
        System.out.println("영어 평균 점수 : " + englishAvg);
        double mathAvg = avg( Student :: getMathScore );
        System.out.println("수학 평균 점수 : " + mathAvg);
    }
}
