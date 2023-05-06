/* 7KYU CodeWars Greatest Common Divisor

Find the greatest common divisor of two positive integers. 
The integers can be large, so you need to find a clever solution.

The inputs x and y are always greater or equal to 1, so the greatest common 
divisor will always be an integer that is also greater or equal to 1.

*/

public class GCD {
    public static int compute(int x, int y) {
        int j = Math.max(x,y);
      int m = Math.min(x,y);
      int count = 1;
      int result = 0;
      while (count <= j) {
        if (m % count == 0 && j % count == 0) {
          result = count;
          count++;
        }
        else {
          count++;
        }
      }
      return result;
    }
}
/*-----------------------------------------------------------------------
public class GCD {
    public static int compute(int x, int y) {
        return (x % y != 0) ? compute(y, x % y) : y;
    }//Euclidean Algorithm
}
-------------------------------------------------------------------------
public class GCD {
    public static int compute(int x, int y) {
        //your code here
        int gcd = 0;
        for(int i=1; i<= x && i<= y; i++){
          if(x %i == 0 && y %i ==0){
            gcd = i;
          }
        }
        return gcd;
    }
}
--------------------------------------------------------------------------
class GCD {
  static int compute(int x, int y) {
    return x % y == 0 ? y : compute(y, x % y);
  }
}
--------------------------------------------------------------------------
import static java.math.BigInteger.valueOf;
import java.math.BigInteger;

public class GCD {
  public static int compute(int x, int y) {
    return valueOf(x).gcd(valueOf(y)).intValue();
  }
}



*/