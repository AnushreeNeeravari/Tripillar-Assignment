package com.basics.tripillarAssignmentTwo.moduleFive;

public class AlternatingNumbers {
        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: Number " + i);
                    try { Thread.sleep(50); } catch (Exception e) {}
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2: Number " + i);
                    try { Thread.sleep(50); } catch (Exception e) {}
                }
            });

            t1.start();
            t2.start();
        }
    }

