package com.aaiaaba.javabasics.wrapperclasses;

public class BMICalculator {
    public static void main(String[] args) {

        double heigth = 5.7;
        double weight = 72;

        double heigthInMeter = heigth * 0.4536;

        double bmiCal = weight / (heigthInMeter * heigthInMeter);

        System.out.println(bmiCal);
    }
}
