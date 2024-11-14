package ThisIsJava.ch19.sec03.ex1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx_TCP {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("서버를 종료하려면 q or Q 입력 후 Enter");
        System.out.println("---------------------------------");

        // TCP 서버 시작
        startServer();

        // 입력
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
        // 작업 스레드 정의
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작");

                    while (true) {
                        System.out.println("\n[서버] 연결 요청 대기 중\n");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라 정보 수집
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostName() + "의 요청 수락");

                        // 연결 종료
                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결 종료");
                    }
                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        // 스레드 시작
        thread.start();
    }
    public static void stopServer() {
        try {
            // ServerSocket 닫고 Port 언바인딩
            serverSocket.close();
            System.out.println("[서버] 종료");
        } catch (IOException e) {  }
    }
}
