/* 8KYU CodeWars Replace all vowels to exclamation marks in the sentence

Description:
Replace all vowel to exclamation mark in the sentence. 
aeiouAEIOU is vowel.

Examples
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"

*/

public class Solution {
  public static String replace(final String s) {
      return s.replaceAll("[aeiouAEIOU]", "!"); //coding and coding....
  }
}
/*----------------------------------------------------------------
public class Solution {
    public static String replace(final String s) {
      String a = s.replaceAll("[aeiouAEIOU]","!");  
      return a; //coding and coding....
    }
}
--------------------------------------------------------------------
import java.util.regex.*;

public class Solution {
    private static Pattern vowels = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
    public static String replace(final String s) {
        return vowels.matcher(s).replaceAll("!");
    }
}
----------------------------------------------------------------------
public class Solution {
  public static String replace(final String s) {
    StringBuilder result = new StringBuilder(s);
    char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    for(int i = 0; i < result.length(); i++) 
      for(int j = 0; j < vowel.length; j++) 
        if(result.charAt(i) == vowel[j]) {
          result.setCharAt(i, '!');
          break;
        }
    return new String(result);
  }
}
---------------------------------------------------------------------
public class Solution {
    public static String replace(final String s) {
        String vowels = "aeiouAEIOU";
        String out = "";
        for(char letter : s.toCharArray()){
            out += (vowels.indexOf(letter) != -1)? "!" : letter;
        }
        return out;
    }
}
--------------------------------------------------------------------
public class Solution {
    public static String replace(final String s) {
        return s.replace("a","!").replace("e","!").replace("i","!").replace("o","!").replace("u","!")
        .replace("A","!").replace("E","!").replace("I","!").replace("O","!").replace("U","!"); //coding and coding....
    }
}


*/