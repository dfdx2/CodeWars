/* 5KYU First non-repeating character

Write a function named first_non_repeating_letter† that takes a 
string input, and returns the first character that is not repeated 
anywhere in the string.

For example, if given the input 'stress', the function should return 
't', since the letter t only occurs once in the string, and occurs 
first in the string.

As an added challenge, upper- and lowercase letters are considered 
the same character, but the function should return the correct case 
for the initial letter. For example, the input 'sTreSS' should return 'T'.

If a string contains all repeating characters, it should return an 
empty string ("");

† Note: the function is called firstNonRepeatingLetter for historical 
reasons, but your function should handle any Unicode character.

*/

import java.util.*;
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    Map<Character, Integer> map = new HashMap<>();
    String x = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(x.charAt(i))) {
        map.put(x.charAt(i), 1);
      }
      else {
        int total = map.get(x.charAt(i));
        map.put(x.charAt(i), total + 1);
      }
    }
    String y = "";
    for (int i = 0; i < x.length(); i++) {
      if (map.get(x.charAt(i)) == 1) {
        y += s.charAt(i);
        return y;
      }
    }
    return "";
  }
}
/*----------------------------------------------------------------------
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    for (String str : s.split("")) {
      if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;
     }
    return "";
  }
}
-------------------------------------------------------------------------
interface Kata {
  static String firstNonRepeatingLetter(String s) {
    return s.chars().filter(c -> s.toLowerCase().indexOf((c = Character.toLowerCase(c))) == s.toLowerCase().lastIndexOf(c))
        .mapToObj(c -> "" + (char) c).findFirst().orElse("");
  }
}
-------------------------------------------------------------------------
import java.util.Objects;

public class Kata {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("streSS"));
    }
    public static String firstNonRepeatingLetter(String s){
        String[] result = s.split("");
        String[] ar = s.toLowerCase().split("");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (Objects.equals(ar[i], ar[j]) && i != j) {
                    break;
                }
                if (j == ar.length - 1) {
                    return result[i];
                }
            }
        }
        return "";
    }
}
--------------------------------------------------------------------------
import java.util.HashSet;
import java.util.Set;
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    String res = s;
    s = s.toLowerCase();
    Set<Character> n = new HashSet<>();
    for(int i = 0; i < s.length(); i++){
      if(s.indexOf(s.charAt(i), i+1) == -1 && !n.contains(s.charAt(i))){
         return res.charAt(i)+"";         
      }
      n.add(s.charAt(i));
    }
    return "";
  }
}
-------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    Map<Character, Integer> map = new HashMap<>();
    String x = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(x.charAt(i))) {
        map.put(x.charAt(i), 1);
      }
      else {
        int total = map.get(x.charAt(i));
        map.put(x.charAt(i), total + 1);
      }
    }
    String y = "";
    for (int i = 0; i < x.length(); i++) {
      if (map.get(x.charAt(i)) == 1) {
        y += s.charAt(i);
        return y;
      }
    }
    return "";
  }
}

-------------------------------------------------------------------------
public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    final var lower = s.toLowerCase();
    final var len = s.length();
    for (var i = 0; i < len; i++) {
      final var c = s.charAt(i);
      final var l = Character.toLowerCase(c);
      if (lower.indexOf(l) == lower.lastIndexOf(l)) {
        return Character.toString(c);
      }
    }
    return "";
  }
}
-------------------------------------------------------------------------
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    String res = s;
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {

      if (s.indexOf(s.charAt(i)) == (s.lastIndexOf(s.charAt(i)))) {
        return String.valueOf(res.charAt(i));
      }
    }
    return "";
  }
}
-------------------------------------------------------------------------
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Kata {
  public static String firstNonRepeatingLetter(String s){
    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    Map<Character, Integer> nonCaseSensitiveMap = new HashMap<>();
    
    for (char ch : s.toCharArray()) {
      Character lowerCase = Character.toLowerCase(ch);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      nonCaseSensitiveMap.put(lowerCase, nonCaseSensitiveMap.getOrDefault(lowerCase, 0) + 1);
    }
    
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (nonCaseSensitiveMap.getOrDefault(Character.toLowerCase(entry.getKey()), 0) == 1) return String.valueOf(entry.getKey());
    }
    return "";
  }
}
*/