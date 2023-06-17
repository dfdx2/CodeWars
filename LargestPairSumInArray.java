/* 7KYU CodeWars Largest Pair Sum In Array

Given a sequence of numbers, find the largest pair sum in the sequence.

For example

[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.

*/
import java.util.Arrays;
public class Solution{
    public static int largestPairSum(int[] numbers){
       Arrays.sort(numbers);
        return numbers[numbers.length-1]+numbers[numbers.length-2];
    }
}
/*---------------------------------------------------------------------------
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution{
    public static int largestPairSum(int[] numbers){
		return IntStream.of(numbers)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .limit(2)
                    .mapToInt(Integer::intValue)
                    .sum();
    }
}
------------------------------------------------------------------------------
public class Solution {
  
  public static int largestPairSum(int[] arr) {
    int a = Math.min(arr[0], arr[1]), b = Math.max(arr[0], arr[1]);
    for (int i = 2, x; i < arr.length; i++) 
      if ((x = arr[i]) >= b) { a = b; b = x; }
      else if (x > a) a = x;
    return a + b;
  }
  
}
------------------------------------------------------------------------
import java.util.Arrays;

public class Solution{
    public static int largestPairSum(int[] numbers){
      return Arrays.stream(numbers).map(x->-x).sorted().map(x->-x).limit(2).sum();
    }
}
-------------------------------------------------------------------------
import static java.util.Comparator.reverseOrder;
import static java.util.stream.IntStream.of;

interface Solution {
  static int largestPairSum(int[] numbers) {
    return of(numbers).boxed().sorted(reverseOrder()).limit(2).mapToInt(i -> i).sum();
  }
}




*/