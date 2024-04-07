/* Triangular Treasure

Triangular numbers are so called because of the equilateral 
triangular shape that they occupy when laid out as dots. i.e.

1st (1)   2nd (3)    3rd (6)
*          **        ***
           *         **
                     *

You need to return the nth triangular number. You should return 0 
for out of range values:

For example: (Input --> Output)

0 --> 0
2 --> 3
3 --> 6
-10 --> 0

*/

public class Triangular {
    public static long triangular(long n) {
      return n > 0 ? n * (n + 1) / 2 : 0;
    }
}
/*--------------------------------------------------------------------------
public class Triangular {
    public static int triangular(int n) {
      int result = 0;
      for (int i = 1; i <= n; i++) result += i;
      return result;
    }
}
----------------------------------------------------------------------------
public class Triangular {
    public static int triangular(int n) {
      return (n==1) ? n : (n + triangular(n-1));
    }
}
----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Triangular {
    public static int triangular(int n) {
      return IntStream.range(1, n+1).sum();
    }
}
-----------------------------------------------------------------------------
public class Triangular {
    public static int triangular(int n) {
      if (n > 0) {
        return n * (n+1) / 2;
      } else {
        return 0;
      }
    }
}
-----------------------------------------------------------------------------
public class Triangular {
    public static int triangular(int n) {
    	int result = 0;
    	try {
        result = (n < 1) ? 0 : n*(n+1)/2;
      } catch (ArithmeticException e) {
      	result = 0;
      } finally {
      	return result;
      }
    }
}
----------------------------------------------------------------------------
public class Triangular {
    public static int triangular(int n) {
        if ( n < 0 ) return 0;
        return (n+1) * n / 2;
    }
}
*/