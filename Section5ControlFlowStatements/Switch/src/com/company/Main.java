package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 1");
//        } else {
//            System.out.println("Value was 1");
//        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
//                break; // Not required
        }

        // Mode code here

        char c = 'C';

        switch(c) {
            case 'A':
                System.out.println("c = A");
                break;
            case 'B':
                System.out.println("c = B");
                break;
            case 'C':
                System.out.println("c = C");
                break;
            case 'D':
                System.out.println("c = D");
                break;
            case 'E':
                System.out.println("c = E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "January";
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }

    }

}
