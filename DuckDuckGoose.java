/* 8KYU CodeWars Duck Duck Goose

The objective of Duck, duck, goose is to walk in a circle, tapping on 
each player's head until one is chosen.

Task: Given an array of Player objects (an array of associative arrays 
in PHP) and an index (1-based), return the name of the chosen 
Player(name is a property of Player objects, e.g Player.name)

Example:

duck_duck_goose([a, b, c, d], 1) should return a.name
duck_duck_goose([a, b, c, d], 5) should return a.name
duck_duck_goose([a, b, c, d], 4) should return d.name

// PHP only
duck_duck_goose([$a, $b, $c, $d], 1); // => $a["name"]
duck_duck_goose([$a, $b, $c, $d], 5); // => $a["name"]
duck_duck_goose([$a, $b, $c, $d], 4); // => $d["name"]

*/
public class DuckDuckGoose {
  public static String duckDuckGoose(Player[] players, int goose) {
    return goose % players.length == 0 ? players[players.length - 1].name : players[goose % players.length - 1].name;
  }
}
/*-------------------------------------------------------------------------
public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    // Note: Player objects have a String field called 'name'.
     int result = goose % players.length;
    return (result == 0) ? players[players.length - 1].name : players[result - 1].name;
  }
}
---------------------------------------------------------------------------
public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    return players[(goose - 1) % players.length].name;
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    // Note: Player objects have a String field called 'name'.
    
    int a=players.length;
    int b=goose%a-1;
    if(b<0){
        b=b+a;
    }
     return players[b].name;
  }
}
----------------------------------------------------------------------------------
class Kata {
    static String duckDuckGoose(final Player[] players, final int goose) {
        final int index = (goose - 1) % players.length;
        return players[index].name;
    }
}
---------------------------------------------------------------------------------
class Kata {
  static String duckDuckGoose(Player[] players, int goose) {
    return players[--goose % players.length].name;
  }
}
---------------------------------------------------------------------------------


*/