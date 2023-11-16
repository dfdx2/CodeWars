/* 7KYU CodeWars MakeBackronym

back·ro·nym
An acronym deliberately formed from a phrase whose initial letters 
spell out a particular word or words, either to create a memorable 
name or as a fanciful explanation of a word's origin.

"Biodiversity Serving Our Nation", or BISON

(from https://en.oxforddictionaries.com/definition/backronym)

Complete the function to create backronyms. Transform the given 
string (without spaces) to a backronym, using the preloaded 
dictionary and return a string of words, separated with a single 
space (but no trailing spaces).

The keys of the preloaded dictionary are uppercase letters A-Z and 
the values are predetermined words, for example:

dictionary.get("P") == "perfect"
Examples
"dgm" ==> "disturbing gregarious mustache"

"lkj" ==> "literal klingon joke"


*/

import java.util.Map;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    String j = "";
    acronym = acronym.toUpperCase();
    System.out.println(acronym);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < acronym.length(); i++) {
      char ch = acronym.charAt(i);
      j += ch;
      sb.append(dictionary.get(j));
      sb.append(" ");
      j = "";
    }
    return sb.toString().trim();
  }
}
/*--------------------------------------------------------------------------
import java.util.Map;
import java.util.stream.Collectors;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    return acronym.toUpperCase().chars().mapToObj(i -> dictionary.get("" + (char)i)).collect(Collectors.joining(" "));
  }
}
------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
      
    if(acronym == null){
      return "";
    }
    
    // Java 8 solution is le sexy
    return acronym
          .toUpperCase()
          .chars()
          .mapToObj(c -> dictionary.get(String.valueOf((char)c)))
          .collect(Collectors.joining(" "));
          
    
  }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    List<String> result = new ArrayList<String>();
    for (char character : acronym.toUpperCase().toCharArray()) {
      result.add(dictionary.get(String.valueOf(character)));
    }
    return String.join(" ", result);
  }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.ArrayList;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    
    char[] acronymAsCharArray = acronym.toCharArray();
    StringBuilder sentanceBuilder = new StringBuilder();
    
    for(int i = 0; i < acronymAsCharArray.length; i++){
      String upperCaseLetter = ("" + acronymAsCharArray[i]).toUpperCase();
      String word = dictionary.get(upperCaseLetter);
      sentanceBuilder.append(word);
      sentanceBuilder.append(" ");
    }
    
    return sentanceBuilder.toString().trim();
  }
}
--------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    String result = "";
    acronym = acronym.toUpperCase();
    for (int i = 0; i < acronym.length(); ++i) {
      if (i > 0) {
        //add a space before every word except the first
        result += " ";
      }
      result += dictionary.get( acronym.substring(i, i+1) );
    }
    
    return result;
  }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    return acronym.toUpperCase().chars().mapToObj(c->dictionary.get((char)c+"")).collect(Collectors.joining(" "));
  }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
  acronym = acronym.toUpperCase();
  if (acronym.length()!=0){
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<acronym.length();i++){
        sb.append(dictionary.get(String.valueOf(acronym.charAt(i)))+" ");
    }
    return sb.substring(0,sb.length()-1);}else{return "";}
  }
}
*/