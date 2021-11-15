# Lecture148ScopeChallenge

My Try

```java
package com.challenge.scope;

import java.util.Scanner;

public class X {
    private Scanner x;

    public X() {
        this.x = new Scanner(System.in);
    }

    public static void getTimesTableFromInteger() {
//        int x = this.x.nextInt();
        int x = 3;
        if (x < 1 || x > 12) return;
        System.out.println("******************");
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < x + 1; j++) {
                System.out.print(String.format("%3s", i * j) + " ");
            }
            System.out.println();
        }

    }

    public class OuterLoop {
        int x;

        public void loop(int x) {
            System.out.println("Here");
        }
    }
}
```

True Answer with Optional

```java
package com.challenge.scope;

import java.util.Scanner;

public class X {
    int x;
    public X(Scanner x) {
        System.out.print("Please enter a number: ");
        this.x = x.nextInt();
        System.out.println();
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + (x*this.x));
        }
    }
}
```

Main.java is simply:

```java
package com.challenge.scope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        X x = new X(new Scanner(System.in));
        x.x();
    }
}

```
