package ThisIsJava.ch15.test.t10;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student (String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
        if (s.score > score) return -1;
        else if (s.score == score) return 0;
        else return 1;
    }
}
