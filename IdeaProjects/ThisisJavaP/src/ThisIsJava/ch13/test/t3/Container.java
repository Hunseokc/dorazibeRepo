package ThisIsJava.ch13.test.t3;

public class Container<T, V> {
    private T key;
    private V value;

    public Container () {}

    public void set(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
