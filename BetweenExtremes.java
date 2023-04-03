/* 7KYU CodeWars Between Extremes

Given an array of numbers, return the difference between the 
largest and smallest values.

For example:

[23, 3, 19, 21, 16] should return 20 (i.e., 23 - 3).

[1, 434, 555, 34, 112] should return 554 (i.e., 555 - 1).

The array will contain a minimum of two elements. Input data range 
guarantees that max-min will cause no integer overflow.

*/
import java.util.Arrays;
public class Kata
{
  public static int betweenExtremes(int[] numbers)
  {
  
    Arrays.sort(numbers);
    return (int) Math.abs(numbers[0] - numbers[numbers.length - 1]);
  }
}
/*----------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class Kata {
  public static int betweenExtremes(int[] numbers) {
    IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();
    return stats.getMax() - stats.getMin();
  }
}
------------------------------------------------------------------------
public class Kata {

  public static int betweenExtremes(int[] numbers) {
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    for (int n : numbers) { if (n < min) min = n; if (n > max) max = n; }
    return max - min;
  }
  
}
------------------------------------------------------------------------
import java.util.*;
public class Kata
{
  public static int betweenExtremes(int[] numbers){
    int size = numbers.length;
    Arrays.sort(numbers);
    int big = numbers[size-1];
    int small = numbers[0];
    return big - small;
  }
}

*/