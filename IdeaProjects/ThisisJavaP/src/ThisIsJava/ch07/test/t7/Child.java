package ThisIsJava.ch07.test.t7;

public class Child extends Parent {
    public String name;

    public Child() {
        this("이민형");
        System.out.println("Child() call");
    }
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
