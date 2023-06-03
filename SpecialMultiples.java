/* 6KYU CodeWars Special Multiples

Some numbers have the property to be divisible by 2 and 3. Other smaller subset of numbers have the property to be divisible by 2, 3 and 5. Another subset with less abundant numbers may be divisible by 2, 3, 5 and 7. These numbers have something in common: their prime factors are contiguous primes.

Implement a function that finds the amount of numbers that have the first N primes as factors below a given limit.

Let's see some cases:

count_specMult(3, 200)  =>  6 

The first 3 primes are: 2, 3 and 5.

And the found numbers below 200 are: 30, 60, 90, 120, 150, 180.

*/
import java.math.BigInteger;
import java.util.TreeSet;

public class CountMultiples {
    private static TreeSet<Long> p = new TreeSet<>();
    public static long countSpecMult(long n, long mxval) {
      if (n == 0 || mxval == 0) {
        return 0;
      }
      for (long i = 2; p.size() < n; i++) {
        final long FI = i;
        if (p.stream().allMatch(x -> FI % x != 0)) {
          p.add(i);
        }
      }
      BigInteger y = BigInteger.valueOf(p.stream().limit(n).reduce((a, b) -> a * b).get());
      return BigInteger.valueOf(mxval).divide(y).longValue();   
    }
}
/*----------------------------------------------------------------------------
public class CountMultiples {
    
    private static boolean isPrime(long n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for(long i = 3; i <= Math.sqrt(n) + 1; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static long countSpecMult(long n, long mxval) {
        int i = 2, cnt = 1; long mul = 1;
        while (cnt <= n) {
            if (isPrime(i)) {
                cnt++;
                mul *= i;
            }
            i++;
        }
        return (int)Math.floor(mxval / mul);
    }
}
-----------------------------------------------------------------------------
public class CountMultiples {
    
    public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};

    public static long countSpecMult(long n, long mxval) {

        int d = 1;
        for (int i = 0; i < n; i++)
            d *= primes[i];

        return mxval / d;
    }
}
----------------------------------------------------------------------------
public class CountMultiples {

    public static boolean isPrime(int n) {
        if ((n == 2) || (n == 3)) {
            return true;
        }
        if ((n < 2) || (n % 2 == 0)) {
            return false;
        }
        for (int i = 3; i <= ((n/2)+1); i+=2) {
            if (n % i == 0) {
                return false; }
        } return true;
    }
  
    public static long countSpecMult(long n, long mxval) {
        if ((n == 0) || (mxval < 2)) {
            return 0;
        }
        int c = 0;
        long divisible = 1;
        for (int i = 2; c < n; i++) {
            if (isPrime(i)) {
                divisible *= i;
                c += 1;
            }
        } return mxval / divisible;
    }
}
-----------------------------------------------------------------------------
public class CountMultiples {
    
    public static long countSpecMult(long n, long m) {
         return (m/(c(n))); 
      }
      public static long c (long n ) { 
          long sum = 1 ; 
             for (int i =2 ;  ; i++) {  
                 boolean is = true ; 
                 for (int j =2 ; j <=Math.sqrt(i); j++) {  
                    if (i%j == 0 ) is = false; 
                 } 
               if (is == true ) {n--; sum*=i; } 
              if (n==0) return sum ; 
             }
          }
  }
---------------------------------------------------------------------------------
import java.math.BigInteger;

class CountMultiples {
  static long countSpecMult(long n, long mxval) {
    long product = 2;
    for (var i = BigInteger.valueOf(3); n-- > 1; i = i.nextProbablePrime()) {
      product *= i.longValue();
    }
    return mxval / product;
  }
}
---------------------------------------------------------------------------
import java.util.stream.LongStream;

public class CountMultiples {

    private static long[] generatePrimes(long maxValue) {
        return LongStream.iterate(2, i -> i + 1) //iteracja co 1
                .filter(x -> !(LongStream // filtruje liczby pierwsze
                        .rangeClosed(2, (long) (Math.sqrt(x)))
                        .anyMatch(n -> x % n == 0))).limit(maxValue).toArray();
    }

    public static long countSpecMult(long a, long mxval) {
        long multiply = 1, counter = 0;
        for (long x : generatePrimes(a)) {  
            multiply *= x;
        }
        for (long i = multiply; i < mxval; i += multiply) {
            counter++;
        }
        return counter;
    }
}

*/