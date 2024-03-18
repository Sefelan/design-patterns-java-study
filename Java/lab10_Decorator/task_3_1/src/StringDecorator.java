abstract class StringDecorator implements Printable {
    final private Printable printable;

    public StringDecorator(Printable printable) {
        this.printable = printable;
    }

    public void print() {
        printable.print();
    }
}