package com.aaiaaba.javacollections.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;

public class IdentityMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new IdentityHashMap<>();
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        int ii1 = 1;
        int ii2 = 1;

        map.put(i1, "aaiaaba1");
        map.put(i2, "aaiaaba2");
        
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println((i1 == i2));
        System.out.println((ii1 == ii2));

        System.out.println(map);
    }
}
