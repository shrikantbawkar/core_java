package com.aaiaaba.oops.polymorphism;

public class MacBook // implements AppleMac
{
    public static void method1() {
        System.out.println("In MacBook static method1");
    } 

    public void start(float i) {
        System.out.println("In start of MacBook : "+ i);

    }

    public void stop() {
        System.out.println("In stop of MacBook");

    }

}
