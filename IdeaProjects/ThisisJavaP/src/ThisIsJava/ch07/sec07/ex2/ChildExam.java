package ThisIsJava.ch07.sec07.ex2;

public class ChildExam {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
        // parent.method3(); 오류 발생
    }
}
