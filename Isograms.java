/* 7KYU CodeWars Isograms

An isogram is a word that has no repeating letters, consecutive or 
non-consecutive. Implement a function that determines whether a 
string that contains only letters is an isogram. Assume the empty 
string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

*/
import java.util.*;
public class Isograms {
    public static boolean  isIsogram(String str) {
      Set<Character> map = new HashSet<>();
      str = str.toLowerCase();
      for (char ch : str.toCharArray()) {
        if (!Character.isLetter(ch) || map.contains(ch)) {
          return false;
        }
        else {
          map.add(ch);
        }
      }
      return true;
    } 
}
/*------------------------------------------------------------------------
import java.util.Arrays;
public class isogram {
    public static boolean  isIsogram(String str) {
      int len = str.length();
      str = str.toLowerCase();
      char arr[] = str.toCharArray();
      Arrays.sort(arr);
      for (int i = 0; i < len - 1; i++) {
          if (arr[i] == arr[i + 1])
              return false;
       }
       return true;
    } 
}
---------------------------------------------------------------------------
public class isogram {
  public static boolean  isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  } 
}
-----------------------------------------------------------------------------
class isogram {
    public static boolean isIsogram(String str) {
        return str.toLowerCase()
                  .chars()
                  .distinct()
                  .count() == str.length();
    }
}
------------------------------------------------------------------------------
import java.util.HashSet;
import java.util.Set;

public class isogram {
  public static boolean isIsogram(String str) {
    Set<Character> letters = new HashSet<Character>();
         
    for (int i = 0; i < str.length(); ++i) {
      if (letters.contains(str.toLowerCase().charAt(i))) {
        return false;        
      }
      
      letters.add(str.charAt(i));
    }
         
    return true;
  }
}
-------------------------------------------------------------------------------
public class isogram {
   public static boolean  isIsogram(String str) {
         str = str.toLowerCase();
	        for(int i = 0; i < str.length() - 1; i++){  
	          for(int j = i+1; j < str.length(); j++){
	            if(str.toCharArray()[i] == str.toCharArray()[j]){
                return false;
	            }
	          }
	        }
	        
	        return true;
	    } 
}
--------------------------------------------------------------------------------
public class isogram {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    } 
}
-------------------------------------------------------------------------------
class isogram {
  static boolean isIsogram(String str) {
    return str.isEmpty() || str.toLowerCase().chars().distinct().count() == str.length();
  }
}
--------------------------------------------------------------------------------
import java.util.LinkedHashSet;

public class isogram {
    public static boolean isIsogram(String word) {
        if (word.length() == 0)
          return true;
        word = word.toLowerCase();
        String[] letters = word.split("");
        boolean isIsogram = true;
        for (int i = 0; i < letters.length; i++) {
          if (word.indexOf(letters[i], i + 1) != -1) {
            isIsogram = false;
            break;
          }
        }
        return isIsogram;
    } 
}
--------------------------------------------------------------------------------
import java.util.HashMap;

public class isogram {
    public static boolean isIsogram(String str) {
        boolean result = true;

        HashMap<Character, Integer> stats = new HashMap<Character, Integer>();

        char[] chars = str.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer count = stats.get(chars[i]);
            if (count == null)
                count = new Integer(0);

            count++;
            if (count > 1) {
                result = false;
                break;
            }
            stats.put(chars[i], count);
        }

        return result;
    }
}
--------------------------------------------------------------------------------
*/