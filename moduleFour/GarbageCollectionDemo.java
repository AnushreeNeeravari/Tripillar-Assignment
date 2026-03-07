package com.basics.tripillarAssignmentTwo.moduleFour;

public class GarbageCollectionDemo {
        @Override
        protected void finalize() {
            System.out.println("Garbage Collector has cleaned up this object.");
        }

        public static void main(String[] args) {
            GarbageCollectionDemo obj = new GarbageCollectionDemo();
            obj = null; // Object is now eligible for GC
            System.gc(); // Requesting JVM to run Garbage Collector
            System.out.println("GC requested.");
        }
    }

