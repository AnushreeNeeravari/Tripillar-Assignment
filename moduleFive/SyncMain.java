package com.basics.tripillarAssignmentTwo.moduleFive;

public class SyncMain {
        public static void main(String[] args) {
            SharedCounter obj = new SharedCounter();
            Thread t1 = new Thread(() -> obj.printTable(5));
            Thread t2 = new Thread(() -> obj.printTable(10));
            t1.start();
            t2.start();
        }
    }
