/* 8KYU CodeWars Printing Array Elements With Comma Delimiters

Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"

Note: if this seems too simple for you try the next level

*/

public class ArrayPrinter {

    public static String printArray(Object array[]) {
      String x = "";
      for (int i = 0; i < array.length; i++) {
        if (i == array.length - 1) {
          x += (array[i]);
        }
        else {
          x += (array[i] + ",");
        }
      }
      return x;
    }
}
/*------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object[] array) {
      return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
----------------------------------------------------------------------
public class ArrayPrinter {

    public static String printArray(Object[] array) {
      StringBuilder sb = new StringBuilder(7);
      int i = 0;
      for(; i < array.length - 1; i++){
        sb.append(array[i]);
        sb.append(",");
      }
      sb.append(array[i]);
      return sb.toString();
    }
}
---------------------------------------------------------------------
import java.util.*;

public class ArrayPrinter {

    public static String printArray(Object array[]) {
     
     
     String[] str = new String[array.length];
     
     for(int i=0; i<array.length; i++) {
     
     str[i]=String.valueOf(array[i]) ;
     
     }
     
     return String.join(",", str);
    }
}
-------------------------------------------------------------------------
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ArrayPrinter {
  
  public static String printArray(Object[] array) {
    return Stream.of(array)
                 .map(Object::toString)
                 .collect(joining(","));
  }
}
----------------------------------------------------------------------
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class ArrayPrinter {
  static String printArray(Object[] array) {
    return stream(array).map(Object::toString).collect(joining(","));
  }
}



*/