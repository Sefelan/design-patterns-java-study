public class BaseAccountHandler implements AccountHandler {
    private AccountHandler next;

    @Override
    final public void setNext(AccountHandler accountHandler) {
        next = accountHandler;
    }

    @Override
    public void handle(Account account) {
        if (next != null) {
            next.handle(account);
        }
    }
}
