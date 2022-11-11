/*  7KYU Beginner Series #3 Sum of Numbers
Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)


*/  
  
public class Sum
{
  public int GetSum(int a, int b)
    {
    //Good luck!
      int result = 0;
      if (b > a) {
          for (int i = a; i <= b; i++) {
             result += i;
         }
       }
       else {
         for (int i = b; i <= a; i++) {
           result += i;
         }
       }
      return result;
     }
  }
/*----------------------------------------------------------------
public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
}
-------------------------------------------------------------------
  public class Sum
  {
    public int GetSum(int a, int b) {
      int res = 0;
      for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
        res += i;
      }
      return a == b ? a : res;
    }
  }
--------------------------------------------------------------------
import java.util.stream.IntStream;
  
  public class Sum {
     public int GetSum(int a, int b) {
       return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
     }
  }
  ------------------------------------------------------------------
    public class Sum
  {
     public int GetSum(int smaller, int bigger)
     {
        if(bigger<smaller) {
          return GetSum(bigger,smaller);
        }
        else
        {
          /* use Euler's formula to sum up all numbers from 0 to bigger 
          /  and subtract the sum of numbers from 0 to smaller (exclusive)
          
          return (bigger+smaller)*(bigger-smaller+1)/2;
        }
     }
  }
-----------------------------------------------------------------------
  public class Sum {
    public static int GetSum(final int a, final int b) {
        int result = 0;

        if(a != b) {
            int lowestNumber = a < b ? a : b;
            int highestNumber = a > b ? a : b;

            for (int i = lowestNumber ; i <= highestNumber; i++) {
                result += i;
            }
        } else {
            result = a;
        }
        return result;
    }
  }

*/