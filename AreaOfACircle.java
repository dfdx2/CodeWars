/* 7KYU CodeWars Area Of A Circle

Complete the function which will return the area of a circle with the given radius.

Returned value is expected to be accurate up to tolerance of 0.01.

If the radius is not positive, throw IllegalArgumentException.

Example:

Circle.area(43.2673);     // returns 5881.248  (± 0.01)
Circle.area(68);          // returns 14526.724 (± 0.01)
Circle.area(0);           // throws IllegalArgumentException
Circle.area(-1);          // throws IllegalArgumentException

*/

public class Circle {
  public static double area(double radius) {
    double result = Math.PI * (radius * radius);
    if (radius <= 0) {
      throw new IllegalArgumentException();
    }
    return result;
  }
}
/*------------------------------------------------------------------------
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  public static double area(double radius) {
    if(radius <= 0D) {throw new IllegalArgumentException("Radius must be > 0");}
    return (new BigDecimal(Math.PI * radius * radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
-----------------------------------------------------------------------------
public class Circle {
  public static double area(double radius) {
    if (radius <= 0.0 || radius == Double.NaN) {
      throw new IllegalArgumentException();
    }
    return Math.round(Math.PI*(radius*radius) * 100.0) / 100.0;
  }
}
-----------------------------------------------------------------------------
public class Circle {
  public static double area(double radius) {
    if (radius <= 0 || Double.isNaN(radius)) throw new IllegalArgumentException();
    return Math.PI * Math.pow(radius,2);
  }
}


*/