package ThisIsJava.ch09.test.t7;

public class Chatting {
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatid) {
        // String nickname = null;
        // nickname = chatid;
        String nickname = chatid;

        Chat chat = new Chat() {
            @Override
            public void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickname + "]" + inputData;
                    sendMessage(message);
                }
            }
        };

        chat.start();
    }
}
