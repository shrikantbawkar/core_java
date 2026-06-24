package com.aaiaaba.javacollections.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(5));
        }

        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            set1.add(num);
            System.out.println(num);

        }
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            set2.add(num);
            System.out.println(num);

        }
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            set3.add(num);
            System.out.println(num);

        }
        System.out.println(set3);

        Iterator<Integer> itr = set3.iterator();
        while (itr.hasNext()) {
            // itr.next() sets the pointer to next item
            if (itr.next() != null)
                itr.remove();

        }
        System.out.println(set3);

    }
}
