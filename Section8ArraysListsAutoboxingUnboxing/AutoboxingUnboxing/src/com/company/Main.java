package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); // "Type argument cannot be primitive type"
        // suggested to go to "Integer" class

        // This works but is a bit messy
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Java supports primitives by making "wrapper" classes: Integer, Double, ... (note the capital first letter)

        Integer integer = new Integer(54);
        Double doubleValue = new Double(123.45);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // boxing
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // unboxing
        }

        // this is the LONG way
        // now for the short way

        Integer myIntValue = 56; // nice and easy auto-boxing
        // when compiled this becomes "Integer myIntValue = Integer.valueOf(56);"
        // Integer myIntValue2 = 56.56; // does not work - "double cannot be converted to java.lang.Integer"
        int myInt = myIntValue.intValue(); // unboxing

        // Now looking at double

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl)); // boxing
            myDoubleValues.add(dbl); // boxing, no need for valueOf, Java does this automatically
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
//            double value  = myDoubleValues.get(i).doubleValue();
            double value  = myDoubleValues.get(i); // no need for ".doubleValue()", Java does this automatically
            System.out.println(i + " --> " + value);
        }


    }
}
