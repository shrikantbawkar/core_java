package com.aaiaaba.java8features.lambdas.runnable;

public class Test {
    public static void main(String[] args) {
        // MyRunnableImpl myRunnableImpl = new MyRunnableImpl();

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Child Thread : " + i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread : " + i);
        }
    }
}
