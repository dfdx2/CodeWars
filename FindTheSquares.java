/* 7KYU CodeWars Find The Squares

Problem

Complete the function that takes an odd integer (0 < n < 1000000) 
which is the difference between two consecutive perfect squares, 
and return these squares as a string in the format "bigger-smaller"

Examples

9  -->  "25-16"

5  -->  "9-4"

7  -->  "16-9"

*/
public class FindTheSquares{
  public static String findSquares(int n){
    long b = n /= 2;
    return (b * b + 2 * b + 1) + "-" + (b * b);
  }
}
/*---------------------------------------------------------
public class Solution {
  public static String findSquares(final int n) {
    final long a = (n + 1) / 2;
    final long b = a - 1;
    return String.format("%d-%d", a * a, b * b);
  }
}
-----------------------------------------------------------
public class Solution{
  public static String findSquares(int n){
    return (long) Math.pow(n / 2 + 1, 2) + "-" + (long) Math.pow(n / 2, 2);
  }
}
-----------------------------------------------------------
public class Solution{
  public static String findSquares(int n){
    if(n % 2 == 0) throw new IllegalArgumentException("n must be odd");
    if(n <= 0 || n >= 1000000) throw new IllegalArgumentException("n out of range");
    
    double bigger = Math.pow(n/2 + 1,2);
    double smaller = Math.pow(n/2 ,2);
    
    return String.format("%.0f-%.0f", bigger, smaller);
  }
}
-----------------------------------------------------------
public class Solution{
  public static String findSquares(int n){
      return String.format("%d-%d", (long)Math.pow((double)n/2 + 0.5, 2), (long)Math.pow((double)n/2 - 0.5, 2));
  }
}
*/
