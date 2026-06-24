package com.aaiaaba.oops.polymorphism;

public class MacBookAir extends MacBook {

    public static void method1() {
        System.out.println("In MacBookAir static method1");
    } 

    public void start(int i) {
        System.out.println("In MacBookAir start : "+i);
    }

    @Override
    public void stop() {
        System.out.println("In MacBookAir stop");

    }

}
