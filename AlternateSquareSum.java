/* 7KYU CodeWars Alternate Square Sum

Complete the function that takes an array of integers as input and 
finds the sum of squares of the elements at even positions 
(i.e. 2nd, 4th, etc.) plus the sum of the rest of the elements 
at odd position.

For empty arrays, result should be zero (except for Haskell).

Note
The values at even positions need to be squared. For a language with 
zero-based indices, this will occur at oddly-indexed locations. For 
instance, in Python, the values at indices 1, 3, 5, etc. should be 
squared because these are the second, fourth, and sixth positions 
in the list.

Example
[11, 12, 13, 14, 15]  -->  379
# 1.  2.  3.  4.  5.  position

11 + 12^2 + 13 + 14^2 + 15 = 379

*/

public class Kata {

  public static int alternateSqSum(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        result += arr[i] * arr[i];
      }
      else {
        result += arr[i];
      }
    }
    return result;
  }
} 
/*------------------------------------------------------------------------------
public class Kata {

  public static int alternateSqSum(int[] arr) {
    int sum = 0;
    for (int i=0; i<arr.length; i++) {
      sum += (i % 2 == 0) ? arr[i] : arr[i] * arr[i];
    }
    return sum;
  }
  
}
-------------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
  public static int alternateSqSum(int[] arr) {
    return IntStream.range(0, arr.length)
                    .map(i -> i % 2 == 1 ? arr[i] * arr[i] : arr[i])
                    .sum();
  }  
} 
--------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Kata {
  static int alternateSqSum(int[] arr) {
    return range(0, arr.length).map(i -> arr[i] * (i % 2 != 0 ? arr[i] : 1)).sum();
  }
}
--------------------------------------------------------------------------------
public class Kata {

  public static int alternateSqSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (i % 2){
                case 0:
                    sum += arr[i];
                    break;
                case 1:
                    sum += arr[i] * arr[i];
                    break;
            }
        }
        return sum;
    }
  
} 
----------------------------------------------------------------------------------



*/