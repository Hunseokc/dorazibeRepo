package ThisIsJava.ch14.sec07.ex3;

public class PrintThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중");
            // sleep 메소드를 안쓰니까 예외처리 X
            if(Thread.interrupted()) {
                break;
            }
        }

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}

