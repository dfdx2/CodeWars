/* 7KYU CodeWars Build a square

I will give you an integer. Give me back a shape that is 
as long and wide as the integer. The integer will be a 
whole number between 1 and 50.

Example

n = 3, so I expect a 3x3 square back just like below as a string:

+++
+++
+++

*/

public class Kata {
  public static final String generateShape(int n) {
      return ("+".repeat(n) + '\n').repeat(n).trim();
  }
}
/*----------------------------------------------------------
public class Kata {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int j=0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
public class Kata {
    public static final String generateShape(final int n) {
        return IntStream
            .range(0, n)
            .mapToObj(c -> "+".repeat(n))
            .collect(Collectors.joining("\n"));
    }
}
------------------------------------------------------------
class Kata {
  static final String generateShape(int n) {
    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      res[i] = "+".repeat(n);
    }
    return String.join("\n", res);
  }
}
------------------------------------------------------------
public class Kata {
    public static final String generateShape(int n) {
      String lon = "";
      String result = "";
      while(lon.length()<n){
        lon+="+";
      }
      int count = 0;
      while(count<n-1){
        result += lon;
        result +="\n";
        count++;
      }
      return result+lon;
    }
}
------------------------------------------------------------
public class Kata {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) sb.append("+");
            if (i < n) sb.append("\n");
        }
        return sb.toString();
    }
}
*/