package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        DecimalFormat df = new DecimalFormat("#######.###");
        df.setRoundingMode(RoundingMode.DOWN);
        return (df.format(num1)).equals(df.format(num2));
    }
}
