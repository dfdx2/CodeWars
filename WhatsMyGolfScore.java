/* 7KYU CodeWars What's My Golf Score?

I have the par value for each hole on a golf course and my stroke
score on each hole. I have them stored as strings, because I wrote 
them down on a sheet of paper. Right now, I'm using those strings 
to calculate my golf score by hand: take the difference between my 
actual score and the par of the hole, and add up the results for 
all 18 holes.

For example:

If I took 7 shots on a hole where the par was 5, my score would 
be: 7 - 5 = 2
If I got a hole-in-one where the par was 4, my score would 
be: 1 - 4 = -3.
Doing all this math by hand is really hard! Can you help make 
my life easier?

Task Overview

Complete the function which accepts two strings and calculates the golf 
score of a game. Both strings will be of length 18, and each character 
in the string will be a number between 1 and 9 inclusive.

*/

public class Kata {

  public static int golfScoreCalculator(String parList, String scoreList) {
    int score = 0;
    for (int i = 0; i < parList.length(); i++) {
      score += Integer.valueOf(scoreList.charAt(i)) - Integer.valueOf(parList.charAt(i));
    }
    return score;
  }
}
/*------------------------------------------------------------------------------
public class Kata {
  public static int golfScoreCalculator(String parList, String scoreList) {
    return scoreList.chars().sum() - parList.chars().sum();
  }
}
---------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;
class Kata {
  static int golfScoreCalculator(String parList, String scoreList) {
    return range(0, 18).map(i -> scoreList.charAt(i) - parList.charAt(i)).sum();
  }
}
--------------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {

  public static int golfScoreCalculator(String parList, String scoreList) {
    return IntStream.iterate(0, i -> i < parList.length(), i -> ++i)
                    .map(i -> scoreList.charAt(i) - parList.charAt(i))
                    .sum();
  }
}
---------------------------------------------------------------------------------
public class Kata {

  public static int golfScoreCalculator(String parList, String scoreList) {
  int total=0;
  char[] parListArr=parList.toCharArray();
  char[] scoreListArr=scoreList.toCharArray();
  for (int x=0;x<18;x++){
   total+=((int) -parListArr[x] + (int) scoreListArr[x]);
  }
    return total;
  }
}
---------------------------------------------------------------------------
class Kata {

  static int golfScoreCalculator(String p, String s) {
    return s.chars().sum() - p.chars().sum();
  }
  
}


*/