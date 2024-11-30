/*    7KYU CodeWars  Maximum Multiple

Input >> Output Examples
maxMultiple (2,7) ==> return (6)
Explanation:
(6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .

maxMultiple (10,50)  ==> return (50)
Explanation:
(50) is divisible by (10) , (50) is less than or equal to bound (50) , and (50) is > 0 .*

maxMultiple (37,200) ==> return (185)
Explanation:
(185) is divisible by (37) , (185) is less than or equal to bound (200) , and (185) is > 0 .

*/

public class MaximumMultiple {
  public static int maxMultiple(int divisor, int bound) {
    int x = 0;
    for (int i = divisor; i <= bound; i++) {
      if (i % divisor == 0) {
        x = i;
      }
    }
    return x;
  }
}

/*---------------------------------------------------------------------------
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return bound - (bound % divisor);
  }
}
--------------------------------------------------------------------------------
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return bound / divisor * divisor;
  }
}
--------------------------------------------------------------------------------
import static java.util.stream.IntStream.rangeClosed;

class MaxMultiple {
  static int maxMultiple(int divisor, int bound) {
    return rangeClosed(1, bound).filter(i -> i % divisor == 0).max().getAsInt();
  }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream; 
import java.util.*;

public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    // Your code here
    return IntStream
          .rangeClosed(0,bound)
          .filter(e -> e % divisor == 0)
          .max()
          .orElseThrow(NoSuchElementException::new);
  }
}
---------------------------------------------------------------------
import java.util.stream.Stream;

public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        return Stream.iterate(bound, n -> n-1).filter(it -> it % divisor == 0).findFirst().orElse(0);
    }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return IntStream.iterate(bound, i -> i-1).limit(bound).filter(n -> n % divisor == 0).findFirst().orElse(0);
  }
}
*/