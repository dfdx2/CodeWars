/* 8KYU CodeWars Find The Integral

Create a function that finds the integral of the expression passed.

In order to find the integral all you need to do is add one to the 
exponent (the second argument), and divide the coefficient (the first argument) 
by that new number.

For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, 
and divided the coefficient by that new number).

Notes:

The output should be a string.
The coefficient and exponent is always a positive integer.

Examples
 3, 2  -->  "1x^3"
12, 5  -->  "2x^6"
20, 1  -->  "10x^2"
40, 3  -->  "10x^4"
90, 2  -->  "30x^3"

*/

public class Kata {

    public static String integrate(int coefficient, int exponent) {
        // TODO implement the integration
      int x = exponent + 1;
      int y = coefficient / x;
      String z = String.valueOf(y);
      String a = String.valueOf(x);
      return z + "x^" + a;
    }
  
}
/*-------------------------------------------------------------------------
public class Kata {
  public static String integrate(int coefficient, int exponent) {
    int newExponent = exponent + 1;
    return String.format("%dx^%d", coefficient / newExponent, newExponent);
  }
}
--------------------------------------------------------------------------
public class Kata {

    public static String integrate(int coefficient, int exponent) {
        return coefficient / ++exponent + "x^" + exponent;
    }
  
}
---------------------------------------------------------------------------
public class Kata {

    public static String integrate(int coefficient, int exponent) {
        return String.valueOf(coefficient/(exponent+1)+ "x^" + (exponent+1));
    }
}









*/