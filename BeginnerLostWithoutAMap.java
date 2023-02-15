/*   8KYU  Beginner Lost Without A Map

Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

*/

public class Maps {
  public static int[] map(int[] arr) {
    
    for (int i = 0;  i < arr.length; i ++) {
      arr[i] = arr[i] * 2;
    }
    return arr;
  }
}
/*-------------------------------------------------------------------------
import java.util.*;
public class Maps {
  public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
  }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Maps {
  public static int[] map(int[] arr) {
    return IntStream.of(arr).map(i -> i*2).toArray();
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr)
                .map(s -> s*2)
                .toArray();
  }
}
------------------------------------------------------------------------------
*/