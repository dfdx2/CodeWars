/* 8KYU CodeWars Powers Of 2

Complete the function that takes a non-negative integer n as input, 
and returns a list of all the powers of 2 with the exponent ranging 
from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]

*/

public class Kata{
  public static long[] powersOfTwo(int n){
    long[] result = new long[n + 1];
    int i = 0;
    while (i <= n) {
      result[i] = (long) Math.pow(2, i);
      i++;
    }
    return result;
  }
}
/*----------------------------------------------------------------------------
import static java.util.stream.LongStream.rangeClosed;

interface Kata {
  static long[] powersOfTwo(int n) {
    return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
  }
}
------------------------------------------------------------------------------
public class Kata {
  
  public static long[] powersOfTwo(int n) {
    long ret[] = new long[n + 1];
    for (int i = 0; i <= n; i++) ret[i] = 1L << i;
    return ret;
  }

}
--------------------------------------------------------------------------------
import java.util.stream.LongStream;

public class Kata {
    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
    }
}
----------------------------------------------------------------------------
class Kata {
  static long[] powersOfTwo(int n) {
    long r[] = new long[n + 1];
    while (n >= 0) r[n] = 1L << n--;
    return r;
  }
}
----------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Kata{
  public static long[] powersOfTwo(int n){
      List <Long> list1 = new ArrayList <Long> ();
	    for(int i = 0; i <= n; i++) {
	    	list1.add((long) Math.pow(2, i));
	    }
	    
	    return list1.stream().mapToLong(i -> i).toArray();
  }
}



*/