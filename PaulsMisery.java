/*   7KYU CodeWars  Paul's Misery

Paul is an excellent coder and sits high on the CW leaderboard. 
He solves kata like a banshee but would also like to lead a 
normal life, with other activities. But he just can't stop 
solving all the kata!!

Given an array (x) you need to calculate the Paul Misery Score. 
The values are worth the following points:

kata = 5
Petes kata = 10
life = 0
eating = 1
The Misery Score is the total points gained from the array. 
Once you have the total, return as follows:

< 40 = 'Super happy!'
< 70 >= 40 = 'Happy!'
< 100 >= 70 = 'Sad!'
> 100 = 'Miserable!'

*/

public class Kata {
    public static String paul(String[] x) {
      //solution
      int result = 0;
      for (int i = 0; i < x.length; i++) {
        if (x[i] == "kata") {
          result = result + 5;
        }
        else if (x[i] == "Petes kata") {
          result = result + 10;
        }
        else if (x[i] == "life") {
          result = result + 0;
        }
        else if (x[i] == "eating") {
          result = result + 1;
        }
        else {
          result = result + 0;
        }
      }
      if (result < 40) {
        return "Super happy!";
      }
      else if (result >= 40 && result < 70) {
        return "Happy!";
      }
      else if (result >= 70 && result < 100) {
        return "Sad!";
      }
      else {
        return "Miserable!";
      }
    }
}

/*------------------------------------------------------------------------

public class Kata {
    public static String paul(String[] x) {
        int i = 0;
        for(String s : x){
          i += s.equals("kata") ? 5 : s.equals("life") ? 0 : s.equals("eating") ? 1 : 10;  
        }
        return i > 100 ? "Miserable!" : i >= 70 ? "Sad!" : i >= 40 ? "Happy!" : "Super happy!";
    }
}
---------------------------------------------------------------------------------

import static java.util.stream.Stream.of;

import java.util.Map;

interface Kata {
  static String paul(String[] x) {
    int score = of(x).mapToInt(s -> Map.of("eating", 1, "kata", 5, "Petes kata", 10).getOrDefault(s, 0)).sum();
    return score < 40 ? "Super happy!" : score < 70 ? "Happy!" : score < 100 ? "Sad!" : "Miserable!";
  }
}
----------------------------------------------------------------------------------

public class Kata {
    public static String paul(String[] x) {
    int point = 0 ; 
     String s = "lkPe"; 
     for (String f : x ) {
        int res = s.indexOf("" + f.charAt(0)) *5 ; 
        point += res<=10 ? res : 1 ;  
      }
     if (point < 40) return "Super happy!";
     if (point < 70) return "Happy!"; 
     if (point <100) return "Sad!"; 
  else return "Mirserable!"; 
}
  }
  

*/