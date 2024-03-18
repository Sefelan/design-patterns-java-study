public class PostWordDecorator extends StringDecorator {
    final private String word;

    public PostWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
