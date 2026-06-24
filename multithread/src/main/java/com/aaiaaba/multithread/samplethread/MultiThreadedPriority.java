package com.aaiaaba.multithread.samplethread;

public class MultiThreadedPriority extends Thread {

    public static void main(String[] args) {

        MultiThreaded multiThreaded = new MultiThreaded();
        multiThreaded.setPriority(MAX_PRIORITY);
        multiThreaded.setName("m1");
        multiThreaded.start();

        MultiThreaded multiThreaded1 = new MultiThreaded();
        multiThreaded1.setPriority(MAX_PRIORITY);
        multiThreaded1.setName("m2");
        multiThreaded1.start();

    }

    @Override
    public void run() {
        System.out.println("New qwqwqwqw Val : "+Thread.currentThread().getName());
    }
}
