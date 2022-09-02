/*  7KYU CodeWars  Factorial

In mathematics, the factorial of a non-negative integer n, 
denoted by n!, is the product of all positive integers less 
than or equal to n. For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. 
By convention the value of 0! is 1.

Write a function to calculate factorial for a given input. 
If input is below 0 or above 12 throw an exception of type 
ArgumentOutOfRangeException (C#) or IllegalArgumentException 
(Java) or RangeException (PHP) or throw a RangeError 
(JavaScript) or ValueError (Python) or return -1 (C).

More details about factorial can be found here.

*/

public class Factorial {

  public int factorial(int n) {
    // Happy coding :-)
    int result = n;
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }
    
    if (n == 0) {
      result = 1;
    }
    for (int i = n - 1; i > 1; --i) {
      result = result * i;
    }
    return result;
  }
}

/*--------------------------------------------------------------------------

public class Factorial {
  public int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
    return n <= 1 ? 1 : n * factorial(n - 1);
  }
}
------------------------------------------------------------------------------

public class Factorial {

  public int factorial(int n) {
        if (n == 0)
            return 1;

        if (n < 0 || n > 12)
            throw new IllegalArgumentException();

        return n * factorial(n - 1);
    }
}


*/