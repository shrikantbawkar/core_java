package com.aaiaaba.java8features.methodrefconstructor;

public class Test {
    public static void main(String[] args) {

        MyInterface myInterface = s -> new MyClass(s);
        myInterface.myClassRef("asasas");

        MyInterface myInterfaceRef = MyClass::new;
        myInterfaceRef.myClassRef("asasas12121212");
    }
}
