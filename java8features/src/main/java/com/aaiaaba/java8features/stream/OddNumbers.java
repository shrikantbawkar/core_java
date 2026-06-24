package com.aaiaaba.java8features.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        // traditional way for filtering add numbers
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println("------------------");
        System.out.println("traditional way for filtering add numbers");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("------------------");

        Set<Integer> list2 = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toSet());
        System.out.println(list2);

    }
}
