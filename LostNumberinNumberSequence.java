/* 7KYU CodeWars Lost Number in Number Sequence

An ordered sequence of numbers from 1 to N is given. One number 
might have deleted from it, then the remaining numbers were mixed. 
Find the number that was deleted.

Example:

The starting array sequence is [1,2,3,4,5,6,7,8,9]
The mixed array with one deleted number is [3,2,4,6,7,8,1,9]
Your function should return the int 5.
If no number was deleted from the starting array, your function should 
return the int 0.

Note: N may be 1 or less (in the latter case, the first array will 
be []).

*/

import static java.util.stream.IntStream.of;
public class LostNumberinNumberSequence {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
      return arr.length == mixedArr.length ? 0 : arr.length * (arr.length + 1) / 2 - of(mixedArr).sum();
    }
}
/*--------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
       return IntStream.of(arr).sum() - IntStream.of(mixedArr).sum(); 
    }
}
-----------------------------------------------------------
import java.util.Arrays;

class Kata {
    static int findDeletedNumber(final int[] array, final int[] mixedArray) {
        if (array.length == 0) {
            return 0;
        }
        final int expectedSum = (array.length * (array[0] + array[array.length - 1])) / 2;
        final int sum = Arrays.stream(mixedArray).sum();
        return expectedSum - sum;
    }
}
-----------------------------------------------------------
public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
    return java.util.Arrays.stream(arr).sum() - java.util.Arrays.stream(mixedArr).sum();
}
}
-----------------------------------------------------------
import java.util.Arrays;
import java.util.stream.*;
public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        //Your code here
        int num1 = IntStream.of(arr).sum();
        int num2 = IntStream.of(mixedArr).sum();
        return num1-num2;
    }
}
-----------------------------------------------------------
public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        //Your code here
      int i;
      int j;
      for ( i = 0; i < mixedArr.length ; i++) {
        for( j = 0; j < arr.length ; j++) {
          if(mixedArr[i]==arr[j]){
            arr[j] = 0;
          }
        }
      }
      for(int elem:arr){
        if(elem != 0){
          return elem;
        }
      }
      return 0;
    }
}
-----------------------------------------------------------
public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        int sumArr = 0;
        int mixArr = 0;
        
        for(int i=0; i<arr.length; i++){
          sumArr+=arr[i];
        }
        
        for(int j=0; j<mixedArr.length; j++){
          mixArr+=mixedArr[j];
        }
        
        return sumArr-mixArr;
    }
}
-----------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return IntStream.of(arr).sum() - IntStream.of(mixedArr).sum();
    }
}
-----------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr)
                .filter(arrElement -> Arrays.stream(mixedArr).noneMatch(mixedElement -> arrElement == mixedElement))
                .findFirst()
                .orElse(0);
    }
}
----------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int findDeletedNumber(int[] arr, int[] mixedArr) {
    final int[] sortedArr = mixedArr.clone();
    Arrays.sort(sortedArr);
    return Arrays.stream(arr)
                 .filter(i -> Arrays.binarySearch(sortedArr, i) < 0)
                 .findFirst()
                 .orElse(0);
  }
}
*/