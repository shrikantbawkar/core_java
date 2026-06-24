package com.aaiaaba.oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCreditCard(1212121212);
        customer.setFirstName("Aaiaaba First");
        customer.setLastName("aaiaaba Last");

        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getCreditCard());
    }
}
