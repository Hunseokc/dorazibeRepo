package ThisIsJava.ch13.test.t4;

public class Util<T, V>{
    public static <T, V> V getValue(Pair pair, T key) {
        if (pair.getKey().equals(key)) {
            return (V)pair.getValue();
        } else {
            return null;
        }
    }
}
