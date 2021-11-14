# Lec 136 Generics Introduction

## Generics
* Accepting any type as a paramater
* Called a parameter type

### Example 1
```java
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
```

* Notice the ArrayList is not type restricted so the code errors when trying to case "tim" to an Integer
* We can add this with "\<Integer>" at the back
* Then for the constructor we can use "<>" or aka Diamond op to auto-detect the type provided this is Java 7 or higher

### Example 2

```java
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}
```
