package com.aaiaaba.java8features.methodref;

import java.util.Arrays;
import java.util.List;

public class MethodRefTest {

    private int retLen(String str) {
        return str.length();
    }

    String printlnRef(String str) {
        return str;
    }
    void printlnRef1(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        MethodRefTest methodRefTest = new MethodRefTest();

        FunctionalTestImpl functionalTestImpl = new FunctionalTestImpl();
        System.out.println(functionalTestImpl.testLen("nullqwqwqwqwqwqw"));

        FunctionalTest functionalTest = i -> i.length();
        System.out.println(functionalTest.testLen("null"));

        FunctionalTest functionalTest1 = methodRefTest::retLen;
        System.out.println(functionalTest1.testLen("qwqwqwqwqwqwqwqwqwwqw"));

        FunctionalTestRetStr functionalTestRetStr = methodRefTest::printlnRef;
        System.out.println(functionalTestRetStr.retFunStr("null121212"));

        System.out.println("-----------------------------------------");

        String[] strArr = {"Aaiaaba", "Shrikant", "Kanchan", "Shourya", "Kiaan"};
        List<String> listStr = Arrays.asList(strArr);
        listStr.forEach(s->System.out.println(s));
        System.out.println("-----------------------------------------");
        listStr.forEach(System.out::println);
        
    }
}
