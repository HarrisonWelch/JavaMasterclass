# Lecture 146 Scope

## Scope
* Visibility of a function or variable
* Example
  * Going to a store and seeing a price. You see PC on discount. Your scope is only to that store.
  * If your Walmart, a larger company, and you discount the PC then you discount it at thounsands if not millions of stores

ScopeCheck.java

```java
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
```

Main.java

```java
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
```


