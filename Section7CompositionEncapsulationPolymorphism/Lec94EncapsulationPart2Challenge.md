# Lec 94 Encapsulation Part 2 Challenge

## Challenge
* Create a class and demonstrate proper encapsulation techniques
* the class will be called Printer
* simulate a real Computer Printer
* fields
  * toner level
  * number of pages printed
  * is it a duplex printer (both sides)
* methods
  * fill up toner
  * print page (inc page printed)
* Decide scope, constructors, anything else

Printer.java
```java
package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int tonerAmount) {
        System.out.println("Filling up toner");
//        tonerLevel = 100;
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPage(boolean isDoubleSided, int numPages) {
        System.out.println("Printing page");
        if (!isDoubleSided) {
            if (this.tonerLevel - 2 >= 0) {
                this.pagesPrinted += numPages;
                this.tonerLevel -= 2*numPages;
            } else {
                System.out.println("Not enough toner (" + this.tonerLevel + ") to print. Print failed.");
                return -1;
            }
        } else {
            if (this.tonerLevel - 4 >= 0) {
                this.pagesPrinted += numPages;
                this.tonerLevel -= 4*numPages;
            } else {
                System.out.println("Not enough toner (" + this.tonerLevel + ") to print. Print failed.");
                return -1;
            }
        }
        return numPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
```
Main.java

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Printer printer = new Printer(true);

        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(true, 4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
```