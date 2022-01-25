# Lec 156 Comparable And Comparator
---

* Its worth comparing the Comparator and Comparable interface
* In the prev video we experimented with the Comparable with the seats

Theatre.java

```java
package com.lesson;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
//            return Double.valueOf(seat1.getPrice()).compareTo(Double.valueOf(seat2.getPrice()));
//            return Double.compare(seat1.getPrice(), seat2.getPrice());
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            }
            return 0;
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if (row < 'D' && (seatNum >=4 && seatNum<=9)) {
                    price = 14.00;
                } else if ( (row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public Collection<Seat> getSeats() {
        return this.seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = new Seat(seatNumber, 0);

        // Binary search is more efficient
        int  foundSeat = Collections.binarySearch(seats, requestSeat, null);

        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    // Meant to be an example of how Collections.binarySearch works
    public boolean reserveSeatSourceCode(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.println(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

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
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
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

        public double getPrice() {
            return price;
        }
    }
}
```

Main.java
```java
package com.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("================================================================================");
    }
}
```
output
```
Seat D12 reserved
Please pay for D12
Seat already reserved
There is no seat B13
Seat already reserved
 H12 $7.0 H11 $7.0 H10 $7.0 H09 $7.0 H08 $7.0 H07 $7.0 H06 $7.0 H05 $7.0 H04 $7.0 H03 $7.0 H02 $7.0 H01 $7.0 G12 $7.0 G11 $7.0 G10 $7.0 G09 $7.0 G08 $7.0 G07 $7.0 G06 $7.0 G05 $7.0 G04 $7.0 G03 $7.0 G02 $7.0 G01 $7.0 F12 $7.0 F11 $7.0 F10 $7.0 F09 $12.0 F08 $12.0 F07 $12.0 F06 $12.0 F05 $12.0 F04 $12.0 F03 $7.0 F02 $7.0 F01 $7.0 E12 $7.0 E11 $7.0 E10 $7.0 E09 $12.0 E08 $12.0 E07 $12.0 E06 $12.0 E05 $12.0 E04 $12.0 E03 $7.0 E02 $7.0 E01 $7.0 D12 $7.0 D11 $7.0 D10 $7.0 D09 $12.0 D08 $12.0 D07 $12.0 D06 $12.0 D05 $12.0 D04 $12.0 D03 $7.0 D02 $7.0 D01 $7.0 C12 $7.0 C11 $7.0 C10 $7.0 C09 $14.0 C08 $14.0 C07 $14.0 C06 $14.0 C05 $14.0 C04 $14.0 C03 $7.0 C02 $7.0 C01 $7.0 B12 $7.0 B11 $7.0 B10 $7.0 B09 $14.0 B08 $14.0 B07 $14.0 B06 $14.0 B05 $14.0 B04 $14.0 B03 $7.0 B02 $7.0 B01 $7.0 A12 $7.0 A11 $7.0 A10 $7.0 A09 $14.0 A08 $14.0 A07 $14.0 A06 $14.0 A05 $14.0 A04 $14.0 A03 $7.0 A02 $7.0 A01 $7.0
================================================================================
 A01 $7.0 A02 $7.0 A03 $7.0 A10 $7.0 A11 $7.0 A12 $7.0 B01 $7.0 B02 $7.0 B03 $7.0 B10 $7.0 B11 $7.0 B12 $7.0 C01 $7.0 C02 $7.0 C03 $7.0 C10 $7.0 C11 $7.0 C12 $7.0 D01 $7.0 D02 $7.0 D03 $7.0 D10 $7.0 D11 $7.0 D12 $7.0 E01 $7.0 E02 $7.0 E03 $7.0 E10 $7.0 E11 $7.0 E12 $7.0 F01 $7.0 F02 $7.0 F03 $7.0 F10 $7.0 F11 $7.0 F12 $7.0 G01 $7.0 G02 $7.0 G03 $7.0 G04 $7.0 G05 $7.0 G06 $7.0 G07 $7.0 G08 $7.0 G09 $7.0 G10 $7.0 G11 $7.0 G12 $7.0 H01 $7.0 H02 $7.0 H03 $7.0 H04 $7.0 H05 $7.0 H06 $7.0 H07 $7.0 H08 $7.0 H09 $7.0 H10 $7.0 H11 $7.0 H12 $7.0 D04 $12.0 D05 $12.0 D06 $12.0 D07 $12.0 D08 $12.0 D09 $12.0 E04 $12.0 E05 $12.0 E06 $12.0 E07 $12.0 E08 $12.0 E09 $12.0 F04 $12.0 F05 $12.0 F06 $12.0 F07 $12.0 F08 $12.0 F09 $12.0 B00 $13.0 A00 $13.0 A04 $14.0 A05 $14.0 A06 $14.0 A07 $14.0 A08 $14.0 A09 $14.0 B04 $14.0 B05 $14.0 B06 $14.0 B07 $14.0 B08 $14.0 B09 $14.0 C04 $14.0 C05 $14.0 C06 $14.0 C07 $14.0 C08 $14.0 C09 $14.0
================================================================================

```
