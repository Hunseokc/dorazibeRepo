package ThisIsJava.ch12.test.t5;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }
    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (this == null) {
            return false;
        }

        return this.getClass().equals(object.getClass());
    }

    @Override
    public int hashCode() {
        // hashCode
       return studentNum.hashCode();
    }
}
