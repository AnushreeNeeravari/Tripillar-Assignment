package com.basics.tripillarAssignmentThree;

import java.util.Arrays;

public class AnagramCheck {
        public static boolean isAnagram(String s1, String s2) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        System.out.println("Are " + str1 + "and " + str2 + " Anagrams? " + isAnagram(str1,str2));
        System.out.println("Are " + str1 + "and " + str3 + " Anagrams? " + isAnagram(str1,str3));
    }
    }

