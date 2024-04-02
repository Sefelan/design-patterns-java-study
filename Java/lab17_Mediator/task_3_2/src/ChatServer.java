import java.util.List;

public interface ChatServer {
    void addUser(ChatUser user);
    void addGroup(String groupName, List<ChatUser> users);

    void sendMessage(String userFrom, String message, String userTo);
    void sendToAll(String userFrom,String message);
    void sendToGroup(String userFrom, String message, String groupName);
}
