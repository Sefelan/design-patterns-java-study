public interface ChatUser {
    void setServer(ChatServer server);
    String getUserId();

    void sendMessage(String message, String userTo);
    void receiveMessage(String userFrom, String message);
    void sendMessageAll(String message);
    void sendToGroup(String message, String groupTo);
}
