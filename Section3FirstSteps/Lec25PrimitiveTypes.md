# Primitive Types

## Types
* `boolean`
* `byte`
* `char`
* `short`
* `int`
* `long`
* `double`

## Back to Code
* Close last project
* Create New from Template of Command line app

## Java Packages
* A packages is a way to organize Java projects.
* Consider them folders for now
* Companies use their domain names reversed

Now we have this code

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
```

Notice
* Package name at the top
* Main method already written
* Look at the side bar and unfold the src file

## Back to Code
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
    }
}

```

## What can we store in an integer?
* Lets see it in code!

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinValue);
        System.out.println("Integer Maximum value = " + myMaxValue);
    }
}

```
Output
```
Integer Minimum value = -2147483648
Integer Maximum value = 2147483647

Process finished with exit code 0
```

## Wrapper Class
* Java has wrapper classes for all eight primitive types
* This gives us ways to perform ops on an int
* int has Integer

## Output
* Min is -2147483648
* Max is 2147483647

## Let's try and go over the max value
* Code
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinValue);
        System.out.println("Integer Maximum value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
    }
}
```
Ouput 
```
Integer Minimum value = -2147483648
Integer Maximum value = 2147483647
Busted MAX value = -2147483648

Process finished with exit code 0
```

Notice the max went all the way back around to the min int. This is an integer overflow.

Let's do the reverse
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinValue);
        System.out.println("Integer Maximum value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
        System.out.println("Busted MIN value = " + (myMinValue - 1));
    }
}
```
Output
```
Integer Minimum value = -2147483648
Integer Maximum value = 2147483647
Busted MAX value = -2147483648
Busted MIN value = 2147483647
```

* This triggers an underflow
* IJ will flag a literal number over the max int
* `int myMaxIntTest = 2147483648;` will be red in the IDE
  * Running it will give error `java: integer number too large`

Note you can use `int myMaxIntTest = 2_147_483_647;` in java for comma seperation if you want.
 