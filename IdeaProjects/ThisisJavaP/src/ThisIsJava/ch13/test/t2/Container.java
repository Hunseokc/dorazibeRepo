package ThisIsJava.ch13.test.t2;

public class Container<T> {
    private T container;

    public Container () {}

    public T get() {
        return container;
    }

    public void set(T t) {
        this.container = t;
    }
}
