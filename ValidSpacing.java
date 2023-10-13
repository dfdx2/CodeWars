/* 7KYU CodeWars Valid Spacing

Task

Your task is to write a function called valid_spacing() or 
validSpacing() which checks if a string has valid spacing. 
The function should return either true or false (or the 
corresponding value in each language).

For this kata, the definition of valid spacing is one space 
between words, and no leading or trailing spaces. Words can 
be any consecutive sequence of non space characters. Below 
are some examples of what the function should return:

*/
public class Kata {
  
  public static boolean validSpacing(String s) {
    if (s.length() < 1) {
        return true;
    }
    if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
      return false;
    }
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
        return false;
      }
    }
    return true;
  }
}
/*-------------------------------------------------------------------------------
public class Kata {
  
  public static boolean validSpacing(String s) {
    // write your code here
    return !(s.startsWith(" ") || s.endsWith(" ") || s.contains("  "));
  }
}
---------------------------------------------------------------------------------
interface Kata {
  static boolean validSpacing(String s) {
    return s.trim().replace("  ", "").equals(s);
  }
}
---------------------------------------------------------------------------------
public class Kata {
  
  public static boolean validSpacing(String s) {
        return s.length() == s.trim().length() && (!s.contains("  "));
    }
}

---------------------------------------------------------------------------------
public class Kata {
  
  public static boolean validSpacing(String s) {
    if (s.equals(s.trim()) && !(s.contains("  "))){
      return true;
    }
    else{
      return false;
    }
  }
}
---------------------------------------------------------------------------------
public class Kata {  
  public static boolean validSpacing(String source) {
    return source.matches("\\w?|^\\S+(\\s\\S+)*\\s?\\S+$");
  }
}

----------------------------------------------------------------------------------
interface Kata {
  static boolean validSpacing(String s) {
    return !s.startsWith(" ") && !s.endsWith(" ") && !s.contains("  ");
  }
}

----------------------------------------------------------------------------------
public class Kata {
  
  public static boolean validSpacing(String s) {
    if(s.contains("  "))return false;
    if(s.length() == 0)return true;
    if(s.substring(0, 1).equals(" ") || s.substring(s.length()-1, s.length()).equals(" "))return false;
    return true;
  }
}
---------------------------------------------------------------------------------
*/