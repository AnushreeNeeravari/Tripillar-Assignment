package com.basics.tripillarAssignmentThree;

public class PalindromeCheck{
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "hello";
        System.out.println("Is " + word1 + " a" + " a palindrome? " + isPalindrome(word1));
        System.out.println("Is " + word2 + " a" + " a palindrome? " + isPalindrome(word2));
    }
}
