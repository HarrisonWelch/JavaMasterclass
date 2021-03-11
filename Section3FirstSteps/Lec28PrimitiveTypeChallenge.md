# Lec28PrimitiveTypeChallenge

## Challenge
* Create a byte variable and set it to any valid byte number, it doesn't matter. 
* Create an short in the same way
* Create a int in the same way
* Then create a long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the int values.

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte b = 2;
        short s = 3;
        int i = 4;
        long l = 50000L + (10L * (b + s + i));
        System.out.println(l);

        short sh = (short)(1000 + 10 *
                (b + s + i));
    }
}
```
Output
```

50090

Process finished with exit code 0
```

* Note short `sh` must be cast b/c lossy conversion
* You can go to newline easily
