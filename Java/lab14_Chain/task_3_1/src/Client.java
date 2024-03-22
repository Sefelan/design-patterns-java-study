public class Client {

    public static void main(String[] args) {

        Account[] loginAttempts = {
                Account.createAdmin("admin", "123qweASD"),
                Account.createAdmin("administrator", "1234"),
                Account.createUser("andrii", "1234"),
                Account.createGuest(),
                Account.createUser("black_knight", "S@ruman1"),
                Account.createUser("white_knight", "S111"),
                Account.createGuest(),
        };

        AccountHandler accountTypeHandler = new AccountTypeHandler();
        AccountHandler usernameHandler = new UsernameHandler();
        AccountHandler passwordHandler = new PasswordHandler();
        AccountHandler accessHandler = new AccessHandler();

        accountTypeHandler.setNext(usernameHandler);
        usernameHandler.setNext(passwordHandler);
        passwordHandler.setNext(accessHandler);

        for (Account attempt : loginAttempts) {
            accountTypeHandler.handle(attempt);
        }
    }
}
