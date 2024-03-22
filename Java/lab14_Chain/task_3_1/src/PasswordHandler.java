public class PasswordHandler extends BaseAccountHandler {
    @Override
    public void handle(Account account) {
        AccountsDatabase accountsDatabase = GlobalContext.getDatabase();

        String username = account.getLogin();
        String password = account.getPassword();

        if (accountsDatabase.passwordMatches(username, password)) {
            super.handle(account);
        } else {
            System.out.println("Invalid password");
        }
    }
}
