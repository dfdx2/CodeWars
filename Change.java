/* 7KYU CodeWars Ch4113ng3

Make your strings more nerdy: Replace all 'a'/'A' with 4, 
'e'/'E' with 3 and 'l' with 1 e.g. 
"Fundamentals" --> "Fund4m3nt41s"

*/

class Nerd {
  public static String nerdify(String txt){
    txt = txt.replaceAll("a", "4");
    txt = txt.replaceAll("e", "3");
    txt = txt.replaceAll("A", "4");
    txt = txt.replaceAll("E", "3");
    txt = txt.replaceAll("l", "1");
    return txt;
  }
}
/*------------------------------------------------------------------------------
class Nerd {
  public static String nerdify(String txt){
  
    return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
  }
}
--------------------------------------------------------------------------------
class Nerd {
  public static String nerdify(String txt){
    String[] lst = txt.split("");
    String result = "";
    for (String i: lst){
      if (i.equals("a") || i.equals("A")){
        result += "4";
      }
      else if (i.equals("e") || i.equals("E")){
        result += "3";
      }
      else if (i.equals("l")){
        result += "1";
      }
      else{
        result += i;
      }
    }
    return result;
  }
}
---------------------------------------------------------------------------------------
class Nerd {
  public static String nerdify(String txt){
        char[] chars = txt.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'a':
                case 'A':
                    chars[i] = '4';
                    continue;
                case 'e':
                case 'E':
                    chars[i] = '3';
                    continue;
                case 'l':
                    chars[i] = '1';
                    continue;
                default:
            }
        }
        return new String(chars);
  }
}
----------------------------------------------------------------------------------------
class Nerd {
  public static String nerdify(String txt) {
    return txt.replace("l", "1")
              .replaceAll("(?i)a", "4")
              .replaceAll("(?i)e", "3");              
  }
}
---------------------------------------------------------------------------------------
import javax.management.StringValueExp;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Nerd {
  public static String nerdify(String txt){
    return txt
                .chars()
                .mapToObj(i -> (char) i)
                .map(i -> Character.toLowerCase(Character.valueOf(i)) ==   'a' ? '4' : Character.toLowerCase(Character.valueOf(i)) == 'e' ? '3' : i == 'l' ? '1' : i)
                .map(character -> String.valueOf(character))
                .collect(Collectors.joining());
  }
}
---------------------------------------------------------------------------------------


*/