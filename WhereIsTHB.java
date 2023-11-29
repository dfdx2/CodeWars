/* 7KYU CodeWars Where Is THB

Help! THB has gone missing, and we need you to find him! You will 
be given a string, and must return a string including only the t's, 
h's, and b's from the original string. Include both uppercase and 
lowercase.

Remember, you should return an empty string if you are given an 
empty string or a null string. Good luck!

*/
public class THB {
    public static String testing(String initial) {
        if (initial == null) {
        return "";
      }
      if (initial.length()  == 0) {
        return "";
      }
      return initial.replaceAll("[^thbTHB]", "");
    }
  } 
/*------------------------------------------------------------------------------
class THB {
    static String testing(final String initial) {
        if (initial == null) {
            return "";
        }
        return initial.replaceAll("[^TBHtbh]", "");
    }
} 
--------------------------------------------------------------------------------
public class THB {
  public static String testing(String initial) {
    return initial == null ? "" : initial.replaceAll("(?i)[^thb]","");    
  }
}  
---------------------------------------------------------------------------------
class THB {
  static String testing(String initial) {
    return initial != null ? initial.replaceAll("[^tThHbB]", "") : "";
  }
}
--------------------------------------------------------------------------------
public class THB {
  public static String testing(String initial) {
    if (initial == null || initial.equals("")){
      return "";
    }
    String result = "";
    String[] list = initial.split("");
    for (String i: list){
      if (i.equals("t")){
        result += "t";
      }
      else if (i.equals("h")){
        result += "h";
      }
      else if (i.equals("b")){
        result += "b";
      }
      else if (i.equals("T")){
        result += "T";
      }
      else if (i.equals("H")){
        result += "H";
      }
      else if (i.equals("B")){
        result += "B";
      }
    }
    return result;
  }
}  
--------------------------------------------------------------------------------
public class THB {
   public static String testing(String initial) {
        if (initial == null) return "";
        StringBuilder builder = new StringBuilder();
        for (char ch : initial.toCharArray()) {
            if (Character.toLowerCase(ch) == 't') builder.append(ch);
            if (Character.toLowerCase(ch) == 'h') builder.append(ch);
            if (Character.toLowerCase(ch) == 'b') builder.append(ch);
        }

        return builder.toString();
    }
}  
--------------------------------------------------------------------------------
public class THB {
  public static String testing(String initial) {
    String pour = "";
    if(initial == null || initial == "")
        return pour;
    for(int i = 0; i < initial.length(); i++){
      
      if(initial.charAt(i) == 't' || initial.charAt(i) == 'T' || initial.charAt(i) == 'h' || initial.charAt(i) == 'H' || initial.charAt(i) == 'b' || initial.charAt(i) == 'B')
          pour+=initial.charAt(i);

    }
   
    
    return pour;
    
  }
}  
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class THB {
  public static String testing(String initial) {
        if(initial == null) return "";
        return Arrays.stream(initial.split(""))
                .filter(x -> "THBthb".contains(x))
                .collect(Collectors.joining(""));
  }
}  
---------------------------------------------------------------------------------
import java.util.stream.*;

public class THB {
    public static String testing(final String initial) {
        if(initial == null) return "";
        return initial.codePoints()
                      .filter(c -> c == 't' || c == 'b' || c == 'h' || c == 'T' || c == 'B' || c =='H')
                      .mapToObj(tbh -> (char)tbh + "")
                      .collect(Collectors.joining());
    }
} 
--------------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class THB {
  public static String testing(String initial) {
    if (initial == null || initial.isEmpty()) {
      return "";
    }
    Pattern pattern = Pattern.compile("(?i)[thb]+");
    Matcher match = pattern.matcher(initial);
    StringBuilder sb = new StringBuilder();
    while (match.find()) {
      match.start();
      sb.append(match.group());
    }
    return sb.toString();
  }
}  

*/