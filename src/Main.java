import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] wordsList = {"apple", "java", "python", "c++", "c#", "android", "samsung", "php", "apple", "ring"};
        String word = "apple";
        System.out.println(CountWords.countOccurance(wordsList, word));

        Integer[] Array = {1, 2, 3};
        System.out.println(ConvertArrayToList.toList(Array));

        Integer[] numbers = {5, 1, 2, 3, 4, 5, 5};
        System.out.println(UniqueNumbers.findUnique(numbers));

    }
}