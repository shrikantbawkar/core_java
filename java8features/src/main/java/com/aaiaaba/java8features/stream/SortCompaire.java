package com.aaiaaba.java8features.stream;

import java.util.Comparator;

public class SortCompaire implements Comparator<String> {

    @Override
    public int compare(String s21, String s22) {
        // return s21.compareTo(s22);
        if (s21.length() > s22.length()) {
            return 1;
        } else if(s21.length() < s22.length()) {
            return -1;
        } else {
            return 0;
        }
    }


}
