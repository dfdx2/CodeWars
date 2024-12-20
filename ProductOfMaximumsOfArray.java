/* 7KYU CodeWars Product Of Maximums Of Array (Array Series 2)

Task
Given an array/list [] of integers , Find the product of the k maximal numbers.

Notes

Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives , negatives and zeros

Repetition of numbers in the array/list could occur.

Input >> Output Examples
maxProduct ({4, 3, 5}, 2) ==>  return (20)
Explanation:
Since the size (k) equal 2 , then the subsequence of size 2 whose gives 
product of maxima is 5 * 4 = 20 .  

maxProduct ({8, 10 , 9, 7}, 3) ==>  return (720)

Explanation:
Since the size (k) equal 3 , then the subsequence of size 3 whose gives 
product of maxima is  8 * 9 * 10 = 720 .

maxProduct ({10, 8, 3, 2, 1, 4, 10}, 5) ==> return (9600)

Explanation:
Since the size (k) equal 5 , then the subsequence of size 5 whose gives 
product of maxima is  10 * 10 * 8 * 4 * 3 = 9600 .

maxProduct ({-4, -27, -15, -6, -1}, 2) ==> return (4)

Explanation:
Since the size (k) equal 2 , then the subsequence of size 2 whose gives 
product of maxima is  -4 * -1 = 4 .

maxProduct ({10, 3, -1, -27} , 3)  return (-30)

Explanation:
Since the size (k) equal 3 , then the subsequence of size 3 whose gives 
product of maxima is 10 * 3 * -1 = -30 .

*/
import java.util.Arrays;
public class ProductOfMaximumsOfArray {
  public static long maxProduct(int[] numbers, int sub_size) {
    long result = 1;
    Arrays.sort(numbers);
    for (int i = numbers.length - sub_size; i < numbers.length; i++) {
      result *= numbers[i];
    }
    return result;
  }
}
/*-------------------------------------------------------------------
import java.util.Arrays;
public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
      Arrays.sort(numbers);
      int j = numbers.length - 1;
      int count = 0;
      long result = 1;
      while (count != sub_size) {
        result *= numbers[j];
        count++;
        j--;
      }
      return result;
    }
}
--------------------------------------------------------------------------
import static java.util.Arrays.stream;

public class Solution {
    public static long maxProduct(int[] numbers, int subSize) {
        return stream(numbers)
            .sorted()
            .skip(numbers.length-subSize)
            .mapToLong(Long::valueOf)
            .reduce(1, (x,y)->x*y);
    }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        long result = 1;
        for (int i = numbers.length-1;sub_size > 0;sub_size--,i--){
            result*=numbers[i];
        }
        return result; // Do your magic!
    }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
        return Arrays
                .stream(numbers)
                .sorted()
                .skip(numbers.length - sub_size)
                .boxed()
                .mapToLong(Integer::longValue)
                .reduce((x, y) -> x * y)
                .orElseThrow(() -> new NumberFormatException());
    }
}
------------------------------------------------------------------------------
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
        return IntStream.of(numbers).boxed().sorted(Comparator.reverseOrder()).limit(sub_size).mapToLong(Long::valueOf)
                .reduce(Long.valueOf(1), (subtotal, number) -> subtotal * number);
    }
}

*/