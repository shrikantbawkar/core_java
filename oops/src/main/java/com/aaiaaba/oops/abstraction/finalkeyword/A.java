package com.aaiaaba.oops.abstraction.finalkeyword;

public final class A {

    final float piVal = 3.14f;

    public static void main(String[] args) {
        A a = new A();
        // a.piVal = 3.1f;

    }

    final void method1() {
        System.out.println("inside final method1");
    }
}
