/*    8KYU CodeWars Wilsom Primes 
Wilson primes satisfy the following condition. Let P represent a prime number.

Then ((P-1)! + 1) / (P * P) should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.

*/

public class WilsonPrime {
	public static boolean am_i_wilson(double n) {
    if (n == 5 || n ==13 || n == 563)
      return true;
    else
      return false;
  }
}
/*------------------------------------------------------------------------------------

public class WilsonPrime {
  public static boolean am_i_wilson(double n) {
    return n == 5 || n == 13 || n == 563;
  }
}
----------------------------------------------------------------------
import java.util.ArrayList;

public class WilsonPrime {
  public static boolean am_i_wilson(double n) {

    ArrayList<Double> onlyKnownWilsonPrimes = new ArrayList<Double>();
    onlyKnownWilsonPrimes.add(5d);
    onlyKnownWilsonPrimes.add(13d);
    onlyKnownWilsonPrimes.add(563d);

    return onlyKnownWilsonPrimes.contains(n);

  }

}
-------------------------------------------------------------------
public class WilsonPrime {
  public static boolean am_i_wilson(double n) {
    if(n < 2) 
      return false;
    
    for(int i = 2; i <= Math.sqrt(n); i++)
    {
      if(n % i == 0)
        return false;
    }
    
    return true;
  }
}
------------------------------------------------------------------
import java.math.BigInteger;

public class WilsonPrime {
  public static boolean am_i_wilson(double n) {
        if(n <= 1) return false;
        BigInteger number = new BigInteger(String.valueOf((int)n));
        return (factorial(n-1).add(BigInteger.valueOf(1))).remainder(number.pow(2)).equals(BigInteger.ZERO);
    }

    public static BigInteger factorial(double a) {
        BigInteger number = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= a; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
}
-----------------------------------------------------------------
public class WilsonPrime {
  public static boolean am_i_wilson(double n) {
      return n == 5.0 || n == 13.0 || n == 563.0; // Sorry, but these are the only known wilson primes...
    }
}
--------------------------------------------------------------------
public class WilsonPrime {
  public static boolean am_i_wilson(double n) {
    return n==5|n==13|n==563; // https://en.wikipedia.org/wiki/Wilson_prime
  }
}
--------------------------------------------------------------------

*/