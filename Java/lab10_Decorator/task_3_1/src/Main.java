public class Main {

    public static void main(String[] args) {
        Printable printable = new PrintableString("");
        printable = new PostComaDecorator(printable);
        printable = new PostSpaceDecorator(printable);
        printable = new PostWordDecorator(printable, "World");
        printable = new PreWordDecorator(printable, "Hello");
        printable = new PostExclaimDecorator(printable);
        printable.print();
    }

}
