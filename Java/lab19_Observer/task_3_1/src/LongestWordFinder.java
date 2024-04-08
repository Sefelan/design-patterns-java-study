public class LongestWordFinder implements Subscriber {
    private int WordMaxSize;
    private String LongestWord;

    public LongestWordFinder() {
        this.WordMaxSize = 0;
        this.LongestWord = "";
    }

    @Override
    public void update(Publisher publisher, String context) {
        String[] words = context.split("\\s+");
        for (String word : words) {
            int currentSize = word.length();
            if (currentSize > WordMaxSize) {
                WordMaxSize = currentSize;
                LongestWord = word;
            }
        }
    }

    public int getWordMaxSize() {
        return WordMaxSize;
    }

    public String getLongestWord() {
        return LongestWord;
    }
}
