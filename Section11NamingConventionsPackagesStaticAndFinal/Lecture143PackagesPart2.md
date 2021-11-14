# Lecture 143 Packages Part 2

## Star
* "java.awt.*"
* The star means import all variables, static objects, etc.
* "java.awt.\*" and "java.awt.event.\*" are different packages
  * Imports are not recursive (I think)
  * (Markdown applied so slashes removed on real thing)

## External Libraries
* Open the folder near the bottom
* You can see the fanning out of all the packages

## Make our own packages
* New Project
* Make a new class in the SRC folder
* delete the package
  * Notice how this only takes one level away
  * "com.example.mypackage" -> "com.example"
* Make a new package on the src folder named: "com.example.mypackage"
  
## Packages are often mirrored in the file directory structure
* Look in windows explorer 
* "Project" -> src -> com -> example -> myexample
* Careful with where you create classes when using fully qualified class names

## Build a Jar file
* File -> Project Structure -> Artifacts
* Hit the plus sign at the top of the 2nd column
* In the dropdown, select Jar
* Then to the right click "From modules with dependencies..."
* All options in the pop were left alone, no main class as this is more of a library
* The file will be placed in the out folder in the project explorer
  * Then artifacts\<name>_jar\<name>
  * Example: C:\Users\...JavaMasterclass\Section11NamingConventionsPackagesStaticAndFinal\PackageDemo\out\artifacts\PackageDemo_jar\PackageDemo.jar

## Import a Jar
* File -> Project Structure -> Libraries
* Hit the plus sign at the top of the 2nd column
* In the dropdown, select Java
* Pop up comes up, select the *.jar created elsewhere in the computer

## Use the code
* Paste in the other main function
* Or code it manually

```java
package com.example.gametest;

import com.example.game.Dragons;
import com.example.game.ISaveable;
import com.example.game.Monsters;
import com.example.game.Players;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        System.out.println("Players:");
        ArrayList<String> stringArrayList = readValues();
        ISaveable saveablePlayers = new Players();
        saveablePlayers.populate(stringArrayList);
        saveablePlayers.save();

...

```
