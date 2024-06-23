/* 8KYU CodeWars Short Long Short

Given 2 strings, a and b, return a string of the form 
short+long+short, with the shorter string on the outside 
and the longer string on the inside. The strings will not 
be the same length, but they may be empty ( zero length ).

Hint for R users:

The length of string is not always the same as the number of characters
For example: (Input1, Input2) --> output

("1", "22") --> "1221"
("22", "1") --> "1221"
ShortLongShort.solution("1", "22"); // returns "1221"
ShortLongShort.solution("22", "1"); // returns "1221"

*/
public class ShortLongShort {
    public static String solution(String a, String b) {
      return a.length() < b.length() ? a + b + a : b + a + b;
    }
}
/*--------------------------------------------------------------
public class ShortLongShort {

  public static String solution(String a, String b) {
    return a.length() < b.length() ? a + b + a : b + a + b;
  }
}
----------------------------------------------------------------
public class ShortLongShort {
    public static String solution(String a, String b) {
      if (a.length() > b.length()){
        return b.concat(a).concat(b);
      } else {
        return a.concat(b).concat(a);
      }
    }
}
----------------------------------------------------------------
public class ShortLongShort {
    public static String solution(String a, String b) {
      if(a.length()==0 || a.length() < b.length())
      
        return a+b+a; // your code here
      return b+a+b;
    }
}
----------------------------------------------------------------
public class ShortLongShort {
    public static String solution(String a, String b) {
      int aLen = a.length();
      int bLen = b.length();
      
      if(aLen > bLen){
        return b + a + b;
      }else if (bLen  >aLen){
        return a + b + a;
      }else{
        return null;
      }

    }
}
----------------------------------------------------------------
public class ShortLongShort {
    public static String solution(String a, String b) {
        String kurz = null;
        String lang = null;

        if (a.length() < b.length()) {
            kurz = a;
            lang = b;
        }

        if (b.length() < a.length()) {
            kurz = b;
            lang = a;
        }

        return kurz + lang + kurz;
    }
}
----------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class ShortLongShort {
    public static String solution(String a, String b) {
        String[] strings = new String[] {a, b};
        Arrays.sort(strings, Comparator.comparing(String::length));
        return strings[0] + strings[1] + strings[0];
    }
}

----------------------------------------------------------------
public class ShortLongShort {
    public static String solution(String a, String b) {
        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() > b.length() ? a : b;
        return shortStr + longStr + shortStr;
    }
}
*/