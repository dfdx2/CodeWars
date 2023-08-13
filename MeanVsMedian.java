/* 7KYU Mean vs Median

Your goal is to implement the method meanVsMedian which accepts an 
odd-length array of integers and returns one of the following:

'mean' - in case mean value is larger than median value
'median' - in case median value is larger than mean value
'same' - in case both mean and median share the same value

Reminder: Median

Array will always be valid (odd-length >= 3)

*/

import java.util.Arrays;
public class Solution {
  public static String meanVsMedian(int[] numbers) {
    Arrays.sort(numbers);
    int mean = 0;
    int center = (numbers.length / 2);
    int median = numbers[center];
    for (int i = 0; i < numbers.length; i++) {
      mean += numbers[i];
    }
    mean = mean / numbers.length;
    return (mean == median) ? "same" : (mean > median) ? "mean" : "median";
  }
}
/*------------------------------------------------------------------------
import java.util.Arrays;

public class Solution {

  public static String meanVsMedian(int[] numbers) {
    Arrays.sort(numbers);
    
    final double mean = Arrays.stream(numbers).average().getAsDouble();
    final double median = numbers[numbers.length / 2];
    return mean > median ? "mean" : (median > mean ? "median" : "same");
  }
}
--------------------------------------------------------------------------
import java.util.*;
public class Solution {
  public static String meanVsMedian(int[] numbers) {
    Arrays.sort(numbers);
    int median = numbers[numbers.length/2], sum = 0;
    for (int i : numbers) sum += i;
    if (sum / numbers.length == median) return "same";
    if (sum / numbers.length > median) return "mean";
    return "median";
  }
}
-------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

class Solution {
  static String meanVsMedian(int[] numbers) {
    int mean = (int) of(numbers).average().orElse(0.);
    int median = of(numbers).sorted().toArray()[numbers.length / 2];
    return mean > median ? "mean" : mean < median ? "median" : "same";
  }
}




*/