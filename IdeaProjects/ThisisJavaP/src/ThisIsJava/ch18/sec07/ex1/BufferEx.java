package ThisIsJava.ch18.sec07.ex1;

import java.io.*;

public class BufferEx {
    public static void main(String[] args) throws Exception {
        String originalFilePath1 =
                BufferEx.class.getResource("test.jpg").getPath();
        String targetFilePath1 = "/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/test.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        // 입출력 스트림 + 버퍼 스트림
        String originalFilePath2 =
                BufferEx.class.getResource("test2.jpg").getPath();
        String targetFilePath2 = "/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/test2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 논버퍼 작업 시간
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

        // 버퍼 작업 시간
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + " ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
    public static long copy(InputStream is, OutputStream os)throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return  (end-start);
    }
}
