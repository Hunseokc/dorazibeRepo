package ThisIsJava.ch15.test.t8;

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Student) {
            if (studentNum == ((Student) object).studentNum) {
                return true;
            }
        }
        return false;
    }
}
