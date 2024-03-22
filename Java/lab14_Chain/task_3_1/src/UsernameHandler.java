public class UsernameHandler extends BaseAccountHandler {
    @Override
    public void handle(Account account) {
        AccountsDatabase accountsDatabase = GlobalContext.getDatabase();

        String username = account.getLogin();

        if (accountsDatabase.userExists(username)) {
            super.handle(account);
        } else {
            System.out.println("No account with username " + username);
        }
    }
}
