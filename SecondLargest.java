package com.basics.tripillarAssignmentThree;

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int first = -1, second = -1;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
