import java.util.HashMap;
import java.util.Map;

public class AccountsDatabase {
    private Map<String, String> adminsAccounts = new HashMap<>();
    private Map<String, String> usersAccounts = new HashMap<>();

    public AccountsDatabase() {
        adminsAccounts.put("admin", "123qweASD");
        adminsAccounts.put("administrator", "1234");

        usersAccounts.put("andrii", "1234");
        usersAccounts.put("black_knight", "S@ruman1");
        usersAccounts.put("white_knight", "ruman1");
    }

    public boolean userExists(String username) {
        return usersAccounts.containsKey(username) || adminsAccounts.containsKey(username);
    }

    public boolean passwordMatches(String username, String password) {
        if (usersAccounts.containsKey(username)) {
            return usersAccounts.get(username).equals(password);
        } else if (adminsAccounts.containsKey(username)) {
            return adminsAccounts.get(username).equals(password);
        }
        return false;
    }
}

class GlobalContext {
    private static final AccountsDatabase accountsDatabase = new AccountsDatabase();

    public static AccountsDatabase getDatabase() {
        return accountsDatabase;
    }
}

