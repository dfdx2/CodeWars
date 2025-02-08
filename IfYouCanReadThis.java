/* 6KYU CodeWars If You Can Read This...

Task
You'll have to translate a string to Pilot's alphabet (NATO phonetic alphabet).

Input:

If, you can read?

Output:

India Foxtrot , Yankee Oscar Uniform Charlie Alfa November Romeo Echo Alfa Delta ?

Note:

There is a preloaded dictionary that you can use, named NATO. It uses uppercase keys, 
e.g. NATO['A'] is "Alfa". See comments in the initial code to see how to access it 
in your language.

The set of used punctuation is ,.!?.

Punctuation should be kept in your return string, but spaces should not.

Xray should not have a dash within.

Every word and punctuation mark should be seperated by a space ' '.

There should be no trailing whitespace

*/
import java.util.*;
public class IfYouCanReadThis {
    public static String toNATO (String str) {
// You can use Helper.NATO, of type: Map<Character, String>
// usage: Helper.NATO.get('A') returns "Alfa", etc.
      StringBuilder sb = new StringBuilder();
      str = str.toUpperCase();
      for (char a : str.toCharArray()) {
        if (a == '.' || a == ',' || a == '!' || a == '?') {
          sb.append(a);
          sb.append(" ");
        }
        else if (a == ' ') {
          continue;
        }
        else {
          sb.append(Helper.NATO.get(a));
          sb.append(" ");
        }
      }
      return sb.toString().trim();
    }
}
/*-----------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

public class Kata {
    public static String toNATO (String string) {
        return string.toUpperCase()
          .replaceAll(" ", "")
          .chars()
          .mapToObj(ch -> Helper.NATO.getOrDefault((char) ch, (char) ch + ""))
          .collect(joining(" "));
    }
}
-------------------------------------------------------------------------
public class Kata {
    public static String toNATO (String string) {
      StringBuilder sb = new StringBuilder();
      
      for(char c: string.toUpperCase().toCharArray()){
        if(Character.isLetter(c)) sb.append(Helper.NATO.get(c)+" ");
        else if(c != ' ') sb.append(c+" ");
      }
      
      String result = sb.toString();

      return result.endsWith(" ")? result.substring(0, sb.length()-1) : result;
    }
}
-------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
    public static String toNATO (String string) {
        return Arrays.stream(string.replaceAll(" ", "").split("")).map(s -> s.matches("[a-zA-Z]") ? Helper.NATO.get(s.toUpperCase().charAt(0)) : s).collect(Collectors.joining(" "));
    }
}
-------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.*;

public class Kata {
    public static String toNATO (String string) {
// You can use Helper.NATO, of type: Map<Character, String>
// usage: Helper.NATO.get('A') returns "Alfa", etc.
        return string.toUpperCase().chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> Helper.NATO.containsKey((char) c) ? Helper.NATO.get((char) c) : String.valueOf((char) c))
                .collect(Collectors.joining(" "));
    }
}
-------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

interface Kata {
  static String toNATO(String string) {
    return string.replace(" ", "").toUpperCase().chars()
        .mapToObj(c -> Helper.NATO.getOrDefault((char) c, (char) c + "")).collect(joining(" "));
  }
}
*/