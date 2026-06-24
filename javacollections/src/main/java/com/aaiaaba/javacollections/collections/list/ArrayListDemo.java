package com.aaiaaba.javacollections.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i += 10) {
            list.add(i);
        }

        System.out.println(list);

        list.add(2, 200);
        list.add(3, 300);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();

        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);

        System.out.println(list2);

        list.addAll(2, list2);

        System.out.println(list);

        if (list.contains(16))
            System.out.println("16 is available in list");

        list.remove(2);
        System.out.println(list);

    }
}
