
----
"# JavaMasterclass" 

----
# Intro.md

## Purpose

* Educate to the point of becoming a Java dev
* JDK version 11
  * Java Development Kit
    * Create Java programs
* Why Update
  * JDK 12 is coming out
  * JDK 13 is on the schedule
  * New versions maintain concepts from v8 and above
* Please dont skip next videos

----
# Remaster.md

* Adding slides
* Removing confusion
* Adding answers to common questions
* Take advantage for new content
  * 77 hr course will take a bit to get to the end
* Pay attention for update

----
# VideoQuality.md

* Video is uploaded at 1080p, is highest quality
* Udemy can blur it 

----
# Subtitles

* Turn on subtitles
* Austrailian accent
* These subtitles are hand edited English

----
# HowToGetHelp.md

* On Udemy go to bottom left and choose Q&A
* Post Question
* Use code text and not screenshot
* Be specific in the question
* Ask a new question
  * Unless it is completely related.

----
# ImportantTip.md

* Type in the code in the topic
* Run programs

1) Write
2) Compile
3) Run
4) Fix
5) Success

----
# JDKInstall.md

* Version 11
  * LTS; Long Term Support


----
# InstallJDK11

* https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
* Install x64 Windows MSI

System dependent

----
# DownloadIntellij

* https://www.jetbrains.com/idea/
* Download x64 bit
* Open Installer

## Customize
* You can adjust themes and fonts

----
# ConfigureIntelliJ.md

* Version Control System = VCS
* Hit New Project
* Select the Corretto JDK from earlier
* Close b/c we have other stuff to look at

## Apperance

* Click Customize
* Go to All settings
  * Open Editor on the side
  * Unfold General
  * Go to Code Folding
    * uncheck Imports under the general section
    * uncheck closures
    * uncheck Generic constructor
  * Go to Appearance
    * Make sure line numbers is checked


----
# BiggestTip.md

* You are going to be frustrated.
  * Part of the job

## Number one skill
* https://www.youtube.com/watch?v=vsg5P40x8xo
* Its not the program
* Its not the hardware
* Its about PERSISTENCE
  * Understand the basics
  * Start getting better
  * Memorize
  * Stick to it
  * Apply concepts

## Four Stages of Becoming a Programmer
* https://www.youtube.com/watch?v=VHAXJxcHA1k
* Make a commitment to persist
* Practice Regularly
  * Adapt Programs

1.  Unconscious Incompetence
    * Where to start?
2.  Conscious Incompetence
    * You know some skill, but a lot to learn
    * You want the next skill
    * Acknowledge the skills
    * Making mistakes and getting frustrated are integral
3.  Conscious Competence
    * Start stringing together peices of code
    * Worried about remembrance
    * You have progressed
    * The training is making sense
4.  Unconscious Competence
    * 2nd nature action
    * Teach at some small level
    * Model of how to learn

----
# SoftwareTools.md

* Download and install Intellij IDEA

----
# Intro.md

* Hello World
* Learn a little about a lot of things like:
  * Keywords
  * Variables
  * Methods
  * Operators
  * Prim types
  * Strings
* Access to the slides
  * Check the last section for slides
* Learn a little about a lot of things
  * touch on them to get familar all at once
  * more detail later

----
# HelloWorldProject

* CreateProject
* Use Corretto
* Don't use template
* Create another folder using the elipses

```java
public class Hello {
}
```

## Keywords
* public and class are two keywords
* public - Access modifier
  * Scope - How a program can access a variable
* class - used to define a class
  * left and right curly braces define the body


----
# DefineMainMethod.md

* Define main entry point

```java
public class Hello {

    public static void main(String [] args){
        
    }
}
```

* public 
* static - we need this for java to find the right code
* void - method wont return anything 
* parameters - what is passed to a function
* Code is very case sensitive
* From the right click the green arrow that says run Hello main
* Gets this output at the bottom:

```
"C:\Program Files\Amazon Corretto\jdk11.0.10_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=50747:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\...\Section3FirstSteps\HelloWorld\out\production\HelloWorld Hello

Process finished with exit code 0
```

* 0 is often used to indicate no problem
* Keep going
* Type `System.out.println("Hello World");` into line 4
* We have added a statement
  * Complete command to be executed
  * Call method println() and pass it the string "Hello World"
* Now we have this 

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello World");
    }
}
```

* Which gives output similar to

```
"C:\Program Files\Amazon Corretto\jdk11.0.10_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=50747:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\...\Section3FirstSteps\HelloWorld\out\production\HelloWorld Hello
Hello World

Process finished with exit code 0
```


----
# HelloWorldChallengeAndCommonErrors.md'

* Make Change to add a name after Hello instead of World
* Done

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello, Harrison");
    }
}
```

* Output

```
"C:\Program Files\Amazon Corretto\jdk11.0.10_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=50810:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\...\Section3FirstSteps\HelloWorld\out\production\HelloWorld Hello
Hello Harrison

Process finished with exit code 0
```

## Common Errors
* No Semicolon - IJ will try to recommend a solution
  * Add the semicolon to the end of the line
* The output is clickable to find an error in the code
* No Endquote on literal string
  * Add the " at the end of Hello... string







----
# Variables

* In order to do useful things we need variables.
* What are variables?
  * way to store info
  * define by program
  * can be accessed
  * computer decides how to store them
  * contents can adjusted
  * Define
    * data type
    * name
    * value

## Data types
* int - integer, whole number, no decimal

## Declaration statement
* Define variable by data type, name, and option set of value
```java
int myFirstNumber = 5;
```
* Initialization (to give value `= 5`) is optional
* In general, variables have to be initialized before being used

## Expression
* Construct that evalutes to a single value
* More on this later

## Back to code
* `myFirstNumber` is initialized to 5
* We don't care about memory location, Java does all the dirty work

## Challenge
* Print out the variable `myFirstNumber`
* Done

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = 5;

        System.out.println(myFirstNumber);
    }
}
```

* Mistake mentioned
  * `System.out.println("myFirstNumber");` uses the string literal and not the variable
  * We told it to print the text and not to access the memory location and get the value from it

## The expression can be more complex
* Lets add an expression for the sum of two numbers

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = 10 + 5;

        System.out.println(myFirstNumber);
    }
}
```
* Java has looked at the expression and calculated the value to be 15
* Now something more complicated

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);

        System.out.println(myFirstNumber);
    }
}
```

## Java Operators
* +,-,*,/ are common math operators that most are familiar with




----
# StartingOutWithExpressions

* Using code from last time
  
## Challenge
* Create additional variables
* mySecondNumber, int assiged value 12
* myThirdNumber, int assiged value 6
* Done

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        System.out.println(myFirstNumber);
    }
}
```

* Add a sum instead of literal numbers

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
    }
}
```
Output
```
Hello Harrison
53

Process finished with exit code 0
```

* Notice myTotal is grey indicating it has never been used
* Now adjust for extra practice

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
    }
}
```
Ouput

```
Hello Harrison
117

Process finished with exit code 0
```

## Challenge
* Create new var `myLastOne` as int with value of 1000 less the value of `myTotal`

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
```

Output
```
Hello Harrison
117
883

Process finished with exit code 0
```

* If you ever get stuck, look at spelling or case-ing of variable names
  * They are picky, need to be the SAME thing

----
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
 
----
# Lec26ByteShortLong

## Byte
* `byte` exists
* It takes up less space and less time to access
* Self-documenting, used with specific purpose

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

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);
    }
}
```
Ouput
```
Byte Minimum value = -128
Byte Maximum value = 127
```

## Replace Selection
* Use Ctrl+R to activate a replace method
* replace `byte` with `short`
* replace `Byte` with `Short`
* gives this code
```java
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);
```
Output
```
Short Minimum value = -32768
Short Maximum value = 32767
```

## Size of Primitive Types
* A Byte occupies 8 bits
  * A byte has a width of 8
* A Short has 16 bits, width of 16
* An Int has 32 bits, and has a width of 32
* Could come up as an interview question

## Long
* `long myLongValue = 100L;` Needs the `L` at the end to indicate the variable is a long
  * Case does not matter here, but it needs to be `L` and uppercase is easter to differentiate from a lower case `l` which could be a 1 `1` or an I `I`
* size is 2^63

## Back to the Code
* Adding in this
  
```java
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
```
Ouput
```
Long Minimum value = -9223372036854775808
Long Maximum value = 9223372036854775807
```

* Underscore numbers are still valid `long bigLongLiteralValue = 2_147_483_647_234L;`. The L is needed to interpret as long and not int.
* IJ will warn if too large.






----
# Lec27CastingInJava

## Casting
* `int myTotal = (myMinValue / 2);` works
* But `byte myNewByteValue = (myMinByteValue / 2);` does not because Java by default ouputs integers on arithmetic operations.
* For this we put `(byte)` in front to case the int to byte.
  * Full line:
```java
byte myNewByteValue = (byte) (myMinByteValue / 2);
```
* The same works for short 
```java
short myNewShortValue = (short) (myMinShortValue / 2);
```

## Code update

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

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // default output is integer
        short myNewShortValue = (short) (myMinShortValue / 2); // default output is integer

    }
}
```
Output
```
"C:\Program Files\Amazon Corretto\jdk11.0.10_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=51872:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\...\Section3FirstSteps\ByteShortIntLong\out\production\ByteShortIntLong com.company.Main
Integer Minimum value = -2147483648
Integer Maximum value = 2147483647
Busted MAX value = -2147483648
Busted MIN value = 2147483647
Byte Minimum value = -128
Byte Maximum value = 127
Short Minimum value = -32768
Short Maximum value = 32767
Long Minimum value = -9223372036854775808
Long Maximum value = 9223372036854775807

Process finished with exit code 0

```

----
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

----
# Lec29FloatAndDoublePrimitiveTypes

## Floating Point Numbers
* Use decimal
* Not Whole
* Pi is an example, 3.14159...
* Precision

## Single Precision and Double Precision
* Single is 32 bits and width of 32
* Double is 64, width of 64
* Double is twice as precise as Single

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
//        float myFloatValue = 5; // int is default no need to use the back letter
//        float myFloatValue = 5f; // f is for float, optional when going into a float
//        double myDoubleValue = 5;  // int is default no need to use the back letter
        double myDoubleValue = 5d; // d is for double, optional when going into a double
//        float myFloatValue = 5.25; // does not work because decimals default to double literal
        float myFloatValue = (float) 5.25;
    }
}
```
Ouput
```
Float minimum value = 1.4E-45
Float maximum value = 3.4028235E38
Double minimum value = 4.9E-324
Double maximum value = 1.7976931348623157E308
```
----
# Lec30FloatingPointPrecisionAndChallenge

## Division
* Division by 2
```java
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d; // d is for double, optional when going into a double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
```
Ouput
```
myIntValue = 2
myFloatValue = 2.5
myDoubleValue = 2.5
```

* Division by 3
```java
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // d is for double, optional when going into a double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
```
Ouput
```
myIntValue = 1
myFloatValue = 1.6666666
myDoubleValue = 1.6666666666666667
```
* Notice the percision bump in float
* .00 can be subbed for `d` at the end to imply double numbers

## Challenge
* Create var for storing pounds
* Create a var for kilos for when converting lbs to kilos
* Print result

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // var to store number of pounds
        double numPounds = 5.0;
        double numKilos = numPounds * 0.45359237;
        System.out.println("numKilos = " + numKilos);

    }
}

```
Ouput
```
numKilos = 2.2679618500000003
```

## Other
* Underscores still work
* Legal Code:
```java
double pi = 3.1415927d;
double anotherNumber  = 3_000_000.4_567_890d;
System.out.println(pi);
System.out.println(anotherNumber);
```
Ouput
```
3.1415927
3000000.456789
```

## BigDecimal
* float and double are limited
* BigDecimal class overcomes this
* More detail later



----
# Lec31CharAndBoolean

## Char
* Similar to string
* But only store one character
* Why use a character var?
  * Last key press by the user
  * Menu option
  * Used more in the past with less memory
* Width of 16 because it can use unicode

## Unicode 
* Where every symbol is given a different value
* English value is 26 characters
* Can be 65535 characters
* Java can use it by doing `char myUnicodeChar = '\u0044';`

Example
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("myChar = " + myChar);
        System.out.println("myUnicodeChar = " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar = " + myCopyrightChar);
    }
}
```
Output
```
myChar = D
myUnicodeChar = D
myCopyrightChar = ©
```

### Boolean

----
# Lec32PrimitiveTypesRecapAndTheStringDataType

## Types
* byte
* short
* int
* long
* float
* double
* char
* boolean

## String
* Not primitive type
* Actually a class
  * treated differently, favoritism
* Sequence of chars (unlike char that holds only 1)
* Limited by the memory value of int

## Code

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string"; // Make string
        System.out.println("myString is equal to " + myString); // Print it out to the console

        // Append
        myString = myString + ", and this is more."; // append
        System.out.println("myString is equal to " + myString); // Print again to show change from append

        // Use the char unicode stuff from eariler
        myString = myString + " \u00A9 2019"; // append
        System.out.println("myString is equal to " + myString); // Print again to show change from append
        String numberString = "250.55";
        numberString = numberString + "49.95"; // PROBLEM: This concatenation and not addition
        System.out.println("numberString is equal to " + numberString);

        // String concat
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Adding numeric to string, PROBLEM: This concatenation and not addition
        System.out.println("lastString is equal to " + lastString); // Print again to show change from append
        // Java converts the int to string and concatenates.

        // This also works with doubles.
        double number = 120.47d;
        lastString = lastString + number; // Adding numeric to string, PROBLEM: This concatenation and not addition
        System.out.println("lastString is equal to " + lastString); // Print again to show change from append

    }
}
```
Output
```
myString is equal to This is a string
myString is equal to This is a string, and this is more.
myString is equal to This is a string, and this is more. © 2019
numberString is equal to 250.5549.95
lastString is equal to 1050
lastString is equal to 1050120.47
```

## Strings in Java are Immutable
* Not strictly true
* A new string is created on an append action
* The variable now references the new string
  * Net result is the same
* Append is inefficent
  * Buffer is better
  * Can be changed

## Summary
* Strings are easy to use compared to classes
* Can be treated as the 9th Primitive types






















----
# Lec33OperatorsOperandsAndExpressions

## Operators
* Symbols that preform specific operation on 1,2, or more operands
* `+` - Add
* `-` - Subtract
* `*` - 
* `\`
* `%`

## Operand
* Object manipulated by an operator
* Example x = y + z
  * x, y, and z are operands and + is the operator

## Expression
* Formed by combining variables, literals, method return values
* Example `myInt = 15 + 12;`
  * Return is 27
* Example `doubleSalary = salary * 2;`
  * doubleSalary and salary are variables. And Operands
  * 2 is a number literal
  * `*` is an oparator

## Comments
* Ignored by program/compiler
* After ``//`` is ignored

## Code

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // Another One
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        // Notice previousResult and result are independent

        // Another One
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // Modulus Operator
        result = result % 3; // remainder after division of 3. (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


    }
}
```
Output
```
1 + 2 = 3
previousResult = 3
3 - 1 = 2
2 * 10 = 20
20 / 5 = 4
4 % 3 = 1
```
























----
# Lec34AbbreviatingOperators

## Abbreviation
* `++` - can be used to quickly add 1
* `--` - can be used to quickly sub 1
* `+=` - cab be used to add and assign quickly
* `-=` - cab be used to sub and assign quickly
* `*=` - cab be used to mul and assign quickly
* `/=` - cab be used to div and assign quickly

## Code

```java
        //++
        // result = result + 1
        result++; // Abbr. op. 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // Same with sub
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // +=
        // result = result * 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // *=
        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // /=
        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // -=
        // result = result / 3;
        result -= 2; // 10 / 2 = 8
        System.out.println("10 - 2 = " + result);
```
Output
```
1 + 1 = 2
2 - 1 = 1
1 + 2 = 3
3 * 10 = 30
30 / 3 = 10
10 - 2 = 8
```

----
# Lec35IfThenStatement

## Overview
* `==` Compares for equality
* If you don't use curly braces after an if statement, only the next expression/statement is executed.
* Use Curly braces in general

## Code

```java
        boolean isAlien = false; // Assignment op. Assign false to isAlien
//        if (isAlien == true) // == is testing if value is false. Asks if operands are identical.
//            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
//            System.out.println("And I am scared of aliens");
        if (isAlien == false) { // == is testing if value is false. Asks if operands are identical.
            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
            System.out.println("And I am scared of aliens");
        }
```
Output
```
It is not an alien!
And I am scared of aliens
```



----
# Lec36LogicalAndOperator

## Overview
* Relational Operators
  * `==` - is equal to
  * `!=` - is not equal to
  * `>` - greater than
  * `>=` - greater or equal to than
  * `<` - less than
  * `<=` - less than or equal to

## Logicial Operator AND
* `&&` - AND. Return true if both the left and right operands are true, else return false.

## Code

```java
        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score! 1");
        }
        if (topScore != 100) {
            System.out.println("You got the high score! 2");
        }
        if (topScore > 100) {
            System.out.println("You got the high score! 3");
        }
        if (topScore >= 100) {
            System.out.println("You got the high score! 4");
        }
        if (topScore < 100) {
            System.out.println("You got the high score! 5");
        }
        if (topScore <= 100) {
            System.out.println("You got the high score! 6");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) { // logical AND
            System.out.println("Greater than secound top score and less than 100");
```

Output

```
You got the high score! 2
You got the high score! 5
You got the high score! 6
Greater than secound top score and less than 100
```

## Other
* DO NOT USE `&`. That's bitwise AND and will be covered at a later time.

----
# Lec37LogicalOrOperator

This follows Lec36 file

## Logical Operator OR
* `||` - OR. Return true if one of the left and right operands are true, else return false (implies both are false).
* DO NOT use a sinle bar/pipe char `|`. This is a bitwise OR; totally different

## Bitwise vs Logial Operators
* `&` - bitwise AND
* `&&` - logical AND
* `|` - bitwise OR
* `||` - logical OR

## Code
```java
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) { // logical AND
            System.out.println("Greater than secound top score and less than 100");
        }

        if ((topScore > 90) || secondTopScore <= 90) { // left is false right is true
            System.out.println("Either or both of the conditions are true");
        }
```
## Output
```
Either or both of the conditions are true
```
----
# Lec38AssignmentVsEqualTo

## Challenge - Easy to cross = with ==

```java
        int newValue = 50;
        if (newValue = 50) {
            System.out.println("This is an error");
        }
```

### Explain

* `newValue = 50` - IntelliJ is saying this is returning an int
* This is assigning, not comparing

### Correction

```java
        int newValue = 50;
        if (newValue == 50) { // <---
            System.out.println("This is true");
        }
```

## Another Example - assignment returns value assigned

```java
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
```

### Explain

This will execute the sys out line because `isCar = true` is assigning true then using the returned true value in the if statement test.

### Correction

```java
        boolean isCar = false;
        if (!isCar) { // if the var is not true exe the sys out statement
            System.out.println("This is not supposed to happen");
        }
```

## The not `!` operator
* `!` - flips the boolean value.
  * false -> true
  * true -> false

### Example
* `isCar == false` - returns true if the var is false, else true
* `!isCar` - returns true if the var is false, else true
  * if the var is false it is flipped to true, true is then evaluated and the if statement block is executed.
  * if the var is true it is flipped to false


----
# Lec39TernaryOperator

### Code
```java
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasChar is true");
        }
```
Output
```
wasChar is true
```

## The ternary operator `? :`
```java
int ageOfClient = 20;
boolean isEighteenOrOver = ageClient == 20 ? true : false;
```
* Operand one - `ageOfClient == 20` - is the case we are checking
* Op two - `true` - assign true to `isEighteenOrOver` if condition (op one) is true
* Op three - `false` - assign true to `isEighteenOrOver` if condition (op one) is false
* In this case, ageClient is 20 so the result will isEighteenOrOver will be true
* Good Idea, use parenthesis to indicate the condition
  * `boolean isEighteenOrOver = (ageClient == 20) ? true : false;`













----
# Lec40OperatorPrecedenceAndOperatorChallenge

## Useful links
* Check out oracle's ops summary page
  * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
* Check out this precedence table from Bilkent University, Turkey
  * http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

## Operator Challenge
1. Create double var with value of 20.00
2. Create a 2nd version of type double with the value of 80.00
3. Add both numbers together and multiply by 100.00
4. Use remainder to figure the remainder from the result in step 3 and 40
   1. `%` can be used on double
5. Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
6. Output the boolean var
7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.

## Code
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        // Create double var with value of 20.00
        double dVar = 20;

        // Create a 2nd version of type double with the value of 80.00
        double dVar2 = 80;

        // Add both numbers together and multiply by 100.00
        double addBoth = (dVar + dVar2) * 100.00;

        // Use remainder to figure the remainder from the result in step 3 and 40
        double remainder = addBoth % 40.00;

        // Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
        boolean isZero = (remainder == 0) ? true : false;

        // Output the boolean var
        System.out.println(isZero);

        // Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (!isZero){
            System.out.println("Got some remainder");
        }
        
    }
}
```
Output
```
true
```

## Instructor's Incorrect Solution (with my var names)

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        // Create double var with value of 20.00
        double dVar = 20;

        // Create a 2nd version of type double with the value of 80.00
        double dVar2 = 80;

        // Add both numbers together and multiply by 100.00
        double addBoth = dVar + dVar2 * 100.00;

        System.out.println("addBoth = " + addBoth);

        // Use remainder to figure the remainder from the result in step 3 and 40
        double remainder = addBoth % 40.00;

        System.out.println("remainder = " + remainder);

        // Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
        boolean isZero = (remainder == 0) ? true : false;

        System.out.println("isZero = " + isZero);

        // Output the boolean var
        System.out.println(isZero);

        // Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (!isZero){
            System.out.println("Got some remainder");
        }

    }
}

```
Output
```
addBoth = 8020.0
remainder = 20.0
isZero = false
false
Got some remainder
```

## Explanation
* `double addBoth = dVar + dVar2 * 100.00;` Multiplies before it adds b/c precedence
* Switch to `double addBoth = (dVar + dVar2) * 100.00;`


----
# Lec41EndOfRemaster

## End of Remaster
* Long story short "I am remastering the course" to clear up any confusion
* Improving the course making it better
* Improving it one section at a time

----
# Lec41FirstStepsSummary

## Summary
* Keywords
* Code
* Operators
* Expressions
* Statements
* If-Then statement
* Don't be afraid to go back and look at the previous less
  * Pick up on extra things
* Don't go as fast as possible
  * Goal is to learn Java

----
# Lec43Introduction

## Intro
* Expressions
* Statements
* Code blocks
* Methods

## Valid expressions
```java
double kilometres = (100 * 1.609344);

int highScore = 50;
if (highScore == 50) {
    System.out.println("This is an expression");
}
```

All of these are valid expression
* `double kilometres = (100 * 1.609344);`
* `int highScore = 50;`
* `highScore == 50`
* `System.out.println("This is an expression");`

## Another Example

```java
int score = 100;
if (score > 99) {
    System.out.println("You got the high score!");
    score = 0;
}
```

All of these are valid expressions
* `int score = 100;`
* `score > 99`
* `System.out.println("You got the high score!");`
* `score = 0;`

----
# Lec44KeywordsAndExpressions

## Keywords
* 50 keywords
* Link: https://en.wikipedia.org/wiki/List_of_Java_keywords

----
# Lec45StatementsWhitespaceIndentation

## Statements
* A semicolon `;` indictates the end of a statement

```java
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more."); // java can handle this no problem.
        // ; is a terminator

        int anotherVariable = 50;myVariable--; // java does not care, but this is not recommended.

        // this can go further
        int anotherVariable2 = 50;myVariable--;System.out.println("This is another one");
```
output
```
This is a test
This is another still more.
This is another one
```

## Whitespace
* Space between

This is valid
```java
        //whitespace
        int
                x
                    =
            17;
```
Java will cut the whitespace

## Indentation
* Generally we indent when going inside of:
  * if statements
  * class definitions
  * method definitions

This is hard to read
```java
package com.company;

public class Main {

public static void main(String[] args) {
int myVariable = 50;
myVariable++;
myVariable--;
System.out.println("This is a test");
System.out.println("This is" +
" another" +
" still more."); // java can handle this no problem.
// ; is a terminator

int anotherVariable = 50;myVariable--; // java does not care, but this is not recommended.

// this can go further
int anotherVariable2 = 50;myVariable--;System.out.println("This is another one");
}
}
```

As opposed to this

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more."); // java can handle this no problem.
        // ; is a terminator

        int anotherVariable = 50;myVariable--; // java does not care, but this is not recommended.

        // this can go further
        int anotherVariable2 = 50;myVariable--;System.out.println("This is another one");

        if (true){
            System.out.println("stuff");
        }

    }
}
```


----
# Lec46CodeBlocksAndIfElse

## Code Blocks
* The curly braces are an in statement condition
* This fails

```java
        if (score == 4000)
            System.out.println("Your score was 5000");
            System.out.println("This was excuted");
```
output
```
This was excuted
```

### Explain
* w/o curly braces the if will only limit or control up to the single statement after the if condition parenthesis. Thus we see the 2nd sys out statement execute.

### Fix
```java
        if (score == 4000) {
            System.out.println("Your score was 5000");
            System.out.println("This was excuted");
        }
```

### Notes
* Even if you use a single line it's best to use the curly braces. Consistency + legibility

## If-Else
```java
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }
    }
```
ouput
```
Got here
```
### Explain
* `score` is not less than 5000 so the else executes.
* Making `score < 5000` say `score <= 5000` instead will allow the 1st code block to execute

## If-Else

```java
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
```

### Explain
* The `else if ...` tests again if the first one was false
* The `else` executes after all others are false

## Definitions inside code blocks
* Variable names declared (and initialized) inside a codeblock cannot be used outside
  * The reverse is possible
  * Accessing ***from*** inside inner scopes ***to*** outer works, but outwards does not
* This fails

```java
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println();
        }

        int savedFinalScore = finalScore;
```

### Explain
* finalScore is declared inside the `{}` codeblock. This cannot be accessed past the end of its scope/codeblock

## Challenge Time
Print out a 2nd score on the screen with the following

1. Score set to 10000
2. levelCompleted set 8
3. Bonus set to 200
4. But make sure the 1st printout above still displays as well

### My answer
```java
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
```
output: `Your final score was = 11600`

### Professor answer

Option 1
* Create new vars
  * Minor Problem: Using excess memory

```
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was = " + finalScore);
        }
```
output: `Your final score was = 11600`

Option 2
* Use old vars
  * Minor Problem: Dont have record of the old record
  * Minor Problem: duplicating code. Makes changes hard.
    * You can remove this by using methods
* Code is essentially the same as the above.


----
