package com.basics.tripillarAssignmentTwo.moduleFour;

abstract class Shape {
        abstract void display();
    }

    class Circle extends Shape {
        @Override
        void display() {
            System.out.println("Displaying Circle: This is a round shape.");
        }
            public static void main(String[] args) {
                Circle myCircle = new Circle();
                myCircle.display();
            }
        }


