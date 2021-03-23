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
