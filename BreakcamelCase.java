/* 6KYU CodeWars Break camelCase

Complete the solution so that the function will break up camel casing, 
using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

*/

class Solution {
  public static String camelCase(String input) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      Character ch = input.charAt(i);
      if (Character.isUpperCase(ch)) {
        sb.append(" ");
        sb.append(ch);
      }
      else {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}
/*----------------------------------------------------------------------------
import java.util.Arrays;

class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
------------------------------------------------------------------------------
class Solution {
  public static String camelCase(String input) {
    String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
        }
        return output;
  }
}
---------------------------------------------------------------------------
class Solution {
  public static String camelCase(String input) {
    return String.join(" ", input.split("(?=[A-Z])"));
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.lang.Character;

class Solution {
  public static String camelCase(String input) {
    return input.chars()
          .mapToObj(ch -> Character.isUpperCase(ch) ? " " + String.valueOf((char) ch) : String.valueOf((char) ch))
          .collect(Collectors.joining());
  }
}


*/