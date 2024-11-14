package ThisIsJava.ch19.sec03.ex2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerEx {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("서버를 종료하려면 q or Q 입력 후 Enter");
        System.out.println("---------------------------------");

        // TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        stopServer();
    }

    public static void startServer() {
        Thread thread = new Thread() {
                @Override
            public void run() {
                    try {
                        serverSocket = new ServerSocket(50001);
                        System.out.println("[서버] 시작");
                        while (true) {
                            System.out.println("\n[서버] 연결 대기 중");
                            Socket socket = serverSocket.accept();
                            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                            System.out.println("[서버] 클라이언트 " + isa.getHostName() + "의 요청 수락");

                            // 스트림을 통한 데이터 송수신
                            // 수신 스트림
                            DataInputStream dis = new DataInputStream(socket.getInputStream());
                            String message = dis.readUTF();

                            // 송신 스트림
                            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                            dos.writeUTF(message);
                            dos.flush();
                            System.out.println("[서버] Echo 완료 : " + message);

                            socket.close();
                            System.out.println("[서버] " + isa.getHostName() + "과 연결 종료");
                        }
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
