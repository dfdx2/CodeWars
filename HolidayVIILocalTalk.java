/*  7KYU CodeWars Holiday VII- Local Talk

In Bali, as far as I can gather, when ex-pats speak to locals, 
they basically insert the word 'Pak' as often as possible. I am 
assured it means something like 'mate' or 'sir' but that could 
be completely wrong.

Anyway, as some basic language education(??) this kata requires 
you to turn any sentence provided (s) into ex-pat balinese waffle 
by inserting the word 'pak' between every other word. Simple 8kyu :D

Pak should not be the first or last word. Strings of just spaces 
should return an empty string.

*/

public class Kata {

  public static String pak(final String s) {
    StringBuilder sb = new StringBuilder();
    String[] result = s.split(" ");
    for (int i = 0; i < result.length - 1; i++) {
      String y = result[i];
      sb.append(y);
      sb.append(" pak ");
    }
    sb.append(result[result.length - 1]);
    return sb.toString();
  } 
}
/*---------------------------------------------------------------------------
class Kata {
    static String pak(final String s) {
        return String.join(" pak ", s.split(" "));
    }
}
-----------------------------------------------------------------------------
public class Kata {

  public static String pak(final String s) {
    // Your code here
    return s.replace(" ", " pak ");
  }
  
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

  public static String pak(final String s) {
    return Arrays.stream(s.split(" ")).collect(Collectors.joining(" pak "));
  }
  
}
--------------------------------------------------------------------------------
import java.util.*;
import static java.util.stream.Collectors.*;

public class Kata {
  public static String pak(final String s) {
    return Arrays.stream(s.split(" "))
                  .collect(joining(" pak "));
  }  
}
-------------------------------------------------------------------------------
public class Kata {

  public static String pak(final String s) {
    if(s.replaceAll(" ", "").length() == 0) {
      return "";
    }
    else {
      return s.replaceAll(" ", " pak ");
      }
  }
  
}
-----------------------------------------------------------------------------
public class Kata {

  public static String pak(final String s) {
    // Your code here
    return s.trim().replaceAll("(\\s)", "$1pak$1");
  }
  
}
--------------------------------------------------------------------------------
public class Kata {

  public static String pak(final String s) {
    String[] str = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length - 1; i++) {
      sb.append(str[i]).append(" ").append("pak").append(" ");
    }
    sb.append(str[str.length - 1]);
    return sb.toString().trim();
  }
  
}
-------------------------------------------------------------------------------
public class Kata {

  public static String pak(String s) {  
    return s.trim().replace(" "," pak ");
    }
}
---------------------------------------------------------------------------------
public class Kata {

  public static String pak(final String s) {
    if (s.length() == 0 || s.isBlank()){
      return "";
    }
    String result = "";
    String[] list = s.split(" ");
    for (String i: list){
      result += i;
      result += " pak ";
    }
    return result.substring(0, result.length() - 4).trim();
  }
}
*/
