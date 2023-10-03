import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String s = input.nextLine().toLowerCase();
        System.out.print("Enter second String: ");
        String t = input.nextLine().toLowerCase();

        Solution solution = new Solution();

        System.out.println(solution.isAnagram(s, t));
    }

}