package com.aaiaaba.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ASSDDF");
        list.add("QWEWE");
        list.add("HJKH");
        list.add("OIUPOPP");
        list.add("LHTYDTRRRSEWSRYE");
        list.add("Q");
        list.add("QW");
        list.add("QWE");

        List<String> list2 = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3 = list.stream().sorted(new SortCompaire()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
