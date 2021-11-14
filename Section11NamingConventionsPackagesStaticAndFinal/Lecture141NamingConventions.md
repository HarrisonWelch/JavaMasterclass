# Lecture 141 Naming Conventions

## Naming Convetions

* Adoptings the accepted convetions for naming variables, methods, and objects in Java makes your code easier for others to read.
* "Others" here could be you in the future or another dev.

### Packages

The things you get to name:
* Packages
* Classes
* Interfaces
* Methods
* Constants
* Variables
* Type Parameters

### Package Format

* Always lower case.
* Package names should be unique.
* Use your internet domain name, reversed, as a prefix for the package name.
* https://docs.oracle.com/cd/E18727_01/doc.121/e12897/T302934T458266.htm

### Invalid Domain Name components
* Replace invalid characters (i.e. -) domain names with an underscore
* Domain name components starting with a number should instead start with an underscore_
* Domain name components that are Java keywords should have that component start with an underscore

### Invalid Domain Name components examples
* Switch.supplier.com -> come.supplier._switch
  * switch is a keyword
* 1world.com -> com._1world
* Experts-exchange.com -> com.experts_exchange

### Java package name
* java.lang
* java.io
* org.xml.sax.helpers
* com.timbuchalka.autoboxing

## Class names
* CamelCase
* Class names should be nouns (they represent things)
* Should start with a capital letter
* Each word in the name should also start with a capital (e.g. LinkedList)

### Class name examples
* ArrayList
* LinkedList
* String
* TopSong
* GearBox
* Main

### Interface names
* Capitalized like classes
* Consider what object implementing the interface will become. What they will be able to do?
  * List
  * Comparable
  * Serializable

## Method Names
* mixedCase
* Often verbs
* Reflect the function performed or the result returned.
  * size()
  * getName()
  * addPlayer()

## Constants
* ALL UPPER CASE
* Separate words with underscore _.
* Declared using the final keyword
* Examples
  * Static final int MAX_INT
  * Static final short SEVERITY_ERROR
  * Static final double PI = 3.141592653

## Variable Names
* mixedCase
* Meaningful and indicative
* Start with lower case letter.
* Do not use underscores _.
  * Examples
    * i
    * league
    * sydneySwans
    * boxLength

## Type Parameters
* Single Character, Capital Letters
* Guidelines given at https://docs.oracle.com/javase/tutorial/java/generics/index.html

### Type Parameters
* E - Element (Used extensively by Java Collections framework)
* K - Key
* V - Value
* S, U, V, etc. - 2nd, 3rd, 4th types
