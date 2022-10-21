/*  8KYU CodeWars  Vowel Remover

Create a function called shortcut to remove the 
lowercase vowels (a, e, i, o, u ) in a given string.

Examples
"hello"     -->  "hll"
"codewars"  -->  "cdwrs"
"goodbye"   -->  "gdby"
"HELLO"     -->  "HELLO"
don't worry about uppercase vowels
y is not considered a vowel for this kata

*/

public class Kata {
  public static String shortcut(String input) {
    return input.replaceAll("[aeiou]", "");   
  }
}
/*------------------------------------------------------------
import java.util.Set;

public class Kata {
  public static String shortcut(String input) {

    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    StringBuilder sb = new StringBuilder();
    
   char[] chars = input.toCharArray();
     for (Character ch : chars){
       if(!vowels.contains(ch)){
         sb.append(ch);
       }
     }
    return sb.toString();
  }
}
-------------------------------------------------------------------
public class Kata {
  public static String shortcut(String input) {
        
    
    if(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
      return input.replaceAll("[aeiou]", "");
    }
    
    else {
      return input;   
    }      
    
  }
      
}
--------------------------------------------------------------------
public class Kata {
  public static String shortcut(String input) {
    
    input = input.replace("a", "");
    input = input.replace("e", "");
    input = input.replace("i", "");
    input = input.replace("o", "");
    input = input.replace("u", "");
    
    return input;   
  }
}
------------------------------------------------------------------
public class Kata {
    public static String shortcut(String input) {
        String[] glas = {"a", "e", "o", "i", "u"};
        for (int i = 0; i < glas.length; i++) {
            input = input.replace(glas[i], "");
        }
        return input;
    }
}

*/