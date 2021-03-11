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
