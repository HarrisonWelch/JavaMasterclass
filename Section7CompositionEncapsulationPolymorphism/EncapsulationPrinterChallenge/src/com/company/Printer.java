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
