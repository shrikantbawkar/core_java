package com.aaiaaba.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest {

	@MyAnnotation
	public void myMethod() {

	}

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			Class<?> myClass = Class.forName(A.class.getName());
			System.out.println(Arrays.toString(myClass.getConstructors()));
			Constructor<?> constructor = myClass.getConstructor();
			Object myObj = constructor.newInstance();

			Method myMethod2 = myClass.getMethod("myMethod2");
			myMethod2.invoke(myObj);

			Method myMethodWithParam = myClass.getMethod("myMethodWithParam", String.class);
			myMethodWithParam.invoke(myObj, "Hi, I'm in myMethodWithParam");

			// String str1 = "qwqw";
			// String str2 = "qwqw";

			// String str3 = new String("qwqw1");
			// String str4 = new String("qwqw1");
			
			// Integer i1 = new Integer(12);
			// Integer i2 = new Integer(12);

			// System.out.println(str1 == str2);
			// System.out.println(str3 == str4);
			// System.out.println(i1 == i2);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
