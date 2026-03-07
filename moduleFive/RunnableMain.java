package com.basics.tripillarAssignmentTwo.moduleFive;

public class RunnableMain {
        public static void main(String[] args) {
            Thread t1 = new Thread(new MyRunnable());
            t1.start();
        }
    }
