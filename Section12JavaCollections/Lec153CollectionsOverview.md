# Lec153CollectionsOverview

* Back in Section 9 we looked at different list interfaces: List, ArrayList.
* At the top level is the collections class. This can be extended and methods are exposed that can be used to make new collections and so on.
* Covering aggregate functions
* Covering more implementations
* Covering algorithms

## Theatre
* Making a basic example

```java
package com.lesson;

import java.util.ArrayList;
import java.util.List;

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

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                break;
            }
        }

        if (requestSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestSeat.reserve();
    }

    public class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
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

## Main.java

```java
package com.lesson;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();

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
    }
}
```

Output
```
A01
A02
A03
A04
A05
A06
A07
A08
A09
A10
A11
A12
B01
B02
B03
B04
B05
B06
B07
B08
B09
B10
B11
B12
C01
C02
C03
C04
C05
C06
C07
C08
C09
C10
C11
C12
D01
D02
D03
D04
D05
D06
D07
D08
D09
D10
D11
D12
E01
E02
E03
E04
E05
E06
E07
E08
E09
E10
E11
E12
F01
F02
F03
F04
F05
F06
F07
F08
F09
F10
F11
F12
G01
G02
G03
G04
G05
G06
G07
G08
G09
G10
G11
G12
H01
H02
H03
H04
H05
H06
H07
H08
H09
H10
H11
H12
Seat H11 reserved
Please pay
Sorry, seat is taken
```
