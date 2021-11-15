package com.example.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2; // local to this function (CAREFUL)
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * privateVar); // swap to this.privateVar would mean *1
                                                                       // instead of *2
        }
        // System.out.println("Value of i is now " + i); // i is now out of scope
    }

    public class InnerClass {
        public int privateVar = 3; // commenting out would mean *1 instead of *3, b/c scope

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        // copy of innerClass
        public void timesTwo() {
            ScopeCheck.this.timesTwo(); // go back to out class

            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * privateVar);
//                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar); // *1
            }
        }
    }
}
