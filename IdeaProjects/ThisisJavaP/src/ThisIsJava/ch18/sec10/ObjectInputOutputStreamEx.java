package ThisIsJava.ch18.sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamEx {
    public static void main(String[] args) throws Exception {
        // OutputStream - ObjectOutputStream 연결
        FileOutputStream fos = new FileOutputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 150000);
        int[] arr1 = { 1, 2, 3 };

        // 객체 출력(직렬화하여 파일로 저장)
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();

        // InputStream -> ObjectInputStream 연결
        FileInputStream fis = new FileInputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 파일 입력 + 역직렬화로 객체 복원
        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        // 복원 객체 내용 확인(화면 출력)
        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
