import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class StatisticsWriter {
    public static void writeStatisticsToFile(String bookTitle, Map<String, Integer> wordCountMap, Map<String, Integer> topWords, int uniqueWordsCount) throws IOException {
        String statisticFilePath = System.getProperty("user.dir") + "/src/" + bookTitle + "_statistic.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(statisticFilePath))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " -> " + entry.getValue());
                writer.newLine();
            }

            writer.newLine();
            writer.write("TOP10 words:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : topWords.entrySet()) {
                writer.write(entry.getKey() + " -> " + entry.getValue());
                writer.newLine();
            }

            writer.write("Total word count: " + wordCountMap.size());
            writer.newLine();
            writer.write("Total number of unique words: " + uniqueWordsCount);
        }
        System.out.println("Statistics are saved to the file " + bookTitle + "_statistic.txt");
    }
}