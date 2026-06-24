package com.aaiaaba.java8features.parameters;

public class Test {

    public static void main(String[] args) {
        Sum sum = (x, y) -> System.out.println("Sum of given 2 numbers is : "+(x+y));
        sum.addition(2, 3);
    }
}
