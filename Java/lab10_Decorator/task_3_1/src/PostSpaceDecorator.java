public class PostSpaceDecorator extends StringDecorator {
    public PostSpaceDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
