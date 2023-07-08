/* 7KYU CodeWars Spacify

Modify the spacify function so that it returns the given string with 
spaces inserted between each character.

spacify("hello world") // returns "h e l l o   w o r l d"

*/

public class Spacify {
    public static String spacify(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
        if (i == str.length() - 1) {
          result += str.charAt(i);
        }
        else {
          result += str.charAt(i) + " ";
        }
      }
      return result;
    }
}
/*-------------------------------------------------------------------------------
public class Spacify {
    public static String spacify(String str){
        return str.replaceAll("", " ").trim();
    }
}
---------------------------------------------------------------------------------
public class Spacify {
    public static String spacify(String str){
        String[] s = str.split("");
        String ans = "";
        for(int i = 0; i < s.length; i++) {
          ans += s[i] + " ";
        }
        return ans.trim();
    }
}
-----------------------------------------------------------------------------------
public class Spacify {
    public static String spacify(String str){
        String[] chars = str.split("");
        return String.join(" ", chars);
    }
}
-------------------------------------------------------------------------------
public class Spacify {
    public static String spacify(String str){
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for (char c: ch) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim(); 
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Spacify {
    public static String spacify(String str){
        return Arrays.stream(str.split("")).collect(Collectors.joining(" "));
    }
}
----------------------------------------------------------------------------
public class Spacify {
    public static String spacify(String str){
        return String.join(" ", str.split("")); //show me the code!
    }
}
----------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

public class Spacify {
    public static String spacify(String str){
       return str.chars().mapToObj(Character::toString).collect(joining(" "));
    }
}

*/