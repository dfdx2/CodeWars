/* 7KYU CodeWars GCD Sum

Given the sum and gcd of two numbers, return those two 
numbers in ascending order. If the numbers do not exist, 
return -1, (or NULL in C, tuple (-1,-1) in C#, pair (-1,-1) 
in C++,None in Rust, array {-1,-1}  in Java and Golang).

For example: 

Given sum = 12 and gcd = 4...

solve(12,4) = [4,8]. The two numbers 4 and 8 sum to 12 and have a gcd of 4.

solve(12,5) = -1. No two numbers exist that sum to 12 and have gcd of 5.

solve(10,2) = [2,8]. Note that [4,6] is also a possibility but we pick the one with the lower first element: 2 < 4, so we take [2,8].
More examples in test cases.

Good luck!

*/

class GCDsum{
    public static int[] solve(int s, int g){        
      int[] result = new int[2];
      int x = s - g;
      if ((s % g) != 0) {
        result[0] = -1;
        result[1] = -1;
        return result;
      }
      int a = Math.min(x,g);
      int b = Math.max(x,g);
      result[0] = a;
      result[1] = b;
      return result;
    }
}
/*------------------------------------------------------------------------------
class GCDsum{
    public static int[] solve(int s, int g){        
        return (s % g == 0) ? (new int[] {g, s-g}) : (new int[] {-1, -1});
    }
}
--------------------------------------------------------------------------------
class GCDsum{
    public static int[] solve(int s, int g){        
        //12-4=8 8-4=4
      int[] arr = new int[2];
    if (s % g == 0) {
      arr[0] = g;
      arr[1] = s - g;
    }
    else {
      arr[0] = arr[1] = -1;
    }
    return arr;
    }
}
--------------------------------------------------------------------------------
class GCDsum {
    public static int[] solve(int s, int g) {
        //..
        int first;
        int second;
        for (first = g; first < s; first += g) {
            for (second = first; second < s; second += g) {
                if ((first + second) == s) {
                    return new int[] {first, second};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
--------------------------------------------------------------------------------
import java.util.*;

class GCDsum{
    public static int[] solve(int s, int g){        
        //..
        int[] ans = new int[2];
        for (int i = 1 ; i <= s / 2 + 1; i++) {
            if (i % g == 0 & (s - i) % g == 0) {
                ans[0] = i;
                ans[1] = s - i;
                return ans;
            }
        }
        return new int[]{-1, -1};
    }
}
-------------------------------------------------------------------------------
import java.math.*;
class GCDsum{
    public static int[] solve(int s, int g){        
        for (int i = 2; i <= s / 2; i++) {
            int gcd = new BigInteger(i + "").gcd(new BigInteger(s - i + "")).intValue();
            if (gcd == g) {
                return new int[]{i, s - i};
            }
        }
        return new int[]{-1, -1};
    }
}
--------------------------------------------------------------------------------
class GCDsum{
    public static int[] solve(int s, int g){        
            for (int i = 1; i < s; i++) {
            if (i % g == 0) {
                int j = s - i;
                if (j % g == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
---------------------------------------------------------------------------------
class GCDsum{
    public static int[] solve(int s, int g){  
        if(s%g!=0)return new int [] {-1,-1};
        return new int [] {g,g*(s/g-1)};
      }
}
----------------------------------------------------------------------------------
class GCDsum{
    public static int[] solve(int s, int g){        
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; i < s; i++) {
            if ((s - i) % g == 0 && i % g == 0) {
                firstNumber = s - i;
                secondNumber = i;
            }
        }

        return firstNumber == 0 && secondNumber == 0 ? new int[]{-1, -1} : new int[]{firstNumber, secondNumber};
    }
}
---------------------------------------------------------------------------------
class GCDsum {

    public static int[] solve(int s, int g) {
        for (int i = 1; i <= s / 2; i++) {
            if(g == gcd(i, s - i)) return new int[] {Math.min(i, s - i), Math.max(i, s - i)};
        }
        return new int[] {-1, -1};
    }

    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a % b);
    }
}
*/