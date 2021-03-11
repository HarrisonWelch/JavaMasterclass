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






