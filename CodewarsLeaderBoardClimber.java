/* 7KYU CodeWars CodeWars LeaderBoard Climber

In this kata you will be given a username and their score, 
your score (not your real score) and you need to calculate 
how many kata you need to complete to beat their score, by 
1 point exactly.

As this is the easy version (harder one to folow at some 
point in the future), let's assume only Beta kata and 8kyu 
kata are available. Worth 3 and 1 point respectively.

Return a string in this format: "To beat <user>'s score, I 
must complete <x> Beta kata and <y> 8kyu kata."

If the total number of kata you need to complete >1000, add
"Dammit!" to the end of the string, like so: "To beat <user>'s 
score, I must complete <x> Beta kata and <y> 8kyu kata. Dammit!"

If your score is higher than the user's already, return "Winning!" 
and if they are equal, return "Only need one!"

Note: You are looking to complete as few kata as possible to get to 
your target.

*/

package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
      System.out.println("UserScore: " + userScore + " yourScore: " + yourScore);
      String result = "To beat " + user + "'s score, I must complete ";
      int x = userScore - yourScore;
      if (yourScore > userScore) {
        return "Winning!";
      }
      if (userScore == yourScore) {
        return "Only need one!";
      }
      int a = x % 3;
      int b = x / 3;
      if (a + b > 1000) {
        return result + b + " Beta kata and " + a + " 8kyu kata. Dammit!";
      }
      return result + b + " Beta kata and " + a + " 8kyu kata.";
    }
}
/*------------------------------------------------------------------------------
package com.codewars.apartridge;

class CodewarsLeaderboardClimber {

  static String leaderBoard(String user, int s1, int s2) {
    int need = s1 - s2, beta = need / 3, kyu8 = need - beta * 3, tot = beta + kyu8;
    return need < 0 ? "Winning!" : need == 0 ? "Only need one!" :
      String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.%s", user, beta, kyu8, tot > 1000 ? " Dammit!" : "");
  }
  
}
-------------------------------------------------------------------------------
package com.codewars.apartridge;

class CodewarsLeaderboardClimber {
  static String leaderBoard(String user, int userScore, int yourScore) {
    return userScore < yourScore ? "Winning!" :
           userScore == yourScore ? "Only need one!" :
           "To beat " + user + "'s score, I must complete " + (yourScore = (userScore -= yourScore) / 3) +
           " Beta kata and " + (userScore = userScore % 3) + " 8kyu kata." + (yourScore + userScore > 1000 ? " Dammit!" : "");
  }
}
---------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
        int difference = userScore - yourScore;
        if (difference == 0) {
          return "Only need one!";
        }
        if (difference < 0) {
          return "Winning!";
        }
        if (difference > 2998) {
            return "To beat " + user + "'s score, I must complete " 
              + difference / 3 + " Beta kata and " + difference % 3 + " 8kyu kata. Dammit!";
        }
        return "To beat " + user + "'s score, I must complete " 
              + difference / 3 + " Beta kata and " + difference % 3 + " 8kyu kata.";
    }
}
--------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
      
      if(yourScore > userScore) return "Winning!";
      if(yourScore == userScore) return "Only need one!";
        
      int scoreDiff = userScore - yourScore ;
      int x = scoreDiff / 3;
      int y = scoreDiff % 3 ;
      
      String res = String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.", user, x, y);
      return (x + y > 1000) ? res + " Dammit!" : res;
    }
}
--------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
        if (yourScore > userScore)
            return "Winning!";
        if (yourScore == userScore)
            return "Only need one!";

        int beta = (userScore - yourScore) / 3;
        int kyu = (userScore - yourScore) % 3;
        return String.format("To beat %s's score, I must complete %d " +
                        "Beta kata and %d 8kyu kata.%s", user, beta, kyu,
                beta + kyu > 1000 ? " Dammit!" : "");
    }
}
---------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
  public static String leaderBoard(String user, int userScore, int yourScore) {
    if(yourScore > userScore) {
      return "Winning!";
    } else if(yourScore == userScore) {
      return "Only need one!";
    } else {
      int betaKata = (userScore - yourScore) / 3;
      int eightKyuKata = (userScore - yourScore) % 3;
      String result = String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.",
                                     user, betaKata, eightKyuKata);
      if(betaKata + eightKyuKata > 1000) {
        result += " Dammit!";
      }
      return result;
    }
  }
}
--------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
  private static final String WINNING = "Winning!";
	private static final String EQUALS = "Only need one!";
	private static final String LOOSE = "To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.";
	private static final String DAMMIT = " Dammit!";

	public static String leaderBoard(String user, int userScore, int yourScore) {

		int delta = userScore - yourScore;

		if (delta < 0)
			return WINNING;
		else if (delta == 0)
			return EQUALS;
		else {
			int b = delta / 3, k = delta % 3;
			if (b + k > 1000)
				return String.format(LOOSE, user, b, k) + DAMMIT;
			else
				return String.format(LOOSE, user, b, k);
		}
	}
}
---------------------------------------------------------------------------------
package com.codewars.apartridge;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
      int differance = userScore - yourScore;
      int betaKataTasks = differance / 3;
      int eightKataTasks = betaKataTasks > 0 ? differance % betaKataTasks : differance;
      return String.format("%s", differance < 0 ? "Winning!"
              : differance <= 1 ? "Only need one!"
              : String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.%s",
                  user, betaKataTasks, eightKataTasks,
                  betaKataTasks + eightKataTasks > 1000 ? " Dammit!" : ""));
    }
}
--------------------------------------------------------------------------------
package com.codewars.apartridge;
public class CodewarsLeaderboardClimber {
  public static String leaderBoard(String user, int userScore, int yourScore) {
    String result;
    if (userScore < yourScore) {
      result = "Winning!";
    }
    else if (userScore == yourScore) {
      result = "Only need one!";
    }
    else {
      int score = userScore - yourScore;
      int x = score / 3, y = score % 3;
      result = String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.", user, x, y);
      if (x + y > 1000) {
        result = result + " Dammit!";
      }
    }
    return result;
  }
}
*/