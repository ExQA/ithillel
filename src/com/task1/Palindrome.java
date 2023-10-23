package com.task1;

public class Palindrome {
    public static boolean isPalindrome(String s) {

        // Convert to lowercase and Remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("\\W+", "");

        // Check if the resulting string is equal to its reverse
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
