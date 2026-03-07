package com.basics.tripillarAssignmentTwo.moduleFour;

public class StaticBlock {
        static {
            System.out.println("Static block: This runs once when the class is loaded.");
        }

        public static void main(String[] args) {
            System.out.println("Main method: This runs after the static block.");
        }
    }

