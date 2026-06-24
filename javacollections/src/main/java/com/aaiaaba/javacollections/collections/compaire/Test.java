package com.aaiaaba.javacollections.collections.compaire;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        
        Set<Employee> set2 = new TreeSet<>();
        set2.add(new Employee(1, "qwqw"));
        set2.add(new Employee(2, "qwqwasds"));
        set2.add(new Employee(3, "qwqwgfhtggdfg"));
        set2.add(new Employee(4, "qwqwgfh"));
        set2.add(new Employee(5, "qwqwgfhasasasasasasas"));

        System.out.println(set2);
    }
    
}
