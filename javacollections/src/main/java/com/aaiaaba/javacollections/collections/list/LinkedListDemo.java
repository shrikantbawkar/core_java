package com.aaiaaba.javacollections.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<Integer> linkedlist = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedlist.add(i);
        }

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        
        long coTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedlist.add(i,i);
        }
        long lcoTime1 = System.currentTimeMillis();
        System.out.println(lcoTime1 - coTime1);

        long coTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(i,i);
        }
        long lcoTime = System.currentTimeMillis();
        System.out.println(lcoTime - coTime);

    }
}
