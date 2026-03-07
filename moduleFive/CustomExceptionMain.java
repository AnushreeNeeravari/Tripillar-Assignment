package com.basics.tripillarAssignmentTwo.moduleFive;

class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    public class CustomExceptionMain {
        public static void main(String[] args) {
            try {
                throw new MyException("This is a user-defined custom exception.");
            } catch (MyException e) {
                System.out.println("Caught: " + e.getMessage());
            }
        }
    }

