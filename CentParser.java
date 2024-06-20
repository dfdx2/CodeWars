/* 7KYU CodeWars Regexp basics - parsing prices

Implement String#to_cents, which should parse prices 
expressed as $1.23 and return number of cents, or in 
case of bad format return nil.

*/

import java.util.*;
public class CentParser {

  public static Integer toCents(String price) {
    if (price.length() < 1) {
      return null;
    }
    if (price.charAt(0) == '.') {
      return null;
    }
    if (price.contains("\n") || price.charAt(0) != '$' || !price.contains(".")) {
      return null;
    } 
    if (price.charAt(price.length()-3) != '.') {
      return null;
    }
    if (price.contains("S") || price.contains("f") || price.contains("..") || price.contains("$$")) {
      return null;
    }
    price = price.replaceAll("[^1234567890]", "");
    if (price.charAt(0) == '0') {
      price = price.replace("0", "");
    }
    return Integer.valueOf(price);
  }
  
}
/*-----------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CentParser {

  public static Integer toCents(String price) {
    if (price == null) {
        return null;
    }
    Pattern p = Pattern.compile("^\\$\\d+\\.\\d{2}$");
    if (!p.matcher(price).matches()) {
        return null;
    }
    return Integer.parseInt(price.replaceAll("[$.]", ""));
  }
  
}

-------------------------------------------------------------
class CentParser {
  static Integer toCents(String price) {
    return price.matches("\\$\\d+\\.\\d{2}") ? Integer.parseInt(price.replaceAll("[$.]", "")) : null;
  }
}
-------------------------------------------------------------
public class CentParser {
  public static Integer toCents(String price) {
    if (price.matches("^\\$\\d+\\.\\d{2}$")) {
      String text = price.substring(1);
      return (int) Math.round((100 * Double.parseDouble(text)));
    }
    return null;
  }
}
-------------------------------------------------------------
public class CentParser {

  public static Integer toCents(String price) {
    return price.matches("\\$\\d+\\.\\d\\d$") ? Integer.valueOf(price.replaceAll("[$.]","")) : null;
  }
  
}
-------------------------------------------------------------
public class CentParser {
  public static Integer toCents(String price) {
    try {
      if (!price.contains(".") || price.substring(price.indexOf(".")+1,price.length()).length() != 2 || price.contains("\n") ||
          price.contains("..") || price.contains("$$") || !price.substring(0,1).contains("$")){
        return null;
      }
      return (int)Math.round(Double.valueOf(price.replace("$",""))*100);
    }
    catch (Exception e){
      return null;
    }
  }
}
--------------------------------------------------------------
public class CentParser {
    public static Integer toCents(String price) {
        if(price.matches("\\$\\d*.\\d\\d"))
            return Integer.parseInt(price.replaceAll("[$.]", ""));
        return null;
    } 
}
--------------------------------------------------------------
public class CentParser {
    public static Integer toCents(String price) {
      int n = price.length();
        if(price.matches("\\$\\d*.\\d\\d")) 
            return Integer.valueOf(price.substring(1, n - 3)) * 100 + Integer.valueOf(price.substring(n - 2));
        return null;
    }
}
---------------------------------------------------------------
public class CentParser {

  public static Integer toCents(String price) {
    if(price == null) return null;
    if(price.matches("^\\$[0-9]+\\.[0-9]{2}$")){
      return Integer.parseInt(price.replaceAll("^\\$([0-9]+)\\.([0-9]{2})$","$1$2"));
    }else{return null;}
    
  }
  
}
--------------------------------------------------------------
public class CentParser {

  public static Integer toCents(String price) {
    // your code here
    return (price.matches("\\$\\d+\\.\\d{2}")) ? Integer.parseInt(price.replaceAll("\\D", "")) : null;
  }
  
}
--------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CentParser {

  public static Integer toCents(String price) {
    String regex = "^\\${1}(\\d+)\\.(\\d{2})\\z$";
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(price);
    if(mat.find()) {
      String num = mat.group(1) + mat.group(2);
      System.out.println(num);
      return Integer.valueOf(num);
    }
    return null;
  }
  
}

*/