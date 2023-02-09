/* 8KYU CodeWars Area Of A Square

Complete the function that calculates the area of the red square, 
when the length of the circular arc A is given as the input. 
Return the result rounded to two decimals.

*/

import java.text.NumberFormat;
import java.util.Formatter;
import org.apache.commons.math3.util.Precision;

public class Geometry{
  public static double squareArea(double A){
    //your code; multiply the arc by 4    a * 4
    // divide that by 2 pi.     y = a * 4 / 2 pi
    // that is the solution
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    double radius = (A * 4) / (2 * Math.PI);
    double result = radius * radius;
    result = Precision.round(result, 2);
    return result;
  }
}
/*-----------------------------------------------------------------------------------
import java.math.BigDecimal;
public class Geometry{
  public static double squareArea(double A){
  
    return new BigDecimal(Math.pow((A*2/Math.PI),2))
                        .setScale(2, BigDecimal.ROUND_DOWN)
                        .doubleValue();
  }
}
--------------------------------------------------------------------------------------
public class Geometry{
  public static double squareArea(double A){
        double l = (2*A)/Math.PI;
        double x = l*l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}
--------------------------------------------------------------------------------------
class Geometry {
  static double squareArea(double A) {
    return Math.round(Math.pow(.636619 * A, 2) * 100) / 100.;
  }
}
-----------------------------------------------------------------------------------
public class Geometry{
  public static double squareArea(double A){
    
    double radius = (A*4) / (2 * Math.PI);
    
    double square = Math.pow(radius, 2);
  
    
    return  Math.round(square*100)/100D;
    
   
  }
}
-----------------------------------------------------------------------------------
public class Geometry {
  public static double squareArea(double a) {
    double radius = 2.0 * a / Math.PI;
    return roundToTwo(radius * radius);
  }
  
  private static double roundToTwo(double d) {
    int i = (int)(d * 100);
    return i / 100.0;
  }
}


*/