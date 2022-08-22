/*    7KYU CodeWars  Maximum Multiple

Input >> Output Examples
maxMultiple (2,7) ==> return (6)
Explanation:
(6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .

maxMultiple (10,50)  ==> return (50)
Explanation:
(50) is divisible by (10) , (50) is less than or equal to bound (50) , and (50) is > 0 .*

maxMultiple (37,200) ==> return (185)
Explanation:
(185) is divisible by (37) , (185) is less than or equal to bound (200) , and (185) is > 0 .

*/

public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    // Your code here
    int x = 0;
    for (int i = divisor; i <= bound; i++) {
      if (i % divisor == 0) {
        x = i;
      }
    }
    return x;
  }
}

/*---------------------------------------------------------------------------
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return bound - (bound % divisor);
  }
}
--------------------------------------------------------------------------------
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return bound / divisor * divisor;
  }
}
--------------------------------------------------------------------------------



*/