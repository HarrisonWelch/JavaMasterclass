
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
