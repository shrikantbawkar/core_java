package com.aaiaaba.javabasics.accessmodifier.p2;

import com.aaiaaba.javabasics.accessmodifier.p1.A;

public class C extends A {

    public static void main(String[] args) {
        A aRef = new A();
        System.out.println(aRef.d);

        C cRef = new C();
        System.out.println(cRef.c);
    }
}
