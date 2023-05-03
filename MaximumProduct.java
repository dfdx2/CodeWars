/* 7KYU CodeWars Maximum Product

Task
Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.

Notes
Array/list size is at least 2.

Array/list numbers could be a mixture of positives, negatives also zeroes .

Input >> Output Examples
adjacentElementsProduct([1, 2, 3]); ==> return 6
Explanation:
The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
Explanation:
Max product obtained from multiplying 5 * 10  =  50 .

adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
Explanation:
The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array.

*/

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    int result =-10000;
    for (int i = 1; i < array.length; i++) {
      int x = array[i] * array[i - 1];
      if (x > result) {
        result = x;
      }
    }
    return result;
  }
}
/*------------------------------------------------------------------------
public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < array.length-1; i++)
      ans = Math.max(ans,array[i]*array[i+1]);
    return ans;
  }
}
-----------------------------------------------------------------------------
import java.util.stream.*;
public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    return IntStream.range(1, array.length)
                    .map(i -> array[i - 1] * array[i])
                    .max()
                    .getAsInt();
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
   return IntStream.range(1, array.length).map(x-> array[x] * array[x - 1]).max().getAsInt();
  }
}
------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            integers.add(array[i] * array[i + 1]);
        }
        return Collections.max(integers);
  }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    return IntStream.range(0, array.length - 1)
                .mapToLong(i -> array[i] * array[i + 1])
                .boxed()
                .max(Long::compare)
                .get()
                .intValue();
  }
}
--------------------------------------------------------------------------
import java.util.*;


public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    // your code here
    
      List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            list.add(array[i] * array[i+1]);
        }
         if(list.size()<1){
            return -2147483648;
        }
        Collections.sort(list);
        return list.get(list.size()-1);
  }
}

*/