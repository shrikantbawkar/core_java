package com.aaiaaba.java8features.function;

import java.util.function.Function;

public class FunctionClassTest {

    public static void main(String[] args) {
        Function<String, Integer> len = str->str.length();

        System.out.println(len.apply("asasa"));
    }
}
