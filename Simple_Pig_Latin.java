/* 5KYU CodeWars Simple Pig Latin

Move the first letter of each word to the end of it, 
then add "ay" to the end of the word. Leave punctuation 
marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !

*/

import java.util.*;
public class PigLatin {
    public static String pigIt(String str) {
      StringBuilder sb = new StringBuilder();
      String c = "";
      String d = "";
      String e = "";
      String[] b = str.split(" ");
      for (int i = 0; i < b.length; i++) {
        String a = b[i];
        c += a.charAt(0);
        d = a.substring(1,a.length());
        e = "ay";
        sb.append(d);
        sb.append(c);
        sb.append(e);
        sb.append(" "); 
        c = "";
      }
      String g = sb.toString();
      if (str.charAt(str.length()-1) == '!' || str.charAt(str.length()-1) == '?') {
        g = g.substring(0,g.length()-3);
        return g;
      }
      return sb.toString().trim();
    }
}
/*----------------------------------------------------------------------------
public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(PigLatin::pigify).collect(Collectors.joining(" "));
    }

    private static String pigify(String word){
        return word.length() > 1 || Character.isLetter(word.charAt(0)) ? word.substring(1) + word.charAt(0) + "ay" : word;
               
    }
}
-------------------------------------------------------------------------------
import static java.lang.Character.*;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();
        
        for (String s : str.split(" ")) {
            char firstLetter = s.charAt(0);

            result.append(s, 1, s.length())
                  .append(firstLetter)
                  .append(isAlphabetic(firstLetter) ? "ay" : "")
                  .append(" ");
        }
        
        return result.substring(0, result.length()-1);
    }
}
--------------------------------------------------------------------------------
import java.util.regex.Pattern;

public class PigLatin {
    private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");

    public static String pigIt(String str) {
        return regex.matcher(str).replaceAll("$2$1ay");
    }
}
-------------------------------------------------------------------------------
import java.util.*;
public class PigLatin {
    public static String pigIt(String str) {
        String puncuation = "!?,.";
        List<String> words = new ArrayList<String>(Arrays.asList(str.split(" ")));
        List<String> pigLatinWords = new ArrayList<String>();
        
        for (String word : words) {          
          String newWord = !puncuation.contains(word) ? word.substring(1) + word.charAt(0) + "ay" : word;
          pigLatinWords.add(newWord);
        }
        
        return String.join(" ", pigLatinWords);
    }
}
-------------------------------------------------------------------------------
public class PigLatin {
    public static String pigIt(String str) {
        String s = "";
    		for (String STR : str.split(" ")) {
    			if(!STR.matches("\\W")) {
    				s += STR.substring(1) + STR.charAt(0) + "ay";
    			}
    			else
    				s += STR;
    			s += " ";
    		}
    		return s.substring(0, s.length() - 1);
    }
}
-------------------------------------------------------------------------------
public class PigLatin {
    static String func(String s){
        return s.substring(1,s.length()) + s.charAt(0) + "ay";
    }
    static boolean isp(String s){
        return s.equals("!") || s.equals(",") || s.equals(";") || s.equals(".") || s.equals("?") || s.equals(":") || s.equals('\'') || s.equals('\"');
    }
    public static String pigIt(String str) {
        String[] arr = str.split(" ");
            for(int i = 0; i < arr.length; i++){
                if(!isp(arr[i])){arr[i] = func(arr[i]);}
            }
        return String.join(" " , arr);
    }
}
-------------------------------------------------------------------------------
public class PigLatin {
    public static String pigIt(String str) {
        return str != null ? str.replaceAll("(\\w{1})(\\w*)", "$2$1ay") : null;
    }
}
-------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class PigLatin {
    private static final String SUFFIX = "ay";
    private static final String WORD_SEPERATOR = " ";
    private static final String NON_WORD_CHARACTERS = "?!";
  
    public static String pigIt(String a) {
        return Arrays.stream(a.split(WORD_SEPERATOR))
          .map(PigLatin::buildPigLatin)
          .collect(Collectors.joining(WORD_SEPERATOR));
    }
  
    private static String buildPigLatin(String word){
      if(isWord(word)){
        return word.substring(1) + word.substring(0, 1) + SUFFIX;
      }
      return word;
    }
  
   private static boolean isWord(String word){
      return !NON_WORD_CHARACTERS.contains(word);
   }
}
*/