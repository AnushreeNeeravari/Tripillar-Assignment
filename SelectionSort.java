package com.basics.tripillarAssignmentThree;

public class SelectionSort{
    public static int sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            return temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,3,4,5};
        System.out.println(sort(arr));
    }
}
