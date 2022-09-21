/*  8 KYU CodeWars  Sum Of Positive  

You get an array of numbers, return the sum of all 
of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

*/

public class Positive{

  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        sum = sum + arr[i];
      }
    }
    return sum;
  }

}
/*-----------------------------------------------------------------

import java.util.stream.*;
public class SumOfPositive{
  public static int sum(int[] input) {
    return IntStream.of(input)
      .filter(i -> i > 0)
      .sum();
  }
}
-------------------------------------------------------------------
import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
------------------------------------------------------------------
public class Positive{

  public static int sum(int[] arr){
    // check for emtpy array
    if(arr.length == 0) return 0;
    // add all positive ints to the sum & return the result
    else {
      int sum = 0;
      for(int num : arr){
        sum = (num > 0 ? sum + num : sum);
      }
      return sum;
    }
  }
}
--------------------------------------------------------------------
public class Positive{

  public static int sum(int[] arr){
    int sum = 0;
    
    // Adds all positive numbers to the sum variable
    for(int num : arr) sum += num > 0 ? num : 0;
    
    return sum;
  }
}

*/