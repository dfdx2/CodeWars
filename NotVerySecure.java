/* 5KYU CodeWars Not Very Secure


In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore

*/

public class SecureTester{
  
  public static boolean alphanumeric(String s){
    if (s.length() < 1) {
      return false;
    }
    String x = s.replaceAll("[^a-zA-Z0-9]","");
    return s.length() == x.length();
  }
}
/*--------------------------------------------------------------------------
public class SecureTester {
  public static boolean alphanumeric(String s) {
    return s.matches("[A-Za-z0-9]+");
  }
}
----------------------------------------------------------------------------
public class SecureTester{
  
  public static boolean alphanumeric(String s){
      if (s.isEmpty()) return false;

        char [] alphanumerics = s.toCharArray();

        for (char x: alphanumerics) {
            if( (x < 48 || x > 57 ) && (x < 65 || x > 90) && (x < 97 || x > 122)) return false;
        }
        
        return true;
  }

}
-----------------------------------------------------------------------------
public class SecureTester{
  
  public static boolean alphanumeric(String s){
    if (s == null) return false;
        
        if (!s.equals(s.replaceAll("[^a-zA-Z0-9]", "")) || s.isEmpty()){
            return false;
        }

        return true;
  }

}
---------------------------------------------------------------------------
public class SecureTester{
  
  public static boolean alphanumeric(String s){
    return s.equals("") ? false : (s.replaceAll("[a-zA-Z0-9]*", "").length()==0 ? true : false);
  }
}




*/