/* 8KYU CodeWars Compare Within Margin

Create a function close_compare that accepts 3 parameters: a, b, and an 
optional margin. The function should return whether a is lower than, close 
to, or higher than b.

a is considered "close to" b if margin is greater than or equal to the 
distance between a and b.

Please note the following:

When a is close to b, return 0.
Otherwise...

When a is less than b, return -1.

When a is greater than b, return 1.

If margin is not given, treat it as zero.

Assume: margin >= 0

Tip: Some languages have a way to make parameters optional.

*/

public class Solution {

  public static int closeCompare(double a, double b) {
    if (a >= b && a - b > 0) {
      return 1;
    }
    else if (a == b) {
      return 0;
    }
    else {
      return -1;
    }
  }
  
  public static int closeCompare(double a, double b, double margin) {
    if (a >= b && a - b > margin) {
      return 1;
    }
    else if (a >= b && (a - b) < margin) {
      return 0;
    }
    else if (b >= a && (b - a) > margin) {
      return -1;
    }
    else {
      return 0;
    }
  }
}
/*-------------------------------------------------------------------------------
public class Solution {

    public static int closeCompare(double a, double b, double margin) {
      return Math.abs(a - b) <= margin? 0 : a > b? 1 : -1;
    }
    
    public static int closeCompare(double a, double b) {
      return closeCompare(a,b,0);
    }
  
}
--------------------------------------------------------------------------------
interface Solution {
  static int closeCompare(double a, double b) {
    return closeCompare(a, b, 0);
  }
  
  static int closeCompare(double a, double b, double margin) {
    return margin < Math.abs(a - b) ? Double.compare(a, b) : 0;
  }
}
---------------------------------------------------------------------------------
public class Solution {

  public static int closeCompare(double a, double b) {
    return a > b ? 1 : a == b ? 0 : -1;
  }
  
  public static int closeCompare(double a, double b, double margin) {
    return margin >= Math.abs(b - a) ? 0 : a > b ? 1 : -1;
  }
}


*/