package ThisIsJava.ch14.sec08;

public class DaemonEx {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            // 슬립 한번 떄리고
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
        // 이대로 코드가 종료되어 버리니까 데몬인 AST도 자동 종료
    }
}
