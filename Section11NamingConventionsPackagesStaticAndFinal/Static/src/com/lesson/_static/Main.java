package com.lesson._static;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	    // write your code here
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6); // Non-static method 'multiply(int)' cannot be referenced from a static context

        System.out.println("The answer is  " + answer);
        System.out.println("Multiplier is  " + multiplier); // Non-static field 'multiplier' cannot be referenced
        // from a static context
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
