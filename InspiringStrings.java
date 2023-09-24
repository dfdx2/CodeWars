/* 7KYU CodeWars Inspiring Strings

When given a string of space separated words, return the word 
with the longest length. If there are multiple words with the 
longest length, return the last instance of the word with the 
longest length.

Example:

'red white blue' //returns string value of white

'red blue gold' //returns gold

*/

public class Kata {
  public static String longestWord(String wordString) {
    String[] result = wordString.split(" ");
    String x = "";
    for (int i = 0; i < result.length; i++) {
      String y = result[i];
      if (y.length() >= x.length()) {
        x = y;
      }
    }
    return x;
  }
}
/*-----------------------------------------------------------------------------
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Kata {
  public static String longestWord(String wordString) {
    // Give me back the longest word!
     return Arrays.stream(wordString.split(" "))
                .reduce((s, s2) -> s.length() > s2.length() ? s : s2)
                .get();
  }
}
-----------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static String longestWord(String words) {
    return Arrays.stream(words.split(" "))
          .reduce((x, y) -> x.length() <= y.length() ? y : x).get();
  }
}
--------------------------------------------------------------------------------
public class Kata {
  public static String longestWord(String wordString) {
    String result = "";
    String[] list = wordString.split(" ");
    for (String i: list){
      if (i.length() >= result.length()){
        result = i;
      }
    }
    return result;
  }
}
----------------------------------------------------------------------------
public class Kata {
  public static String longestWord(String wordString) {
    return java.util.Arrays.stream(wordString.split(" ")).reduce((x,y) -> x.length()>y.length()?x:y).get();
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;

class Kata {
  public static String longestWord(String wordString) {
     return Arrays.stream(wordString.split(" "))
                .reduce((s1, s2) -> s2.length() >= s1.length() ? s2 : s1)
                .get();
  }
}

*/