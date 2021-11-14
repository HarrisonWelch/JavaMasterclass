# Lec 137 Our Generics Class

* Writing code right the 1st time is worth the wait
* Lets use generics to add various types of players to a team

### Java stuffs

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

BaseballPlayer.java
```java
package com.company;

public class BaseballPlayer extends Player{
    public BaseballPlayer(String name) {
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

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
        } else if (ourScore == theirScore) {
            this.tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
```
