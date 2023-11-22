import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAnalyzer {
    public Map<String, Integer> getTopWords(Map<String, Integer> wordCountMap) {
        return wordCountMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int countUniqueWords(Map<String, Integer> wordCountMap) {
        return wordCountMap.size();
    }

    public Map<String, Integer> analyzeBook(File bookFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(bookFile))) {
            String line;
            Map<String, Integer> wordCountMap = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 2) {
                        String lowercaseWord = word.toLowerCase();
                        wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
                    }
                }
            }

            return wordCountMap;
        }
    }
    public void analyzeAndWriteStatistics(File bookFile, String bookTitle) throws IOException {
        Map<String, Integer> wordCountMap = analyzeBook(bookFile);
        Map<String, Integer> topWords = getTopWords(wordCountMap);
        StatisticsWriter.writeStatisticsToFile(bookTitle, wordCountMap, topWords, countUniqueWords(wordCountMap));
    }
}

