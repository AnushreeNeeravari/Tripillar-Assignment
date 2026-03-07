package com.basics.tripillarAssignmentTwo.moduleFive;

public class ThrowsDemo {
        // 'throws' indicates this method might throw an exception
        static void validateAge(int age) throws Exception {
            if (age < 18) {
                // 'throw' explicitly throws the exception
                throw new Exception("Age must be 18 or older.");
            }
        }

        public static void main(String[] args) {
            try {
                validateAge(16);
            } catch (Exception e) {
                System.out.println("Validation failed: " + e.getMessage());
            }
        }
    }

