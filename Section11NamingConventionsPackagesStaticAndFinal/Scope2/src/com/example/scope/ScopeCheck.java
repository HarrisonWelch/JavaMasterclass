package com.example.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2; // local to this function (CAREFUL)
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo); // swap to this.privateVar would mean *1
                                                                       // instead of *2
        }
        // System.out.println("Value of i is now " + i); // i is now out of scope
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        public int varThree = 3; // commenting out would mean *1 instead of *3, b/c scope

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        // copy of innerClass
        public void timesTwo() {
            System.out.println("varOne is still available: " + varOne);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
//                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar); // *1
            }
        }
    }
}
