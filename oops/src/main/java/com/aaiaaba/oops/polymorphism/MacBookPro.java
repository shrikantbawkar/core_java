package com.aaiaaba.oops.polymorphism;

public class MacBookPro extends MacBook {

    public static void method1() {
        System.out.println("In MacBookPro static method1");
    } 

    public void start(int i) {
        System.out.println("In MacBookPro start : "+i);
    }

    // @Override
    // public void stop() {
    //     System.out.println("In MacBookPro stop");

    // }

}
