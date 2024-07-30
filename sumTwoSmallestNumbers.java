/* Sum of two lowest positive integers

Create a function that returns the sum of the two lowest 
positive numbers given an array of minimum 4 positive integers. 
No floats or non-positive integers will be passed.

For Java, those integers will come as double precision (long).

For example, when an array is passed like [19, 5, 42, 2, 77], 
the output should be 7.

[10, 343445353, 3453445, 3453545353453] should return 3453455.

*/
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
    long[] test = new long[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      test[i] = numbers[i];
    }
    Arrays.sort(test);
    return test[0] + test[1];
  }             
}
/*---------------------------------------------------------------------
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
     return Arrays.stream(numbers)
                    .sorted()
                    .limit(2)
                    .sum();
  }             
}
-----------------------------------------------------------------------
import static java.util.stream.LongStream.of;

interface Kata {
  static long sumTwoSmallestNumbers(long[] numbers) {
    return of(numbers).sorted().limit(2).sum();
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
     Arrays.sort(numbers);
    return numbers[0]+numbers[1]; 
  }             
}
-----------------------------------------------------------------------
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
     //Your solution here
    
    Arrays.sort(numbers);
    
    
    
    return numbers[0] + numbers[1]; 
  }             
}
-----------------------------------------------------------------------
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
     Arrays.sort(numbers);
    long result = 0;
    result += numbers[0];
    result += numbers[1];
    return result;
  }             
}
-----------------------------------------------------------------------
public class Kata {
    public static long sumTwoSmallestNumbers(final long[] numbers) {
        // Initialize the smallest and second smallest values to the maximum possible long value
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        // Iterate through the array
        for (long num : numbers) {
            if (num < min1) {
                // Update the smallest and second smallest values
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                // Update only the second smallest value
                min2 = num;
            }
        }

        // Return the sum of the two smallest numbers
        return min1 + min2;
    }
}
-----------------------------------------------------------------------
import java.util.Arrays;
class Kata{
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        //Your solution here
        Arrays.sort(numbers);
        try {
            long sum = numbers[0] + numbers[1];
            return sum;
        }catch (NullPointerException e){
            return 0L;
        }
    }
}
*/
