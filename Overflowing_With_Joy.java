/* 7KYU CodeWars Overflowing With Joy

Multiply two ints, but take care of overflow. If the 
result cannot be accurately stored in an int, throw 
an ArithmeticException.

*/

public class Multiplier {
  public static int multiply(int a, int b) {
     return Math.multiplyExact(a, b);
  }
}
/*--------------------------------------------------------------
public class Multiplier {
  public static int multiply(int a, int b) {
    int result = a * b;
    if (result != (long) a * b) throw new ArithmeticException();
    return result;
  }
}
----------------------------------------------------------------
public class Multiplier {
  public static int multiply(int a, int b) throws ArithmeticException{
    if ((long) a * b > Integer.MAX_VALUE || (long) a * b < Integer.MIN_VALUE) throw new ArithmeticException();
    return a*b;
  }
}
----------------------------------------------------------------
class Multiplier {
  static int multiply(int a, int b) {
    if ((long) a * b != (a *= b)) {
      throw new ArithmeticException();
    }
    return a;
  }
}
----------------------------------------------------------------
import java.util.*;
public class Multiplier {
  public static int multiply(int a, int b) {
    long result = ((long) a) * b;
    if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      throw new ArithmeticException("too high");
    }
    return (int) result;
  }
}
----------------------------------------------------------------
public class Multiplier {
  public static int multiply(int a, int b) throws ArithmeticException {
    long result = (long) a*b;
    if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) throw new ArithmeticException("Overflow");
    return (int)result;
  }
}
----------------------------------------------------------------
public class Multiplier {
  public static int multiply(int a, int b) {
    int result;
    
    try {
    	result = Math.multiplyExact(a, b);
    } catch (ArithmeticException e) {
    	throw e;
    }
        
    return result;
  }
}
----------------------------------------------------------------
import java.math.BigInteger;

public class Multiplier {
  public static int multiply(int a, int b) {
    BigInteger bigA = BigInteger.valueOf(a);
    BigInteger bigB = BigInteger.valueOf(b);
    BigInteger bigResult = bigA.multiply(bigB);
    BigInteger bigMax = BigInteger.valueOf(Integer.MAX_VALUE);
    BigInteger bigMin = BigInteger.valueOf(Integer.MIN_VALUE);
    
    if ((bigResult.compareTo(bigMax) > 0) || (bigResult.compareTo(bigMin) < 0)) {
      throw new ArithmeticException();
    }

    return bigResult.intValue();
  }
}
----------------------------------------------------------------
public class Multiplier {
  public static int multiply(int a, int b) throws ArithmeticException {
      if ( b > 0 ? a >  Integer.MAX_VALUE/b || a < Integer.MIN_VALUE/b :
         (b  < -1 ? a > Integer.MIN_VALUE/b || a < Integer.MAX_VALUE/b :
         b == -1 && a == Integer.MIN_VALUE)) {
           throw new ArithmeticException("Integer overflow");
         }
         
         return a * b;
  }
}
----------------------------------------------------------------
import java.math.BigInteger;

public class Multiplier {
  public static int multiply(int a, int b) throws ArithmeticException {
    int result = a*b;
    BigInteger exact = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
    if(!exact.equals(BigInteger.valueOf(result))) throw new ArithmeticException();
    return result;
  }
}
*/