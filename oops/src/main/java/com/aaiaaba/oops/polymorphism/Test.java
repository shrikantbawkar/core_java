package com.aaiaaba.oops.polymorphism;

public class Test {

    public static void main(String[] args) {
        MacBook macBookPro = new MacBookPro();
        MacBook macBookAir = new MacBookAir();

        macBookPro.start(12.1f);
        macBookPro.stop();

        macBookAir.start(15);
        macBookAir.stop();
        
        MacBookPro.method1();
        MacBookAir.method1();
    }
}
