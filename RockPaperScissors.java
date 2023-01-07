/* 8KYU CodeWars Rock Paper Scissors!

Let's play! You have to return which player won! In case 
of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"

*/

public class Kata {
  public static String rps(String p1, String p2) {

    if (p1 == "scissors" && p2 == "paper") {
      return "Player 1 won!";
    }
    else if (p1 == "scissors" && p2 == "rock") {
      return "Player 2 won!";
    }
    else if (p1 == "paper" && p2 == "rock") {
      return "Player 1 won!";
    }
    else if (p1 == "rock" && p2 == "scissors") {
      return "Player 1 won!";
    }
    else if (p1 == p2) {
      return "Draw!";
    }
    else {
      return "Player 2 won!";
    }
  }
}
/*---------------------------------------------------------------
public class Kata {
  public static String rps(String p1, String p2) {
    if(p1 == p2) return "Draw!";
    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
    return "Player " + p + " won!";
  }
}
------------------------------------------------------------------
public class Kata {
  public static String rps(String p1, String p2) {
    return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
  }
}
-----------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        
        Map<String, String> game = new HashMap<>();
        game.put("scissors", "paper");
        game.put("paper", "rock");
        game.put("rock", "scissors");

        String result = game.get(p1);
        if (result.equals(p2)) return "Player 1 won!";
        else                   return "Player 2 won!";
    }
}
------------------------------------------------------------------
public class Kata {
  public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        String result = p1 + p2;
        int winner = "scissorspaper".equals(result) || "rockscissors".equals(result) || "paperrock".equals(result) ? 1 : 2;
        return String.format("Player %d won!", winner);
  }
}
------------------------------------------------------------------
public class Kata {
    
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String ROCK = "rock";
    
    public static final String P1WON = "Player 1 won!";
    public static final String P2WON = "Player 2 won!";
    public static final String DRAW = "Draw!";

    public static String rps(String p1, String p2) {
        switch (p1) {
            case PAPER:
                return p2 == p1 ? DRAW : (p2 == SCISSORS ? P2WON : P1WON);
            case SCISSORS:
                return p2 == p1 ? DRAW : (p2 == ROCK ? P2WON : P1WON);
            case ROCK:
                return p2 == p1 ? DRAW : (p2 == PAPER ? P2WON : P1WON);
            default:
                return "Please enter an item";
                
        }
    }

}
-------------------------------------------------------------------
public class Kata {
  private static byte p = 1;
  public static String rps(String p1, String p2) {
    // your code
    switch(p1.length() - p2.length()) {
      case 0: return "Draw!";
      case 3:
      case 1:
      case (-4): return "Player " + p + " won!";
      default: p = 2; return rps(p2, p1);
    }
  }
}
-------------------------------------------------------------
public class Kata {
  public static String rps(String p1, String p2) 
  {
    if( p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
    if( p1.equals("scissors") && p2.equals("rock")) return "Player 2 won!";
    if( p1.equals("scissors") && p2.equals("scissors")) return "Draw!";
    if( p1.equals("paper") && p2.equals("paper")) return "Draw!";
    if( p1.equals("paper") && p2.equals("scissors")) return "Player 2 won!";
    if( p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
    if( p1.equals("rock") && p2.equals("rock")) return "Draw!";
    if( p1.equals("rock") && p2.equals("paper")) return "Player 2 won!";
    if( p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
    else return "";
  }
}
----------------------------------------------------------------------
public class Kata {
  public static String rps(String p1, String p2) {
    if (p1 == p2) return "Draw!";

    boolean firstPlayerWon = "scissors" == p1 && "paper" == p2 ||
                             "paper" == p1 && "rock" == p2 ||
                             "rock" == p1 && "scissors" == p2;

    return String.format("Player %s won!", firstPlayerWon ? 1 : 2);
  }
}
---------------------------------------------------------------------
*/