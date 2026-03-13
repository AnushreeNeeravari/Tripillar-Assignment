package com.basics.tripillarAssignmentThree;

public class SetBits{
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 13;
        int result = countSetBits(number);
        System.out.println("Number " + number);
        System.out.println("Binary representation " + Integer.toBinaryString(number));
        System.out.println("Number of set bits(1s) :" + result);
    }
}
