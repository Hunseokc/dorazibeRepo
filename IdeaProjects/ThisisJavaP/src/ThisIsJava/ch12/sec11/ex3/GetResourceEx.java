package ThisIsJava.ch12.sec11.ex3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class GetResourceEx {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);


    }
}
