import java.util.Arrays;

import static com.task1.Palindrome.isPalindrome;
import static com.task2.ContainsDuplicate.isDuplicate;
import static com.task3.CountTwoSum.twoSum;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // true
        System.out.println(isPalindrome("race a car"));  // false
        //task2
        System.out.println(isDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(isDuplicate(new int[]{1, 2, 3, 1})); // true
        //task3
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
}