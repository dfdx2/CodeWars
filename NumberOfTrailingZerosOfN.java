/* 5KYU CodeWars Number of Trailing Zeros of N!

Write a program that will calculate the number of trailing zeros 
in a factorial of a given number.

N! = 1 * 2 * 3 *  ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html

Examples

N	Product	N factorial	Trailing zeros

6	1*2*3*4*5*6	720	1

12	1*2*3*4*5*6*7*8*9*10*11*12	479001600	2

Hint: You're not meant to calculate the factorial. Find another 
way to find the number of zeros.

*/
public class NumberOfTrailingZerosOfN {
  public static int zeros(int n) {
      return n / 5 + (n > 25 ? zeros(n / 5) : 0);
  }
}
/*------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
    int res = 0;
    for (int i = 5; i <= n; i *= 5) {
      res += n / i;
    }
    return res;
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
      if(n/5 == 0)
        return 0;
      return n/5 + zeros(n/5);
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
      int s = 0;
      while( n > 0 ){
        n /= 5;
        s += n;
      }       

      return s;
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
      int num = (int)( Math.log(n)/Math.log(5));
      int zeros = 0;
      for (int i = 1; i<=num; i++){
        zeros += n/Math.pow(5, i );
      }
      return zeros;
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
      // your beatiful code here
      int count = 0;
    int result = 0;
    int save = n;
    int k = 1;
    while(save >=5){
      count++;
      save = save/5;
    }
   while(k <=count){
     result += n/(int)(Math.pow(5,k));
     k++;
   }
    return result;
  
  
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
		int count = 0;
		while (n > 0) {
			n /= 5;
			count += n;
		}
		return count;
  }
}
--------------------------------------------------------------
public class Solution {
  public static int zeros(int n) {
      //it's good enough :P
      return n / 5 + n / 25 + n / 125 + n / 625 + n / 3125 + n / 15625 + n / 78125 + n / 390625 + n / 1953125 + n / 9765625 + n / 48828125 + n / 244140625;
  }
}
--------------------------------------------------------------
public class Solution {
    public static int zeros(int n) {
        int zeros = 0;
        int factor = 5;
        while (factor < n) {
            zeros = zeros + n / factor;
            factor = factor * 5;
        }
        return zeros;
    }
}
--------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {
  public static int zeros(int n) {
        int l = (int)(Math.log(n)/Math.log(5));
        return IntStream.rangeClosed(1, l).map(p -> (int)(n/Math.pow(5,p))).sum();
    }
}
*/