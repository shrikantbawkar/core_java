package com.aaiaaba.javacollections.collections.sets;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer arg0, StringBuffer arg1) {
        if ( arg0.toString().length() > arg1.toString().length())
        {
            return 1;
        } else if ( arg0.toString().length() > arg1.toString().length())
        {
            return -1;
        } else {
            return 0;
        }
    }

}
