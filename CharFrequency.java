package com.basics.tripillarAssignmentThree;

import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "hello";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println(map);
    }
}
