# Lec 125 Interfaces Challenge Part 1

## My solution
Main.java
```java
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        ISaveable players = new Players(readValues());
        ISaveable monsters = new Monsters(readValues());
        ISaveable dragons = new Dragons(readValues());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

}
```
ISaveable.java
```java
package com.company;

import java.util.ArrayList;

public interface ISaveable {
    void save();
    void populate(ArrayList<String> list);
}
```
Players.java
```java
package com.company;

import java.util.ArrayList;

public class Players implements ISaveable {
    private ArrayList<String> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public Players(ArrayList<String> players) {
        this.players = players;
    }

    @Override
    public void save() {
        // for each player (actually Strings ... shhhh) in players
        for (String s : this.players) {
            System.out.println("Saving player " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        // Invoke copy constructor
        this.players = new ArrayList<>(list);
    }

    private void saveItem(Object o){
        // saving action
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.players) {
            str += s + " ";
        }
        return str;
    }
}
```
Monsters.java
```java
package com.company;

import java.util.ArrayList;

public class Monsters implements ISaveable {

    private ArrayList<String> monsters;

    public Monsters() {
        this.monsters = new ArrayList<>();
    }

    public Monsters(ArrayList<String> monsters) {
        this.monsters = monsters;
    }

    @Override
    public void save() {
        for (String s : this.monsters) {
            System.out.println("Saving monster " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        // Copy constructor
        this.monsters = new ArrayList<>(list);
    }

    private void saveItem(Object o) {
        // Save action
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.monsters) {
            str += s + " ";
        }
        return str;
    }
}
```
Dragon.java
```java
package com.company;

import java.util.ArrayList;

public class Dragons implements ISaveable {

    private ArrayList<String> dragons;

    public Dragons() {
        this.dragons = new ArrayList<>();
    }

    public Dragons(ArrayList<String> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void save() {
        for (String s : this.dragons) {
            System.out.println("Saving dragon " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        this.dragons = new ArrayList<>(list);
    }

    private void saveItem(Object o) {
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.dragons) {
            str += s + " ";
        }
        return str;
    }
}
```
output
```
Players:
Choose
1 to enter a string
0 to quit
Choose an option: 1
Enter a string: Mike
Choose an option: 1
Enter a string: Mary
Choose an option: 1
Enter a string: Rashad
Choose an option: 0
Saving player Mike
Saved Mike
Saving player Mary
Saved Mary
Saving player Rashad
Saved Rashad
Monsters:
Choose
1 to enter a string
0 to quit
Choose an option: 1
Enter a string: MikDak
Choose an option: 1
Enter a string: Zibb
Choose an option: 1
Enter a string: Logzar
Choose an option: 0
Saving monster MikDak
Saved MikDak
Saving monster Zibb
Saved Zibb
Saving monster Logzar
Saved Logzar
Dragons:
Choose
1 to enter a string
0 to quit
Choose an option: 1
Enter a string: Rak'nakkireen
Choose an option: 1
Enter a string: Zrikduubn
Choose an option: 1
Enter a string: Logosian
Choose an option: 0
Saving dragon Rak'nakkireen
Saved Rak'nakkireen
Saving dragon Zrikduubn
Saved Zrikduubn
Saving dragon Logosian
Saved Logosian

Process finished with exit code 0
```
