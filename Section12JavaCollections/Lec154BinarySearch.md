# Lec 154 Binary Search

* Swap the ArrayList to LinkedList
* Make it a type collection
  * Enables any collection class
  * This is an interface
  * https://www.javatpoint.com/collections-in-java

```java
private Collection<Seat> seats = new LinkedList<>();
```
* When declared as collection we can implement any class
  * Set, HashSet, etc.$
* Change to HashSet, notice the change in order but it still works
* TreeSet does not work, throws class cast exception.
* LinkedHashSet does work

* This algorithm is brute force searching'
* Lets implement a better strategy
* The DOT will show us how long the algorithm takes

### Theatre.java
```java
package com.lesson;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

//    public boolean reserveSeat(String seatNumber) {
//        Seat requestedSeat = new Seat(seatNumber); // for new binary search
//        int foundSeat = Collections.binarySearch(this.seats, requestedSeat, null); // null for default comparable
//
//        if (foundSeat >= 0) {
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//    }

    // fully visible reserveSeat method using Binary search. Professor copy-pasted this in
    public boolean reserveSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareToIgnoreCase(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber()); // Now we can use a different type of
            // search
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}

```

### Main.java

```java
package com.lesson;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Theatre theatre = new Theatre("Olympian", 8, 12);
        //        theatre.getSeats();

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
```

### Output

```
......Seat H11 reserved
Please pay
......Sorry, seat is taken
......There is no seat B13
Sorry, seat is taken
.Seat D12 reserved
Please pay
```
