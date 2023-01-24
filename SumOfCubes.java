/* 7KYU CodeWars Sum Of Cubes

Write a function that takes a positive integer n, sums all the 
cubed values from 1 to n, and returns that sum.

Assume that the input n will always be a positive integer.

Examples: (Input --> output)

2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)



*/

public class Solution{
  public static long sumCubes(long n)
  {
    //put your code here :D
    /* 1^3 = 1   2^3 = 8   3^3 = 27   3 cubes = 1 + 8 + 27 = 36
       4^3 = 64   4 cubes = 1 + 8 + 27 + 64 = 100;
       The sum of cubes is to sum a cube then add that to the total
     */
    double x = 0;
    for (int i = 0; i <= n; i++) {
      x = x + (long)Math.pow(i,3);
    }
    return x;
  }
}
/*----------------------------------------------------------------
public class Solution{
  public static long sumCubes(long n)
  {
    long sum=0;
    for(long i=1;i<=n;i++){
      sum+=(long)i*i*i;
    }
    return sum;
  }
}
------------------------------------------------------------------
interface Solution {
  static long sumCubes(long n) {
    return (n + n * n) * (n + n * n) / 4;
  }
}
------------------------------------------------------------------
public class Solution{
  public static long sumCubes(long n) {
    return java.util.stream.LongStream.rangeClosed(1, n).map(i -> i*i*i).sum();
  }
}
--------------------------------------------------------------------
public class Solution{
  public static long sumCubes(long n)
  {
    return n*n*(n+1)*(n+1)>>2;
  }
}
--------------------------------------------------------------------
import java.math.BigInteger;

public class Solution{
  public static long sumCubes(long n) {
    if(n > 77935) 
      throw new ArithmeticException("Result out of range for long. Input must be less than 77,936");
    return BigInteger.valueOf(n).add(BigInteger.ONE)
                                .multiply(BigInteger.valueOf(n))
                                .divide(BigInteger.TWO)
                                .pow(2)
                                .longValue();
  }
}
----------------------------------------------------------------------
import static java.util.stream.LongStream.rangeClosed;

interface Solution {
  static long sumCubes(long n) {
    return rangeClosed(1, n).map(l -> l * l * l).sum();
  }
}


*/