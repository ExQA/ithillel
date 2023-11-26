import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BookParser {
    public Map<String, Integer> topWords(Map<String, Integer> words) {
        return words.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int uniqWords(Map<String, Integer> words) {
        return words.size();
    }

    public Map<String, Integer> statistic(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
    public void save(File bookFile, String bookTitle) throws IOException {
        Map<String, Integer> wordCountMap = statistic(bookFile);
        Map<String, Integer> topWords = topWords(wordCountMap);
        StatisticsWriter.writeStatisticsToFile(bookTitle, wordCountMap, topWords, uniqWords(wordCountMap));
    }
}

