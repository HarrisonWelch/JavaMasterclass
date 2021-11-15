package com.example.scope;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String varFour = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree from outer class (main): " + innerClass.varThree); // if it were private this
        // wouldn't compile

//        ScopeCheck scopeCheck = new ScopeCheck();
//        System.out.println("scopeInstance varFour is " + scopeCheck.getVarOne());
//        System.out.println(varFour); // 2 variables named varFour
//
//        scopeCheck.timesTwo();
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
//

    }
}
