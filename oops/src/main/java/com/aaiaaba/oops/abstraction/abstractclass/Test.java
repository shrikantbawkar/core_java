package com.aaiaaba.oops.abstraction.abstractclass;


public class Test {
    public static void main(String[] args) {

        // we ca NOT instanciate abstract class
        // BMW bmw = new BMW();

        BMWThreeSeries bmwThreeSeries = new BMWThreeSeries();
        bmwThreeSeries.accelarate();
        bmwThreeSeries.commonFunctionality();

        BMWFiveSeries bmwFiveSeries = new BMWFiveSeries();
        bmwFiveSeries.accelarate();
        bmwThreeSeries.commonFunctionality();
    }
}
