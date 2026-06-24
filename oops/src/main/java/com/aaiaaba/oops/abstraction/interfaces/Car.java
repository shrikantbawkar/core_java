package com.aaiaaba.oops.abstraction.interfaces;

public interface Car {

    default void commonMethodInInterface() {
        System.out.println("Inside commonMethodInInterface");
    }
    void go();
    void brake();
    void stop();
}
