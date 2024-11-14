package ThisIsJava.ch19.sec03.ex2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class EchoClientEx {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 접속 요청");

            String sendMessage = "구마유시 파이팅";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(sendMessage);
            dos.flush();
            System.out.println("[클라이언트] 데이터 송신 : " + sendMessage);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 수신 : " + receiveMessage);

            socket.close();
            System.out.println("[클라이언트] 연결 종료");
        } catch (Exception e) {}
    }
}
