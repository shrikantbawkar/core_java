package com.aaiaaba.multithread.samplethread;

import java.util.Scanner;

public class JoinThreadDemo extends Thread {
    private static int num, sum = 0;
    
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        JoinThreadDemo.num = scanner.nextInt();


        long startt = System.currentTimeMillis();

        JoinThreadDemo demo = new JoinThreadDemo();
        demo.start();
        try {
            demo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endt = System.currentTimeMillis();
        System.out.println("The sum is : "+JoinThreadDemo.sum);
        System.out.println("total time : "+(endt-startt));


    }

    @Override
    public void run() {
        
        for (int i = 0 ; i <= JoinThreadDemo.num ; i++) {
            JoinThreadDemo.sum += i;
            // System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
