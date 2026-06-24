package com.aaiaaba.javacollections.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Random random = new Random();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "Test"+i);
        }

        System.out.println(map);

        Map<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            map1.put(i, "Test"+num);
            System.out.println(num);

        }
        System.out.println(map1);

        Map<Integer, String> map2 = new LinkedHashMap<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            map2.put(i, "Test"+num);
            System.out.println(num);

        }
        System.out.println(map2);

        Map<Integer, String> map3 = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            map3.put(i, "Test"+num);
            System.out.println(num);

        }
        System.out.println(map3);

        Iterator<Map.Entry<Integer, String>> itr = map3.entrySet().iterator();
        while (itr.hasNext()) {
            // itr.next() sets the pointer to next item
            if (itr.next() != null)
                itr.remove();

        }
        System.out.println(map3);

    }
}
