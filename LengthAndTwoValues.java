/* 7KYU CodeWars Length And Two Values

Given an integer n and two other values, build an array of size n filled with 
these two values alternating.

Examples

5, true, false     -->  [true, false, true, false, true]
10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
0, "one", "two"    -->  []

Good luck!

*/

public class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        result[i] = firstValue;
      }
      else {
        result[i] = secondValue;
      }
    }
    return result;
  }
}
/*----------------------------------------------------------------------------
public class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
    String[] str = new String[n];
    for(int i = 0; i < n; i++){
      str[i] = (i % 2 == 0 ? firstValue : secondValue);
    }
    return str;
  }
}
------------------------------------------------------------------------------
import com.google.common.collect.FluentIterable;

public class Kata {
  public static String[] alternate(int n, String x, String y) {
    return FluentIterable.of(x, y).cycle().limit(n).toArray(String.class);
  }
}
------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Kata {
  static String[] alternate(int n, String firstValue, String secondValue) {
    return range(0, n).mapToObj(i -> i % 2 > 0 ? secondValue : firstValue).toArray(String[]::new);
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? firstValue : secondValue;
        }
        return arr;
    }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
    return IntStream.range(0,n)
      .mapToObj(i -> i % 2 == 0 ? firstValue : secondValue)
      .toArray(String[]::new);
  }
}
----------------------------------------------------------------------------------
public class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
    return java.util.stream.IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? firstValue : secondValue).toArray(String[]::new);
  }
}
----------------------------------------------------------------------------------
public class Kata {
  
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = (i % 2 == 0) ? firstValue : secondValue;
        }
        return result;
    }
}


*/
