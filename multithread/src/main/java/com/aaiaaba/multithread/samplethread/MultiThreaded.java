package com.aaiaaba.multithread.samplethread;

public class MultiThreaded extends Thread {

    public static void main(String[] args) {

        MultiThreaded multiThreaded = new MultiThreaded();
        multiThreaded.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Rhread Val : " + i);
        }
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("New Thread Val : " + i);
        }
    }
}
