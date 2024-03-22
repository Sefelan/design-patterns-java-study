public interface AccountHandler {
    void setNext(AccountHandler accountHandler);
    void handle(Account account);
}