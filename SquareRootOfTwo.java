/* 8KYU CodeWars Square Root of 2

The method of periodic continued fractions is one of the 
many ways to calculate the square root of a natural number. 
This method uses as denominator a repetition for fractions. 
This repetition can be done by a fixed number of times.

For example, by repeating 2 times the continued fraction to 
calculate the square root of 2, we have the following equation.

Input

The input is a natural number n (0 ≤ n ≤ 1000) that indicates 
the quantity of denominator repetitions in the continued fraction.

Output
The output is the approximate value of the square root with 10 
decimal places.

Examples

calculate(0) => 1.0000000000
calculate(1) => 1.5000000000
calculate(5) => 1.4142857143

Notes

https://en.wikipedia.org/wiki/Periodic_continued_fraction

*/

public class SquareRootOfTwo {

    /**
     * @param n quantity of denominator repetitions
     * @return the approximate value of the square root with 10 decimal places
     */
    public String calculate(int n) {
        return String.format("%.10f", 1 + (n > 0 ? 1 / (1 + Double.parseDouble(calculate(--n))) : 0));
    }
}
/*--------------------------------------------------------------------
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SquareRootOfTwo {

    
     * @param n quantity of denominator repetitions
     * @return the approximate value of the square root with 10 decimal places
    
    public String calculate(int n) {
        
       float f = 1;         
       
       DecimalFormat df = new DecimalFormat("0.0000000000");
       return(df.format(f + ca(n)));
    }
    
    private double ca(int n) {
       if(n == 0) {
         return 0;
       }
       return 1 / (2 + ca(n-1));
    }
}
----------------------------------------------------------------------
public class SquareRootOfTwo {

    
     * @param n quantity of denominator repetitions
     * @return the approximate value of the square root with 10 decimal places
     
    public String calculate(int n) {
      double tail = 0;
		  for (int i = n; i > 0; i--) {
			  tail = 1.0 / (2.0 + tail);
		  }
		  return String.format("%.10f", 1+tail);
    }

}
----------------------------------------------------------------------
public class SquareRootOfTwo {

  
   * @param n quantity of denominator repetitions
   * @return the approximate value of the square root with 10 decimal places
   
  public String calculate(int n) {
    return String.format("%.010f", c(n));
  }

  private double c(int n) {
    if (n == 0) return 1;
    double a = 0.5;
    n--;
    while (n-->0) {
      a = 1.0 / (2 + a);
    }
    return 1 + a;
  }
}
----------------------------------------------------------------------
public class SquareRootOfTwo {
  public static double f(int n){
    double r = 0;
    while (n>0){
      r = 1/(2+r);
      n--;
    }
    return 1+r;
  }
  public String calculate(int n){
    return String.format("%.10f",f(n));
  }
}
----------------------------------------------------------------------
public class SquareRootOfTwo {
    public String calculate(int n) {
        int one = 1;
        double half = 0;
        for (int i = 0; i < n; i++) {
            half = 1d/(2d + half);
        }
        return String.format(java.util.Locale.US,"%.10f", one + half);
    }
}
----------------------------------------------------------------------
class SquareRootOfTwo {
  public String calculate(int n){
    double r=1;
    while(n-->0) r=1+1/(1+r);
    return String.format("%,.10f",r);   
  }
}
----------------------------------------------------------------------
public class SquareRootOfTwo {
  public String calculate(int n) {
    var r = 1.0;
    while (n-- > 0) r = 1 + 1 / (1 + r);
    return String.format("%.10f", r);
  }
}
*/