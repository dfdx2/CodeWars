/* 7KYU CodeWars ANTISTRING

given an input string str, return a string such that

All letters change case
All digits are replaced with it's compliment to 9 (0 => 9, 1 => 8...)
Each letter is replaced by it's compliment in the alphabet (a => z, B => Y, c => x...)
The result is reversed
Example:
"abcWXY123" => "678bcdXYZ"
Only strings with letters and numbers will be passed in.

*/

import java.util.*;
public class JomoPipi{
    public static String antiString(String str){
      Map<String, String> map = new HashMap<>();
      map.put("a", "Z");
      map.put("b", "Y");
      map.put("c", "X");
      map.put("d", "W");
      map.put("e", "V");
      map.put("f", "U");
      map.put("g", "T");
      map.put("h", "S");
      map.put("i", "R");
      map.put("j", "Q");
      map.put("k", "P");
      map.put("l", "O");
      map.put("m", "N");
      map.put("n", "M");
      map.put("o", "L");
      map.put("p", "K");
      map.put("q", "J");
      map.put("r", "I");
      map.put("s", "H");
      map.put("t", "G");
      map.put("u", "F");
      map.put("v", "E");
      map.put("w", "D");
      map.put("x", "C");
      map.put("y", "B");
      map.put("z", "A");
      map.put("A", "z");
      map.put("B", "y");
      map.put("C", "x");
      map.put("D", "w");
      map.put("E", "v");
      map.put("F", "u");
      map.put("G", "t");
      map.put("H", "s");
      map.put("I", "r");
      map.put("J", "q");
      map.put("K", "p");
      map.put("L", "o");
      map.put("M", "n");
      map.put("N", "m");
      map.put("O", "l");
      map.put("P", "k");
      map.put("Q", "j");
      map.put("R", "i");
      map.put("S", "h");
      map.put("T", "g");
      map.put("U", "f");
      map.put("V", "e");
      map.put("W", "d");
      map.put("X", "c");
      map.put("Y", "b");
      map.put("Z", "a");
      map.put("0", "9");
      map.put("1", "8");
      map.put("2", "7");
      map.put("3", "6");
      map.put("4", "5");
      map.put("5", "4");
      map.put("6", "3");
      map.put("7", "2");
      map.put("8", "1");
      map.put("9", "0");
      String a = "";
      StringBuilder sb = new StringBuilder();
      for (int i = str.length() - 1; i >= 0; i--) {
        a += str.charAt(i);
        sb.append(map.get(a));
        a = "";
      }
      return sb.toString();
    }
}
/*-------------------------------------------------------------------------
public class JomoPipi{
    
    public static String antiString(String str){
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) 
            sb.append( (char) (c<'A' ? ('9'+'0'-c) : ('z'+'A'-c)) );
        return sb.reverse().toString();
    }
}
---------------------------------------------------------------------------
public class JomoPipi {

    final static String lookup = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    final static String pukool = "9876543210zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";
    
    public static String antiString(String s){
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            sb.append(pukool.charAt(lookup.indexOf(c)));
        }
        return sb.reverse().toString();
    }
}
---------------------------------------------------------------------------
import java.util.stream.Collectors;

public class JomoPipi{

    public static String antiString(String str){
        return new StringBuilder(str).reverse()
                                     .toString()
                                     .chars()
                                     .map(i -> Character.isLowerCase(i) ? 'Z'+'A'- Character.toUpperCase(i) :
                                               Character.isUpperCase(i) ? 'z'+'a'- Character.toLowerCase(i) :
                                               '9' + '0' - i)
                                     .mapToObj(i -> String.valueOf((char)i))
                                     .collect(Collectors.joining());                                       
    }
}
----------------------------------------------------------------------------
class JomoPipi {
  static String antiString(String str) {
    return str.chars()
        .map(c -> (char) ((c < 'A' ? 105 : 187) - c))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .reverse().toString();
  }
}
---------------------------------------------------------------------------
class JomoPipi{
    static String antiString(final String str) {
        final StringBuilder sb = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) ('z' - Character.toLowerCase(ch) + 'a');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ('Z' - Character.toUpperCase(ch) + 'A');
            } else {
                ch = (char) ('9' - ch + '0');    
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
---------------------------------------------------------------------------
public class JomoPipi {
  public static String antiString(String s) {
    return new String(s
      .chars()
      .map(c -> c + 32 * (c >= 65 && c < 91 ? 1 : c >= 97 && c < 123 ? -1 : 0)) // All letters change case
      .map(c -> c >= 48 && c < 58 ? 105 - c : c) // All digits replaced with complement to 9
      .map(c -> c >= 65 && c < 91 ? 155 - c : c >= 97 && c < 123 ? 219 - c : c) // Each letter replaced by complement in alphabet position (case-insensitive)
      .boxed()
      .sorted((a, b) -> -1) // The string is reversed
      .mapToInt(Integer::intValue)
      .toArray(), 0, s.length());
  }
}
*/