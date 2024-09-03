package ThisIsJava.ch03.test;

public class test3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;
        // 학생 한명 당 연필 수
        int pencilsPerStudent = pencils / students;  // 17
        System.out.println(pencilsPerStudent);

        // 남은 연필 수                          510
        int pencilsLeft = pencils - (pencilsPerStudent * students);
        System.out.println(pencilsLeft);    // 24
    }
}
