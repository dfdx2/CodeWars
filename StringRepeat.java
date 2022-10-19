/*  8KYU CodeWars String Repeat

Write a function that accepts an integer n and a 
string s as parameters, and returns a string of 
s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"

*/

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
      }
}
/*----------------------------------------------------------------
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }
}
--------------------------------------------------------------------
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i = 0; i < repeat; i++) s += string;
        return s;
    }
}
--------------------------------------------------------------------
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        return repeat >= 0 ? string.repeat(repeat) : "";
    }
}
---------------------------------------------------------------------
public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    return java.util.stream.IntStream.range(0, repeat).mapToObj(i -> string)
        .collect(java.util.stream.Collectors.joining()).toString();
  }
}
-------------------------------------------------------------------
import java.util.Collections;

public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    return repeat < 0 ? "" : String.join("", Collections.nCopies(repeat, string));
  }
}



*/