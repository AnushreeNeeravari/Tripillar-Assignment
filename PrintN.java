package com.basics.tripillarAssignmentThree;

import com.advanced.collections.sets.MaintainInsertionOrder;

public class PrintN{
    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing numbers from 1 to " + n + " : ");
        print(n);
        System.out.println();
    }
}
