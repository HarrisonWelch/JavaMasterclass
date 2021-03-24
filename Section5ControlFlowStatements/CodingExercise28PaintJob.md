# CodingExercise28PaintJob

## Summary
* Bob wants to know how many buckets to buy at the store for a given wall
  * Calc this and return as int
* Now bob wants to not type 0 each time, overload to add a non-buckets-at-home value
* Now bob already knows the are and wants simply put that, overload so its area instead of width * height.

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise28PaintJob
        // 4 args
        System.out.println("getBucketCount(-3.4, 2.1, 1.5, 2) = " + getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(3.4, 2.1, 1.5, 2) = " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("getBucketCount(2.75, 3.25, 2.5, 1) = " + getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("----");
        // 3 args
        System.out.println("getBucketCount(-3.4, 2.1, 1.5) = " + getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("getBucketCount(3.4, 2.1, 1.5) = " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("getBucketCount(7.25, 4.3, 2.35) = " + getBucketCount(7.25, 4.3, 2.35));
        System.out.println("----");
        // 2 args
        System.out.println("getBucketCount(3.4, 1.5) = " + getBucketCount(3.4, 1.5));
        System.out.println("getBucketCount(6.26, 2.2) = " + getBucketCount(6.26, 2.2));
        System.out.println("getBucketCount(3.26, 0.75) = " + getBucketCount(3.26, 0.75));
        System.out.println("----");
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        return (int) (Math.ceil((width * height) / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
```
output
```
getBucketCount(-3.4, 2.1, 1.5, 2) = -1
getBucketCount(3.4, 2.1, 1.5, 2) = 3
getBucketCount(2.75, 3.25, 2.5, 1) = 3
----
getBucketCount(-3.4, 2.1, 1.5) = -1
getBucketCount(3.4, 2.1, 1.5) = 5
getBucketCount(7.25, 4.3, 2.35) = 14
----
getBucketCount(3.4, 1.5) = 3
getBucketCount(6.26, 2.2) = 3
getBucketCount(3.26, 0.75) = 5
----
```
