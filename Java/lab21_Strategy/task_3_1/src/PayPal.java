public class PayPal implements BankAccount {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }
}
