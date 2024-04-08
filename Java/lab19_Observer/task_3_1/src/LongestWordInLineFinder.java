public class LongestWordInLineFinder implements Subscriber {
    private int WordMaxSize;
    private String longestWord = "";
    private String lineWithLongestWord = "";

    @Override
    public void update(Publisher publisher, String context) {
        String[] words = context.split("\\s+");
        for (String word : words) {
            int currentSize = word.length();
            if (currentSize > WordMaxSize) {
                WordMaxSize = currentSize;
                longestWord = word;
                lineWithLongestWord = context;
            }
        }
    }

    public int getWordMaxSize() {
        return WordMaxSize;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }
}
