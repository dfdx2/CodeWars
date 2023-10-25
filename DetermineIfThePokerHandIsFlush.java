/* 7KYU CodeWars Determine If The Poker Hand Is Flush

Determine if the poker hand is flush, meaning if the five cards 
are of the same suit.

Your function will be passed a list/array of 5 strings, each 
representing a poker card in the format "5H" (5 of hearts), 
meaning the value of the card followed by the initial of its 
suit (Hearts, Spades, Diamonds or Clubs). No jokers included.

Your function should return true if the hand is a flush, 
false otherwise.

The possible card values are 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A

Examples
["AS", "3S", "9S", "KS", "4S"]  ==> true

["AD", "4S", "7H", "KS", "10S"] ==> false

*/

public class Kata{
    public static boolean CheckIfFlush(String[] cards){
      System.out.println(cards[0] + cards[1] + cards[2] + cards[3] + cards[4]);
      int counter = 0;
      char a;
      String c = cards[0];
      if (c.length() > 2) {
        a = cards[0].charAt(2);
      }
      else {
        a = cards[0].charAt(1);
      }
      for (int i = 0; i < cards.length; i++) {
        String y = cards[i];
        if (y.length() > 2) {
          if (y.charAt(2) == a) {
            counter++;
          }
        }
        if (y.length() == 2) {
          if (y.charAt(1) == a) {
            counter++;
          }
        }
      }
      return counter >= 5;
    }
}
/*----------------------------------------------------------------------
import java.util.Arrays;

public class Kata{
  public static boolean CheckIfFlush(String[] cards){
      final char target = cards[0].charAt(cards[0].length()-1);
      return Arrays.stream(cards)
                   .allMatch( s -> s.charAt(s.length()-1) == target );
  }
}
--------------------------------------------------------------------------
public class Kata{
  public static boolean CheckIfFlush(String[] cards) {
    return java.util.Arrays.toString(cards).replaceAll("[^HCSD]","").matches("(.)\\1{4}");
  }
}
---------------------------------------------------------------------------
public class Kata{
 public static boolean CheckIfFlush(String[] cards) {

		char c = ' ';

		if (cards[0].charAt(1) != '0') {
			c = cards[0].charAt(1);
		} else {
			c = cards[0].charAt(2);
		}

		for (int i = 1; i < cards.length; i++) {
			if (cards[i].charAt(1) == '0') {
				if (cards[i].charAt(2) != c) {
					return false;
          }
				} else {
					if (cards[i].charAt(1) != c) {
						return false;
					}
				}
		}
		return true;
}
	}
---------------------------------------------------------------------------
import static java.util.Arrays.stream;

class Kata {
  static boolean CheckIfFlush(String[] cards) {
    return stream(cards).map(s -> s.charAt(s.length() - 1)).distinct().count() == 1;
  }
}
----------------------------------------------------------------------------
public class Kata{
  public static boolean CheckIfFlush(String[] cards){
 int ss = 0, qq=0, kk=0, aa =0;
 for(int i = 0; i<cards.length; i++){
     if( cards[i].contains("S") ) ss++;
     if( cards[i].contains("H") ) qq++;
     if( cards[i].contains("D") ) kk++;
     if( cards[i].contains("C") ) aa++; 
 }
     if (ss==cards.length || qq==cards.length || kk==cards.length || aa==cards.length) return true;
     else return false;
  }
}

*/