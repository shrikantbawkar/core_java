package com.aaiaaba.javabasics.datatypes;


public class BankAccount {

	static int testVar = 1212;

	static void method1(int testVar) {
		System.out.println(testVar);
	}

	public static void main(String[] args) {
		int accNo=1234565;
		String name ="John";
		double balance = 10000000.1232;
		String type = "Savings";
		boolean active = true;
		
		System.out.println(active);

		System.out.println(BankAccount.testVar);

		BankAccount.method1(565656);
		
	}

}
