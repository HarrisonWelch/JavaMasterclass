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

