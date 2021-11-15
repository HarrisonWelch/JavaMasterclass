package com.lesson._final;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        //        SomeClass one = new SomeClass("one");
        //        SomeClass two = new SomeClass("two");
        //        SomeClass three = new SomeClass("three");
        //
        //        System.out.println(one.getInstanceNumber());
        //        System.out.println(two.getInstanceNumber());
        //        System.out.println(three.getInstanceNumber());
        //
        //        System.out.println(Math.PI);
        ////        Math m = new Math();
        //
        //        int pw = 674312;
        //        Password password = new ExtendedPassword(pw);
        //        password.storePassword();
        //
        //        password.letMeIn(1);
        //        password.letMeIn(1241324);
        //        password.letMeIn(-7);
        //        password.letMeIn(8);
        //        password.letMeIn(999999999);
        //        password.letMeIn(123);
        //        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + test.owner); // BOTH static initializer blocks
        SIBTest test2 = new SIBTest();
        test2.someMethod();
        System.out.println("Owner is " + test2.owner);
    }
}
