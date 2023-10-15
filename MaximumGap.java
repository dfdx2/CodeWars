/* 7KYU CodeWars Maximum Gap (Array Series # 4)

Task
Given an array/list [] of integers , Find The maximum difference between the successive elements in its sorted form.

Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives and negatives also zeros_

Repetition of numbers in the array/list could occur.

The Maximum Gap is computed Regardless the sign.

Input >> Output Examples
maxGap ({13,10,5,2,9}) ==> return (4)
Explanation:
The Maximum Gap after sorting the array is 4 , The difference between 9 - 5 = 4 .
maxGap ({-3,-27,-4,-2}) ==> return (23)
Explanation:
The Maximum Gap after sorting the array is 23 , The difference between  |-4- (-27) | = 23 .

Note : Regardless the sign of negativity .

maxGap ({-7,-42,-809,-14,-12}) ==> return (767)  
Explanation:
The Maximum Gap after sorting the array is 767 , The difference between  | -809- (-42) | = 767 .

Note : Regardless the sign of negativity .



*/

import java.util.Arrays;
public class Solution {
    public static int maxGap(int[] numbers) {
      Arrays.sort(numbers);
      int result = 0;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i + 1] - numbers[i] > result) {
          result = numbers[i + 1] - numbers[i];
        }
      }
      return result;
    }
}
/*-----------------------------------------------------------------------------
public class Solution {
    public static int maxGap(int[] ary) {
      java.util.Arrays.sort(ary);
      int max = 0, prev = ary[0];
      for (int a : ary) { max = Math.max(a-prev, max); prev = a; }
      return max;
    }
}
-------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
public class Solution
{
    public static int maxGap(int[] numbers)
    {
    Arrays.sort(numbers);
        return IntStream.range(0, numbers.length-1)
        .map(i-> Math.abs(numbers[i+1]-numbers[i]))
        .max()
        .getAsInt();
        
        
    }
}
--------------------------------------------------------------------------------
import java.util.stream.*;
import java.util.Arrays;
public class Solution{
    public static int maxGap(int[] numbers){
        Arrays.sort(numbers);
        return IntStream.range(1,numbers.length).map(i -> numbers[i] - numbers[i-1]).max().getAsInt(); // Do your magic!
    }
}
---------------------------------------------------------------------------------
import java.util.Arrays;
public class Solution
{
    public static int maxGap(int[] numbers)
    {
        int maxGap = 0;
        Arrays.sort(numbers);
        for ( int i=1; i<numbers.length; i++)
           maxGap =  Math.max ( numbers[i]-numbers[i-1] , maxGap) ;
        
        return maxGap; 
    }
}
------------------------------------------------------------------------------
import static java.util.Arrays.sort;
import static java.util.stream.IntStream.range;

class Solution {
  static int maxGap(int[] numbers) {
    sort(numbers);
    return range(0, numbers.length - 1).sorted().map(i -> numbers[i + 1] - numbers[i]).max().orElse(0);
  }
}
--------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(1, numbers.length)
                        .map(i -> numbers[i] - numbers[i - 1])
                        .max()
                        .orElse(0);
    }
}

*/