package com.basics.tripillarAssignmentThree;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 1, 99, 2};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}

