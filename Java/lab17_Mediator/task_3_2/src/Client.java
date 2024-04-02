import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ChatServer server = new ConcreteChatServer();

        ConcreteChatUser user1 = new ConcreteChatUser("User1");
        ConcreteChatUser user2 = new ConcreteChatUser("User2");
        ConcreteChatUser user3 = new ConcreteChatUser("User3");
        ConcreteChatUser user4 = new ConcreteChatUser("User4");
        ConcreteChatUser user5 = new ConcreteChatUser("User5");
        ConcreteChatUser user6 = new ConcreteChatUser("User6");

        ArrayList<ChatUser> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        for (ChatUser user : users) {
            user.setServer(server);
            server.addUser(user);
        }

        System.out.println("\n==========Testing message to all users==========\n");
        user1.sendMessageAll("Hello, guys!");

        System.out.println("\n==========Testing personal message==========\n");
        user2.sendMessage("Hello, my only friend.", "User1");

        System.out.println("\n==========Testing message to group==========\n");

        ArrayList<ChatUser> admins = new ArrayList<>();
        admins.add(user1);
        admins.add(user5);
        admins.add(user6);

        server.addGroup("Admins", admins);
        user6.sendToGroup("Hello admins!", "Admins");
    }

}
