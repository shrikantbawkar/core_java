package com.aaiaaba.javacollections.collectionsarraysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("qwqw");
        list.add("xcvxcvxcvqwqw");
        list.add("qqwqwwqw");
        list.add("asasasqwqw");
        list.add("uiouiouiwqw");

        System.out.println(list);

        Collections.sort(list, new SBComparator());

        System.out.println(list);


        String asas = "01234567789";
        String[] as = asas.split("");

        List<String> l1 = Arrays.asList(as);

        Collections.reverse(l1);
        
        System.out.println(String.join("", l1));

    }
}
