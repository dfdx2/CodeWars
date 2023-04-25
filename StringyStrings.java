/* 8KYU CodeWars Stringy Strings

write me a function stringy that takes a size and returns a string of 
alternating '1s' and '0s'.

the string should start with a 1.
a string with size 6 should return :'101010'.
with size 4 should return : '1010'.
with size 12 should return : '101010101010'.
The size will always be positive and will only use whole numbers.

*/
public class Kata {
  public static String stringy(int size) {
    // Your code here
    String x = "1";
    String y = "0";
    String z = "";
    for (int i = 1; i <= size; i++) {
      if (i % 2 != 0) {
        z += x;
      }
      else {
        z += y;
      }
    }
    return z;
  }
}
/*--------------------------------------------------------------------------------
public class Kata {
  public static String stringy(int size) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; i++){
    if (i % 2 ==0) { 
      builder.append(1); 
    } else {
      builder.append(0); 
    }
    }
    return builder.toString();
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Kata {
  public static String stringy(int size) {
    return IntStream.rangeClosed(1, size)
                    .map(i -> i % 2)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(""));
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String stringy(int size) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < size + 1; i++)
      sb.append(i & 1);
    return sb.toString();
  }
}
-----------------------------------------------------------------------------
class Kata {
  static String stringy(int size) {
    return "10".repeat(size / 2) + (size % 2 != 0 ? '1' : "");
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static String stringy(int size) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < size; i++) {
      sb.append((i+1)%2);
    }
    return sb.toString();
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String stringy(int size) {
    return "10101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010".substring(0, size);
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String stringy(int size) {
    return new String(new char[size/2]).replace("\0","10")+(size%2!=0?"1":"");
  }
}



*/