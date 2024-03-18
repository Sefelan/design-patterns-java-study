public class PostEndlDecorator extends StringDecorator {
    public PostEndlDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
