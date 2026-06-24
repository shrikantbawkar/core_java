package com.aaiaaba.java8features.predicate;

import java.util.function.Predicate;

public class PredicateClassTest {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Predicate<Integer> lessThan = i -> i < 5;
    Predicate<Integer> evenNum = i -> i % 2 == 0;

    Predicate<Integer> num1 = i -> i%2 == 0;
    

    Predicate<String> strLen = l -> l.length() < 5;

    public static void main(String[] args) {
        PredicateClassTest testClass = new PredicateClassTest();

        System.out.println("strLen: " + testClass.strLen.test("qwqw"));
        System.out.println("-------------------------------");
        for (int i : testClass.arr) {
            if (testClass.lessThan.test(i)) {
                System.out.println("lessThanFive: " + i);
            }
            if (testClass.evenNum.test(i)) {
                System.out.println("evenNum: " + i);
            }
        }
        System.out.println("-------------------------------");
        
        System.out.println("Predicate join - ");
        for (int i : testClass.arr) {
            if (testClass.lessThan.and(testClass.evenNum).test(i)) {
                System.out.println("Predicate join - lessThanFive and evenNum: " + i);
            }
        }
    }

}
