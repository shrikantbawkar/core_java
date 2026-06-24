package com.aaiaaba.javabasics.datatypes;


public class ImplicitCast {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b;
		System.out.println(i);
		long l = i;
		
		char ch ='A';
		int x = ch;

		int charI = 65;
		char fromInt = (char) charI;
		System.out.println(x);
		System.out.println(fromInt);
		

	}

}
