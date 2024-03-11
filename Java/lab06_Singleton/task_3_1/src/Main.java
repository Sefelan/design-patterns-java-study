public class Main {
    public static void main(String[] args) {

        SingletonFileReader singletonFileReader = SingletonFileReader.getInstance();
        SingletonFileReader singletonFileReader2 = SingletonFileReader.getInstance();

        System.out.println("Instances check: " + (singletonFileReader == singletonFileReader2)+ "\n");

        String filePath = "./txts/SomeText.txt";
        String content = singletonFileReader.readFileAsString(filePath);
        System.out.println("File content:\n" + content + "\n");

        int wordCount = singletonFileReader.countWordsInFile(filePath);
        System.out.println("Number of words in the file: " + wordCount);
    }
}
