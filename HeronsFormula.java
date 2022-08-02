/*   7KYU Heron's Formula

Write function heron which calculates the area of a triangle
with sides a, b, and c (x, y, z in COBOL).

Heron's formula:

s∗(s−a)∗(s−b)∗(s−c)\sqrt{s * (s - a) * (s - b) * (s - c)} 
s∗(s−a)∗(s−b)∗(s−c)
 
where

s = a+b+c2s = \frac{a + b + c} 2s= 
2
a+b+c

 
Output should have 2 digits precision.

*/

public class Kata {
  public static double heron(double a, double b, double c)
  {
    //code here
    double expected = (a + b + c) / 2;
    double result = Math.sqrt(expected * (expected - a) * (expected - b) * (expected - c));
    
    return result;
  }
}