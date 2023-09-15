/* 7KYU CodeWars Battle Of The Characters (EASY)

Description:

Groups of characters decided to make a battle. Help them to figure out 
which group is more powerful. Create a function that will accept 2 
strings and return the one who's stronger.

Rules:

Each character have its own power: A = 1, B = 2, ... Y = 25, Z = 26
Strings will consist of uppercase letters only
Only two groups to a fight.
Group whose total power (A + B + C + ...) is bigger wins.
If the powers are equal, it's a tie.

Examples:
      * "ONE", "TWO"  -> "TWO"`
      * "ONE", "NEO"  -> "Tie!"

*/

import java.util.*;
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
      Map<Character, Integer> result = new HashMap<>();
      result.put('A', 1);
      result.put('B', 2);
      result.put('C', 3);
      result.put('D', 4);
      result.put('E', 5);
      result.put('F', 6);
      result.put('G', 7);
      result.put('H', 8);
      result.put('I', 9);
      result.put('J', 10);
      result.put('K', 11);
      result.put('L', 12);
      result.put('M', 13);
      result.put('N', 14);
      result.put('O', 15);
      result.put('P', 16);
      result.put('Q', 17);
      result.put('R', 18);
      result.put('S', 19);
      result.put('T', 20);
      result.put('U', 21);
      result.put('V', 22);
      result.put('W', 23);
      result.put('X', 24);
      result.put('Y', 25);
      result.put('Z', 26);
      int count1 = 0;
      int count2 = 0;
      for (int i = 0; i < x.length(); i++) {
        if (result.containsKey(x.charAt(i))) {
          count1 += result.get(x.charAt(i));
        }
      }
      for (int i = 0; i < y.length(); i++) {
        if (result.containsKey(y.charAt(i))) {
          count2 += result.get(y.charAt(i));
        }
      }
      return count1 == count2 ? "Tie!" : (count1 > count2) ? x : y;
    }
}
/*-----------------------------------------------------------------------------
class BattleOfTheCharacters {
  static String battle(String x, String y) {
    int xs = x.chars().map(i -> i - 64).sum(), ys = y.chars().map((i -> i - 64)).sum();
    return xs > ys ? x : xs < ys ? y : "Tie!";
  }
}
-------------------------------------------------------------------------------
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        int powerA=0;
        int powerB=0;
        for(char a : x.toCharArray())
          powerA+=a-64;
        for(char b : y.toCharArray())
          powerB+=b-64;
        if(powerA==powerB)
          return "Tie!";
        if(powerA>powerB)
          return x;
        else
          return y;
    }
}
------------------------------------------------------------------------------
import java.util.*;

public class BattleOfTheCharacters {
     public static String battle(final String x, final String y) {
        int index = 1;
        int counterX = 0;
        int counterY = 0;
        String result ;
        char [] first = x.toCharArray();
        char [] second = y.toCharArray();
        Map<Character, Integer> alphaMap = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphaMap.put(c, index);
            index++;
        }
        for (char X : first) {
            int c = alphaMap.get(X);
            counterX += c;
        }
        for (char Y: second){
            int b = alphaMap.get(Y);
            counterY += b;
        }
       if(counterX > counterY){
           result = x;
       }else if(counterX < counterY){
           result = y;
        }else result = "Tie!";

       return result;
    }
}
------------------------------------------------------------------------------
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        int offset = 'A' - 1;
        var powerX = x.chars().map(i -> i - offset).sum();
        var powerY = y.chars().map(i -> i - offset).sum();
        return powerX == powerY ? "Tie!" : powerX > powerY ? x : y;
    }
}
----------------------------------------------------------------------------
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
      int sumX = 0;
      int sumY = 0;
      
      for (int i = 0; i < x.length(); i++) {
          sumX = sumX + ((int) x.charAt(i) - 64);
      }
      for (int i = 0; i < y.length(); i++) {
          sumY = sumY + ((int) y.charAt(i) - 64);
      }
        if (sumX == sumY) return "Tie!";
        return sumX > sumY ? x : y;
    }
}
------------------------------------------------------------------------------
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
      int first = toNumber(x);
      int second = toNumber(y);
      if(first > second) return x;
      if(second > first) return y;
      return "Tie!";
    }
  public static int toNumber(String text){
    int result = 0;
    char[] charArray  = text.toLowerCase().toCharArray();
    for(char ch : charArray){
      int temp = (int)ch;
      int temp_integer = 96;
      if(temp<=122 & temp>=97) {
        result += temp-temp_integer;
      }
    }
    return result;
  }
}
----------------------------------------------------------------------------
public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
    int xPower = x.chars().map(c -> c - 64).sum(), yPower = y.chars().map(c -> c - 64).sum();
    return xPower > yPower ? x : xPower < yPower ? y : "Tie!";
    }
}
-----------------------------------------------------------------------------
public class BattleOfTheCharacters {
  
  private static final String TIE = "Tie!";
  
  public static String battle(String first, String second) {
    int one = computePower(first);
    int two = computePower(second);
    return one > two ? first : 
           two > one ? second : TIE;
  }
  
  private static int computePower(String str) {
    return str.chars()
              .filter(Character::isUpperCase)
              .map(ch -> (ch + 1) - 'A')
              .sum();
  }
}
-------------------------------------------------------------------------------
class BattleOfTheCharacters {
    static String battle(String a, String b) {
        int aScore = calculateScore(a);
        int bScore = calculateScore(b);

        if (aScore == bScore) {
            return "Tie!";
        }

        return aScore > bScore ? a : b;
    }

    private static int calculateScore(String str) {
        return str.chars().sum() - (str.length() * 64);
    }
}

*/