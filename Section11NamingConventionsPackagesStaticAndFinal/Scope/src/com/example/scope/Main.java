package com.example.scope;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String privateVar = "this is private to main";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar); // 2 variables named privateVar

        scopeCheck.timesTwo();
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();


    }
}
