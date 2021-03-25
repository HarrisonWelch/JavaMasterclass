
----
# JavaMasterclass

## Notes from [Tim Buchalka](https://www.timbuchalka.com/)'s class entitled "[Java Programming Masterclass for Software Developers](https://www.udemy.com/course/java-the-complete-java-developer-course/)" on Udemy

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
# Lec 61 p3 Int Equality Printer

## Summary
* If any number is < 0 print invalid value
* If all 3 numbers are equal print "All numbers are equal"
* If all 3 numbers are different print "All numbers are different"
* Else print "Neither all are equal or different"

## Solution
```java
package com.company;

public class Main {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        // IntEqualityPrinter
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
            return;
        }
        if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
        return;
    }
}
```
Output
```
All numbers are equal
Neither all are equal or different
Invalid Value
All numbers are different
```

----
# Lec61p4PlayingCat.md

## Summary
* If any number is < 0 print invalid value
* If all 3 numbers are equal print "All numbers are equal"
* If all 3 numbers are different print "All numbers are different"
* Else print "Neither all are equal or different"

## Soltion
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // PlayingCat
        System.out.println("isCatPlaying(true, 25) = " + isCatPlaying(true, 25));
        System.out.println("isCatPlaying(false, 36) = " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) = " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying(true, 33) = " + isCatPlaying(true, 33));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        return (summer) ?
                (temperature >= 25 && temperature <= 45) :
                (temperature >= 25 && temperature <= 35);
    }
}
```
Output
```
isCatPlaying(true, 25) = true
isCatPlaying(false, 36) = false
isCatPlaying(false, 35) = true
isCatPlaying(true, 33) = true
```

----
# Lec57p1CodingExercise1SpeedConverter

## Solution
```java
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megeBytes = kiloBytes / 1024;
        int kiloBytesRemainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = "+megeBytes+" MB and "+kiloBytesRemainder+" KB");
    }
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
```
output
```
2500 KB = 2 MB and 452 KB
Invalid Value
5000 KB = 4 MB and 904 KB
```

----
# Lec57p2CodingExercise2MegaBytesConverter

## Solution
```java
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / 1024;
        int kiloBytesRemainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = "+megaBytes+" MB and "+kiloBytesRemainder+" KB");
    }
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
```
output
```
2500 KB = 2 MB and 452 KB
Invalid Value
5000 KB = 4 MB and 904 KB
```

----
# Lec57p3CodingExercise3BarkingDog

## Solution
```java
package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        return (barking && (hourOfDay > 22 || hourOfDay < 8));
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, -1));
    }
}
```
output
```
BarkingDog.shouldWakeUp(true, 1) = true
BarkingDog.shouldWakeUp(true, 1) = false
BarkingDog.shouldWakeUp(true, 1) = false
BarkingDog.shouldWakeUp(true, 1) = false
```

----
# Lec57p4CodingExercise4LeapYearCalculator

## Solution
```java
package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("LeapYear.isLeapYear(-1600) = " + LeapYear.isLeapYear(-1600));
        System.out.println("LeapYear.isLeapYear(1600) = " + LeapYear.isLeapYear(1600));
        System.out.println("LeapYear.isLeapYear(2017) = " + LeapYear.isLeapYear(2017));
        System.out.println("LeapYear.isLeapYear(2000) = " + LeapYear.isLeapYear(2000));
    }
}
```
output
```
LeapYear.isLeapYear(-1600) = false
LeapYear.isLeapYear(1600) = true
LeapYear.isLeapYear(2017) = false
LeapYear.isLeapYear(2000) = true
```

----
# Lec57p5CodingExercise5DecimalComparator

## Solution
```java
package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        DecimalFormat df = new DecimalFormat("#######.###");
        df.setRoundingMode(RoundingMode.DOWN);
        return (df.format(num1)).equals(df.format(num2));
    }
}

```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.176, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.176, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.123, 3.123) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
```
output
```
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175) = true
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.176, -3.175) = false
DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0) = true
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.123, 3.123) = false
```

----
# Lec57p6CodingExercise6EqualSumChecker

## Solution
```java
package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3;
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("EqualSumChecker.hasEqualSum(1, 1, 1) = " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("EqualSumChecker.hasEqualSum(1, 1, 2) = " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("EqualSumChecker.hasEqualSum(1, -1, 0) = " + EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}
```
output
```
EqualSumChecker.hasEqualSum(1, 1, 1) = false
EqualSumChecker.hasEqualSum(1, 1, 2) = true
EqualSumChecker.hasEqualSum(1, -1, 0) = true
```

----
# Lec57p7CodingExercise7TeenNumberChecker

## Solution
```java
package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int p1, int p2, int p3){
        return isTeen(p1) ||
               isTeen(p2) ||
               isTeen(p3);
    }
    public static boolean isTeen(int p1){
        return (p1 >= 13 && p1 <= 19);
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("TeenNumberChecker.hasTeen( 9,99,19) = " + TeenNumberChecker.hasTeen( 9,99,19));
        System.out.println("TeenNumberChecker.hasTeen(25,15,42) = " + TeenNumberChecker.hasTeen(25,15,42));
        System.out.println("TeenNumberChecker.hasTeen(22,23,24) = " + TeenNumberChecker.hasTeen(22,23,24));

        System.out.println("TeenNumberChecker.isTeen( 9) = " + TeenNumberChecker.isTeen( 9));
        System.out.println("TeenNumberChecker.isTeen(13) = " + TeenNumberChecker.isTeen(13));
    }
}
```
output
```
TeenNumberChecker.hasTeen( 9,99,19) = true
TeenNumberChecker.hasTeen(25,15,42) = true
TeenNumberChecker.hasTeen(22,23,24) = false
TeenNumberChecker.isTeen( 9) = false
TeenNumberChecker.isTeen(13) = true
```

----
# Lec 61 p1 Area Calculator

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // AreaCalculator
    }
    public static double area(double radius){
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1;
        return x * y;
    }
}
```

----
# Lec 61 p2 Minutes To Years Days Calculator

## Problem Summary
* Convert minutes to years and days
* If < 0 print invalid value

## Solution
```java
package com.company;

public class Main {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        // MinutesToYearsDaysCalculator
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24*60);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
        return;
    }
}
```
Output
```
525600 min = 1 y and 0 d
1051200 min = 2 y and 0 d
561600 min = 1 y and 25 d
```


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
# Lec47IfElseRecap

## Recap
* an `if` statement will let a code block exe on a specific condition
* A code block can have one or more than one statement inside.
* `else` will allow a specific code block to run if the condition is false
* `else if` will allow testing of multiple conditions

## Basic Structure

```java
if (condition) {
    // if statement (block)
} else {
    // else statement (block)
}
```

## Example 1
```java
int score = 6000;

if (score >= 5000) { // Java will set this as true
    System.out.println("Your score was >= 5000"); // and exe this line
} else if (score < 1000 && score >= 500) {
    System.out.println("Your score was < 1000 but >= 500");
} else {
    System.out.println("Your score was < 500");
}
// then exit
```
output: `Your score was >= 5000`


## Example 2
```java
int score = 800;

if (score >= 5000) { // Java will see this as false
    System.out.println("Your score was >= 5000"); 
} else if (score < 1000 && score >= 500) { // Java will see this as true. score is between 1000 and 500 (lower inclusive)
    System.out.println("Your score was < 1000 but >= 500"); // and exe this line
} else {
    System.out.println("Your score was < 500");
}
// then exit
```
output: `Your score was < 1000 but >= 500`

## Example 2
```java
int score = 200;

if (score >= 5000) { // Java will see this as false
    System.out.println("Your score was >= 5000"); 
} else if (score < 1000 && score >= 500) { // Java will see this as false
    System.out.println("Your score was < 1000 but >= 500"); // and exe this line
} else { // default is exe
    System.out.println("Your score was < 500"); // and exe this line
}
// then exit
```
output: `Your score was < 500`


----
# Lec48MethodsInJava

## Methods
* We have been using method "main" all along

### Define `calculateScore`
```java
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

    }
```

## Passing information to a method
* Tell the method what parameters/information
* We can add parameters with to the functions parenthesis
* Then pass them in the main method

```java
public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

    }

}

```
ouput 
```
Your final score was = 2300
Your final score was = 11600
```
Same as before

## Cleaning further
* Change the 2nd score calculation to be arguments passed into the function
* Note: we changed the bonus to 2000

```java
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200); // Notice typing in the variables in directly
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was = " + finalScore);
        }
    }
```

output
```
Your final score was = 3300
Your final score was = 13600
```

* Now we have two lines and the code looks cleaner

## Now send back the result
* Get the two of them to work together
* `void` means don't send anything back
* Lets return the `finalScore` instead
* Note: `-1` is commonly used to indicate value not found. Especially in cases where the value cannot be positive or null

## Full Code as of now
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200); // Notice typing in the variables in directly
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was = " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
```

----
# Lec49MoreMethods

## More on Methods
* return an int and log it to the console


## Challenge
* Create a method called displayHighScorePosition
  * It should receive a players name and a 2nd param as a position in the high score table
  * Display the player name with a message like " managed to get into position " and the position they got and a further message " on the high score table".
* Create a 2nd method called calculateHighScorePosition
  * It should be sent one argument only, the player score
  * It return an int
  * the return data should be
    * `1` if the score is >1000
    * `2` if the score is >500 and <1000
    * `3` if the score is >100 and <500
    * `4` if the score is >100 and <500
  * Call both methods and display the results of the following
    * A score of 1500, 900, 400, and 50
* Note: a void method is often called a procedure
* Note: a method can also be called a function. Interchangeable

## My Answer

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Mary", calculateHighScorePosition(1500));
        displayHighScorePosition("Rashad", calculateHighScorePosition(900));
        displayHighScorePosition("Z", calculateHighScorePosition(400));
        displayHighScorePosition("Xylophone", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int postionHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + postionHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
```
ouput
```
Mary managed to get into position 1 on the high score table
Rashad managed to get into position 2 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 4 on the high score table
```

## Slight problem
* We are using `<` and `>` so that it does not include the numbers 1000, 500, and 100.
* To fix this we need only introduce `>=` and `<=` where applicable

## Fixed
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Mary", calculateHighScorePosition(1500));
        displayHighScorePosition("Rashad", calculateHighScorePosition(900));
        displayHighScorePosition("Z", calculateHighScorePosition(400));
        displayHighScorePosition("Xylophone", calculateHighScorePosition(50));
        displayHighScorePosition("Louise", calculateHighScorePosition(1000));
        displayHighScorePosition("Marshall", calculateHighScorePosition(500));
        displayHighScorePosition("Crystal", calculateHighScorePosition(100));
    }

    public static void displayHighScorePosition(String playerName, int postionHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + postionHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
```
output
```
Mary managed to get into position 1 on the high score table
Rashad managed to get into position 2 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 4 on the high score table
Louise managed to get into position 1 on the high score table
Marshall managed to get into position 2 on the high score table
Crystal managed to get into position 3 on the high score table
```

# Future Optimizations
* In an `if else` statement, we have knowledge in `else if` blocks that the previous `if` condition was false. So `...else if (playerScore >= 500 && playerScore < 1000)...` can be truncated to just `else if (playerScore >= 500)`.


----
# Lec50MethodChallengeFinal

## Final Changes
* In an `if else` statement, we have knowledge in `else if` blocks that the previous `if` condition was false. So `...else if (playerScore >= 500 && playerScore < 1000)...` can be truncated to just `else if (playerScore >= 500)`.
* Then the `else` can be subbed for a simple return 4 as we have tested all other conditons as needed

## Changed Function
```java
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
```
output is the same

## More than 1 way to solve this
```java
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
```
output is the same
----
# Lec51DiffMergeToolIntroduction

## Intro
* Help visually compare merge files
* In the future, this will help with code repositories
* When you get stuck this will help
* Download the professors code and compare it to yours


----
# Lec52InstallDiffMerge

## Install
* Go to http://sourcegear.com/diffmerge/
* Go to Downloads/DiffMerge (from the hover dropdown)
* Install your appropriate installer



----
# Lec53UsingDiffMerge

## Diff Merge
* Use the folder button in the top left
* Make the left folder your correct (more correct) solution
* Make the right folder your target solution
* Diff Merge will highlight all changes in all files recursively between both folders
* Diff Merge will detect (most of the time) that a file has been changed outside of the program.
  * Reload the folder(s)
* "Apply from change from left" is a button in the top row
  * It will adjust the right window to match the left
  * Black bars will be placed on the changed code on the right
  * Changes have not yet been made

## Filtering
* You can filter out some files to avoid useless info
* `*.class` files are compiled java files
* Under Tools / Options you will see "Folder Windows"
* In the "Use file name filters"
  * Make sure the box is checked
  * Add `*.class` to avoid diffmerge from checking files it doesn't need to
* Under subfolder filters place `.idea` in there to avoid any child files and the directory from being diffmerge compared.

Example:
```java
        } else if (playerScore >= 100); { // <-- Introduced an error
            position = 3;
        }
```
This caused all output to say positon 3 b/c `position = 3;` is a code block without a condition

output
```
Mary managed to get into position 3 on the high score table
Rashad managed to get into position 3 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 3 on the high score table
Louise managed to get into position 3 on the high score table
Marshall managed to get into position 3 on the high score table
Crystal managed to get into position 3 on the high score table
```

----
# Lec54CodingExercises

## Coding Exercises
* New Feature added in 2018
* Coding problems are presented and the user can input their solution interactively

# Example
* Design a method called checkNumber with one param number as an int. if the number is > 0 return "positive", if the number is < 0 return "negative", if 0 return "zero"

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("checkNumber(42) = " + checkNumber(42));
        System.out.println("checkNumber(0) = " + checkNumber(0));
        System.out.println("checkNumber(-1) = " + checkNumber(-1));
    }

    public static String checkNumber(int number){
        if (number == 0){
            return "zero";
        } else if (number > 0) {
            return "positive";
        }
        return "negative";
    }
}
```

## Notes
* Coding exercises need to be EXACT (very picky)
  * Capitalization
  * Static vs Non-static
  * single method vs. > 1 method

----
# Lec55CodeExerciseExamplePart1

Main
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("SpeedConverter.toMilesPerHour(1.5) = " + SpeedConverter.toMilesPerHour(1.5));
        System.out.println("SpeedConverter.toMilesPerHour(10.25) = " + SpeedConverter.toMilesPerHour(10.25));
        System.out.println("SpeedConverter.toMilesPerHour(-5.6) = " + SpeedConverter.toMilesPerHour(-5.6));
        System.out.println("SpeedConverter.toMilesPerHour(25.42) = " + SpeedConverter.toMilesPerHour(25.42));
        System.out.println("SpeedConverter.toMilesPerHour(75.114) = " + SpeedConverter.toMilesPerHour(75.114));
    }

}
```

Class SpeedConverter
```java
package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.00d) return -1;
        return Math.round(kilometersPerHour * 0.621371);
    }
}
```

output
```
SpeedConverter.toMilesPerHour(1.5) = 1
SpeedConverter.toMilesPerHour(10.25) = 6
SpeedConverter.toMilesPerHour(-5.6) = -1
SpeedConverter.toMilesPerHour(25.42) = 16
SpeedConverter.toMilesPerHour(75.114) = 47
```

----
# Lec56CodingExercisesExamplePart2

## Constructing the 2nd method `printConversion`

Main
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}
```
SpeedConverter
```java
package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.00d) return -1;
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0.00d) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(
                kilometersPerHour + " km/h = " +
                SpeedConverter.toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}

```
Output
```
1.5 km/h = 1 mi/h
10.25 km/h = 6 mi/h
Invalid Value
25.42 km/h = 16 mi/h
75.114 km/h = 47 mi/h
```

----
# Lec58MethodOverloading

## Method Overloading
* Defining several methods of the same name but with diff arguments (number or type)
* Create a unique method signature
  * Same name
  * Diff arguments (number or type)
* Cannot change return type (without also changing the arguments)

## EXAMPLE

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore();
    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player " + playername + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored, no player score.");
        return 0;
    }

}
```

## Challenge
* Create a method called calcFeetAndInchesToCentimeters
  * It needs to have two parameters.
  * feet is the first parameter, inches, is the 2nd parameter
  * You should validate that the first parameter feet is >= 0
  * You should validate that the 2nd parameter inches is >= 0 and <= 12
  * return -1 from the method if either of the above is not true
  * If the parameters are valid, then calculate how many centimeters comprised the feet and inches passed to this method and return that value
* Create a 2nd method of the same name but with only one parameter inches is the parameter
  * validate that it is >= 0
  * return -1 if it is not true
  * But if its valid, then calculate how many feet are in the inches and then
* here is the tricky part
  * call the other overloaded method passing in the correct feet and inches calculated so that it can calculate correctly.
* hints:
  * use double for your number data types is probably a good idea 1 inch = 2.54cm and 1 ft = 12 inches
  * use the link I give
  * Calling the correct overloaded method requires you to use the right number of arguments

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("calcFeetAndInchesToCentimeters(4,5) = " + calcFeetAndInchesToCentimeters(4,5));
        System.out.println("calcFeetAndInchesToCentimeters(3,16) = " + calcFeetAndInchesToCentimeters(3,16));
        System.out.println("calcFeetAndInchesToCentimeters(-1,11) = " + calcFeetAndInchesToCentimeters(-1,11));
        System.out.println("calcFeetAndInchesToCentimeters(16) = " + calcFeetAndInchesToCentimeters(16));
        System.out.println("calcFeetAndInchesToCentimeters(1000) = " + calcFeetAndInchesToCentimeters(1000));
        System.out.println("calcFeetAndInchesToCentimeters(-12) = " + calcFeetAndInchesToCentimeters(-12));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0) return -1;
        if (inches < 0 || inches > 12) return -1;
        int totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0) return -1;
        int feet = inches / 12;
        int remInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remInches);
    }

}

```
Output
```
calcFeetAndInchesToCentimeters(4,5) = 134.62
calcFeetAndInchesToCentimeters(3,16) = -1.0
calcFeetAndInchesToCentimeters(-1,11) = -1.0
calcFeetAndInchesToCentimeters(16) = 40.64
calcFeetAndInchesToCentimeters(1000) = 2540.0
calcFeetAndInchesToCentimeters(-12) = -1.0
```

----
# Lec59MethodOverloadingRecap

## Method Overloading
* A feature that allows more than one method with the same name so long as we use different parameters (number and type)
* Allows diff implementations with different types or number of variables
* You can also mix in other implementations for easier flow

## Example
* Suppose you have a method that can do 
  * the sum of 2 numbers
  * the sum of 3 numbers
  * And the sum of 4 numbers
* Each method would have the number of args passed to it.

Bad Practice
```java
    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }
    public static int sumThreeNumbers(int a, int b, int c){
        return a + b + c;
    }
    public static int sumFourNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }
```

Good Practice
```java
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
```

### `sum` is easier to remember and use.

## Final Notes
* Easier to remember one name
* Improve readability
* Add flexibility with diff types of data.
* Less work, more readable

----
# Lec 60 Seconds And Minutes Challenge

## Challenge
* Create a method called getDurationString with 2 params, 1st param minutes and 2nd param seconds.
* Validate first param is >= 0
* Validate 2nd parameter seconds is >= 0 and <= 59
* The method should return "Invalid value" in the method if either of the above are not true.
* If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represent a number of hours, YY the minutes, and ZZ the seconds.
* Create a 2nd method of the same name but with only one parameter seconds
  * validate that it is >= 0 and return invalid value if not true
  * if true pass to the overloaded method

## Solution
```java
package com.company;

public class Main {
    //    * Create a method called getDurationString with 2 params, 1st param minutes and 2nd param seconds.
    //    * Validate first param is >= 0
    //            * Validate 2nd parameter seconds is >= 0 and <= 59
    //            * The method should return "Invalid value" in the method if either of the above are not true.
    //            * If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represent a number of hours, YY the minutes, and ZZ the seconds.
    //    * Create a 2nd method of the same name but with only one parameter seconds
    //            * validate that it is >= 0 and return invalid value if not true
    //            * if true pass to the overloaded method
    public static void main(String[] args) {
        // SecondsAndMinutesChallenge
        System.out.println("getDurationString(12, 12) = " + getDurationString(12, 12));
        System.out.println("getDurationString(-15, 3) = " + getDurationString(-15, 3));
        System.out.println("getDurationString(15, -3) = " + getDurationString(15, -3));
        System.out.println("getDurationString(100) = " + getDurationString(100));
        System.out.println("getDurationString(-100) = " + getDurationString(-100));
    }
    private static String getDurationString(long minutes, long seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";
        long hours = minutes / 60;
        long minutesRemaining = minutes % 60;
        return hours + "h " + minutesRemaining + "m " + seconds + "s";
    }
    private static String getDurationString(long seconds){
        if (seconds < 0) return "Invalid value";
        long minutes = seconds / 60;
        long secondsRemaining = seconds % 60;
        return getDurationString(minutes, secondsRemaining);
    }
}

```
----
# Lec 61 Bonus Challenge

## Going from the Seconds And Minutes Challenge from Lec 60
* Zero pad the hours, minutes, seconds
* Use final values

## Updated solution
```java
package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // final means value can't change

    public static void main(String[] args) {
        // SecondsAndMinutesChallenge
        System.out.println("getDurationString(12, 12) = " + getDurationString(12, 12));
        System.out.println("getDurationString(-15, 3) = " + getDurationString(-15, 3));
        System.out.println("getDurationString(15, -3) = " + getDurationString(15, -3));
        System.out.println("getDurationString(100) = " + getDurationString(100));
        System.out.println("getDurationString(-100) = " + getDurationString(-100));
    }
    private static String getDurationString(long minutes, long seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;
        long hours = minutes / 60;
        long minutesRemaining = minutes % 60;
        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hours;
        }
        String minutesString = minutesRemaining + "h";
        if (minutesRemaining < 10) {
            minutesString = "0" + minutesRemaining;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + seconds;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }
    private static String getDurationString(long seconds){
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        long minutes = seconds / 60;
        long secondsRemaining = seconds % 60;
        return getDurationString(minutes, secondsRemaining);
    }
}

```

----
# CodingExercise12NumberInWord

## Summary
* Method called printNumberInWord
* The method has one parameter number which is the whole number
* Print ZERO ONE ... NINE OTHER if the paramater is 0 1 ... 9 or other for any number including negative ones.
* Use if-else or switch, whatever is easier

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // Test all numbers -1 through 10
        for(int i = -1; i <= 10; i++){
            printNumberInWord(i);
        }
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0:  System.out.println("ZERO");  break;
            case 1:  System.out.println("ONE");   break;
            case 2:  System.out.println("TWO");   break;
            case 3:  System.out.println("THREE"); break;
            case 4:  System.out.println("FOUR");  break;
            case 5:  System.out.println("FIVE");  break;
            case 6:  System.out.println("SIX");   break;
            case 7:  System.out.println("SEVEN"); break;
            case 8:  System.out.println("EIGHT"); break;
            case 9:  System.out.println("NINE");  break;
            default: System.out.println("OTHER");
        }
    }
}
```
output
```
OTHER
ZERO
ONE
TWO
THREE
FOUR
FIVE
SIX
SEVEN
EIGHT
NINE
OTHER
```

----
# CodingExercise13NumberOfDaysInMonth

## Summary
* Method 1 `isLeapYear`
  * Write a method called isLeapYear
  * return boolean
  * single param year, type int
  * param needs to be >= 1 and <= 9999
  * If outside return false
  * return true if the year sent in is a leap year, else false
  * A year is a leap year if divisible by 4, but not if divisible by 100, unless it is divisible by 400 then it is again

* Method 2 `getDaysInMonth`
  * two params month and year, both type int
  * if month < 1 or > 12 return -1
  * if year < 1 or > 9999 return -1
  * return the number of days in a month. Feb has 29 on a leap year
  * Use the isleapyear function


## Solution 
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise13NumberOfDaysInMonth
        System.out.println("isLeapYear(-1600) = " + isLeapYear(-1600));
        System.out.println("isLeapYear(1600) = " + isLeapYear(1600));
        System.out.println("isLeapYear(2017) = " + isLeapYear(2017));
        System.out.println("isLeapYear(2000) = " + isLeapYear(2000));
        System.out.println("----");
        System.out.println("getDaysInMonth(1, 2020) = " + getDaysInMonth(1, 2020));
        System.out.println("getDaysInMonth(2, 2020) = " + getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(2, 2018) = " + getDaysInMonth(2, 2018));
        System.out.println("getDaysInMonth(-1, 2020) = " + getDaysInMonth(-1, 2020));
        System.out.println("getDaysInMonth(1, -2020) = " + getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999) return -1;
        switch (month) {
            case 1: // JAN
            case 3: // MAR
            case 5: // MAY
            case 7: // JUL
            case 8: // AUG
            case 10: // OCT
            case 12: // DEC
                return 31;
            case 4: // APR
            case 6: // JUN
            case 9: // SEP
            case 11: // NOV
                return 30;
            case 2: // FEB
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
```
Output
```
isLeapYear(-1600) = false
isLeapYear(1600) = true
isLeapYear(2017) = false
isLeapYear(2000) = true
----
getDaysInMonth(1, 2020) = 31
getDaysInMonth(2, 2020) = 29
getDaysInMonth(2, 2018) = 28
getDaysInMonth(-1, 2020) = -1
getDaysInMonth(1, -2020) = -1
```

----
# Coding Exercise 14 Sum Odd

## Summary
* Method 1 'isOdd`
  * Write a method call `isOdd` with an int param and call it number.
  * return boolean
  * if > 0 return false
  * if odd return true, else false
* Method 2 `sumOdd`
  * return int
  * 2 int params `start` and `end` which represent the start and end of nums to sum
  * return the sum of odd numbers between start and end inclusive
  * call isOdd to determine if a number is odd or not
  * end >= start, else return -1
  * start,end > 0, else return -1

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // SumOdd
        System.out.println("sumOdd(  1,  100) = " + sumOdd(  1,  100));
        System.out.println("sumOdd( -1,  100) = " + sumOdd( -1,  100));
        System.out.println("sumOdd(100,  100) = " + sumOdd(100,  100));
        System.out.println("sumOdd( 13,   13) = " + sumOdd( 13,   13));
        System.out.println("sumOdd(100, -100) = " + sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) = " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) return -1;
        if (end < start) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
```
## Output
```
sumOdd(  1,  100) = 2500
sumOdd( -1,  100) = -1
sumOdd(100,  100) = 0
sumOdd( 13,   13) = 13
sumOdd(100, -100) = -1
sumOdd(100, 1000) = 247500
```

----
# Coding Exercise 15 Number Palindrome

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise15NumberPalindrome
        System.out.println("isPalindrome(1221) = " + isPalindrome(1221));
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(1234) = " + isPalindrome(1234));
        System.out.println("isPalindrome(707) = " + isPalindrome(707));
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverse = 0;
        int place = (int) Math.pow(10, (number + "").length()-1);
        int n = number;
        while (n > 0) {
            reverse += (n % 10) * place;
            place = place / 10;
            n /= 10;
        }
        return number == reverse;
    }
}
```
output
```
isPalindrome(1221) = true
isPalindrome(-1221) = true
isPalindrome(1234) = false
isPalindrome(707) = true
isPalindrome(11212) = false
```





----
# Coding Exercise 16 First And Last Digit Sum

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise16FirstAndLastDigitSum
        System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstDigit = number % 10;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number;
            number /= 10;
        }
        return (firstDigit + lastDigit);
    }
}
```
output
```
sumFirstAndLastDigit(252) = 4
sumFirstAndLastDigit(257) = 9
sumFirstAndLastDigit(0) = 0
sumFirstAndLastDigit(5) = 10
sumFirstAndLastDigit(-10) = -1
```

----
# Coding Exercise 17 Even Digit Sum

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise17EvenDigitSum
        System.out.println("getEvenDigitSum(123456789) = " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) = " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22) = " + getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
```
output
```
getEvenDigitSum(123456789) = 20
getEvenDigitSum(252) = 4
getEvenDigitSum(-22) = -1
```

----
# Coding Exercise 18 Shared Digit

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise18SharedDigit
        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99) = " + hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || y < 10 || x > 99 || y > 99) return false;
        int y_temp = y;
        int digit_x = 0;
        int digit_y = 0;
        while (x > 0){
            digit_x = x % 10;
            while (y_temp > 0) {
                digit_y = y_temp % 10;
                if (digit_x == digit_y) {
                    return true;
                }
                y_temp /= 10;
            }
            y_temp = y;
            x /= 10;
        }
        return false;
    }
}
```
output
```
hasSharedDigit(12, 23) = true
hasSharedDigit(9, 99) = false
hasSharedDigit(15, 55) = true
```

----
# Coding Exercise 19 Last Digit Checker

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise19LastDigitChecker
        System.out.println("hasSameLastDigit(41, 22, 71) = " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23, 32, 42) = " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9, 99, 999) = " + hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int n1_last_digit = n1 % 10;
        int n2_last_digit = n2 % 10;
        int n3_last_digit = n3 % 10;
        return n1_last_digit == n2_last_digit ||
               n1_last_digit == n3_last_digit ||
               n2_last_digit == n3_last_digit;
    }
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
```
output
```
hasSameLastDigit(41, 22, 71) = true
hasSameLastDigit(23, 32, 42) = true
hasSameLastDigit(9, 99, 999) = false
```

----
# CodingExercise20GreatestCommonDivisor

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise20GreatestCommonDivisor
        System.out.println("getGreatestCommonDivisor(25, 15) = " + getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9, 18) = " + getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81, 153) = " + getGreatestCommonDivisor(81, 153));

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        if (second % first == 0) return first;
        for( int i = first; i >= 2; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
```
output
```
getGreatestCommonDivisor(25, 15) = 5
getGreatestCommonDivisor(12, 30) = 6
getGreatestCommonDivisor(9, 18) = -1
getGreatestCommonDivisor(81, 153) = 9
```

----
# Coding Exercise 21 All Factors

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise21AllFactors
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
```
output
```
1 2 3 6 
1 2 4 8 16 32 
1 2 5 10 
Invalid Value
```


----
# CodingExercise22PerfectNumber

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise22PerfectNumber
        System.out.println("isPerfectNumber(6) = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfDivisors = 0;
        for (int i = 1; i <= number-1; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
}

```
output
```
isPerfectNumber(6) = true
isPerfectNumber(28) = true
isPerfectNumber(5) = false
isPerfectNumber(-1) = false
```

----
# Coding Exercise 23 Number To Words

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise23NumberToWords
        System.out.println("getDigitCount(0) = " + getDigitCount(0));
        System.out.println("getDigitCount(123) = " + getDigitCount(123));
        System.out.println("getDigitCount(-12) = " + getDigitCount(-12));
        System.out.println("getDigitCount(5200) = " + getDigitCount(5200));
        System.out.println("reverse(-121) = " + reverse(-121));
        System.out.println("reverse(1212) = " + reverse(1212));
        System.out.println("reverse(1234) = " + reverse(1234));
        System.out.println("reverse(100) = " + reverse(100));
        System.out.println("reverse(100) = " + reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.print("Zero" + " ");
            return;
        }
        int reverse = reverse(number);
        int old_reverse = reverse;
        while (reverse > 0) {
            switch (reverse % 10){
                case 0:
                    System.out.print("Zero" + " ");
                    break;
                case 1:
                    System.out.print("One" + " ");
                    break;
                case 2:
                    System.out.print("Two" + " ");
                    break;
                case 3:
                    System.out.print("Three" + " ");
                    break;
                case 4:
                    System.out.print("Four" + " ");
                    break;
                case 5:
                    System.out.print("Five" + " ");
                    break;
                case 6:
                    System.out.print("Six" + " ");
                    break;
                case 7:
                    System.out.print("Seven" + " ");
                    break;
                case 8:
                    System.out.print("Eight" + " ");
                    break;
                case 9:
                    System.out.print("Nine" + " ");
                    break;
            }
            reverse /= 10;
        }
        if (getDigitCount(number) != getDigitCount(old_reverse)) {
            int diff = getDigitCount(number) - getDigitCount(old_reverse);
            for (int i = 0; i < diff; i++) {
                System.out.print("Zero" + " ");
            }
        }
        System.out.println("");
    }

    public static int reverse(int number) {
        boolean isNegative = number != Math.abs(number);
        number = Math.abs(number);
        int reverse = 0;
        int place = (int) Math.pow(10, getDigitCount(number)-1);
        int n = number;
        while (n > 0) {
            reverse += (n % 10) * place;
            place = place / 10;
            n /= 10;
        }

        return isNegative ? (-1 * reverse) : reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;
        return (number + "").length();
    }
}
```
output
```
getDigitCount(0) = 1
getDigitCount(123) = 3
getDigitCount(-12) = -1
getDigitCount(5200) = 4
reverse(-121) = -121
reverse(1212) = 2121
reverse(1234) = 4321
reverse(100) = 1
reverse(100) = 1
One Two Three 
One Zero One Zero 
One Zero Zero Zero 
Invalid Value
```

----
# CodingExercise24FlourPackProblem

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("canPack(1,0,4) = " + canPack(1,0,4));
        System.out.println("canPack(1,0,5) = " + canPack(1,0,5));
        System.out.println("canPack(0,5,4) = " + canPack(0,5,4));
        System.out.println("canPack(2,2,11) = " + canPack(2,2,11));
        System.out.println("canPack(-3,2,12) = " + canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (((i*5) + j) == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
```
output
```
canPack(1,0,4) = false
canPack(1,0,5) = true
canPack(0,5,4) = true
canPack(2,2,11) = true
canPack(-3,2,12) = false
```

----
# Coding Exercise 25 Largest Prime

## Summary
* Return the largest prime number that is composite to the number passed in
* If the number is negative return -1
* If the number is 1 return -1

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise25LargestPrime
        System.out.println("getLargestPrime(21) = " + getLargestPrime(21));
        System.out.println("getLargestPrime(217) = " + getLargestPrime(217));
        System.out.println("getLargestPrime(0) = " + getLargestPrime(0));
        System.out.println("getLargestPrime(45) = " + getLargestPrime(45));
        System.out.println("getLargestPrime(-1) = " + getLargestPrime(-1));
        System.out.println("getLargestPrime(7) = " + getLargestPrime(7));
        System.out.println("getLargestPrime(1) = " + getLargestPrime(1));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;
        boolean flag_prime = true;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                flag_prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        // Not Prime
                        flag_prime = false;
                    }
                }
                if (flag_prime) {
                    if (i == 1) return -1;
                    return i;
                }
            }
        }
        return -1;
    }
}
```
output
```
getLargestPrime(21) = 7
getLargestPrime(217) = 31
getLargestPrime(0) = -1
getLargestPrime(45) = 5
getLargestPrime(-1) = -1
getLargestPrime(7) = 7
getLargestPrime(1) = -1
```

----
# CodingExercise26DiagonalStar

## TODO

----
# Coding Exercise 27 Input Calculator

## Summary
* Make function inputThenPrintSumAndAverage
* No params
* Void return type
* Until the user sends in non-int input, keep adding and counting the numbers input by the user
* At the end, print the output `"SUM = XX AVG = YY"`

## Solution

```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise27InputCalculator
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                break;
            }
        }
        if (count != 0) {
            avg = (int) Math.round(((double) sum)/ ((double) count));
        } else {
            avg = sum;
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

```
Example Output
```
-1
5
7
bg
SUM = 11 AVG = 4
``

----
# CodingExercise28PaintJob

## Summary
* Bob wants to know how many buckets to buy at the store for a given wall
  * Calc this and return as int
* Now bob wants to not type 0 each time, overload to add a non-buckets-at-home value
* Now bob already knows the are and wants simply put that, overload so its area instead of width * height.

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise28PaintJob
        // 4 args
        System.out.println("getBucketCount(-3.4, 2.1, 1.5, 2) = " + getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(3.4, 2.1, 1.5, 2) = " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(2.75, 3.25, 2.5, 1) = " + getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("----");
        // 3 args
        System.out.println("getBucketCount(-3.4, 2.1, 1.5) = " + getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("getBucketCount(3.4, 2.1, 1.5) = " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("getBucketCount(7.25, 4.3, 2.35) = " + getBucketCount(7.25, 4.3, 2.35));
        System.out.println("----");
        // 2 args
        System.out.println("getBucketCount(3.4, 1.5) = " + getBucketCount(3.4, 1.5));
        System.out.println("getBucketCount(6.26, 2.2) = " + getBucketCount(6.26, 2.2));
        System.out.println("getBucketCount(3.26, 0.75) = " + getBucketCount(3.26, 0.75));
        System.out.println("----");
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        return (int) (Math.ceil((width * height) / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
```
output
```
getBucketCount(-3.4, 2.1, 1.5, 2) = -1
getBucketCount(3.4, 2.1, 1.5, 2) = 3
getBucketCount(2.75, 3.25, 2.5, 1) = 3
----
getBucketCount(-3.4, 2.1, 1.5) = -1
getBucketCount(3.4, 2.1, 1.5) = 5
getBucketCount(7.25, 4.3, 2.35) = 14
----
getBucketCount(3.4, 1.5) = 3
getBucketCount(6.26, 2.2) = 3
getBucketCount(3.26, 0.75) = 5
----
```

----
# Lec 62 Introduction

## Overview
* Switch statement
* For statement
* do-while statement


----
# Lec 63 Switch Statement

## Switch Statement
* You can use byte short char int for a switch statement

```java
package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 1");
//        } else {
//            System.out.println("Value was 1");
//        }

        // rewrite like this

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                // break; // Not required
        }

        // Mode code here
    }

}

```
Output
```
Value was 1
```

## Challenge
* Create a new switch statement using char instead of int
* create a new char variable
* create a switch statement testing for
* A,B,C,D,E
* display a message if any of these are found and then break
* Add a default which displays a message saying not found

#### Solution
```java
        char c = 'C';

        switch(c) {
            case 'A':
                System.out.println("c = A");
                break;
            case 'B':
                System.out.println("c = B");
                break;
            case 'C':
                System.out.println("c = C");
                break;
            case 'D':
                System.out.println("c = D");
                break;
            case 'E':
                System.out.println("c = E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
```
Output
```
c = C
```

## Strings in switch statements

```java
        String month = "January";
        switch(month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }
```

Problem: what if any letter is lowercase?

Soultion: Use `.toLowerCase()` to convert all to lowercase letters and test on that.

```java
        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }
```

Alternative is `.toUpperCase()`

```java
        String month = "January";
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }
```


----
# Lec 64 Day Of The Week Challenge

## Challenge
* Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
* Should not return any value, void
* Using a switch statement
  * print the day of the week Sunday, Monday, ... Sunday if the day is 0 to 6.
  * default should be "Invalid day"
* Bonus
  * Write a 2nd solution using if then else, instead of using switch
  * Create a new proj with name DayOfTheWeekChallenge

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        // For loop for testing
        for(int i = 0; i <= 6; i++){
            printDayOfTheWeek(i);
        }
        printDayOfTheWeek(7);
        // Spacer
        System.out.println("----");
        printDayOfTheWeekIfElse(-1);
        // For loop for testing
        for(int i = 0; i <= 6; i++){
            printDayOfTheWeekIfElse(i);
        }
        printDayOfTheWeek(7);
    }

    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeekIfElse(int day){
        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
```
Output
```
Invalid day
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Invalid day
----
Invalid day
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Invalid day

Process finished with exit code 0

```

----
# Lec 65 The For Statement

## The For loop
* Repitition

## Example of where its useful
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // The For Statement
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        // It gets tedious to type this out
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
```
* It gets tedious to type this out
* We can use a for loop

## Basic Model
```java
for (init; termination; increment) {
    // code stuff
}
```
* `init` - initialize variables
* `termination` - test at the begining of each loop, exit loop if false
* `increment` - modify variables, usually increment the initialized variables in the first part

## For loop example
```java
for (int i = 0; i < 6; i++) {
    System.out.println("Loop " + i + " hello!");
}
```

## Mini Challenge
* using the for statement, call the calculateInterest method
* the amount of 1000 with interest rates 2 through 8
* and print the results to the console window

```java
for (int i = 2; i < 9; i++) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
}
```
output
```
10,000 at 2% interest = 200.0
10,000 at 3% interest = 300.0
10,000 at 4% interest = 400.0
10,000 at 5% interest = 500.0
10,000 at 6% interest = 600.0
10,000 at 7% interest = 700.0000000000001
10,000 at 8% interest = 800.0
```
* The ` 700.0000000000001` is weird
* This can be fixed with `String.format(...)` function

```java
for (int i = 2; i < 9; i++) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
}
```
output
```
10,000 at 2% interest = 200.00
10,000 at 3% interest = 300.00
10,000 at 4% interest = 400.00
10,000 at 5% interest = 500.00
10,000 at 6% interest = 600.00
10,000 at 7% interest = 700.00
10,000 at 8% interest = 800.00
```

## Mini Challenge 2
* How would you modify the for loop above to do the same thing as shown above
* but start with 8 and work backwards to 2

```java
System.out.println("----");
for (int i = 8; i >= 2; i--) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
}
```
output
```
----
10,000 at 8% interest = 800.00
10,000 at 7% interest = 700.00
10,000 at 6% interest = 600.00
10,000 at 5% interest = 500.00
10,000 at 4% interest = 400.00
10,000 at 3% interest = 300.00
10,000 at 2% interest = 200.00
```

### quick `isPrime()` definition
```java
public static boolean isPrime(int n) {
    if (n == 1) {
        return false;
    }

    for(int i = 2; i <= n/2; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
```

## Mini Challenge 3
* Final Challenge
* Create a for statment with any range of number
* determine if the number is prime
* print an indicator of how many prime you have found
* exit loop if you have found 3 primes
* hint: use break to exit a loop

## My solution

```java
int numPrimes = 0;
for (int i = 5; i < 100; i++) {
    if (isPrime(i)){
        System.out.println("isPrime("+i+") = " + isPrime(i));
        numPrimes++;
    }
    if (numPrimes > 3) {
        break;
    }
}
```
output
```
isPrime(5) = true
isPrime(7) = true
isPrime(11) = true
isPrime(13) = true
```

## Instructor solution
```java
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a prime number");
                if (count == 3) {
                    break;
                }
            }
        }
```
output
```
Number 11 is a prime number
Number 13 is a prime number
Number 17 is a prime number
```

## Optimizing `isPrime`
* Replace `n/2` with `(long) Math.sqrt(n)` in the for loop
* Runs faster, less useless comparisons

```java
public static boolean isPrime(int n) {
    if (n == 1) {
        return false;
    }
    for(int i = 2; i <= (long) Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```



----
# Lec 66 For Loop Recap

## For Loop
* init - make variables, only visible in the scope of the for loop
* terminal condition - if false exit, may cause infinite loop or a skip-over if it is false to begin with
* increment - change variables between loops
* break - exit loop
* continue - go to next iteration, normal checks and increments apply
* semicolon dividers are required

## Example

```java
for (int number = 1; number < 7; number += 2) {
    System.out.println("number = " + number);
}
```
output
```
number = 1
number = 3
number = 5
```

## For loop gets skipped over
```java
for (int number = 1; number < 0; number += 2) {
    System.out.println("number = " + number);
}
```
`1 < 0` is false to begin with


## infinite for loop
* loops until overflow (max int)
```java
for (int number = 100; number > 0; number += 10) {
    System.out.println("number = " + number);
}
```
`number > 0` keeps return true, `number += 10` 

----
# Lec 67 Sum 3 And 5 Challenge

## Summary
* Create a for statement using a range of numbers from 1 to 1000 inclusive
* Sum all the numbers that can be divided with both 3 and also with 5
* For those numbers that met the above conditions, print out the number.
* break out of the loop once you find 5 number that met the above conditions.
* After breaking out the loop print the sum of the numbers that met the above conditions
* Note: Type all code in the main method

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // Sum 3 And 5 Challenge
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found Number = " + i);
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
```
output
```
Found Number = 15
Found Number = 30
Found Number = 45
Found Number = 60
Found Number = 75
Sum = 225
```


----
# Lec 68 The While And Do While Statement

## While Statement
* When you don't know how many times you're going to repeat a process

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // While And Do While
        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        // equivalent for loop
        for(int i = 1; i != 5; i++) {
            System.out.println("i value is " + i);
        }

        // you can can also use a break if a condition is met
        count = 1;
        while(true) {
            if (count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // Note: it is important that the count is increment,
        // else the loop exit condition is never met and the loop will continue indefinitely

        // Note: if the start condition is already met when
        // the while loop condition is tested it will never execute

        // Now for Do While loops

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6); // Note the semicolon here

        // do while is always execute at least once.
    }
}
```

## Challenge
* Create a method call isEvenNumber that takes an int and return a bool if it is even or not

### Solution

```java
public static boolean isEvenNumber(int number){
    return number % 2 == 0;
}
```

Now we use it in the java program

```java
int number = 4;
int finishNumber = 20;
while (number <= finishNumber) {
    number++;
    if(!isEvenNumber(number)) {
        continue; // go to next iteration of loop (condition is tested again)
    }
    System.out.println("Even number " + number);
}
```
output
```
Even number 6
Even number 8
Even number 10
Even number 12
Even number 14
Even number 16
Even number 18
Even number 20
```

## Challenge 2
* Modify the while code above
* Make it also record the total number of even numbers it has found
* and break once 5 are found
* and at the end, display the total number of even numbers found

### Solution

```java
int number = 4;
int finishNumber = 20;
int countEven = 0;
while (number <= finishNumber) {
    number++;
    if(!isEvenNumber(number)) {
        continue; // go to next iteration of loop (condition is tested again)
    }
    countEven++;
    System.out.println("Even number " + number);
    if (countEven >= 5) {
        System.out.println("Total number of even numbers found = " + countEven);
        break;
    }
}
```
output
```
Even number 6
Even number 8
Even number 10
Even number 12
Even number 14
Total number of even numbers found = 5
```
----
# Lec 69 While And Do While Recap

## While loop format
* Condition checked at the start
* Multiple statements can go inside
```java
while(condition) {
    // statements
}
```

## Do While loop format
* Executes at least once
* Condition checked at the end
* Multiple statements can go inside
```java
do {
    // statements
} while (condition); // semicolon required
```

## While vs For loops
* These do the same thing

```java
int i = 0
while(i <= 5) {
    System.out.println("i = " + i);
    i++;
}
```
vs
```java
for(int i = 0; i <= 5; i++) {
    System.out.println("i = " + i);
}
```

## `break` and `continue`
* `break` exits the loop
* `continue` goes to the next iteration of the loop
  * Goes to the end curly brace
  * All checks still happen

## Other
* Be careful of your conditions else you'll create an infinite loop or a loop that never executes

----
# Lec 70 Digit Sum Challenge

* Write a method with the name sumDigits that has one int parameter called number.
* If a param is >= 10 then the method should process the number and return sum of all digits
  * else return -1
* The numbers from 0-9 have 1 digit so we don't want to process them, also we dont want to process negative numbers so return -1 for negative numbers

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(-1) = " + sumDigits(-1));
        System.out.println("sumDigits(9) = " + sumDigits(9));
        System.out.println("sumDigits(8675309) = " + sumDigits(8675309));
        System.out.println("sumDigits(12) = " + sumDigits(12));
    }
    public static int sumDigits(int number) {
        if (number < 10) return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
```


----
# Lec71ParsingValuesFromAString

## String Parsing
* Later this will be useful with user input on the scanner class
* If the number is unable to parse it will throw a NumberFormatException

### Example
```java
public static void main(String[] args) {
    // write your code here
    String numberAsString = "2018";
    System.out.println("numberAsString = " + numberAsString);

    int number = Integer.parseInt(numberAsString);
    System.out.println("number = " + number);

    numberAsString += 1; // Concatenation
    number += 1; // Addition
    System.out.println("numberAsString = " + numberAsString);
    System.out.println("number = " + number);
}
```

This also works with double

```java
public static void main(String[] args) {
    // write your code here
    String numberAsString = "2018.125";
    System.out.println("numberAsString = " + numberAsString);

    double number = Double.parseDouble(numberAsString);
    System.out.println("number = " + number);

    numberAsString += 1; // Concatenation
    number += 1; // Addition
    System.out.println("numberAsString = " + numberAsString);
    System.out.println("number = " + number);
}
```




----
# Lec 72 Reading User Input

## Goal
* Create an application for reading user input
* Learn the scanner class

## Notes
* `new` is a keyword to create a new instance of an object. Such as the scanner class.
* 

## Basic Scanner usage
```java
// Define a new scanner obj
Scanner scanner = new Scanner(System.in);

// Print a message asking for the user to type their name
System.out.println("Enter your name: ");

// Save the next line they enter to var "name"
String name = scanner.nextLine();

// Print name, proving we grabbed
System.out.println("Your name is " + name);

// Close the scanner for safety
scanner.close();
```

## Adding in a year to figure age
* Combining NextInt with NextLine
* IMPORTANT NOTE: Recommended that you call next line after a nextInt, nextFloat, ...

```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Define a new scanner obj
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Recommended that you call next line after a nextInt, nextFloat, ...
        scanner.nextLine(); // output ignored

        // Basic find age of user
        int age = 2018 - yearOfBirth;

        // Print a message asking for the user to type their name
        System.out.println("Enter your name: ");

        // Save the next line they enter to var "name"
        String name = scanner.nextLine();

        // Print name, proving we grabbed
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        // Close the scanner for safety
        scanner.close();
    }
}
```

----
# Lec73ProblemsAndSolution

(Based on Lec 72)

## Problems
* What if user inputs a negative?
  * Age will be above the curr year
* What if a user sends name in first?
  * Mismatch exception

## Fixed Code
```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Define a new scanner obj
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter your year of birth: ");

        // Check for valid int input
        boolean hasNextInt = scanner.hasNextInt(); // tells us if it has an int, without removing from the scanner

        // If the input is ok (has int) proceed
        if (hasNextInt) {
            // Capture year of birth
            int yearOfBirth = scanner.nextInt();

            // Recommended that you call next line after a nextInt, nextFloat, ...
            scanner.nextLine(); // output ignored

            // Basic find age of user
            int age = 2018 - yearOfBirth;

            // Print a message asking for the user to type their name
            System.out.println("Enter your name: ");

            // Save the next line they enter to var "name"
            String name = scanner.nextLine();

            // Print name, proving we grabbed
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        }
        // Close the scanner for safety
        scanner.close();
    }
}
```

----
# Lec 74 ReadingUserInputChallenge

## Summary
* Read 10 numbers from the console by the suer and print the sum
* Create Scanner
* Use has next int for checking
  * If false, loop until you get a valid input
* Before input, print Enter number #x each time:
  * x represents a count
  * 

## My Solution
```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.print("Enter number #" + (count+1) + ": ");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }

        System.out.print("Sum = " + sum);

        scanner.close();
    }
}
```

----
# Lec75MinAndMaxChallenge

## Summary
* read numbers from user and print the minimum and maximum they entered
* Before the user enters a number print "Enter number:"
* If the number is invalid, break out of the loop and print the min and max

## My Solution
```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // MinAndMaxChallenge

        // Spawn a new scanner obj
        Scanner scanner = new Scanner(System.in);

        // minimum number found, set to max
        int min = Integer.MAX_VALUE;

        // maximum number found, set to min
        int max = Integer.MIN_VALUE;

        // num found from user, read-ability
        int num = 0;

        // Infinite loop, exit condition internal
        while (true){
            // Ask user for input
            System.out.print("Enter number:");

            // If the input can be parsed as int
            if (scanner.hasNextInt()) {
                // parse the input to int, store in num
                num = scanner.nextInt();

                // flush scanner
                scanner.nextLine();

                // if the num is more than the max, max becomes num
                if (num > max) {
                    max = num;
                }

                // if the num is less than the min, min becomes num
                if (num < min) {
                    min = num;
                }
            } else {
                // Number is not parse-able as int
                System.out.print("Invalid Number");
                // exit the loop now
                break;
            }
        }

        // print max
        System.out.println("Max = " + max);
        // print min
        System.out.println("Min = " + min);

        // safely close scanner
        scanner.close();
    }
}
```

----
# CodingExercise29SumCalculator

## Summary 
* Create class SimpleCalculator
* It has fields firstNumber and secondNumber
* Normal getters and setters
* getAdditionResult - return the addition of firstNumber and secondNumber
* getSubtractionResult - return the subtraction of firstNumber and secondNumber
* getMultiplicationResult - return the multiplication of firstNumber and secondNumber
* getDivisionResult - return the division of firstNumber and secondNumber

## Solution
```java
package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber == 0) ? 0.0 : (firstNumber / secondNumber);
    }
}
```
----
# Coding Exercise 30 Person

## Summary
* Create a Person class
* Fields: firstName, lastName, age
* Normal setters and getters
* Method isTeen returns if the person is > 12 and < 20 (a teenager)
* Method getFullName returns the first + last name of the person
  * if first name is empty return last name
  * if last name is empty return first name
  * if both are empty return the empty string
  * return `firstName + " " + lastName`

## Solution
```java
package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (this.firstName.isEmpty()) return lastName;
        if (this.lastName.isEmpty()) return firstName;
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        return this.firstName + " " + this.lastName;
    }

}
```
----
# CodingExercise31WallArea

## Summary
* Class: Wall
* Fields: width and height; both double
* Normal Getters and Setters for both fields
* Method getArea - return area of the wall

## Solution
Wall.java
```java
package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
```

----
# Coding Exercise 32 Point

## Summary
* Class: Point
* Fields: x,y both int
* Method: distance
  * Overload 1: empty args - get distance from origin
  * Overload 2: x and y ints - get distance from the object to the x,y passed in
  * Overload 3: Point - get distance from object to the point.

## Solution
Main.java
```java
package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(int x2, int y2) {
        return Math.sqrt(Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2));
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow((this.x - p2.getX()), 2) + Math.pow((this.y - p2.getY()), 2));
    }
}
```

----
# Coding Exercise 33 Carpet Cost Calculator

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Coding Exercise 33 Carpet Cost Calculator
    }
}
```
Floor.java
```java
package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
```
Carpet.java
```java
package com.company;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
```
Calculator.java
```java
package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
```

----
# Coding Exercise 34 Complex Operations

## Summary
* Class: ComplexNumber
* Fields: real, imaginary
* Method: add
  * Overload 1: real, imaginary - add the passed in real and imaginery to the object's real and imaginary values
  * Overload 2: ComplexNumber - add the passed in ComplexNumber real and imaginary components to the object's real and imaginary values
* Method: subtract
  * Overload 1: real, imaginary - subtract the passed in real and imaginery to the object's real and imaginary values
  * Overload 2: ComplexNumber - subtract the passed in ComplexNumber real and imaginary components to the object's real and imaginary values

## Solution
ComplexNumber.java
```java
package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

}
```

----
# Coding Exercise 35 Cylinder

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Coding Exercise 35 Cylinder
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cyclinder = new Cylinder(5.55, 7.25);
        System.out.println("cyclinder.radius = " + cyclinder.getRadius());
        System.out.println("cyclinder.height = " + cyclinder.getHeight());
        System.out.println("cyclinder.area = " + cyclinder.getArea());
        System.out.println("cyclinder.volume = " + cyclinder.getVolume());

    }
}
```
Circle.java
```java
package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
```
Cylinder.java
```java
package com.company;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
```

----
# Coding Exercise 36 Pool Area

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        System.out.println("----");
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getWidth());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());

    }
}
```
Rectangle.java
```java
package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
```
Cuboid.java
```java
package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.height * getArea();
    }
}
```
output
```
rectangle.width = 5.0
rectangle.length = 10.0
rectangle.area = 50.0
----
cuboid.width = 5.0
cuboid.length = 10.0
cuboid.area = 5.0
cuboid.height = 5.0
cuboid.volume = 250.0
```

----
# Introduction 

##  Classes Contructors and Inheritance
* Classes
* Objects
* Contructors
* Inheritance


----
# Lec 77 Classes Part 1

## Objects
* State
  * Wet, Dry
  * Alive, Dead
  * Number of legs
* Behavior
  * Actions
  * Make noise
  * Produce some output
  * Drink Water
* Objects have feilds for states
* Objects have methods for behaviors
* Allowes creation of customer data types

## Creation
* in the project left side column, right click, create new class
* Create "Car"
* A new file comes in "Car.java"
* Should be next to main in the proj directory

## Access Modifiers
* `public` - All classes can access
* `private` - No other classes can access
* `protected` - package access.
* For now, go with public and know that other classes have access without restriction

## Class Feilds
* Fields, member variables - save variables for each object
* Access modifiers are here as well - generally private

## Basic Car class
```java
package com.company;

public class Car {

    // Fields
    private int doors; // notices the access modifier
    private int wheels;
    private String model;
    private String engine;
    private String colour;

}
```
* To make a car object use `Car car = new Car();`
* Remember we cannot access this member vars (fields) 

----
# Lec 78 Classes Part 2

## Getters & Setters
* All the access or modification of class fields

### Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Classes Part 1
        Car porsche = new Car();
        Car holden = new Car();
        // System.out.println("Model = " + porsche.getModel()); // null is the default state
        // porsche.model = "Carrera"; // Not great idea. Violates encapsulation
        porsche.setModel("911");
        System.out.println("Model = " + porsche.getModel());
    }
}
```
### Car.java
```java
package com.company;

public class Car {

    // Fields
    private int doors; // notices the access modifier
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        // The model parameter model and the field are different
        // this.model = model;
        // this.model reference the object string (the field of the calling object)
        // model references the passed in string
    }

    public String getModel() {
        return this.model;
    }
}
```
output
```
Model = Unknown
```
* output is unknown because it is not a carrera or commodore as seen in the setModel
* Note the `.equals()` on the string

----
# Lec 79 Contructors Part 1

## Start with a Challenge
* Create new class BankAccount
* Fields: account number, balance, customer name, email, phone number.
* Normal getters and setters
* Method deposit funds
  * increment balance
* Method withdraw funds
  * deduct balance
  * do not allow if insufficient funds

## Java
Main.java

```java
package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance + ".");
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only $" + this.balance + " available. Withdraw not processed.");
            return;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of $" + withdrawAmount + " made. New balance is $" + this.balance + ".");
    }
}
```
BankAccount.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhoneNumber("+1 (123) 567 - 7890");
        // CONSTRUCTORS CAN MAKE THIS EASIER

        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100.00); // Should succeed
    }
}

```

## Constructors
Main
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("+1 (123) 567 - 7890");
        // CONSTRUCTORS CAN MAKE THIS EASIER

        BankAccount bobsAccount = new BankAccount(
                "12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "+1 (123) 567 - 7890"
        );
        System.out.println("bobsAccount.getAccountNumber() = " + bobsAccount.getAccountNumber());
        System.out.println("bobsAccount.getBalance() = " + bobsAccount.getBalance());

        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100.00); // Should succeed
    }
}
```
BankAccount.java
```java
package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // Special Use case of "this" keyword.
        // You can call another constructor
        // Required to be the first line of a constructor
        this("56789", 2.50, "Default name", "Default address", "default phone");
        // Now the default constructor is calling the full constructor
        System.out.println("This is a constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance + ".");
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only $" + this.balance + " available. Withdraw not processed.");
            return;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of $" + withdrawAmount + " made. New balance is $" + this.balance + ".");
    }
}
```
----
# Lec 80 Constructors Part 2

* You can use setters in the constructor to take advantage of validation, avoid repitition
  * Its NOT common to do this 
* The `this()` fucntion can also be used to omit values in a constructor

## Challenge
* Create a new class VipCustomer
* It should have 3 fields name, credit limit, and email address
* create 3 constructors
  * cons. 1 - empty, call the csontructor with 3 parameters with default values
  * cons. 2 - pass on the 2 values it receives and add a default value for the 3rd
  * cons. 3 - should save all feilds
* Create only getters

## Solution
```java
package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 1000.00, "Default email address");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email address");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
```

Test code in Main.java
```java
VipCustomer person1 = new VipCustomer();
System.out.println(person1.getName());

VipCustomer person2 = new VipCustomer("Bob", 25000.00);
System.out.println(person2.getName());

VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email123.com");
System.out.println(person3.getName());
System.out.println(person3.getEmailAddress());
```

## Next Video
Inheritance

----
# Lec 81 Inheritance Part 1

## Inheritance
* Use methods from parent class
* Improve code-reuse
* Better modularity

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance
        Animal animal = new Animal(
                "Animal",
                1,
                1,
                5,
                5
        );
        Dog dog = new Dog(
                "Yorkie",
                8,
                20,
                2,
                4,
                1,
                20,
                "long silky"
        );

        // This is when inheritance makes sense

        dog.eat(); // this function was defined on the parent class
        // We overrode this method in dog, else it would default to the animal class
    }
}
```
Animal.java
```java
package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called."); // prove this function was called and executed.
    }

    public void move() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
```
Dog.java
```java
package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // Note the super function
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override // We are overriding a parent class method
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // chew food
        super.eat(); // call parent
    }
}
```

----
# Lec 81 Inheritance Part 1

## Inheritance
* Use methods from parent class
* Improve code-reuse
* Better modularity

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance
        Animal animal = new Animal(
                "Animal",
                1,
                1,
                5,
                5
        );
        Dog dog = new Dog(
                "Yorkie",
                8,
                20,
                2,
                4,
                1,
                20,
                "long silky"
        );

        // This is when inheritance makes sense

        dog.eat(); // this function was defined on the parent class
        System.out.println("----");
        dog.walk();
//        dog.run();

        System.out.println("----");
        Fish fish = new Fish(
                "Mr. Fish",
                2,
                2,
                6,
                2,
                5
        );
        fish.move(7);
    }
}
```
Animal.java
```java
package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called."); // prove this function was called and executed.
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
```
Dog.java
```java
package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // Note the super function
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override // We are overriding a parent class method
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // chew food
        super.eat(); // call parent
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
        // super.move(5); also works but if we ever decide to change this class
        // to override move then we have to change this code
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs() {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }
}
```
Fish.java
```java
package com.company;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
```
----
# Lec 83 Reference Vs Object Vs Instance Vs Class

## Words
* `Reference`
* `Object`
* `Instance`
* `Class`

## Analogy
* A class = A house
* A **`class`** is a blueprint is for a house
* Each house you build is an **`instance`**
* Each house you build has an address, that is a **`reference`**
* You can copy the reference as many times as you want, but its still just one house
* We can pass references to methods or constructors

## Class Creation
* Blueprint for Animal
```java
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    ...
}
```

## Object
* Advanced custom data type
* below the `animal` object is made
```java
Animal animal = new Animal("Animal", 1, 1, 5, 5);
```

## Instance creation
* new keyword is used
* A new `object` is made in memory
```java
Animal animal = new Animal(
        "Animal",
        1,
        1,
        5,
        5
);
```

## Reference manipulation
* Assigning an object to an object
* `animal2` has the same ref of animal
* Any manip on `animal2` will apply to animal, b/c they are the same in memory
```java
Animal animal2 = animal;
```

----
# Lec 84 This Vs Super

## Super
* Used to access/call the parent class members (variables and methods).
* Commonly used with method overriding
  * Calling the parent class
* Can also be used on the constructor to set up parent feilds
* Calls parent constructor

## This
* Used to call current class members
* Required when we have a field = parameter in name
* Commonly used in constructors and setters of a class
  * can be avoided using different names in the paramaters or feilds
* Can be used in a constructor in order to access a different constructor with a different number of args usually

Note: We can use both except in static areas. Attempts to do so lead to compile-time errors.

## Abstract class
* More on them later
* Even they can constructors
* Cannot instantiate
* This is still a super calls, so its constructors run when someone makes an instance of a concrete class.

Note: A constructor can call this() or super() but never both.

## `this()` example
* Known as constructor chaining
* 3rd constructor does all the work
* Removes copy/paste (duplicate) code
* Adds to modularity
```java
class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle() {
        this(0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int width, int height) {
        this(0, 0, width, height); // calls 3rd constructor
    }

    // 3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
```

## `super()` example
* 2nd constructor calls the parent class constructor
* Here we have both `super()` and `this()`

```java
class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
```

----
# Lec 85 Method Overloading Vs Overriding Recap

## Overloading
* Same name different functionality
* Different number/type of args
* Improves readablility
* Minimizes diplicate code
* Don't have to remember many method names
  * Speed up dev time
* NOTHING to do with polymorphism
  * Sometimes referred to as "Compile Time Polymorphism"
* We can overload static and instance methods
  * More on that later
* Happens in a single class usually
  * "usually" b/c a subclass can inherit a class then overload it

## Overloading Rules
* Same name
* Different parameters
* Optional: different return types
* Optional: different access modifiers (`public`, `private`, `protected`)
* Optional: throw diff exceptions
  * More on that later

## Overriding
* Define a method in a parent class
* Same name and same arguments (same signature)
* By extending the parent class the child class gets all the methods defined in the parent class
* AKA Runtime polymorphism
* AKA Dynamic Method Dispatch
* Recommended to put `@Override` above the overrided function
  * Compiler will throw error if we don't override
  * Checks to see if a code change broke the app
* Can't override static methods, only instance methods

## Overriding rules
* Same name
* Same args
* return type can be a subclass of the return type in the parent class
* Can't have a lower access modifier
  * Can't be more private, but can be less public
* Only inherited methods can be overridden
* Constructors and private methods cannot be overridden
* Methods that are `final` cannot be overridden
* A child can use `super.methodName()` to call the parent class verison of the overridden method

## Overloading example
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }

    // Same name, 1 arg instead of 0.
    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}
```

## Overriding example
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

class GermanShepard extends Dog {

    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
```

## Recap
| | Method Overloading      | Method Overriding |
| ----------- | ----------- | ----------- |
| Description | Provide functionality to reuse a method name with diff parameters | Override a behavior inherited from a parent class |
| Cross-class? | Usually in a single class, but can be used in a child class (optional) | **Always in two classes.** Child is-a parent |
| Signature | **Must have** different parameters | **Must have** same parameters and same name |
| Return type | Must have different return type | **Must have** same return type or covariant type (child class) |
| Access Level | May be different | **Must not** be lower modifier. Cannot be more private than the parent |
| Exceptions | May throw different exceptions | **Must NOT** throw a new or broader checked exception |

## Covarient Type
* HealthyBurger is a covarient type of Burger
* So I can return a HealthyBurger from the overriden `createBurger()` method b/c it is a child
```java
class Burger {
    // feilds, methods ...
}

class HealthyBurger extends Burger {
    // feilds, methods ...
}

class BurgerFactory {

    public Burger createBurger() {
        return new Burger();
    }
}
class HealthyBurgerFactory extends BurgerFactory {

    @Override
    public HealthyBurger createBurger() {
        return new HealthyBurger();
    }
}
```

----
# Lec 86 Static Vs Instance Methods

## Static Methods
* Declared using `static` modifier
* Can't access instance methods and instance variables from a class
* Used for operations that don't require any data from an instance of a class
* The this keyword is the current instance of a class
* We cannot use the `this` keyword'
* When not using instance variables that method should be static
  * Example `main`

## Example
* printSum accepts parameters and passes back result, never accessing class fields
```java
class Calculator {
    public static void printSum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator.printSum(5, 10); // ClassName.methodName()
        printHello(); // access in the same class
    }
    public static void printHello() {
        System.out.println("Hello");
    }
}
```

## Instance Methods
* Have to make an instance before using
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog(); // create instance
        rex.bark(); // call instance method
    }
}
```

----
# Lec 87 Static Vs Instance Variables

## Static Variables
* Defined using keyword `static`
* AKA static member variables
* Each instances of the class shares the same static variable.
* If changes are made, all classes will be affected.
* Not used very often
* We can declare Scanner as a static variable so all classes can access it directly.

## Static Variables Example
* This a bad place for a static var, but can show
```java
class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy
    }
}
```
output
```
name= fluffy
name= fluffy
```
* Notice the 2nd creation made the 1st named fluffy as well? changes to static methods are felt across all instances


## Instance Variables
* Don't use `static`
* Belong to each object
  * Has its own blueprinted verison of the member variable
  * Changes to 1 will not affect others
* AKA fields, member variables

## Instance Variables Example
```java

class Dog {
    private String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName(); // prints rex
        fluffy.printName(); // prints fluffy
    }
}
```
output
```
name= rex
name= fluffy
```
----
# Lec 88 Inheritance Challenge Part 1

## Notes
* All classes extend `Object`

## Challenge
* Start with the base class of a Vehicle, then create a Car class that inherits from this base class
* Finally, create another class, a specific type of Car that inherits from the Car class.
* You should be able to hand steering, changing gears, and moving (speed in other words)
* Chaning gears, increasing speed should be included
* For your specific car you should add something different

----
# Lec89InheritanceChallengePart2

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance Challenge
        Outlander outlander = new Outlander(0,0,1,36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
```

Vehicle.java
```java
package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle() {
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + this.currentVelocity + " at " + this.currentDirection + " degrees.");
    }

    public void stop() {
        this.currentVelocity = 0; // stop
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
```
Car.java
```java
package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int steering;
    private int gears;
    private int speed;
    private int currentGear;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        System.out.println("Setting current gear to: " + currentGear);
        this.currentGear = currentGear;
    }

    public Car() {
        super("Default name","Default size");
    }

    public Car(int steering, int gear, int speed) {
        super("Default name","Default size");
        this.steering = steering;
        this.gears = gear;
        this.speed = speed;
    }

    public Car(String name, String size, int steering, int gear, int speed) {
        super(name, size);
        this.steering = steering;
        this.gears = gear;
        this.speed = speed;
    }

    public Car(String name, String size, int wheels, int doors, int steering, int gears, int speed, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
        this.currentGear = currentGear;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGear() {
        return gears;
    }

    public void changeGears(int gear) {
        setCurrentGear(gear);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Moving at " + speed + " at " + direction + " degrees.");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
```
Outlander.java
```java
package com.company;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int steering, int speed, int currentGear, int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, steering, 6, speed, currentGear);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGears(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGears(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGears(3);
        } else {
            changeGears(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
```
----
