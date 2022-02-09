# Lecture 158 Map Continued And Adventure Game
* Remove can remove a key-value pair by the key
* Remove can remove a key-value pair by the key and the value being an exact match
* Replace can remove replace a k-v pair if the key exists
  * It will return the value of the old pair or null if it never was there


Replace with 3 values
```java
languages.replace("Lisp", "This will not work",
                "a function programming language with imperative features")
```
* Returns true if the 2nd arg old value is the same as the current value for the key (1st value), then it makes the value for the key equal to the 3rd arg.

Switching to adventure game, current code:

```java
Map<String, String> languages = new HashMap<>();
if(languages.containsKey("Java")) {
    System.out.println("Java is already in the map");
} else {
    languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
    System.out.println("Java added successfully");
}
languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
//        languages.put("C++", "C++");
languages.put("Python", "An interpreted, object-oriented, high-level programming language");
languages.put("Algol", "An algorithmic language");
System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
System.out.println(languages.put("Lisp", "Therein lies the madness"));

if(languages.containsKey("Java")) {
    System.out.println("Java is already in the map");
}

System.out.println(languages.put("Java", "this course is about Java"));
System.out.println(languages.get("Java"));

System.out.println("============================================================");

//        languages.remove("Lisp");
if(languages.remove("Algol", "a family of algorithmic languages")) {
    System.out.println("Algol removed");
} else {
    System.out.println("Algol not removed");
}

if(languages.replace("Lisp", "This will not work",
        "a function programming language with imperative features")) {
    System.out.println("Lisp replaced");
} else {
    System.out.println("This was not replaced");
}
//        System.out.println(languages.replace("Scala", "this will not be added"));

for(String key : languages.keySet()) {
    System.out.println(key + " : " + languages.get(key));
}
```

Location.java

```java
package com.lesson;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int locationID) {
        exits.put(direction, locationID);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits); // Deep copy
    }
}

```

Main.java
```java
package com.lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Location> locations = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small ..."));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
                loc = 1;
            }
        }
    }
}
```

output
```
You are standing at the end of a road before a small bridge
2
You are at the top of a hill
3
You are inside a building, a well house for a small ...
4
You are in a valley beside a stream
5
You are in the forest
6
You cannot go in that direction
You are standing at the end of a road before a small bridge
7
You cannot go in that direction
You are standing at the end of a road before a small bridge
0
You are sitting in front of a computer learning Java

Process finished with exit code 0
```
