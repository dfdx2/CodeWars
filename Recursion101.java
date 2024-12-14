/* 7KYU CodeWars Recursion 101

In this Kata, you will be given two positive integers a and b 
and your task will be to apply the following operations:

i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);

ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);

iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].

a and b will both be lower than 10E8.

*/

class Recursion101 {
    public static int [] solve(int a, int b){
      for (int i = 0; i < 3; i++) {
         a %= 2 * Math.max(b, 1);
         b %= 2 * Math.max(a, 1);
      }
      return new int[] {a, b};
    }
}
/*------------------------------------------------------------
interface Solution {
  static int[] solve(int a, int b) {
    if (a == 0 || b == 0) {
      return new int[]{a, b};
    } else if (a >= 2 * b) {
      return solve(a - 2 * b, b);
    } else if (b >= 2 * a) {
      return solve(a, b - 2 * a);
    }
    return new int[]{a, b};
  }
}
--------------------------------------------------------------
class Solution{
    public static int[] solve(int a, int b) {
      return a == 0 || b == 0 ? new int[]{a, b} :
             a >= 2 * b ? solve(a - 2 * b, b) :
             b >= 2 * a ? solve(a, b - 2 * a) : new int[]{a, b};
    }
}
--------------------------------------------------------------
class Solution{
    public static int [] solve(int a, int b){
        for (int i = 0; i < 24; ++i) {
            if (b>0) a %= 2 * b;
            if (a>0) b %= 2 * a;
        }       
      return new int []{a,b}; 
    }
}
--------------------------------------------------------------
class Solution {
  public static int [] solve(int a, int b) {
    int newa = a;
    int newb = b;
    while (newa != 0 && newb != 0) {
      if (newa >= 2 * newb) {
        newa -= 2 * newb;
        continue;
      }
      else if (newb >= 2 * newa) {
        newb -= 2 * newa;
      }
      else {
        break;
      }
    }
    return new int[]{newa, newb};
  }
}
--------------------------------------------------------------
class Solution{
    public static int [] solve(int a, int b){
      int[] result = {a,b};
        if(a == 0 || b == 0)
          return result;
        if(a >= 2 * b)
          return solve(a-2*b,b);
        if(b >= 2 * a)
          return solve(a,b-2*a);
        return result;
    }
}
--------------------------------------------------------------
class Solution{
  public static int[] solve(int a, int b) {
    if (a == 0 || b == 0) return new int[]{a, b};
    if (a >= 2 * b) return solve(a - 2 * b, b);
    if (b >= 2 * a) return solve(a, b - 2 * a);
    return new int[]{a, b};
  }
}
--------------------------------------------------------------
class Solution{
  public static int [] solve(int a, int b){
    if (a == 0 || b == 0) return new int[] {a,b};
    else if (a >= 2*b) return solve(a%(2*b), b);
    else if (b >= 2*a) return solve(a, b%(2*a));
    return new int[] {a,b};
  }
}
*/