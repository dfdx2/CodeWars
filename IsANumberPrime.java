/*   6KYU CodeWars  Is A Number Prime

Define a function that takes an integer argument and returns a 
logical value true or false depending on if the integer is a prime.

Per Wikipedia, a prime number ( or a prime ) is a natural number 
greater than 1 that has no positive divisors other than 1 and itself.

Requirements
You can assume you will be given an integer input.
You can not assume that the integer will be only positive. 
You may be given negative numbers as well ( or 0 ).
NOTE on performance: There are no fancy optimizations required, but still 
the most trivial solutions might time out. Numbers go up to 2^31 
( or similar, depending on language ). Looping all the way up to n, or n/2, 
will be too slow.

Example
is_prime(1)    false 
is_prime(2)    true  
is_prime(-1)   false 

*/

public class Prime {
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    else {
      int newnum = (int)Math.sqrt(num) + 1;
      for (int i = 2; i < newnum; i++) {
        if (num % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
/*---------------------------------------------------------------------------
public class Prime {
  public static boolean isPrime(int num) {
    return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
  }
}
------------------------------------------------------------------------------
public class Prime {

  public static boolean isPrime(int num) {
    // Filter out negative numbers, 0 and 1
    if (num <= 1)
      return false;
    // Factors of a number form pairs and the middle pair is the square root so no
    // reason to test numbers beyond that
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
-------------------------------------------------------------------------
public class Prime {
  public static boolean isPrime(int num) {
    if (num == 2) {
        return true;
    }
    
    if (num < 2 || num % 2 == 0) {
        return false;
    }

    for (int i = 3; num >= i*i; i+=2) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
  }
}
--------------------------------------------------------------------------
import java.math.BigInteger;
public class Prime {
    public static boolean isPrime(int num) {
    
        if (num < 2) { return false; }
    
        BigInteger result = BigInteger.valueOf(num);
        return result.isProbablePrime((int)Math.log(num));
    }
}
----------------------------------------------------------------------------
public class Prime {
  public static boolean isPrime(int num) {
    return num >= 0 && java.math.BigInteger.valueOf(num).isProbablePrime(42);
  }
}
----------------------------------------------------------------------------
import static java.math.BigInteger.valueOf;

class Prime {
  static boolean isPrime(int num) {
    return num > 1 && valueOf(num).isProbablePrime(10);
  }
}
---------------------------------------------------------------------------
import org.apache.commons.math3.primes.Primes;
public class Prime {
  public static boolean isPrime(int num) {
    return Primes.isPrime(num);
  }
}


*/