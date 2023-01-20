/*  7KYU CodeWars Heron's Formula


Write function heron which calculates the area of a triangle with 
sides a, b, and c (x, y, z in COBOL).

Heron's formula:
sqrt of sqrt * (sqrt − a) ∗ (sqrt − b) ∗ (sqrt − c)
​
where square root = a+b+c / 2
​ 
Output should have 2 digits precision.

*/

public class Kata {
  public static double heron(double a, double b, double c)
  {
    //code here
    double result = (a + b + c) / 2;
    double answer = Math.sqrt(result * (result - a) * (result - b) * (result - c));
    return answer;

  }
}
/*--------------------------------------------------------------
interface Kata {
  static double heron(double a, double b, double c) {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
}




*/