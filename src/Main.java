import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final String FILE_EXTENSION = ".txt";
    public static final String DIRECTORY = "src";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book to analyze: ");
        String bookTitle = scanner.nextLine();

        Path path = Paths.get(DIRECTORY, bookTitle + FILE_EXTENSION);
        File file = new File(String.valueOf(path));

        if (!isValidPath(path)) {
            System.out.println("The book '"
                    + bookTitle + "' is missing in the " + DIRECTORY
                    + "/ directory or it is not a file.");
            return;
        }

        if (file.exists() && file.isFile()) {
            try {
                BookParser bookParser = new BookParser();

                // Analyze the book
                Map<String, Integer> wordCountMap = bookParser.statistic(file);
                System.out.println("The result of the analysis of the book:");
                printWordCount(wordCountMap);

                // Getting top 10 words
                Map<String, Integer> topWords = bookParser.topWords(wordCountMap);
                System.out.println("\nTOP10 words");
                printWordCount(topWords);

                // Total number of unique words
                int uniqueWordsCount = bookParser.uniqWords(wordCountMap);
                System.out.println("\nTotal number of unique words: " + uniqueWordsCount);

                // Wring analyze in the file
                bookParser.save(file, bookTitle);

            } catch (IOException e) {
                System.out.println("Error during getting the book: " + e.getMessage());
            }
        } else {
            System.out.println("The book " + bookTitle + " is not fined in src/");
        }

        scanner.close();
    }

    private static boolean isValidPath(Path path) {
        return Files.isRegularFile(path) && !Files.isDirectory(path);
    }

    private static void printWordCount(Map<String, Integer> wordCountMap) {
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
