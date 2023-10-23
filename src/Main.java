import static com.task1.Palindrome.isPalindrome;
import static com.task2.ContainsDuplicate.isDuplicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // true
        System.out.println(isPalindrome("race a car"));  // false

        System.out.println(isDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(isDuplicate(new int[]{1, 2, 3, 1})); // true
    }
}