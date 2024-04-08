import java.io.*;

public class FileReader extends Publisher{

    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;

    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        notifySubscribers(line);
    }

}
