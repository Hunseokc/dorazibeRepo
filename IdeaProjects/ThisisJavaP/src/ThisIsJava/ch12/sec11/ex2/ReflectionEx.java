package ThisIsJava.ch12.sec11.ex2;

import ThisIsJava.ch06.test.test16.Printer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + "(");
            Class[] parameters = con.getParameterTypes();
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    private static void printParameters(Class[] parameters) {
        for (int i=0; i<parameters.length; i++) {
            System.out.println(parameters[i].getName());
            if(i<(parameters.length-1)) {
                System.out.println(",");
            }
        }
    }
}
