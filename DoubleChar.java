/* 8KYU CodeWars Double Char

Given a string, you have to return a string in which each character 
(case-sensitive) is repeated once.

Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
Good Luck!

*/

public class Solution{
  public static String doubleChar(String s){
    //enter your code here 
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      result += s.charAt(i);
      result += s.charAt(i);
    }
    return result;
  }
}
/*--------------------------------------------------------------------------
public class Solution{
  public static String doubleChar(String s){
    StringBuilder srtingBuilder = new StringBuilder("");
    for (int i = 0; i < s.length(); i++) {
      srtingBuilder.append(s.charAt(i)).append(s.charAt(i));
    }
    return srtingBuilder.toString();
  }
}
-----------------------------------------------------------------------------

public class Solution{
  public static String doubleChar(String s){
     return s.replaceAll(".", "$0$0");
     
    
  }
}
----------------------------------------------------------------------------
public class Solution{
  public static String doubleChar(String s){
    
    String result = "";
    
    for(int i = 0; i < s.length(); i++) result += Character.toString(s.charAt(i)) + Character.toString(s.charAt(i));
    return result;
  }
}
----------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

interface Solution {
  static String doubleChar(String s) {
    return s.chars().mapToObj(c -> (char) c + "" + (char) c).collect(joining());
  }
}
----------------------------------------------------------------------------
public class Solution {
  public static String doubleChar(String s) {
    return s.codePoints().collect(
      StringBuilder::new,
      (sb, c) -> sb.appendCodePoint(c).appendCodePoint(c),
      StringBuilder::append
    ).toString();
  }
}
---------------------------------------------------------------------------
import static java.util.stream.Collectors.*;

public class Solution{
  public static String doubleChar(String s) {
    return s.chars()
            .mapToObj(i -> String.valueOf((char) i).repeat(2))
            .collect(joining());
  }
}
-----------------------------------------------------------------------------
public class Solution {
  
  public static String doubleChar(String s) {
    
    String[] arr = s.split("");
    String answer = "";
    
    for (String i : arr)
      answer += i.repeat(2);
    
    return answer;
  }
}
--------------------------------------------------------------------
public class Solution{
  public static String doubleChar(String s){
    return s.replaceAll("(?<char>.)", "${char}${char}");
  }
}


*/