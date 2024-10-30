/* 7KYU CodeWars All Unique

Write a program to determine if a string contains only unique characters. 
Return true if it does and false otherwise.

The string may contain any of the 128 ASCII characters. Characters 
are case-sensitive, e.g. 'a' and 'A' are considered different characters.

*/
import java.util.*;
public class AllUnique {
    public static boolean hasUniqueChars(String str) {
      Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
        if (!map.containsKey(str.charAt(i))) {
          map.put(str.charAt(i), 1);
        }
        else {
          return false;
        }
      }
      return true;
    }
}
/*-----------------------------------------------------------------------
import java.util.HashMap;
import java.util.*;
public class Kata {
    public static boolean hasUniqueChars(String str) {

      Map<Character, Integer> result = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
        Character ch = str.charAt(i);
        if (!result.containsKey(ch)) {
          result.put(ch, 1);
        }
        else {
          int total = result.get(ch);
          result.put(ch, total + 1);
        }
      }
      for (int i = 0; i < str.length(); i++) {
        Character c = str.charAt(i);
        if (result.get(c) > 1) {
          return false;
        }
      }
      return true;
    }
}
--------------------------------------------------------------------------
public class Kata {
    public static boolean hasUniqueChars(String s) {
      return s.chars().distinct().count() == s.length();
    }
}
---------------------------------------------------------------------------
import java.util.Set;
import java.util.HashSet;
public class Kata {
  public static boolean hasUniqueChars(String str) {
    Set<Character> set = new HashSet<>();
    for(char c : str.toCharArray())
      if(set.contains(c))
        return false;
      else set.add(c);
    return true;
  }
}
--------------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static boolean hasUniqueChars(String s) { 
       return s.length()==new HashSet(Arrays.asList(s.split(""))).size();
    }
}
----------------------------------------------------------------------------
import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.Arrays;

public class Kata {
    public static boolean hasUniqueChars(String str) {
      char[] charStr = str.toCharArray();
      Set<Character> characters = new HashSet<>();
      for (char c : charStr) {
        characters.add(c);
      }
      if (charStr.length == characters.size()) {
        return true;
      }             
      return false;
    }
}

*/