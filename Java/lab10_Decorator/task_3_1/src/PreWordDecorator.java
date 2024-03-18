public class PreWordDecorator extends StringDecorator {
    final private String word;

    public PreWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}
