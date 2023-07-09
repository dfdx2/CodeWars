/* 7KYU CodeWars Paul's Misery

Paul is an excellent coder and sits high on the CW leaderboard. He 
solves kata like a banshee but would also like to lead a normal life, 
with other activities. But he just can't stop solving all the kata!!

Given an array (x) you need to calculate the Paul Misery Score. The values 
are worth the following points:

kata = 5
Petes kata = 10
life = 0
eating = 1
The Misery Score is the total points gained from the array. Once you have the 
total, return as follows:

< 40 = 'Super happy!'
< 70 >= 40 = 'Happy!'
< 100 >= 70 = 'Sad!'
> 100 = 'Miserable!'

*/

public class Kata {
    public static String paul(String[] x) {
      int result = 0;
      for (int i = 0; i < x.length; i++) {
        if (x[i] == "kata") {
          result += 5;
        }
        else if (x[i] == "Petes kata") {
          result += 10;
        }
        else if (x[i] == "eating") {
          result += 1;
        }
        else {
          result += 0;
        }
      }
     
     return (result < 40) ? "Super happy!" : (result >= 40 && result < 70) ? "Happy!" : (result >= 70 && result < 100) ? "Sad!" : (result > 100) ? "Miserable!" : "dead!"; 
  }
}
/*-------------------------------------------------------------------------
public class Kata {
    public static String paul(String[] x) {
        int i = 0;
        for(String s : x){
          i += s.equals("kata") ? 5 : s.equals("life") ? 0 : s.equals("eating") ? 1 : 10;  
        }
        return i > 100 ? "Miserable!" : i >= 70 ? "Sad!" : i >= 40 ? "Happy!" : "Super happy!";
    }
}
----------------------------------------------------------------------------
import static java.util.stream.Stream.of;

import java.util.Map;

interface Kata {
  static String paul(String[] x) {
    int score = of(x).mapToInt(s -> Map.of("eating", 1, "kata", 5, "Petes kata", 10).getOrDefault(s, 0)).sum();
    return score < 40 ? "Super happy!" : score < 70 ? "Happy!" : score < 100 ? "Sad!" : "Miserable!";
  }
}
------------------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static String paul(String[] x) {
      List<String> l = Arrays.asList(x);
      int miser = 0;
      miser += 5 * Collections.frequency(l, "kata");
      miser += 10 * Collections.frequency(l, "Petes kata");
      miser += 1 * Collections.frequency(l, "eating");
      if (miser < 40){ return "Super happy!";}
      else if (miser < 70){ return "Happy!";}
      else if (miser < 100){ return "Sad!";}
      else{ return "Miserable!";}
    }
}


*/