package com.basics.tripillarAssignmentThree;

public class Factorial{
    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
