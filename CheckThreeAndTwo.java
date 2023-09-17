/* 7KYU CodeWars Check Three And Two

Given an array with exactly 5 strings "a", "b" or "c" 
(chars in Java, characters in Fortran), check if the 
array contains three and two of the same values.

Examples
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"

*/

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      // your code
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == 'a') {
          count1++;
        }
        else if (chars[i] == 'b') {
          count2++;
        }
        else {
          count3++;
        }
      }
      if (count1 == 3 && count2 == 2 || count2 == 3 && count1 == 2) {
        return true;
      }
      if (count3 == 3 && count1 == 2 || count1 == 3 && count3 == 2) {
        return true;
      }
      if (count3 == 3 && count2 == 2 || count3 == 2 && count2 == 3) {
        return true;
      }
      return false;
    }
}
/*--------------------------------------------------------------------------
public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      int a=0,b=0,c=0;
      for(int i=0;i<chars.length;i++){
      if(chars[i]=='a'){a++;}
      if(chars[i]=='b'){b++;}
      if(chars[i]=='c'){c++;}   
      }
      if((a==3||b==3||c==3)&&(a==2||b==2||c==2))
  return true;
  
  return false;
  }
}
-------------------------------------------------------------------------------
public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      int n = chars.length;
      int a = 0;
      int b = 0;
      int c = 0;
      for(int i=0; i<n; i++)
      {
        switch(chars[i])
        {
          case 'a':
            a += 1;
            break;
          case 'b':
            b += 1;
            break;
          case 'c':
            c += 1;
            break;
          default:
            System.out.println("There's an invalid char.");
            break;
        }
    }
    
    if((a == 3 || b == 3 || c == 3) && (a == 2 || b == 2 || c == 2))
      return true;
    else
      return false;
    }
}
-------------------------------------------------------------------------
import java.nio.CharBuffer;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Solution {
    public static boolean checkThreeAndTwo(char[] chars) {
        return CharBuffer.wrap(chars)
                         .chars()
                         .boxed()
                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                         .values()
                         .stream()
                         .reduce(new Long(1), (a, b) -> b == 3 || b == 2 ? a * b : a) % 6 == 0;
    }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    private static final Collection<Long> twoAndThree = Arrays.asList(2L, 3L);

    boolean checkThreeAndTwo(final char[] chars) {
        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i])
                .collect(groupingBy(identity(), counting()))
                .values()
                .containsAll(twoAndThree);
    }
}
------------------------------------------------------------------------------
public class Solution {
  public boolean checkThreeAndTwo(char[] chars) {
    return String.valueOf(chars).matches("^(?=(.)(?:.*\\1){1,2})(?=\\1*+(.)(?:\\1*\\2){1,2})(?!(?:\\1*+\\2*)*+.).*$");
  }
}
--------------------------------------------------------------------------------
public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      return new String(chars).replaceAll(String.valueOf(chars[0]), "").matches("(.)\\1{1,2}");
    }
}
------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      Map<Character, Integer> count = new HashMap<>();

        for (char ch : chars) {
            if (!count.containsKey(ch)) {
                count.put(ch, 1);
            } else {
                count.put(ch, count.get(ch) + 1);
            }
        }

        return count.size() == 2 && count.containsValue(2);

    }
    
}
*/