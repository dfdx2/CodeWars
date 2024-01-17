/* 8KYU CodeWars Sum Of Multiples
Your Job
Find the sum of all multiples of n below m

Keep in Mind
n and m are natural numbers (positive integers)
m is excluded from the multiples
Examples
Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
Kata.sumMul(4, -7)  // throws IllegalArgumentException

*/
public class Kata {
    public static long sumMul(int n, int m) {
        return multi(n,m);
    }
  
  public static long multi(int a, int b) {
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException();
    }
    long result = 0;
    for (int i = 0; i < b; i+=a) {
      result += i;
    }
    return result;
  }
}
/*---------------------------------------------------------------
public class Kata {
    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) throw new IllegalArgumentException("n or m < 1");
        int x = (m - 1) / n;
        return (long) (n * 0.5 * x * (x + 1));
    }
}
-----------------------------------------------------------------
import java.util.stream.IntStream;
import java.lang.IllegalArgumentException;

public class Kata {
    public static long sumMul(int n, int m) {
        if(m <= 0 || n <= 0) {
          throw new IllegalArgumentException();
        }
        return IntStream.range(n, m).filter(i -> i % n == 0).sum();
    }
}
------------------------------------------------------------------
public class Kata {
    public static long sumMul(int n, int m) {
        if(n <= 0 || m <= 0){
          throw new IllegalArgumentException("n = " + n + " m = " + m);
        }
        long sum = 0;
          for(long i = n; i < m; i++){
              if(i%n == 0){
                sum += i;
              }
          }
        return sum;
    }
}
-----------------------------------------------------------------
public class Kata {
    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) throw new IllegalArgumentException();
        int x = m/n;
        int y = x - 1;
        return x * n == m ? (long) y*(y+1)/2*n : (long) x*(x+1)/2*n;
    }
}
-------------------------------------------------------------------
import static java.util.stream.LongStream.iterate;

public class Kata {

    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) throw new IllegalArgumentException();
        return iterate(n, i -> i < m, i -> i + n).sum();
    }
}
--------------------------------------------------------------------
import java.util.stream.LongStream;
public class Kata {
    public static long sumMul(int n, int m) {
        // TODO implement
      if (n <= 0 || m <= 0)
            throw new java.lang.IllegalArgumentException();
        return LongStream.range(n,m).filter(x -> x % n == 0).sum();
    }
}
-------------------------------------------------------------------
public class Kata {
    public static long sumMul(int n, int m) {
     if (n > 0 && m > 0) {
            long sum = 0;
            int pow = n;
            while (m > n) {
                sum += n;
                n += pow;
            }
            return sum;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
-------------------------------------------------------------------
interface Kata {
  static long sumMul(int n, int m) {
    if (n < 1 || m < 1) throw new IllegalArgumentException();
    return (m = --m / n) * ++m * n / 2;
  }
}
*/