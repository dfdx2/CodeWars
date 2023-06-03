/* 6KYU CodeWars Simple Card Game

Steve and Josh are bored and want to play something. They don't want 
to think too much, so they come up with a really simple game. Write a 
function called winner and figure out who is going to win.

They are dealt the same number of cards. They both flip the card on the 
top of their deck. Whoever has a card with higher value wins the round and 
gets one point (if the cards are of the same value, neither of them gets a 
point). After this, the two cards are discarded and they flip another card 
from the top of their deck. They do this until they have no cards left.

deckSteve and deckJosh are arrays representing their decks. They are filled 
with cards, represented by a single character. The card rank is as follows 
(from lowest to highest):

'2','3','4','5','6','7','8','9','T','J','Q','K','A'
Every card may appear in the deck more than once. Figure out who is going to 
win and return who wins and with what score:

"Steve wins x to y" if Steve wins; where x is Steve's score, y is Josh's score;
"Josh wins x to y" if Josh wins; where x is Josh's score, y is Steve's score;
"Tie" if the score is tied at the end of the game.

Example
Steve is dealt: ['A','7','8']
Josh is dealt: ['K','5','9']
In the first round, ace beats king and Steve gets one point.
In the second round, 7 beats 5 and Steve gets his second point.
In the third round, 9 beats 8 and Josh gets one point.
So you should return: "Steve wins 2 to 1"

*/

public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {
      String cards = "23456789TJQKA";
      int Steve = 0;
      int Josh = 0;
      for (int i = 0; i < deckSteve.length; i++) {
        if (cards.indexOf(deckSteve[i].charAt(0)) > cards.indexOf(deckJosh[i].charAt(0))) {
          Steve++;
        }
        else if (cards.indexOf(deckSteve[i].charAt(0)) < cards.indexOf(deckJosh[i].charAt(0))) {
          Josh++;
        }
      }
      if (Steve != Josh) {
        return String.format("%s wins %d to %d"
                            , Steve > Josh ? "Steve" : "Josh" 
                            , Integer.max(Steve, Josh) 
                            , Integer.min(Steve, Josh));
      }
      return "Tie";
    }
  }
/*---------------------------------------------------------------------
public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
    int scoreSteve = 0,
      scoreJosh = 0;
  
    for (int i = 0; i < deckSteve.length; ++ i) {
      int cardSteve = getCardValue(deckSteve[i]);
      int cardJosh = getCardValue(deckJosh[i]);
      if (cardSteve > cardJosh) {
        ++ scoreSteve;
      } else if (cardSteve < cardJosh) {
        ++ scoreJosh;
      }
    }
      
    if (scoreSteve == scoreJosh) {
      return "Tie";
    } else if (scoreSteve > scoreJosh) {
      return "Steve wins " + scoreSteve + " to " + scoreJosh;
    } else  {
      return "Josh wins " + scoreJosh + " to " + scoreSteve;
    }
  }
  
  private int getCardValue(String card) {
    switch (card) {
      case "T": return 10;
      case "J": return 11;
      case "Q": return 12;
      case "K": return 13;
      case "A": return 14;
      default:
        return Integer.parseInt(card);
    }
  }
}
--------------------------------------------------------------------------------
public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
    String cards = "23456789TJQKA";
    int sSteve = 0;
    int sJosh = 0;
    for (int i = 0; i < deckSteve.length; i++) {
      int winner = cards.indexOf(deckSteve[i]) - cards.indexOf(deckJosh[i]);
      sSteve += winner > 0 ? 1 : 0;
      sJosh += winner < 0 ? 1 : 0;
    }    
    
    return (sSteve > sJosh) ? "Steve wins " + sSteve + " to " + sJosh :
           (sJosh > sSteve) ? "Josh wins " + sJosh + " to " + sSteve :
           "Tie";
  }
}
------------------------------------------------------------------------------
import java.util.*;

public class Game {
  private HashMap<String, Integer> map;
  
  public Game() {
    map = new HashMap<String, Integer>();
    map.put("2", 2);
    map.put("3", 3);
    map.put("4", 4);
    map.put("5", 5);
    map.put("6", 6);
    map.put("7", 7);
    map.put("8", 8);
    map.put("9", 9);
    map.put("T", 10);
    map.put("J", 11);
    map.put("Q", 12);
    map.put("K", 13);
    map.put("A", 14);
  }

  public String winner(String[] deckSteve, String[] deckJosh) {
    int x = 0, y = 0;
    
    for (int i = 0; i < deckSteve.length; i++) {
      int cardSteve = map.get(deckSteve[i]), cardJosh = map.get(deckJosh[i]);
      if (cardSteve > cardJosh) x++;
      else if (cardSteve < cardJosh) y++;
    }
    return x > y ? String.format("Steve wins %d to %d", x, y) : 
           x < y ? String.format("Josh wins %d to %d", y, x) :"Tie";
  }
}


*/