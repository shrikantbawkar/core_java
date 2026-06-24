package com.aaiaaba.oops.singletonclass;

public class MultithreadSafeSingletonClass {

    private static volatile MultithreadSafeSingletonClass INSTANCE;

    private MultithreadSafeSingletonClass() {
        System.out.println("I am single instance of MultithreadSafeSingletonClass : " + this.hashCode());
    }

    public static MultithreadSafeSingletonClass getInstance() {
        if (INSTANCE == null) {

            synchronized (MultithreadSafeSingletonClass.class) {

                if (INSTANCE == null) {
                    INSTANCE = new MultithreadSafeSingletonClass();
                }
            }
        }

        return INSTANCE;
    }

    public void method1() {
        System.out.println("I am in method1 method and single instance of MultithreadSafeSingletonClass : " + INSTANCE.hashCode());

    }

}
