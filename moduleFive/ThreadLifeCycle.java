package com.basics.tripillarAssignmentTwo.moduleFive;

public class ThreadLifeCycle {
        public static void main(String[] args) {
            Thread t = new Thread(() -> {
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            });
            System.out.println("State after creation: " + t.getState()); // NEW
            t.start();
            System.out.println("State after start(): " + t.getState()); // RUNNABLE
        }
    }

