/* 7KYU CodeWars Scrolling Text

Let's create some scrolling text!

Your task is to complete the function which takes a string, 
and returns an array with all possible rotations of the given string, in uppercase.

Example
scrollingText("codewars") should return:

[ "CODEWARS",
  "ODEWARSC",
  "DEWARSCO",
  "EWARSCOD",
  "WARSCODE",
  "ARSCODEW"
  "RSCODEWA",
  "SCODEWAR" ]

*/
public class ScrollingText {
    public static String[] scrollingText(String text) {
      text = text.toUpperCase();
      String[] result = new String[text.length()];
      for (int i = 1; i < result.length; i++) {
        String a = text.substring(0, i);
        String b = text.substring(i, text.length());
        result[i] = b + a;
      }
      result[0] = text;
      return result;
    }
}
/*-------------------------------------------------------------
public class Kata {
    public static String[] scrollingText(String text) {
        String[] result = new String[text.length()];
        StringBuilder stringBuilder = new StringBuilder(text.toUpperCase());
        for (int i = 0; i < result.length; i++) {
            result[i] = stringBuilder.toString();
            stringBuilder.append(stringBuilder.charAt(0)).deleteCharAt(0);
        }
        return result;
    }
}
---------------------------------------------------------------
public class Kata {
    public static String[] scrollingText(String text) {
        return java.util.stream.IntStream.range(0, text.length())
          .mapToObj(i -> text.substring(i).toUpperCase() + text.substring(0, i).toUpperCase())
          .toArray(String[]::new);
    }
}
---------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static String[] scrollingText(String text) {
        String s = text.toUpperCase();
        return IntStream.range(0, s.length()).mapToObj(i -> s.substring(i) + s.substring(0, i)).toArray(String[]::new);
    }
}
---------------------------------------------------------------
import java.util.*;
public class Kata {
  public static String[] scrollingText(String text) {
    String[] result = new String[text.length()];
    var prev = text.split("");
    result[0] = text.toUpperCase();
    for (var x = 1; x < text.length(); x++){
      var first = prev[0];
      var afterFirst = String.join("",prev).substring(1,prev.length);
      String complete = afterFirst + first;
      prev = complete.split("");
      result[x] = complete.toUpperCase();
    }
    return result;
  }
}
---------------------------------------------------------------
import java.util.stream.Stream;

public class Kata {
  
  public static String[] scrollingText(String text) {
    return Stream.iterate(text.toUpperCase(), Kata::getNext)
                  .limit(text.length())
                  .toArray(String[]::new);
  }
  
  private static String getNext(String source) {
    return source.substring(1) + source.charAt(0);
  }
}
---------------------------------------------------------------
public class Kata {
    public static String[] scrollingText(String text) {
        String[] out = new String[text.length()];
        char[] ch = text.toUpperCase().toCharArray();

        for (int i=0; i<text.length(); i++){
            out[i]="";
            for (int j = 0; j < text.length(); j++) {
                out[i] += ch[j + i+(j+i>=text.length()?-text.length():0)];
            }

        }

        return out;
    }
}
---------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static String[] scrollingText(String text) {
        return IntStream.range(0, text.length())
                .mapToObj(i -> text.substring(i).toUpperCase() + text.substring(0, i).toUpperCase())
                .toArray(String[]::new);
    }
}
*/