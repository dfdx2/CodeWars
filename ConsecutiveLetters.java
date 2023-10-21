/* 7KYU CodeWars Consecutive Letters

In this Kata, we will check if a string contains consecutive 
letters as they appear in the English alphabet and if each 
letter occurs only once.

Rules are: (1) the letters are adjacent in the English alphabet, 
and (2) each letter occurs only once.

For example: 
solve("abc") = True, because it contains a,b,c

solve("abd") = False, because a, b, d are not consecutive/adjacent 
in the alphabet, and c is missing.

solve("dabc") = True, because it contains a, b, c, d

solve("abbc") = False, because b does not occur once.

solve("v") = True

All inputs will be lowercase letters.

More examples in test cases. Good luck!

*/

import java.util.Arrays;
class Solution{
    public static boolean solve(String s){
      if (s.length() <= 1) {
        return true;
      }
      char[] x = s.toCharArray();
      Arrays.sort(x);
      for (int i = 0; i < x.length - 1; i++) {
        Character ch = x[i];
        Character cd = x[i + 1];
        if (x[i] == x[i + 1]) {
          return false;
        }
        else if ((int) cd - (int) ch > 1) {
          return false;
        }
      }
      return true;
    }
}
/*-----------------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static boolean solve(String s){
        char tempArray[] = s.toCharArray();    
        Arrays.sort(tempArray);       
        return "abcdefghijklmnopqrstuvwxyz".indexOf(new String(tempArray)) != -1;
    }
}

-------------------------------------------------------------------------------
interface Solution {
  static boolean solve(String s) {
    var stat = s.chars().summaryStatistics();
    return stat.getMax() - stat.getMin() + 1 == s.length();
  }
}
---------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static boolean solve(String s) {
        return "abcdefghijklmnopqrstuvwxyz".contains(Stream.of(s.split("")).sorted().collect(Collectors.joining()));
    }
}

--------------------------------------------------------------------------------
import java.util.Arrays;
class Solution{
    public static boolean solve(String s){

        // convert input string to char array
        char tempArray[] = s.toCharArray();


        // sort tempArray
        Arrays.sort(tempArray);

        for (int i = 0; i < tempArray.length-1; i++)
        {

            if(tempArray[i] + 1  != tempArray[i+1])
                return false;

        }

        return true;

    }
}
-------------------------------------------------------------------------------
import java.util.*;

class Solution{
    public static boolean solve(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i+1] - arr[i] != 1) return false;
        }
        return true;
    }
}
------------------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static boolean solve(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return alphabet.contains(sorted);
    }
}

------------------------------------------------------------------------------
import java.util.stream.IntStream;

class Solution {
  
  public static boolean solve(String source) {
    if (source.length() > 26) return false;
    if (source.length() <= 1) return true;
    
    String sortedStr = getSortedStr(source);
    return IntStream.range(1, source.length())
                    .sorted()
                    .allMatch(i -> sortedStr.charAt(i) - sortedStr.charAt(i - 1) == 1);
  }
  
  private static String getSortedStr(String str) {
    return str.chars()
              .sorted()
              .collect(StringBuilder::new, 
                        StringBuilder::appendCodePoint, 
                        StringBuilder::append)
              .toString();
  }
}

-------------------------------------------------------------------------------
import java.lang.StringBuilder;
class Solution{
    public static boolean solve(String s) {
        return "abcdefghijklmnopqrstuvwxyz".contains(s.chars()
          .sorted()
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString());
    }
}
*/