/* 8KYU CodeWars Sum Without Highest And Lowest Number

Task

Sum all the numbers of a given array ( cq. list ), except the highest and 
the lowest element ( by value, not by index! ).
The highest or lowest element respectively is a single element at each edge, 
even if there are more than one with the same value.
Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

Input validation
If an empty value ( null, None, Nothing etc. ) is given instead of an array, 
or the given array is an empty list or a list with only 1 element, return 0.

*/

import java.util.Arrays;
public class Kata
{
  public static int sum(int[] numbers)
  {
   if (numbers == null) {
      return 0;
    }
   Arrays.sort(numbers); 
    if (numbers.length == 0) {
      return 0;
    }
    int result = 0;
    for (int i = 1; i < numbers.length - 1; i++) {
      if (numbers[i]  == 0) {
        result += 0;
      }
      else if (numbers[i] == 'a') {
        result += 0;
      }
      else {
      result += numbers[i];
        }
    }
    return result;
  }
}
/*---------------------------------------------------------------------
public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
    int min,max,sum;
    sum = min = max = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
      sum += numbers[i];
      if (numbers[i] < min) min = numbers[i];
      if (numbers[i] > max) max = numbers[i];
    }
    return sum - min - max;
  }
}
------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

public class Kata {

  public static int sum(int[] numbers) {
    return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers) {
        if(numbers == null || numbers.length <= 2) return 0;
        int sum = 0;
        Arrays.sort(numbers);
        for(int i = 1; i < numbers.length-1; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
-------------------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers)
  {
    if(numbers == null || numbers.length < 2) return 0;
    Arrays.sort(numbers);
    return Arrays.stream(numbers).skip(1).limit(numbers.length-2).sum();
  }
}




*/
