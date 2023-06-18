/* 7KYU CodeWars Max Diff

You must implement a function that returns the difference between the 
largest and the smallest value in a given list / array (lst) received 
as the parameter.

lst contains integers, that means it may contain some negative numbers
if lst is empty or contains a single element, return 0
lst is not sorted
[1, 2, 3, 4]   //  returns 3 because 4 -   1  == 3
[1, 2, 3, -4]  //  returns 7 because 3 - (-4) == 7

Have fun!

*/
import java.util.Arrays;
public class Kata {

  public static int maxDiff(int[] lst) {
    Arrays.sort(lst);
    if (lst.length == 0 || lst == null) {
      return 0;
    }
    return lst[lst.length - 1] - lst[0];
  }
}
/*----------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {

  public static int maxDiff(int[] lst) {
    return lst.length == 0 ? 0 :
      Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
  }
}
------------------------------------------------------------------------------
import static java.util.Arrays.stream;

public class Kata {
  public static int maxDiff(final int[] lst) {
    return stream(lst).max().orElse(0) - stream(lst).min().orElse(0);
  }
}
-------------------------------------------------------------------------------
public class Kata {

  public static int maxDiff(int[] lst) {
  
    if(lst.length == 0) return 0;

    int min = lst[0], 
        max = lst[0];

    for(int i = 1; i < lst.length; i++)
      if(lst[i] < min) min = lst[i];
      else if(lst[i] > max) max = lst[i];

    return max - min;
  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
 
  public static int maxDiff(int[] lst) {
        int k=0;
        int b = 0;

        if(lst.length>=2) {
            k = Arrays.stream(lst).max().getAsInt();
            b = Arrays.stream(lst).min().getAsInt();
        }
        else
            return 0;
        return k-(b);

}
  }


*/
