/* 7KYU CodeWars Cyrillic Letters

Cyrillic letters, used in languages like Russian and Ukrainian, 
have different unicode values than Latin letters. 2 of those 
cyrillic letters include а and у which, if you copy these 2, 
are not the same as the latin a and y

Task

Your task is to write a function that returns whether a given 
string is a Cyrillic letter in the Cyrillic Unicode Block.

The string will always be a single letter.


Examples

Input: "D"
Output: false (or False in Python or your language's equivalent)

Input: "Я"
Output: true (or True in Python or your language's equivalent)

*/
public class CyrillicLetters {
    public static boolean isCyrillic(char letter) {
      int start = 0x0400;
      int end = 0x04FF;
      for (int i = start; i <= end; i++) {
        if ((char) i == letter) {
          return true;
        }
      }
      return false;
    }
}
/*----------------------------------------------------------------------------
import static java.lang.Character.UnicodeBlock.*;

interface Kata {
  static boolean isCyrillic(char letter) {
    return of(letter).equals(CYRILLIC);
  }
}
------------------------------------------------------------------------------
public class Kata {
    public static boolean isCyrillic(char letter) {
      return 1023<letter && letter<1280;
    }
}
------------------------------------------------------------------------------
interface Kata {
  static boolean isCyrillic(char letter) {
    return letter > 'Ͽ' && letter < 'Ԁ';
  }
}
------------------------------------------------------------------------------
public class Kata {

  public static boolean isCyrillic(char letter) {
    return 1024 <= letter && letter <= 1279;
  }

}
------------------------------------------------------------------------------
import java.util.regex.Pattern;
public class Kata {
    public static boolean isCyrillic(char letter) {
        String regex = "[\\u0400-\\u04FF]";
        return Pattern.matches(regex, String.valueOf(letter));
    }
}
------------------------------------------------------------------------------
public class Kata {
    public static boolean isCyrillic(char letter) {
        return Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.CYRILLIC);
    }
}    
*/