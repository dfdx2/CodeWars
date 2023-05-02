/* 7KYU CodeWars String Ends With?

Complete the solution so that it returns true if the first argument(string) 
passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false

*/

public class Kata {
    public static boolean solution(String str, String ending) {
      return str.endsWith(ending);
    }
}
/*----------------------------------------------------------------------------
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.length() >= ending.length() ? 
    str.substring(str.length()-ending.length()).equals(ending) : false;

  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static boolean solution(String str, String ending) {
    char[] strung = str.toCharArray(), out = ending.toCharArray();
    if (out.length>strung.length) return false;
    for (int i=0; i<(out.length); i++)
      if (strung[(strung.length-1)-i]!=out[(out.length-1)-i])
        return false;
    return true;
  }
}
-------------------------------------------------------------------------------
public class Kata {
  public static boolean solution(String str, String ending) {
  if(str.length()<ending.length())
  {
  return false;
  }
 // if(str.length() < ending.length())
  int c = str.length()-1;
    for(int i=ending.length()-1;i>=0;i--)
    {
      char result1 = ending.charAt(i);
      char result2 = str.charAt(c--);
      if(result1==result2)
      {
        
      }
      else
      {
        return false;
      }
    }
    return true;
  } 
}
---------------------------------------------------------------------------------
public class Kata {
  public static boolean solution(String start, String end){
        return (start.length()>=end.length()) ? start.substring(start.length()-end.length()).equals(end) : false;
    }
}
---------------------------------------------------------------------------------
public class Kata {
  public static boolean solution(String str, String ending) {
    // if "ending" is longer than "str", returns false
    if (str.length() < ending.length()) {
      return false;
    }
    
    // if "ending" is empty, returns true
    if (ending.length() == 0) {
      return true;
    }
    
    
    // index of last character
    int indexStr = str.length()-1;
    int indexEnding = ending.length()-1;
    
    // Each character is checked one by one
    // If they are different, return false
    for (int i = 0; i < ending.length(); i++) {
      if (ending.charAt(indexEnding) != str.charAt(indexStr)) {
        return false;
      }
      indexEnding--;
      indexStr--;
    }
    
    // Finally, returns true
    return true;
  }
}
---------------------------------------------------------------------------
public class StringEndsWith {
  public static boolean solution(String party, String afterparty) {
    char S1 = party.charAt(party.length() - 1);
    char S2 = party.charAt(afterparty.length() - 1);
    if (S1 == S2) {
      return true;
      }
     
    else
      {
       return false;
      }
    }



*/