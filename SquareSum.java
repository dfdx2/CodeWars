/*  8KYU CodeWars Square Sum

Complete the square sum function so that it squares each number 
passed into it and then sums the results together.
For example, for [1, 2, 2] it should 
return 9 because 1^2 + 2^2 + 2^2 = 9.

*/

public class Kata
 {
  public static int squareSum(int[] n)
  { 
   //Your Code
    int result = 0;
    for (int i = 0; i < n.length; i++) {
      result += Math.pow(n[i], 2);
    }
    return result;
  }
 }
/*--------------------------------------------------------------------
OLD SOLUTION
public class Kata {
  public static int squareSum(int[] n) { 
     int power = 2;
     int sum = 0;
       for(int i = 0; i < n.length; i++) {
         sum += Math.pow(n[i], power);
       }
    return sum;
  }
}
--------------------------------------------------------------------
public class Kata {
    public static int squareSum(int[] numbers) { 
    int sum = 0;
    for (int n : numbers) {
        sum += n * n;
    }
   
    return sum;
    }
 }
--------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int squareSum(int[] xs) {
    return Arrays.stream(xs).map(x -> x * x).sum();
  }
}
--------------------------------------------------------------------
public class Kata
 {
  public static int squareSum(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      sum += n[i]*n[i];
    }
    return sum;
  }

 }
*/