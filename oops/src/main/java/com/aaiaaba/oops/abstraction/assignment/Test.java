package com.aaiaaba.oops.abstraction.assignment;

public class Test {

    public static void main(String[] args) {
        HPNotebook hpNotebook = new HPNotebook();
        DELLNotebook dellNotebook = new DELLNotebook();

        hpNotebook.click();
        hpNotebook.scroll();

        dellNotebook.click();
        dellNotebook.scroll();
    }
}
