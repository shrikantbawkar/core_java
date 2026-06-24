package com.aaiaaba.oops.inheritance.methodoverriding;

public class B extends A {

    B() {
        // this super call is bydefault
        // super();
        System.out.println("In B");
    }

    public static void main(String[] args) {
        A a = new A();
        a.overridableMethod();
        
        B b = new B();
        b.overridableMethod();
    }

    @Override
    public void overridableMethod() {
        super.overridableMethod();
        System.out.println("In B class overridableMethod");
    }
}
