/* 7KYU CodeWars Rock Off!

Alice and Bob have participated to a Rock Off with their bands. A jury of true metalheads rates the two challenges, awarding points to the bands on a scale from 1 to 50 for three categories: Song Heaviness, Originality, and Members' outfits.

For each one of these 3 categories they are going to be awarded one point, should they get a better judgement from the jury. No point is awarded in case of an equal vote.

You are going to receive two arrays, containing first the score of Alice's band and then those of Bob's. Your task is to find their total score by comparing them in a single line.

Example:

Alice's band plays a Nirvana inspired grunge and has been rated 20 for Heaviness, 32 for Originality and only 18 for Outfits. Bob listens to Slayer and has gotten a good 48 for Heaviness, 25 for Originality and a rather honest 40 for Outfits.

The total score should be followed by a colon : and by one of the following quotes: if Alice's band wins: Alice made "Kurt" proud! if Bob's band wins: Bob made "Jeff" proud! if they end up with a draw: that looks like a "draw"! Rock on!

The solution to the example above should therefore appear like '1, 2: Bob made "Jeff" proud!'.

*/

public class Solution {
    public static String solveRockOff(final int[] alice, final int[] bob) {
      int a = 0;
      int b = 0;
      for (int i = 0; i < alice.length; i++) {
        if (alice[i] > bob[i]) {
          a++;
        }
        else if (alice[i] < bob[i]) {
          b++;
        }
        else if (alice[i] == bob[i]) {
          continue;
        }
      }
      String j = String.valueOf(a);
      String l = String.valueOf(b);
      if (a > b) {
        return j + ", " + l + ": Alice made \"Kurt\" proud!";
      }
      if (b > a) {
        return j + ", " + l + ": Bob made \"Jeff\" proud!";
      }
    return j + ", " + l + ": that looks like a \"draw\"! Rock on!";
    }
}
/*---------------------------------------------------------------------------
public class Solution {

  private static final String ALICE_WINS = "Alice made \"Kurt\" proud!"; 
  private static final String BOB_WINS = "Bob made \"Jeff\" proud!";
  private static final String DRAW = "that looks like a \"draw\"! Rock on!"; 
  
  public static String solveRockOff(final int[] alice, final int[] bob) {
      int a = 0, b = 0;
      for (int i=0; i<3; i++) { a += alice[i]>bob[i]?1:0; b += alice[i]<bob[i]?1:0; }
      return String.format("%d, %d: %s", a, b, a>b ? ALICE_WINS : a<b ? BOB_WINS : DRAW);
    }
  }
------------------------------------------------------------------------------
public class Solution {

  private static final String ALICE_WON = "Alice made \"Kurt\" proud!";
  private static final String BOB_WON = "Bob made \"Jeff\" proud!";
  private static final String DRAW = "that looks like a \"draw\"! Rock on!";
  
  public static String solveRockOff(final int[] alice, final int[] bob) {
    int aliceScore = 0, bobScore = 0;
    for(int i = 0; i < alice.length; i++) {
      if (alice[i] > bob[i]) {
        aliceScore++;
      } else if (alice[i] < bob[i]) {
        bobScore++;
      }
    }
    
    StringBuilder result = new StringBuilder();
    result.append(aliceScore).append(", ").append(bobScore).append(": ");
    result.append(aliceScore > bobScore ? ALICE_WON : 
                  aliceScore < bobScore ? BOB_WON :
                  DRAW);
    return result.toString();
  }
}
-------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.IntStream;
public class Solution
{
    public static String solveRockOff(final int[] alice, final int[] bob)
    {
        int sumAlice=IntStream.rangeClosed(0,2).map(i->alice[i]>bob[i]?1:0).sum();
        int sumBob=IntStream.rangeClosed(0,2).map(i->alice[i]<bob[i]?1:0).sum();
        String scoreboard=sumAlice+", "+sumBob+": ";
        if(sumAlice>sumBob)return scoreboard+"Alice made \"Kurt\" proud!";
        if(sumAlice<sumBob)return scoreboard+"Bob made \"Jeff\" proud!";
        return scoreboard+"that looks like a \"draw\"! Rock on!"; // Do your magic!
    }
}
--------------------------------------------------------------------------------
class Solution {
  static String solveRockOff(int[] alice, int[] bob) {
    int a = 0, b = 0;
    for (int i = 0; i < alice.length; i++) {
      int c = alice[i] > bob[i] ? a++ : alice[i] < bob[i] ? b++ : 0;
    }
    return String.format("%s, %s: ", a, b) + (a == b  ? "that looks like a \"draw\"! Rock on!"
            : a > b ? "Alice made \"Kurt\" proud!" : "Bob made \"Jeff\" proud!");
  }
}
-------------------------------------------------------------------------------
public class Solution {
  
  private static final String CONTESTANT_1_NAME = "Alice";
  private static final String CONTESTANT_2_NAME = "Bob";
  
  private static final String CONTESTANT_1_PROUD = "Kurt";
  private static final String CONTESTANT_2_PROUD = "Jeff";
  
  private static final String WIN_FORMAT = "%d, %d: %s made \"%s\" proud!";
  private static final String DRAW_FORMAT = "%d, %d: that looks like a \"draw\"! Rock on!";
  
  public static String solveRockOff(final int[] contestant1, final int[] contestant2) {
    
    int contestant1Score = 0;
    int contestant2Score = 0;
    
    for(int i = 0; i < contestant1.length; i++) {
      if(contestant1[i] > contestant2[i]) {
        contestant1Score++;
      } else if (contestant1[i] < contestant2[i]){
        contestant2Score++;
      }
    }
    
    if(contestant1Score > contestant2Score) {
      return String.format(WIN_FORMAT, contestant1Score, contestant2Score, CONTESTANT_1_NAME, CONTESTANT_1_PROUD);
    } else if (contestant1Score < contestant2Score) {
      return String.format(WIN_FORMAT, contestant1Score, contestant2Score, CONTESTANT_2_NAME, CONTESTANT_2_PROUD);
    } else {
      return String.format(DRAW_FORMAT, contestant1Score, contestant2Score);
    }
  }
}
---------------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {
    public static String solveRockOff(final int[] alice, final int[] bob) {
      int aliceRes = IntStream.range(0, 3).map(i -> alice[i] > bob[i] ? 1 : 0).sum();
      int bobRes = IntStream.range(0, 3).map(i -> bob[i] > alice[i] ? 1 : 0).sum();

      return String.format("%d, %d: %s", aliceRes, bobRes, aliceRes == bobRes ? "that looks like a \"draw\"! Rock on!" :
                                                           aliceRes > bobRes ? "Alice made \"Kurt\" proud!" : "Bob made \"Jeff\" proud!");
    }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution {
  public static String solveRockOff(final int[] alice, final int[] bob) {
    int[] c = new int[]{alice[0] - bob[0], alice[1] - bob[1], alice[2] - bob[2]};
    int a = (int) Arrays.stream(c).filter(i -> i > 0).count(), b = (int) Arrays.stream(c).filter(i -> i < 0).count(), r = a - b;
    String ans = "%d, %d: %s made \"%s\" proud!", draw = "%d, %d: that looks like a \"draw\"! Rock on!";
    return r == 0 ? String.format(draw, a, b) : r > 0 ? String.format(ans, a, b, "Alice", "Kurt") : String.format(ans, a, b, "Bob", "Jeff");
  }
}
---------------------------------------------------------------------------------
import static java.lang.Integer.signum;
import static java.lang.Math.max;

public class Solution {
  public static String solveRockOff(int[] a, int[] b) {
    int c = max(0, signum(a[0] - b[0])) + max(0, signum(a[1] - b[1])) + max(0, signum(a[2] - b[2]));
    int d = max(0, signum(b[0] - a[0])) + max(0, signum(b[1] - a[1])) + max(0, signum(b[2] - a[2]));
    return String.format("%d, %d: %s!", c, d,
      c == d ? "that looks like a \"draw\"! Rock on" :
      c > d ? "Alice made \"Kurt\" proud" :
      "Bob made \"Jeff\" proud");
  }
}
--------------------------------------------------------------------------------
import java.util.stream.*;
import java.util.*;

public class Solution {

    public static String solveRockOff(final int[] alice, final int[] bob) {
        long a = IntStream.range(0, alice.length)
                              .map(i -> alice[i] > bob[i] ? 1 : 0)
                              .sum();
        long b =  IntStream.range(0, alice.length)
                              .map(i -> alice[i] < bob[i] ? 1 : 0)
                              .sum(); 
        if(a == b) return String.format("%d, %d: that looks like a \"draw\"! Rock on!", a, b);
        return a > b ? String.format("%d, %d: Alice made \"Kurt\" proud!", a, b)
                    : String.format("%d, %d: Bob made \"Jeff\" proud!", a, b);
    }
}
--------------------------------------------------------------------------------
public class Solution {
    public static String solveRockOff(final int[] alice, final int[] bob) {
      int a = 0;
      int b = 0;
      for (int i = 0; i < alice.length; i++) {
        if (alice[i] > bob[i]) {
          a++;
        }
        else if (alice[i] < bob[i]) {
          b++;
        }
        else if (alice[i] == bob[i]) {
          continue;
        }
      }
      String j = String.valueOf(a);
      String l = String.valueOf(b);
      if (a > b) {
        return j + ", " + l + ": Alice made \"Kurt\" proud!";
      }
      if (b > a) {
        return j + ", " + l + ": Bob made \"Jeff\" proud!";
      }
    return j + ", " + l + ": that looks like a \"draw\"! Rock on!";
    }
}
---------------------------------------------------------------------------------
public class Solution{
    public static String solveRockOff(final int[] alice, final int[] bob){
      int Alice = 0, Bob = 0;
        for(int i=0; i<3; i++){
          if(alice[i] == bob[i]){
          }else if(alice[i] > bob[i]){
            Alice++;
          }else{
            Bob++;
          }
        }
      if(Alice > Bob){
        return Alice + ", " + Bob + ": Alice made \"Kurt\" proud!";
      }else if(Alice == Bob){
        return Alice + ", " + Bob +  ": that looks like a \"draw\"! Rock on!";
      }else{
        return Alice + ", " + Bob + ": Bob made \"Jeff\" proud!";
      }
    }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String solveRockOff(final int[] alice, final int[] bob)
    {
        int lose=0;
        int win=0;
      for(int i=0;i<=2;i++)
        {
      if (alice[i]>bob[i])
        win++;
      else if(alice[i]<bob[i])
        lose++;
        }
      if(lose==win) return win+", "+lose+": that looks like a \"draw\"! Rock on!";
      else
        return (win>lose)?win+", "+lose+": Alice made \"Kurt\" proud!":win+", "+lose+": Bob made \"Jeff\" proud!";      }
}
---------------------------------------------------------------------------------
public class Solution
{
    public static String solveRockOff(final int[] alice, final int[] bob)
    {
        int bs = 0;
        int as = 0;
        for(int i = 0; i < alice.length;i++){
          if(alice[i] == bob[i]){
            
          } else if(alice[i] > bob[i]){
            as++;
          } else{
            bs++;
          }
        }
      
        return as == bs? as +", " + bs + ": " + "that looks like a \"draw\"! Rock on!" : as > bs ? 
          as +", " + bs + ": " + "Alice made \"Kurt\" proud!": as +", " + bs + ": " + "Bob made \"Jeff\" proud!";
    }
}
---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution
{
  public static String solveRockOff(final int[] alice, final int[] bob) 
  {
    int aliceS = IntStream.range(0, 3).filter(i -> alice[i] > bob[i]).map(i -> 1).sum();
    int bobS = IntStream.range(0, 3).filter(i -> alice[i] < bob[i]).map(i -> 1).sum();
    
    if (aliceS > bobS) {
      return aliceS + ", " + bobS + ": Alice made \"Kurt\" proud!";
    }
    
    if (aliceS < bobS) {
      return aliceS + ", " + bobS + ": Bob made \"Jeff\" proud!";
    }
    
    return aliceS + ", " + bobS + ": that looks like a \"draw\"! Rock on!";
  }
}


*/