/* 7KYU CodeWwars Help Your Fellow Warrior!

Let's say that in a hypothetical platform that resembles 
Codewars there is a clan with 2 warriors. The 2nd one in 
ranking (lets call him D) wants to at least reach the honor 
score of his ally (lets call her M). (Let's say that there 
is no antagonism here, he just wants to prove his ally that 
she should be proud to have him in the clan and sees this as 
the only way to achieve it! :P )

Your task is to help D by providing him with the quickest path 
to reach M's honor score.

In this hypothetical platform there are 2 kinds of kata to be solved:

'2kyu' worth of 1 point 
'1kyu' worth of 2 points 
So if for example:

M has honor 11
D has honor 2
D could reach **Ms** honor by solving kata worth of 9`. He has many 
options to do this:

Solve 9 '2kyus' (9*1 -> 9) => Solve 9 kata
Solve 4 '1kyus' and 1 '2kyus' (4*2 + 1*1-> 9) => Solve 5 kata
Solve 2 '1kyus' and 5 '2kyus' (2*2 + 5*1 -> 9) => Solve 7 kata
etc etc...
The quickest path to reach the honor score is:

4 '1kyus' and 1 '2kyus' => Solve only 5 kata
Create a function getHonorPath that accepts 2 arguments honorScore
& targetHonorScore with score integers of 2 warriors and returns an 
object with the quickest path for the first one to reach the 2nd's 
honor. For example:

getHonorPath(2, 11) should return { '1kyus': 4, '2kyus': 1 }
getHonorPath(20, 11) should return {}
For the purpose of this kata you do not have to worry about any 
non-integer arguments for honor scores

*/

public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
      if (honorScore > targetHonorScore || honorScore == targetHonorScore) {
        return "";
      }
      int a = targetHonorScore - honorScore;
      return "2kyus: " + String.valueOf(a % 2) + ", 1kyus: " + String.valueOf(a / 2);
    }
}
/*--------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
      if (targetHonorScore <= honorScore)
        return "";
      return "2kyus: " + ((targetHonorScore - honorScore) % 2) + ", 1kyus: " + ((targetHonorScore - honorScore) / 2);
    }
}
----------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int O, int M) { 
       M-=O; 
       if(M<1)return "";
       return "2kyus: "+(M%2)+", 1kyus: "+M/2;
    }
}
-----------------------------------------------------------------------------
class Kata {
  static String getHonorPath(int honorScore, int targetHonorScore) {
    return (targetHonorScore -= honorScore) > 0 ? "2kyus: " + targetHonorScore % 2 + ", 1kyus: " + targetHonorScore / 2 : "";
  }
}
-----------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
    
      if(honorScore >= targetHonorScore) {
        return "";
      }
    
      return String.format("2kyus: %d, 1kyus: %d", (targetHonorScore - honorScore)%2, (targetHonorScore - honorScore)/2);
    }
}
-----------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
      
      int difference = targetHonorScore - honorScore;
      // we want to know the difference so that we know how to divide the difference
      
      if(difference > 0){
        // as long as difference is bigger than 0:
      
        int kyuOne = difference / 2;
        // divided by 2 because kyu 1 gives 2 points
        int kyuTwo = 0;
        // kyu 2 only has to "pick up" the remainder
        
        if(difference % 2 == 1){
          // if there is a remainder:
          kyuTwo++;
          // kyu 2  + 1
        }
        return "2kyus: " + kyuTwo + ", 1kyus: " + kyuOne;
      }
      else{
        return "";
      }
    }
}
-----------------------------------------------------------------------------
class Kata {
    static String getHonorPath(final int honorScore, final int targetHonorScore) {
        final int requiredScore = targetHonorScore - honorScore;
        return requiredScore > 0 ?
            String.format("2kyus: %d, 1kyus: %d", requiredScore % 2, requiredScore / 2) :
            "";
    }
}
-----------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
      if(targetHonorScore <= honorScore) return "";
      int needHonor = targetHonorScore - honorScore;
      int kyus1 = (int) needHonor/2;
      int kyus2 = needHonor - kyus1 * 2;
      return new String("2kyus: "+kyus2+", 1kyus: "+kyus1);
    }
}
-----------------------------------------------------------------------------
public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
    // Honor Higher so return none
      if (honorScore >= targetHonorScore) { return ""; } 
      // Total points needed
      int pointsNeeded = targetHonorScore - honorScore; 
      // 0 is a even number
      int twoKyus = pointsNeeded%2;
      // if we have even number 0 2kyus, and we divide points needed by 2 to get total num of 1kyu (-1 if odd number)
      return String.format("2kyus: %d, 1kyus: %d", (twoKyus), ((pointsNeeded-twoKyus)/2));
    }
}
-------------------------------------------------------------------------------
public class Kata {

  public static String getHonorPath(int h, int t) {
    if (h >= t) return "";
    final int k1 = (t-h) / 2, k2 = t-h-k1*2;
    return String.format("2kyus: %d, 1kyus: %d", k2, k1);
  }
  
}

*/