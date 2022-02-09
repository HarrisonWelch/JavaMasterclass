# Lec 157 Maps
* Each key can only map to a single value
* Maps are generic
* We need to dig down more than price 
* Using put on the same key will overwrite the prev value
```java
Map<String, String> languages = new HashMap<>();
languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
languages.put("Python", "An interpreted, object-oriented, high-level programming language");
languages.put("Algol", "An algorithmic language");
languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
languages.put("Lisp", "Therein lies the madness");

System.out.println(languages.get("Java"));
languages.put("Java", "this course is about Java");
System.out.println(languages.get("Java"));
```
* put returns the previous value

```java
Map<String, String> languages = new HashMap<>();
languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
languages.put("Python", "An interpreted, object-oriented, high-level programming language");
languages.put("Algol", "An algorithmic language");
System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
System.out.println(languages.put("Lisp", "Therein lies the madness"));

System.out.println(languages.put("Java", "this course is about Java"));
System.out.println(languages.get("Java"));
```
```
null
null
A compiled, high level, object-oriented, platform indepenedent language...
this course is about Java
```
* contains key will return a boolean if the key is in the target map
* `.containsKey(<key>)`

Lesson done, current code:
```java


