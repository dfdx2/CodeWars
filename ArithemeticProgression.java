/* 7KYU CodeWars Arithemetic Progression

In your class, you have started lessons about arithmetic progression. 
Since you are also a programmer, you have decided to write a function 
that will return the first n elements of the sequence with the given 
common difference d and first element a. Note that the difference may 
be zero!

The result should be a string of numbers, separated by comma and space.

Example
# first element: 1, difference: 2, how many: 5
arithmetic_sequence_elements(1, 2, 5) == "1, 3, 5, 7, 9"

*/

class Progression {
  
  public static String arithmeticSequenceElements(int a, int d, long n) {
    StringBuilder sb = new StringBuilder();
    int temp = a;
    for (int i = 0; i < n; i++) {
      if (i == n - 1) {
        sb.append(String.valueOf(temp));
      }
      else {
        sb.append(String.valueOf(temp));
        sb.append(", ");
        temp += d;
      }
    }
    return sb.toString();
  }
    
}
/*-----------------------------------------------------------------------------------
import static java.util.stream.IntStream.iterate;
import static java.util.stream.Collectors.joining;

public class Progression {
  
  public static String arithmeticSequenceElements(int a, int d, long n) {
    return iterate(a, t -> t + d).limit(n).mapToObj(Integer::toString).collect(joining(", "));
  }
}
-------------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class Progression {

  public static String arithmeticSequenceElements(int first, int step, long total) {
    return LongStream.range(0, total)
      .map(i -> first + step * i)
      .mapToObj(Long::toString)
      .collect(Collectors.joining(", "));
  }

}
------------------------------------------------------------------------------------
class Progression {
  public static String arithmeticSequenceElements(int first, int step, long total) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < total; i++) {
      sb.append(first + step * i).append(", ");
    }
    return sb.delete(sb.length() - 2, sb.length()).toString();
  }
}
------------------------------------------------------------------------------------
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Progression {
  
  public static String arithmeticSequenceElements(int first, int step, long total) {
    return IntStream.iterate(0, i -> ++i)
                    .limit(total)
                    .map(i -> first + i * step)
                    .mapToObj(String::valueOf)
                    .collect(joining(", "));
  }    
}
------------------------------------------------------------------------------------
class Progression {
  
  public static String arithmeticSequenceElements(int f,int s,long t) {
    return f+(t==1?"":", "+arithmeticSequenceElements(f+s,s,--t));
  }
  
}
------------------------------------------------------------------------------------
class Progression {
  
  public static String arithmeticSequenceElements(int first, int step, long total) {
    String result = Integer.toString(first);
    int temp = first;
    
    for (int i = 1; i < total; i++) {
      temp += step;
      result += ", " + temp;
    }

    return result;
  }
    
}
*/