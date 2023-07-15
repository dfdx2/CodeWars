/* 7KYU CodeWars The Office III - Broken Photocapier

The bloody photocopier is broken... Just as you were sneaking around the office to print off your favourite binary code!

Instead of copying the original, it reverses it: '1' becomes '0' and vice versa.

Given a string of binary, return the version the photocopier gives you as a string.

The Office I - Outed
The Office II - Boredeom Score
The Office IV - Find a Meeting Room
The Office V - Find a Chair

*/
public class Kata {

  public static String broken(final String x) {
    String result = x;
    String y = "";
    int i = 0;
    while (i < result.length()) {
      if (result.charAt(i) == '0') {
        y += '1';
        i++;
      }
      else {
        y += '0';
        i++;
      }
    }
    return y;
  }
  
}
/*--------------------------------------------------------------------------
public class Kata {

  public static String broken(final String x) {
    return x.replace("0"," ").replace("1","0").replace(" ","1");
  }
  
}
---------------------------------------------------------------------------
public class Kata {
    public static String broken(final String x) {
        StringBuilder sb = new StringBuilder(x.length());
        for (char c: x.toCharArray()) sb.append( c=='0'?'1':'0' );
        return sb.toString();
    }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Kata {
  public static String broken(final String x) {
    return x.chars()
            .mapToObj(ch -> ch == 48 ? "1" : "0")
            .collect(Collectors.joining());
  }
}




*/