package com.basics.tripillarAssignmentTwo.moduleFive;

public class SharedCounter {
        synchronized void printTable(int n) { // synchronized prevents thread interference
            for (int i = 1; i <= 3; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }

