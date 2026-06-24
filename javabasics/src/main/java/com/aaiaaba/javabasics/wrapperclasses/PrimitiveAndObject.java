package com.aaiaaba.javabasics.wrapperclasses;

public class PrimitiveAndObject {

    public static void main(String[] args) {
        int i = 121212;
        String as = "a";

        Integer i1 = Integer.valueOf(i);
        
        int i2 = i1.valueOf(i1);
        System.out.println(i2);

        //Byte
        System.out.println(Integer.toString(i));
        System.out.println(Integer.parseInt("12121"));
        System.out.println(Integer.valueOf("12121"));

        System.out.println(Integer.parseInt("12121") == Integer.valueOf("12121"));

    }
}
