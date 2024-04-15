public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setBankAccount(new ApplePay());
        customer.makePayment(150);
        customer.setBankAccount(new GooglePay());
        customer.makePayment(250);
        customer.setBankAccount(new PayPal());
        customer.makePayment(350);
    }
}
