/*   5KYU CodeWars  Primes in Numbers 

Given a positive number n > 1 find the prime factor decomposition of n. 
he result will be a string with the following form :

"(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"

*/

public class PrimeDecomp {
    public static String factors(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (n == 1) {
                break;
            }

            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                builder.append(String.format("(%1$d%2$s)", i, count == 1 ? "" : String.format("**%1$d", count)));
            }
        }

        return builder.toString();
    }
}
/*------------------------------------------------------------------------------
public class PrimeDecomp {
   
    public static String factors(int n) {
        String result = "";
        int cur = n;
        for(int i = 2; i<=cur; i++){
            int ct = 0;
            while(cur%i == 0){
              ct += 1;
              cur = cur/i;
            }
            if(ct == 1)
                result  = result + "(" + i + ")";
            else if(ct > 1)
                result  = result + "(" + i + "**" + ct + ")";
        }
        return result;
    }
       
}
------------------------------------------------------------------------------
import java.util.*;
public class PrimeDecomp {
  public static String factors(int n) {
    final StringBuilder fs = new StringBuilder();
    for (int i = 2; i <= n; i++) {
      int cnt = 0;
      while (n % i == 0) {
        cnt++;
        n /= i;
      }
      if (cnt > 1) {
        fs.append(String.format("(%d**%d)", i, cnt));
      } else if (cnt == 1) {
        fs.append(String.format("(%d)", i));
      }
    }
    return fs.length() == 0 ? String.format("(%d)", n) : fs.toString();
  }
}





*/