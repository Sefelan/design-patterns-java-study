public class AccessHandler extends BaseAccountHandler {
    @Override
    public void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        String username = account.getLogin();

        if (accessType == Account.AccessType.User){
            System.out.println("User access provided: " + username);
        } else if (accessType == Account.AccessType.Administrator) {
            System.out.println("Administrator access provided: " + username);
        } else {
            throw new IllegalArgumentException("Undefined AccessType while providing access");
        }
    }
}
