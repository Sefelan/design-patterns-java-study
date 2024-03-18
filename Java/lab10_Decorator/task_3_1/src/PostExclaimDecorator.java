public class PostExclaimDecorator extends StringDecorator {
    public PostExclaimDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
