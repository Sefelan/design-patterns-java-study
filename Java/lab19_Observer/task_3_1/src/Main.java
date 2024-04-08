import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("resources/input01.txt");

        LongestLineFinder longestLineFinder = new LongestLineFinder();
        LongestWordFinder longestWordFinder = new LongestWordFinder();
        WordsCounter wordsCounter = new WordsCounter();
        LongestWordInLineFinder longestWordInLineFinder = new LongestWordInLineFinder();

        fileReader.subscribe(longestLineFinder);
        fileReader.subscribe(longestWordFinder);
        fileReader.subscribe(wordsCounter);
        fileReader.subscribe(longestWordInLineFinder);

        fileReader.read();

        System.out.println(longestLineFinder.getLongestLine());
        System.out.println(longestWordFinder.getLongestWord());
        System.out.println(wordsCounter.getNumberOfWords());
        System.out.println(longestWordInLineFinder.getLineWithLongestWord());
    }
}
