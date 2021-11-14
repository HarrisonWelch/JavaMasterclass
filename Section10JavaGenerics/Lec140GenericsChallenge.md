# Lec140GenericsChallenge

// ArrayList<Team> teams;
// Collections.sort(teams);
// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

```java
package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
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

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

}
```

League.java

```java
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable<T extends Team> {
    private ArrayList<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        this.teams.add(team);
    }

    public void printLeague() {
        // sort
        Collections.sort(this.teams, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
        // print
        int i = 0;
        for (T t: this.teams) {
            System.out.println("Rank #"+ ++i + ": " + t.getName() + " ... (ranking: " + t.ranking() + ")");
        }
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

Main.java

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.



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

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //        adelaideCrows.matchResult(baseballPlayerTeam, 3, 8);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println("Compare");
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        LeagueTable<Team<FootballPlayer>> league = new LeagueTable<>();

        league.addTeam(adelaideCrows);
        league.addTeam(melbourne);
        league.addTeam(hawthorn);
//        league.addTeam(baseballPlayerTeam);

        league.printLeague();

    }
}

```
