/* 7KYU CodeWars A Rule Of Divisibility By 7

A number m of the form 10x + y is divisible by 7 if and only 
if x − 2y is divisible by 7. In other words, subtract twice 
the last digit from the number formed by the remaining digits. 
Continue to do this until a number known to be divisible by 7 
is obtained; you can stop when this number has at most 2 digits 
because you are supposed to know if a number of at most 2 digits 
is divisible by 7 or not.

The original number is divisible by 7 if and only if the last number 
obtained using this procedure is divisible by 7.

Examples:
1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible 
by 7, 371 is divisible by 7.

The number of steps to get the result is 1.

2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.

3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible 
by 7, 372 is not divisible by 7.

4 - m = 477557101->47755708->4775554->477547->47740->4774->469->28 and 28 
is divisible by 7, so is 477557101. The number of steps is 7.

Task:
Your task is to return to the function seven(m) (m integer >= 0) an array 
(or a pair, depending on the language) of numbers, the first being the 
last number m with at most 2 digits obtained by your function (this last 
m will be divisible or not by 7), the second one being the number of steps 
to get the result.

Forth Note:
Return on the stack number-of-steps, last-number-m-with-at-most-2-digits 

Examples:
seven(371) should return [35, 1]
seven(1603) should return [7, 2]
seven(477557101) should return [28, 7]

*/
class DivSeven {
  public static long[] seven(long m) {
    long[] r1 = new long[2];
    int counter = 0;
    while (m > 99) {
      m = m / 10 - 2 * (m % 10);
      counter++;
    }
    r1[0] = m;
    r1[1] = counter;
    return r1;
  }
}
/*------------------------------------------------------------------------
import java.util.Arrays;

public class DivSeven {
    public static long[] seven(long m) {
        int cnt = 0;
        while (m > 99) {
            long a0 = m % 10;
            m = (m - a0) / 10 - 2 * a0;
            cnt++;
        }
        return new long[] {m, cnt};
    }
}
--------------------------------------------------------------------------
import java.util.Arrays;

class DivSeven {

    public static long[] seven(long m) {
        
        int n=0;
        while (m>99) {
            m = (m/10)-(m%10)*2;
            n++;
        }
        
        return new long[] {m, n};
        
    }
}
--------------------------------------------------------------------------
import java.util.Arrays;

class DivSeven {
  public static long[] seven(long m, int step) {
    if(m < 100) return new long[]{m, step};
    long x = m / 10L, y = m % 10, res = x - 2L * y;
    return seven(res, ++step);
  }
  public static long[] seven(long m) {
    return seven(m, 0);
  }
}
---------------------------------------------------------------------------
class DivSeven {
    public static long[] seven(long m) {
        long last = 0;
        long steps = 0;
        while (m >= 100)
        {
          last = m % 10;
          m = (m - last) / 10 - 2*last;
          steps++;
        }
        return new long[] {m,steps};
    }
}
---------------------------------------------------------------------------
class DivSeven {
    public static long[] seven(long m) {
        long b = 0;
        long a = m;
        int count = 0;
        while ((a + "").length() > 2) {
            b = a % 10;
            a = a / 10 - 2 * b;
            count++;
        }
        return new long[]{a, count};
    }
}
---------------------------------------------------------------------------
class DivSeven {
  
    public static long[] seven(long m) {
        return countingSeven(m, 0);
    }

    private static long[] countingSeven(long m, int i) {
        long a = m / 10;
        if (a >= 10) {
            return countingSeven(a - 2 * (m % 10), ++i);
        }
        return new long[]{m, i};
    }
}
---------------------------------------------------------------------------
*/