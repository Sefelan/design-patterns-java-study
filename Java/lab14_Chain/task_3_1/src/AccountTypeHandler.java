public class AccountTypeHandler extends BaseAccountHandler {
    @Override
    public void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        if (accessType == Account.AccessType.Guest){
            System.out.println("Guest access provided!");
        } else if (accessType == Account.AccessType.User){
            super.handle(account);
        } else if (accessType == Account.AccessType.Administrator) {
            super.handle(account);
        } else {
            throw new IllegalArgumentException("Undefined AccessType");
        }
    }
}
