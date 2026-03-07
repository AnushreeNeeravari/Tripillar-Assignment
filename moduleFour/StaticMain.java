package com.basics.tripillarAssignmentTwo.moduleFour;

  class Student {
         static String schoolName = "Tech University";

         static void displaySchool() {
             System.out.println("School Name: " + schoolName);
         }
     }

     public class StaticMain {
         public static void main(String[] args) {
             // Accessing static members without creating an object
             Student.displaySchool();
         }
     }


