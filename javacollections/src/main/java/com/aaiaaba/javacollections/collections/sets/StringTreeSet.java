package com.aaiaaba.javacollections.collections.sets;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

    public static void main(String[] args) {
        
        Set<String> set1 = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            String num = "qw"+i+"asasas";
            set1.add(num);
            System.out.println(num);

        }
        System.out.println(set1);

        Set<StringBuffer> set2 = new TreeSet<>(new SBComparator());
        String strTest = "";
        for (int i = 0; i < 5; i++) {
            strTest=(i+strTest+"qwasasas"+i);
            StringBuffer num = new StringBuffer(strTest);
            set2.add(num);
            System.out.println(num);

        }
        System.out.println(set2);
    }
}
