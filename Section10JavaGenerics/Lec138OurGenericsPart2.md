# Lec 138 Our Generics Class Part 2

* We don't want to make multiple team types so lets just add functionality to use any player type

Main.java

```java
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Yeet2");

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Backham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //        adelaideCrows.addPlayer(pat);
        //        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        //        Team<String> brokenTeam = new Team<>("this won't work");
        //        brokenTeam.addPlayer("no one");

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("this wont work");
        soccerPlayerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freemantle");

        hawthorn.matchResult(fremantle, 2, 1);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 3, 8);
        adelaideCrows.matchResult(baseballPlayerTeam, 3, 8);

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}

```

Note baseballTeam isnt gunna work

Player.java

```java
package com.company;

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

```

FootballPlayer.java

```java
package com.company;

public class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}

```

BaseballPlayer.java

```java
package com.company;

public class BaseballPlayer extends Player{
    public BaseballPlayer(String name) {
        super(name);
    }
}

```

SoccerPlayer.java

```java
package com.company;

public class SoccerPlayer extends Player{

    public SoccerPlayer(String name) {
        super(name);
    }
}

```

Team.java

```java
package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            this.won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            this.tied++;
            message = " drew with ";
        } else {
            this.lost++;
            message = " lost to ";
        }
        played++;

        // Opponent match result
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
```
