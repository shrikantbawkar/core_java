package com.aaiaaba.java8features.methodref;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        FunctionalTest f1 = test::rtest;

        FunctionalTest f = (s) -> s.length();
        f.testLen("null");

    }

    int rtest(String s) {
        return s.length();

    }
}
