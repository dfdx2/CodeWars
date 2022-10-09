/* 8KYU CodeWars  Find Nearest Square Number

Your task is to find the nearest square number, 
nearest_sq(n), of a positive integer n.

Goodluck :)

*/

public class CodeWarsMath {
  public static int nearestSq(final int n){
    int result = (int) Math.sqrt(n);
    if ((result * result) == n) {
      return n;
    }
    int higher = (result + 1) * (result + 1);
    int lower = result * result;
    int higher1 = higher - n;
    int lower1 = n - lower;
    
    if (higher1 > lower1) 
      return lower;
    else 
      return higher;
   
  }
}
/*-----------------------------------------------------------------
public class CodeWarsMath {
  public static int nearestSq(final int n){
    return (int) Math.pow(Math.round(Math.sqrt(n)),2);
  }
}
-------------------------------------------------------------------
public class CodeWarsMath {
  public static int nearestSq(int n) {
    int base = (int) Math.round(Math.sqrt(n));
    return base * base;
  }
}
------------------------------------------------------------------
public class CodeWarsMath {
    public static int nearestSq(final int n) {

        int m=n;
        int o=n;

        if (Math.sqrt(n)%1==0)
           return n;
        else
        {
            while (Math.sqrt(m)%1!=0)
            {
                m--;
            }
            while (Math.sqrt(o)%1!=0)
            {
                o++;
            }
            if(n-m<o-n)
                return m;
            else
                return o;
        }
    }
}
--------------------------------------------------------------------


*/