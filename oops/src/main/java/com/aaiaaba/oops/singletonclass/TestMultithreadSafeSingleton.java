package com.aaiaaba.oops.singletonclass;

public class TestMultithreadSafeSingleton {
    public static void main(String[] args) {
        MultithreadSafeSingletonClass singletonClass = MultithreadSafeSingletonClass.getInstance();
        MultithreadSafeSingletonClass singletonClass1 = MultithreadSafeSingletonClass.getInstance();

        singletonClass.method1();
        singletonClass1.method1();

    }
}
