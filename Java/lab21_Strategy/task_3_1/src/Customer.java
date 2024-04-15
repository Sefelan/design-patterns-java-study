public class Customer {
    private BankAccount bankAccount;

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void makePayment(int amount) {
        if (bankAccount != null) {
            bankAccount.makePayment(amount);
        }
    }
}
