package com.aaiaaba.oops.singletonclass;

public class SingletonClass {

    // private contructor
    // nobody call it as public now
    private SingletonClass() {
        System.out.println("I am single instance of SingletonClass : "+this.hashCode());
    }

    private static class InnerSingletonHelperClass {
        private static SingletonClass INSTANCE = new SingletonClass();
        
    }

    public static SingletonClass getInstance() {
        return InnerSingletonHelperClass.INSTANCE;
    }
}
