# Lec 95 Polymorphism

## Polymorphism
* Usually refrenced when using a single parent class or interface to implement multiple other classes
  * A split in the inheritance tree
* Allows actions to act differently based on what the action is being performed on
* Best to show an example
  * Create many classes in the main
  * Class that aren't going to be reused

Main.java (all in one file)
```java
package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        // What the movie is about
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws"); // Using inheritance we are initializing name to "Jaws"
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method (Show how polymorphism works)
}

public class Main {

    public static void main(String[] args) {
	    // Lec95Polymorphism
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                        " : " + movie.getName() + "\n" +
                        "Plot: " + movie.plot() + "\n"); // return the soonest available plot method results
        }
    }

    // Notice returning "Movie"
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber); // check
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null; // switch could be diff numbers
    }
}

```