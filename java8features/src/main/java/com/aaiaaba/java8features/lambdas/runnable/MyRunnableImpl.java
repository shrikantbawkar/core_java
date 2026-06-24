package com.aaiaaba.java8features.lambdas.runnable;

public class MyRunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Child Thread : " + i);
        }
    }

}
