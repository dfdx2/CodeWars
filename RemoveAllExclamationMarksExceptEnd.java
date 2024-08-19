/* 8KYU CodeWars Exclamation Marks Series # 4: Remove All Exclamation Marks From Sentence But Ensure a Exclamation Mark At The End Of String

Description:

Remove all exclamation marks from sentence but ensure a 
exclamation mark at the end of string. For a beginner kata, 
you can assume that the input data is always a non empty 
string, no need to verify it.

Examples

"Hi!"     ---> "Hi!"
"Hi!!!"   ---> "Hi!"
"!Hi"     ---> "Hi!"
"!Hi!"    ---> "Hi!"
"Hi! Hi!" ---> "Hi Hi!"
"Hi"      ---> "Hi!"

*/
class RemoveAllExclamationMarksExceptEnd {
  static String remove(String s) {
    return s.replaceAll("!", "") + "!";
  }
}
/*---------------------------------------------------------------
class Kata {
    static String remove(String s) {
        String ss = "";
        
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) != '!') ss += s.charAt(i);
      
        return ss + "!";
    }
}
-----------------------------------------------------------------
class Kata {
    static String remove(String s) {
       return s.replace("!" , "") + "!";
    }
}
-----------------------------------------------------------------
class Kata {
    static String remove(String s) {        
        return s != null? s.replaceAll("!", "") + "!" : null;
    }
}
-----------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    static String remove(String s) {
        // Add code here
        return Arrays.stream(s.split("!")).collect(Collectors.joining()) + "!";
    }
}
-----------------------------------------------------------------
class Kata {
  static String remove(String s) {
    return s.replaceAll("!+", "") + '!';
  }
}
*/