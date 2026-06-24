package com.aaiaaba.javabasics.staticnonstatic;

public class Staticstuff {

    static int testNum;
    
    public static void main(String[] args) {
        System.out.println("In main method");
        Staticstuff.method1();

        System.out.println("Back in main : "+Staticstuff.testNum);
    }

    static void method1() {
        System.out.println("In method1");
        Staticstuff.method2();
        System.out.println("Back in method1");

    }

    public static void method2() {
        System.out.println("In method2");
    }

}
