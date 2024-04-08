public class LongestLineFinder implements Subscriber {
    private int lineMaxSize;
    private String LongestLine;

    public LongestLineFinder() {
        this.lineMaxSize = 0;
        this.LongestLine = "";
    }

    @Override
    public void update(Publisher publisher, String context) {
        final int currentSize = context.length();
        if (currentSize > lineMaxSize) {
            lineMaxSize = currentSize;
            LongestLine = context;
        }
    }

    public int getLineMaxSize() {
        return lineMaxSize;
    }

    public String getLongestLine() {
        return LongestLine;
    }
}
