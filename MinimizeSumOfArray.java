/* 7KYU CodeWars Minimize Sum Of Array (Array Series #1)

Task
Given an array of integers , Find the minimum sum which is obtained 
from summing each Two integers product .

Notes
Array/list will contain positives only .
Array/list will always have even size

Input >> Output Examples
minSum({5,4,2,3}) ==> return (22) 
Explanation:
The minimum sum obtained from summing each two integers product ,  5*2 + 3*4 = 22
minSum({12,6,10,26,3,24}) ==> return (342)

Explanation:
The minimum sum obtained from summing each two integers product ,  26*3 + 24*6 + 12*10 = 342
minSum({9,2,8,7,5,4,0,6}) ==> return (74)
Explanation:
The minimum sum obtained from summing each two integers product ,  9*0 + 8*2 +7*4 +6*5 = 74



*/

import java.util.Arrays;
public class Solution
{
    public static int minSum(int[] passed)
    {
      Arrays.sort(passed);
      int result = 0;
      int j = passed.length - 1;
      int i = 0;
      while (i < j) {
        result += passed[i] * passed[j];
        i++;
        j--;
      }
      return result; // Do your magic!
    }
}
/*------------------------------------------------------------------------

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
  public static int minSum(int[] passed) {
    //Do not mutate argument!
    final int[] array = passed.clone();
    Arrays.sort(array);
    return IntStream.range(0, array.length / 2)
                    .map(i -> array[i] * array[array.length - i - 1])
                    .sum();
  }
}
------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

import java.util.Arrays;

class Solution {
  static int minSum(int[] passed) {
    Arrays.sort(passed);
    return range(0, passed.length / 2).map(i -> passed[i] * passed[passed.length - 1 - i]).sum();
  }
}
--------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution{
    public static int minSum(int[] passed){
      List<Integer> list = new ArrayList<Integer>();
      for(Integer num:passed) {
         list.add(num);
      }
      int acc = 0;
      while(list.size() > 0){
        acc += (Collections.max(list) * Collections.min(list));
        list.remove(list.indexOf(Collections.max(list)));
        list.remove(list.indexOf(Collections.min(list)));
      }
        return acc; // Do your magic!
    }
}




*/