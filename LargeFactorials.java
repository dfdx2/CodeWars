/*    4KYU CodeWars  Large Factorials

In mathematics, the factorial of integer n is written as n!. 
It is equal to the product of n and every integer preceding it. 
For example: 5! = 1 x 2 x 3 x 4 x 5 = 120
Your mission is simple: write a function that takes an integer n 
and returns the value of n!.
You are guaranteed an integer argument. For any values outside 
the non-negative range, return null, nil or None 
(return an empty string "" in C and C++). For non-negative numbers 
a full length number is expected for example, return 25! =  
"15511210043330985984000000"  as a string.

For more on factorials, see http://en.wikipedia.org/wiki/Factorial
NOTES:
The use of BigInteger or BigNumber functions has been disabled, 
this requires a complex solution

*/

import java.math.BigInteger;
public class Kata
{

  public static String Factorial(int n) {
    return great(BigInteger.valueOf(n)).toString();
  }
  public static BigInteger great(BigInteger n) {
    if (n.intValue() <= 1) {
      return BigInteger.valueOf(1);
    }
    else {
      return n.multiply(great(n.subtract(BigInteger.valueOf(1))));
    }
  }
}
/*-------------------------------------------------------------------------------------------
 import java.math.BigInteger;
public class Kata
{
  public static String Factorial(int n) {
    if(n < 0) return null;
    BigInteger a = new BigInteger("1");
    for(int i = 1; i < n + 1; i++) a = a.multiply(new BigInteger("" + i));
    return a.toString();
  }
}
________________________________________________________________________________________

import java.math.BigInteger;

public class Kata
{
  public static String Factorial(int n) {
    return java.util.stream.IntStream.rangeClosed(1, n)
        .mapToObj(i -> BigInteger.valueOf(i))
        .reduce(BigInteger.ONE, (acc, i) -> acc.multiply(i))
        .toString();
  }
}










*/