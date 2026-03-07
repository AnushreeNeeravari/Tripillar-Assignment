package com.basics.tripillarAssignmentTwo.moduleFour;

public class StringOperations {
    public static void main(String[] args) {
        // 3. String Immutability
        String original = "Java";
        original.concat(" Programming");
        System.out.println("Immutability Check: " + original); // Still prints "Java"
        class StaticDemo {
            static {
                System.out.println("Static block executed: Class loaded into memory.");
            }
        }
    }
}