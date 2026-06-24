package com.aaiaaba.javabasics.wrapperclasses;

public class AllInOne {


    public static void main(String[] args) {
        int i = 200;

        Integer i1 = Integer.valueOf(i);

        int i2 = i1.intValue();

        System.out.println(i2);

        System.out.println(i1.toString());
    }
}
