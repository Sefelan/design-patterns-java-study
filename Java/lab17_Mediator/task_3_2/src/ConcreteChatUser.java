public class ConcreteChatUser implements ChatUser {
    final private String userId;
    private ChatServer server;

    public ConcreteChatUser(String userId) {
        this.userId = userId;
    }

    public void setServer(ChatServer server) {
        this.server = server;
    }

    public String getUserId() {
        return userId;
    }


    @Override
    public void sendMessage(String message, String userTo) {
        server.sendMessage(getUserId(), message, userTo);
    }

    @Override
    public void receiveMessage(String userFrom, String message) {
        System.out.println("User " + getUserId() + " receives message:\t(from user " + userFrom + ")");
        System.out.println("\t" + message);
    }

    @Override
    public void sendMessageAll(String message) {
        server.sendToAll(getUserId(), message);
    }

    public void sendToGroup(String message, String groupTo) {
        server.sendToGroup(getUserId(), message, groupTo);
    }
}
