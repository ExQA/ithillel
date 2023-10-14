import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
    public static List<Integer> findUnique(Integer[] numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }
}
