/* 7KYU CodeWars Clean Up After Your Dog

You have stumbled across the divine pleasure that is
owning a dog and a garden. Now time to pick up all the cr@p! :D

Given a 2D array to represent your garden, you must find and collect 
all of the dog cr@p - represented by '@'.

You will also be given the number of bags you have access to (bags), 
and the capactity of a bag (cap). If there are no bags then you can't 
pick anything up, so you can ignore cap.

You need to find out if you have enough capacity to collect all the cr@p 
and make your garden clean again.

If you do, return 'Clean', else return 'Cr@p'.

Watch out though - if your dog is out there ('D'), he gets very touchy 
about being watched. If he is there you need to return 'Dog!!'.

For example:

bags = 2
cap = 2
x (or garden) =
[[ _ , _ , _ , _ , _ , _ ],
 [ _ , _ , _ , _ , @ , _ ],
 [ @ , _ , _ , _ , _ , _ ]]
returns 'Clean'

*/
public class CleanUpAfterYourDog {
    public static String crap(char[][] garden, int bags, int cap) {
      int x = bags * cap;
      for (int i = 0; i < garden.length; i++) {
        for (int j = 0; j < garden[0].length; j++) {
          if (garden[i][j] == 'D') {
            return "Dog!!";
          }
          if (garden[i][j] == '@') {
            x--;
          }
        }
      }
      return x >= 0 ? "Clean" : "Cr@p";
    }
}
/*-------------------------------------------------------------------
public class Kata {
    public static String crap(char[][] garden, int bags, int cap) {
      int count = 0;
      for (int i = 0; i < garden.length; i++) {
        for (int j = 0; j < garden[i].length; j++) {
          if ('@' == garden[i][j]) {
            count++;
          } else if ('D' == garden[i][j]) {
            return "Dog!!";
          }
        }
      }
      
      if (bags * cap >= count) {
        return "Clean";
      } else {
        return "Cr@p";
      }
    }
}
---------------------------------------------------------------------
public class Kata {
    public static String crap(char[][] garden, int bags, int cap) {
        int restCapacity = bags * cap;
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == '@') {
                    restCapacity--;
                }
                if (garden[i][j] == 'D') {
                    return "Dog!!";
                }
            }
        }
        if (restCapacity < 0) {
            return "Cr@p";
        }
        return "Clean";
    }
}
---------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static String crap(char[][] garden, int bags, int cap) {
        int numberOfShits = 0;
        for (char[] line : garden) {
            for (char c : line) { 
              if (c == 'D') { return "Dog!!"; }
              if (c == '@') { ++numberOfShits; } 
            }
        }
        return numberOfShits <= (bags * cap) ? "Clean" : "Cr@p";
    }
}
----------------------------------------------------------------------

*/