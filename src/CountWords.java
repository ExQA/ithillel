public class CountWords {
    public static int countOccurance(String[] wordsList, String word) {
        int count = 0;
        for (String currentWord : wordsList) {
            if (currentWord.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
