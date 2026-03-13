package com.basics.tripillarAssignmentThree;

import java.util.LinkedHashSet;

public class RemoveDuplicates{
    public static String remove(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for (Character c : set) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = remove(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
