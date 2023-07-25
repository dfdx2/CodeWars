/* 8KYU CodeWars Simple Validation Of a Username With Regex

Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).

*/

public class ZywOo {
  public static boolean validateUsr(String s) {
    s = s.replaceAll("[^a-z0-9_]", "?");
    return s.length() >= 4 && s.length() <= 16 && !s.contains("?");
  }
}
/*-----------------------------------------------------------------
public class ZywOo {
  public static boolean validateUsr(String s) {
    return s.matches("[a-z_\\d]{4,16}");
  }
}
-------------------------------------------------------------------
import java.util.regex.Pattern;
public class ZywOo {
  private static final Pattern usernamePattern = Pattern.compile(
  "[a-z0-9_]{4,16}");
  public static boolean validateUsr(String s) {
    return usernamePattern.matcher(s).matches();
  }
}
--------------------------------------------------------------------
public class ZywOo {
  public static boolean validateUsr(String s) {
    if (s.length() < 4 || s.length() > 16) return false;
    if (!s.toLowerCase().equals(s)) return false;
    char[] c = s.toCharArray();
    for (char cs : c){
      if (Character.isJavaIdentifierPart(cs)) continue;
      return false;
    }
    return true;
  }
}
------------------------------------------------------------------------------
public class ZywOo {
  public static boolean validateUsr(String s) {
    if (s.length() >=4 && s.length()<=16)  {   
       s=s.replaceAll("[a-z]" , "").replaceAll("[0-9]", "").replace("_" , ""); 
    }
    else return false;  
    return s.length()==0 ? true : false; 
    }
  }





*/