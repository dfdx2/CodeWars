/* 8KYU CodeWars Sum of Differences in Array

Your task is to sum the differences between consecutive pairs 
in the array in descending order.

Example
[2, 1, 10]  -->  9
In descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result 
should be 0 (Nothing in Haskell, None in Rust).

*/

import java.util.Arrays;
public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    //your code;
    Arrays.sort(arr);
    int result = 0;
    for (int i = 1; i < arr.length; ++i) {
      if (arr.length < 1) {
        result = 0;
      }
      else {
      result += arr[i] - arr[i - 1];
        }
      
    }
      return result;
  }
}

/*--------------------------------------------------------------------

import java.util.Arrays;

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
  }
}
-------------------------------------------------------------------------

import java.util.*;

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
    return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;
  }
}
--------------------------------------------------------------------------

import java.util.Comparator;
import java.util.stream.IntStream;

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    int[] array = IntStream.of(arr)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
   return IntStream.range(0, array.length - 1)
                   .map(i -> array[i] - array[i + 1])
                   .sum();
  }
}
---------------------------------------------------------------------------------

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    if(arr.length < 2) return 0;
    
    int min = Integer.MAX_VALUE, 
        max = Integer.MIN_VALUE;
    
    for(int i: arr) {
       if(i < min) min = i;
       if(i > max) max = i;
    }
    
    return max - min;
  }
}
-------------------------------------------------------------------------------------

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    if (arr.length < 2) return 0;
    int max = arr[0], min = max;
    for (int a : arr) if (a > max) max = a; else if (a < min) min = a;
    return max - min;
  }
}

*/