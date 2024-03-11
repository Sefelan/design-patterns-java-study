import java.util.concurrent.locks.ReentrantLock;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class SingletonFileReader {
    private static SingletonFileReader instance = null;
    private static ReentrantLock mutex = new ReentrantLock();


    private SingletonFileReader() {}

    public static SingletonFileReader getInstance() {
        if (instance == null) {
            mutex.lock();
            if (instance == null) {
                instance = new SingletonFileReader();
            }
            mutex.unlock();
        }

        return instance;
    }

    public String readFileAsString(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }


    public int countWordsInFile(String filePath) {
        String content = readFileAsString(filePath);
        if (!content.isEmpty()) {
            String[] words = content.split("\\s+");
            return words.length;
        }
        return 0;
    }
}
