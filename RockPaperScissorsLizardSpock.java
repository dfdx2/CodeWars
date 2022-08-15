/*   7KYU Rock Paper Scissors Lizard Spock

In this kata, your task is to implement an extended version of 
the famous rock-paper-scissors game. The rules are as follows:

Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors

Task:
Given two values from the above game, return the Player result 
as "Player 1 Won!", "Player 2 Won!", or "Draw!".

Inputs
Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".

*/

public class Kata {
  
  public static String rpsls(String player1, String player2){
    // Your code here!
    if (player1 == "rock" && player2 == "lizard") {
      return "Player 1 Won!";
    }
    else if (player1 == "paper" && player2 == "rock") {
      return "Player 1 Won!";
    }
    else if (player1 == "scissors" && player2 == "lizard") {
      return "Player 1 Won!";
    }
    else if (player1 == "lizard" && player2 == "paper") {
      return "Player 1 Won!";
    }
    else if (player1 == "spock" && player2 == "rock") {
      return "Player 1 Won!";
    }
    else if (player1 == "scissors" && player2 == "paper") {
      return "Player 1 Won!";
    }
    else if (player1 == "lizard" && player2 == "spock") {
      return "Player 1 Won!";
    }
    else if (player1 == "spock" && player2 == "scissors") {
      return "Player 1 Won!";
    }
    else if (player1 == "paper" && player2 == "spock") {
      return "Player 1 Won!";
    }
    else if (player1 == "rock" && player2 == "scissors") {
      return "Player 1 Won!";
    }
    else if (player1 == player2) {
      return "Draw!";
    }
    else {
      return "Player 2 Won!";
    }
    
  }
}
/*-----------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Kata {
  public static String rpsls(String player1, String player2){
    if (player1 == player2) {
      return "Draw!";
    }
    Map <String, String> game = new HashMap<>();
    game.put("scissors","paper lizard");
    game.put("rock", "lizard scissors");
    game.put("paper", "spock rock");
    game.put("spock", "scissors rock");
    game.put("lizard", "spock paper");
    String[] arr = game.get(player1).split(" ");
    if (Arrays.stream(arr).anyMatch(player2::equals)) {
      return "Player 1 Won!";
    }
    return "Player 2 Won!";
    }
}
--------------------------------------------------------------------------------------







*/