# Lecture 150 The Static Statement

## Static
* Only one method or var in memory at a given time

StaticTest.java
```java
package com.lesson._static;

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name){
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}

```

Main.java
```java
package com.lesson._static;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
    }
}

```
Out
```
1st Instance is instance number 1
2nd Instance is instance number 2
3rd Instance is instance number 3
```

You can also change the code to have a static method

in static test
```java
    public static int getNumInstances() {
        return numInstances;
    }
```
in main
```java

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
```

out

```
1st Instance is instance number 1
2nd Instance is instance number 2
3rd Instance is instance number 3
```

## Trying to use non-static in static context

```java
package com.lesson._static;

public class Main {

    public int multiplier = 7;

    public static void main(String[] args) {

        int answer = multiply(6); // Non-static method 'multiply(int)' cannot be referenced from a static context

        System.out.println("The answer is  " + answer);
        System.out.println("Multiplier is  " + multiplier); // Non-static field 'multiplier' cannot be referenced
        // from a static context
    }

    public int multiply(int number) {
        return number * multiplier;
    }
}

```

Fix with static variable and method 

```java
package com.lesson._static;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        int answer = multiply(6); // Non-static method 'multiply(int)' cannot be referenced from a static context

        System.out.println("The answer is  " + answer);
        System.out.println("Multiplier is  " + multiplier); // Non-static field 'multiplier' cannot be referenced
        // from a static context
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}

```
