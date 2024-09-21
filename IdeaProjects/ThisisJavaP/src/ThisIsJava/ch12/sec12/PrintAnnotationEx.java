package ThisIsJava.ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
    public static void main(String[] args) throws Exception{
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            // 어노테이션 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            // 설정 정보의 지정된 선 출력
            printLine(printAnnotation);

            // 메소드 호출
            method.invoke(new Service());

            // 설정 정보 참조해서 선 출력
            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            // number 속성값 얻기
            int number = printAnnotation.number();
            for (int i = 0; i<number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
