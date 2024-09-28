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
public class RockPaperScissorsLizardSpock {
  
  public static String rpsls(String player1, String player2){
    String winner1 = "Player 1 Won!";
    String winner2 = "Player 2 Won!";
    String draw = "Draw!";
    if (player1.equals(player2)) {
      return draw;
    }
    if (player1.equals("scissors") && player2.equals("paper") || player1.equals("scissors") && player2.equals("lizard")) {
      return winner1;
    }
    if (player1.equals("paper") && player2.equals("rock") || player1.equals("paper") && player2.equals("spock")) {
      return winner1;
    }
    if (player1.equals("rock") && player2.equals("lizard") || player1.equals("rock") && player2.equals("scissors")) {
      return winner1;
    }
    if (player1.equals("lizard") && player2.equals("spock") || player1.equals("lizard") && player2.equals("paper")) {
      return winner1;
    }
    if (player1.equals("spock") && player2.equals("scissors") || player1.equals("spock") && player2.equals("rock")) {
      return winner1;
    }
    return winner2;
  }
}
/*
----------------------------------------------------------------------------------
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
-----------------------------------------------------------------------------------
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
import java.util.*;

public class Kata {
  
  public static String rpsls(String player1, String player2){
        List<String> arr = List.of("scissors", "paper", "rock", "lizard", "spock");
        int i1 = arr.indexOf(player1);
        int i2 = arr.indexOf(player2);
        if(i1 < i2) return (i2 - i1) % 2 != 0 ? "Player 1 Won!" : "Player 2 Won!";
        if(i1 > i2) return (i1 - i2) % 2 != 0 ? "Player 2 Won!" : "Player 1 Won!";
        return "Draw!";  
    }
}
------------------------------------------------------------------------------------------

public class Kata {
  
  public static String rpsls(String player1, String player2){
    // Your code here!
    switch(player1){
        case "scissors":
            switch(player2){
                case "scissors":
                return "Draw!";
                case "rock":
                return "Player 2 Won!";
                case "paper":
                return "Player 1 Won!";
                case "lizard":
                return "Player 1 Won!";
                case "spock":
                return "Player 2 Won!";
            }
        case "rock":
            switch(player2){
                case "scissors":
                return "Player 1 Won!";
                case "rock":
                return "Draw!";
                case "paper":
                return "Player 2 Won!";
                case "lizard":
                return "Player 1 Won!";
                case "spock":
                return "Player 2 Won!";
            }
        case "paper":
            switch(player2){
                case "scissors":
                return "Player 2 Won!";
                case "rock":
                return "Player 1 Won!";
                case "paper":
                return "Draw!";
                case "lizard":
                return "Player 2 Won!";
                case "spock":
                return "Player 1 Won!";
            }
        case "lizard":
            switch(player2){
                case "scissors":
                return "Player 2 Won!";
                case "rock":
                return "Player 2 Won!";
                case "paper":
                return "Player 1 Won!";
                case "lizard":
                return "Draw!";
                case "spock":
                return "Player 1 Won!";
            }
        case "spock":
            switch(player2){
                case "scissors":
                return "Player 1 Won!";
                case "rock":
                return "Player 1 Won!";
                case "paper":
                return "Player 2 Won!";
                case "lizard":
                return "Player 2 Won!";
                case "spock":
                return "Draw!";
            }
    }
    return "";
  }
}
------------------------------------------------------------------------------------
public class Kata {
  
  public static String rpsls(String player1, String player2){
    if(player1.equals(player2)) return "Draw!";
    if(player1.equals("scissors") && (player2.equals("paper") || player2.equals("lizard"))) return "Player 1 Won!";
    if(player1.equals("paper") && (player2.equals("rock") || player2.equals("spock"))) return "Player 1 Won!";
    if(player1.equals("rock") && (player2.equals("lizard") || player2.equals("scissors"))) return "Player 1 Won!";
    if(player1.equals("lizard") && (player2.equals("spock") || player2.equals("paper"))) return "Player 1 Won!";
    if(player1.equals("spock") && (player2.equals("scissors") || player2.equals("rock"))) return "Player 1 Won!";
    return "Player 2 Won!";
  }
}
--------------------------------------------------------------------
import java.util.List;

public class Kata {

    public static String rpsls(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        }
        List<String> rockBeats = List.of("lizard", "scissors");
        List<String> scissorsBeats = List.of("paper", "lizard");
        List<String> lizardBeats = List.of("spock", "paper");
        List<String> spockBeats = List.of("scissors", "rock");
        List<String> paperBeats = List.of("rock", "spock");

        return switch (player1) {
            case "lizard" -> lizardBeats.contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
            case "paper" -> paperBeats.contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
            case "spock" -> spockBeats.contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
            case "rock" -> rockBeats.contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
            case "scissors" -> scissorsBeats.contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
            default -> "Hello codewars!";
        };
    }
}
-------------------------------------------------------------------------
public class Kata {
  
  public static String rpsls(String player1, String player2){
    String one="spock";
    String two="scissors";
    String tre="paper";
    String fou="rock";
    String fiv="lizard";
    if(player1==player2) return "Draw!";
    else if (player1=="spock"&&player2=="scissors")return "Player 1 Won!";
    else if (player1=="scissors"&&player2==tre)return "Player 1 Won!";
    else if (player1==tre&&player2==fou)return "Player 1 Won!";  
    else if (player1==fou&&player2==two)return "Player 1 Won!";
    else if (player1==fiv&&player2=="spock")return "Player 1 Won!";
    else if (player1=="spock"&&player2==fou)return "Player 1 Won!";
    else if (player1==two&&player2==fiv)return "Player 1 Won!";
    else if (player1==tre&&player2=="spock")return "Player 1 Won!";  
    else if (player1==fou&&player2==fiv)return "Player 1 Won!";
    else if (player1==fiv&&player2==tre)return "Player 1 Won!";
    else return "Player 2 Won!";
  }
}



*/