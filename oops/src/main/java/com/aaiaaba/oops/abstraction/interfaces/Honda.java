package com.aaiaaba.oops.abstraction.interfaces;

public class Honda implements Car {

    @Override
    public void go() {
        System.out.println("Inside Go meathod");
    }

    @Override
    public void brake() {
        System.out.println("Inside brake meathod");
    }

    @Override
    public void stop() {
        System.out.println("Inside stop meathod");
    }


}
