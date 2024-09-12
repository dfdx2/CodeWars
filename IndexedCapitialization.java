/* 7KYU CodeWars Indexed Capitalization

Given a string and an array of integers representing indices, 
capitalize all letters at the given indices.

For example:

capitalize("abcdef",[1,2,5]) = "aBCdeF"
capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
The input will be a lowercase string with no spaces and an array of digits.

Good luck!

Be sure to also try:

*/
//package kata;
public class IndexedCapitialization {
    public static String capitalize(String s, int[] ind){
       for (int i : ind) {
          if (i < s.length()) {
            s = s.substring(0, i) + (char) (s.charAt(i) - 32) + s.substring(i + 1);
          }
        }
        return s;
    }
}
/*-------------------------------------------------------------------------
package kata;
import java.util.*;
public class Solution{
    public static String capitalize(String s, int[] ind){
        char[] chars = s.toCharArray();
        Arrays.stream(ind)
                .filter(c -> c < s.length())
                .forEach(c -> chars[c] = Character.toUpperCase(chars[c]));
        return new String(chars);
    }
}
---------------------------------------------------------------------------
package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){
       char [] array = s.toCharArray();
        for( int i = 0; i<ind.length; i++){
            if(ind[i]<s.length()){
               array[ind[i]] = Character.toUpperCase(array[ind[i]]);
            }
        }
      return String.valueOf(array);
    }
}
---------------------------------------------------------------------------
package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){
      char[] result = s.toCharArray();
    
      for(int i : ind){
        if(i < result.length){
          result[i] = Character.toUpperCase(result[i]);
        }
        else{
          continue;
        }
      }
      //Method 1
      String str = String.valueOf(result);
      return str;
      
      //Method 2
//       String result = new String(char_s);
//       return result;
    }
}

---------------------------------------------------------------------------
package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){
        StringBuilder sb = new StringBuilder(s);
        for (int index : ind) {
          if (index < s.length()) {
              sb.setCharAt(index, (char) (sb.charAt(index) - 32));
          }
        }
        return sb.toString();
    }
}
---------------------------------------------------------------------------
package kata;

public interface Solution {
  static String capitalize(String s, int[] ind) {
    for (int i : ind) {
      if (i < s.length()) {
        s = s.substring(0, i) + (char) (s.charAt(i) - 32) + s.substring(i + 1);
      }
    }
    return s;
  }
}
---------------------------------------------------------------------------
package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){ 
        char c [] = s.toCharArray(); 
        for (int i : ind){  
          if(i<c.length)
          c[i]=Character.toUpperCase(c[i]); 
          }
        return new String(c);
    }
}
---------------------------------------------------------------------------
package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){
      char[] charArray = s.toCharArray();
      for(int elem : ind) if(elem < s.length()) charArray[elem] = Character.toUpperCase(charArray[elem]);
      return new String(charArray);
    }
}
---------------------------------------------------------------------------
package kata;
import java.util.*;


public class Solution{
    public static String capitalize(String s, int[] ind){
        char[] w = s.toCharArray();
        Arrays.stream(ind).filter(c -> c < s.length()).forEach(i -> w[i] = Character.toUpperCase(w[i]));
        return new String(w);
    }
}
---------------------------------------------------------------------------
package kata;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Solution{
    public static String capitalize(String s, int[] ind){
   String[] strings = s.split("");
      Set<Integer> set = new HashSet<>();
      for (int i : ind)
         set.add(i);

      for (int j = 0; j < strings.length; j++) {
         if (set.contains(j)) strings[j] = strings[j].toUpperCase();
      }
      StringBuilder sb = new StringBuilder();
      for (String str : strings)
         sb.append(str);
      return sb.toString();
    }
}
*/