public class PostComaDecorator extends StringDecorator {
    public PostComaDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
