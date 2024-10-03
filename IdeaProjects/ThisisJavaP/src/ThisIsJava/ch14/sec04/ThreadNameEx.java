package ThisIsJava.ch14.sec04;

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread();
        System.out.println(mainthread.getName() + " 실행");

        for (int i = 0; i<3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    // thread.getName 안했어도 인스턴스 메소드로 작동
                    System.out.println(getName() + " 실행");
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
