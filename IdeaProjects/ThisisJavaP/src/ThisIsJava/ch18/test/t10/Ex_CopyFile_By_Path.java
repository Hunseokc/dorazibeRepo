package ThisIsJava.ch18.test.t10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex_CopyFile_By_Path {
    public static void main(String[] args) {
        try {
            Scanner pathScan = new Scanner(System.in);

            System.out.print("원본 파일 경로 : ");
            String original = pathScan.nextLine();
            File origfinalFile = new File(original);
            if (!origfinalFile.exists()) {
                System.out.println("원본 파일 존재하지 않습니다.");
                System.exit(0);
            }
            Path originalPath = Paths.get(original);

            System.out.print("복사 파일 경로 : ");
            String target = pathScan.nextLine();
            File targetFile = new File(target);
            Path targetPath = Paths.get(target);

            // 부모 경로 없으면 전부 생성해주기
            File parent = targetFile.getParentFile();
            if (!parent.exists()) {
                targetFile.mkdirs();
            }

            // 바이트 기반 스트림       성능 향상 -> 버퍼 스트림
            FileInputStream is = new FileInputStream(origfinalFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            FileOutputStream fos = new FileOutputStream(targetFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] data = new byte[1024];
            int num = -1;
            while (true) {
                num = bis.read(data);
                if(num == -1) break;
                bos.write(data, 0, num);
             }
            System.out.println("복사가 성공되었습니다.");

            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
