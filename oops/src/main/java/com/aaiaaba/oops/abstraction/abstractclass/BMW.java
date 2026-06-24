package com.aaiaaba.oops.abstraction.abstractclass;

public abstract class BMW {

    void commonFunctionality() {
        System.out.println("In common Functionality");
    }

    abstract void accelarate();

    // abstract void carBreak();

    BMW() {
        System.out.println("Inside BMW abstract class Constructor");
    }

    public static void main(String[] args) {
        System.out.println("In Abstract claa main method");
    }
}
