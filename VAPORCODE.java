/* 7KYU CodeWars VAPORCODE

ASC Week 1 Challenge 4 (Medium #1)

Write a function that converts any sentence into a 
V A P O R W A V E sentence. a V A P O R W A V E sentence 
converts all the letters into uppercase, and adds 2 spaces 
between each letter (or special character) to create this 
V A P O R W A V E effect.

Note that spaces should be ignored in this case.

Examples
"Lets go to the movies"       -->  "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S"
"Why isn't my code working?"  -->  "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?"

*/

public class Solution {
  public static String vaporcode(String s) {
    s = s.toUpperCase();
    s = s.replaceAll(" ", "");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == s.length()) {
        sb.append(s.charAt(i));
      }
      else {
        sb.append(s.charAt(i));
        sb.append("  ");
      }
    }
    return sb.toString().trim();
  }
}
/*---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public static String vaporcode(String s) {
    return Arrays.stream(s.replaceAll(" ", "").toUpperCase().split("")).collect(Collectors.joining("  "));
  }
}
-----------------------------------------------------------------------------
interface Solution {
  static String vaporcode(String s) {
    s = s.replace(" ", "").replace("", "  ");
    return s.toUpperCase().substring(2, s.length() - 2);
  }
}
-----------------------------------------------------------------------------
interface Solution {
  static String vaporcode(String s) {
    return s.replace(" ", "").replace("","  ").toUpperCase().trim();
  }
}
-----------------------------------------------------------------------------
public class Solution {
  public static String vaporcode(String s) {
        
        s = s.toUpperCase();
        s = s.replace("", "  ");
        s = s.replace("     ", "  ");
        s = s.trim();
        return s;
  }
}

*/