package com.aaiaaba.javabasics.accessmodifier.p1;

public class B {

    B() {
        A aRef = new A();
        System.out.println(aRef.b);
        System.out.println(aRef.c);
        System.out.println(aRef.d);
    }

    public static void main(String[] args) {
        B bRef = new B();
    }

}
