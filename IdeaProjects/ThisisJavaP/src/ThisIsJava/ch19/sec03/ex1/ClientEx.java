package ThisIsJava.ch19.sec03.ex1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");
            socket.close();
            System.out.println("[클라이언트] 연결 종료");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
