public class WordsCounter implements Subscriber {
    private int numberOfWords;

    public WordsCounter() {
        this.numberOfWords = 0;
    }

    @Override
    public void update(Publisher publisher, String context) {
        String[] words = context.split("\\s+");
        numberOfWords = numberOfWords + words.length;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }
}
