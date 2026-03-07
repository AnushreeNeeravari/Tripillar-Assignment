package com.basics.tripillarAssignmentTwo.moduleFour;

public interface Vehicle {
        void start();
    }

    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car started using the start() method from Vehicle interface.");
        }
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.start();
        }
    }


