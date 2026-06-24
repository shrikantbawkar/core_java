package com.aaiaaba.annotations;

public class A {

	@Deprecated
	public void myMethod() {

	}

	public void myMethod2() {
		System.out.println("Hi, I'm in myMethod2");
	}

	public void myMethodWithParam(String s) {
		System.out.println(s);
	}
}
