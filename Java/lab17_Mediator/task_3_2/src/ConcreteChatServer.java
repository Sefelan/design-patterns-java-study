import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteChatServer implements ChatServer {
    private Map<String, ChatUser> users = new HashMap<>();
    private Map<String, List<ChatUser>> groups = new HashMap<>();

    public void addUser(ChatUser user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void sendMessage(String userFrom, String message, String userTo) {
        ChatUser receiver = users.get(userTo);
        if (receiver != null) {
            receiver.receiveMessage(userFrom, message);
        }
    }

    @Override
    public void sendToAll(String userFrom, String message) {
        for (ChatUser user : users.values()) {
            if (!user.getUserId().equals(userFrom)) {
                sendMessage(userFrom, message, user.getUserId());
            }
        }
    }

    public void addGroup(String groupName, List<ChatUser> users) {
        groups.put(groupName, users);
    }

    public void sendToGroup(String userFrom, String message, String groupName) {
        List<ChatUser> groupUsers = groups.get(groupName);
        if (groupUsers != null) {
            if (groupUsers.contains(users.get(userFrom))) {
                for (ChatUser user : groupUsers) {
                    if (!user.getUserId().equals(userFrom)) {
                        sendMessage(userFrom, message, user.getUserId());
                    }
                }
            }
        }
    }
}
