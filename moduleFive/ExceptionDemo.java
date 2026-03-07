package com.basics.tripillarAssignmentTwo.moduleFive;

public class ExceptionDemo {
        public static void main(String[] args) {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught: Division by zero is not allowed.");
            } finally {
                System.out.println("Cleanup: The finally block always executes.");
            }
        }
    }

