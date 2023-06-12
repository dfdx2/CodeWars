/* 7KYU CodeWars Regexp Basics - Is It A Vowel

Implement the function which should return true if given object 
is a vowel (meaning a, e, i, o, u, uppercase or lowercase), and 
false otherwise.

*/
public class StringUtils {
  
  public static boolean isVowel(String s) {
    return s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U");    
  }
}
/*---------------------------------------------------------------------------
public class StringUtils {
  public static boolean isVowel(String s) {
    return s.matches("[aeiouAEIOU]");
  }
}
-----------------------------------------------------------------------------
class StringUtils {
  static boolean isVowel(String s) {
    return s.toLowerCase().matches("a|e|i|o|u");
  }
}
----------------------------------------------------------------------------
public class StringUtils {
  
  public static boolean isVowel(String s) {
    
    return s.matches("[AEIOUaeiou]");
  }
}
----------------------------------------------------------------------------
public class StringUtils {

  public static boolean isVowel(final String s) {
    return s.length() == 1 && s.matches("[AEIOUaeiou]");
  }
}

*/