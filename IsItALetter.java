/* 7KYU CodeWars Regex Basics Is It A Letter

Complete the code which should return true if the given object is 
a single ASCII letter (lower or upper case), false otherwise.

*/

public class StringUtils {
  
  public static boolean isLetter(String s) {
    s = s.replaceAll("[^a-zA-Z]","?");
    return s.length() == 1 && !s.contains("?");
  }
}
/*-----------------------------------------------------------------------------------
public class StringUtils {
  public static boolean isLetter(String s) {
    return s.matches("[a-zA-Z]");
  }
}
----------------------------------------------------------------------------------
public class StringUtils {
  
  public static boolean isLetter(String s) {
    return s != null && s.matches("[a-zA-Z]");
  }
}
------------------------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringUtils {

  public static boolean isLetter(String s) {
    String reg = "^[a-zA-Z]$";
    Pattern p = Pattern.compile(reg);
    Matcher m = p.matcher(s);
    boolean b = m.matches();
    return b;
  }
}

*/