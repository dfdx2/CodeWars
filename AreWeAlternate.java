/* 6KYU CodeWars Are We Alternate?

Create a function isAlt() that accepts a string as an 
argument and validates whether the vowels (a, e, i, o, u) 
and consonants are in alternate order.

isAlt("amazon") // true

isAlt("apple") // false

isAlt("banana") // true

Arguments consist of only lowercase letters.

*/
import java.util.*;
class AreWeAlternate {
    public static boolean isAlt(String word) {
      Set<Character> map = new HashSet<>();
      map.add('a');
      map.add('e');
      map.add('i');
      map.add('o');
      map.add('u');
      for (int i = 1; i < word.length(); i++) {
        char cd = word.charAt(i - 1);
        char ch = word.charAt(i);
        if (!map.contains(ch) && !map.contains(cd) || map.contains(ch) && map.contains(cd)) {
          return false;
        }
      }
      return true;
    }
}
/*----------------------------------------------------------------------
public class AreWeAlternate {
    public static boolean isAlt(String word) {
      return word.matches("[aeiou]?([^aeiou][aeiou])*[^aeiou]?");
    }
}
-------------------------------------------------------------------------
class Solution {
    private static String vowels = "aeiou";

    private static boolean isVowel(final String word, final int i) {
        return vowels.indexOf(word.charAt(i)) != -1;
    }

    static boolean isAlt(final String word) {
        boolean vowel = isVowel(word, 0);
        for (int i = 1; i < word.length(); i++) {
            if (isVowel(word, i) == vowel) {
                return false;
            }
            vowel = !vowel;
        }
        return true;
    }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Solution {
    static private final String VOCAL = "[aeiou]";
    static private final String CONSONANT = "[^aeiou]";                
    static private final Pattern ALTERNATE = Pattern.compile(
        VOCAL + "?"    // maybe starts with vocal
         + "(" + CONSONANT + VOCAL + ")*"   // followed by any number of consonants and vocals in order
         + CONSONANT + "?"); // maybe ends with consonant


    public static boolean isAlt(String word) {
        return ALTERNATE.matcher(word).matches(); 
    }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Solution {

  private static Pattern altPattern = Pattern.compile("([^aeiou])?([aeiou][^aeiou])*([aeiou])?");

  public static boolean isAlt(String word) {
    return altPattern.matcher(word).matches();
  }
}
---------------------------------------------------------------------------
public class Solution {
    public static boolean isAlt(String s) { 
       int index =1; 
       for (char c :s.toCharArray()){  
           int d =Math.min(0,"aeiou".indexOf(c)); 
           if(index==d)return false; 
           index=d;
       }
      return true;
    }
}
---------------------------------------------------------------------------
import java.util.*;
public class Solution {
    public static boolean isAlt(String word) {
      List<String> vowels = new ArrayList();
      vowels.add("a");
      vowels.add("e");
      vowels.add("i");
      vowels.add("o");
      vowels.add("u");
      boolean alt;
      var splt = word.split("");
      if (vowels.contains(word.substring(0,1))){
        alt = true;
      }
      else{
        alt = false;
      }
      for (var x = 0;x < word.length(); x++){
        if ((vowels.contains(splt[x]) && alt == false) || (!vowels.contains(splt[x]) && alt == true)){
          return false;
        }
        alt = !alt;
      }
      return true;
    }
}
---------------------------------------------------------------------------
public class Solution {
    public static boolean isAlt(String s) { 
      int x [] = new int [26]; 
      for (char c : "aeiou".toCharArray())x[c-'a']=1;  
      char c [] = s.toCharArray(); 
      for (int i=1;i<s.length();i++)
          if(x[c[i]-'a']==x[c[i-1]-'a'])return false;
      return true;
      }
  }
     
---------------------------------------------------------------------------
public class Solution {
    public static boolean isAlt(String word) {
      return !word.replaceAll("[^aeiou]","0").replaceAll("[^0]","1").matches(".*(00|11).*");
    }
}
*/
