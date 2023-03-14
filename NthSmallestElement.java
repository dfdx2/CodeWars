/* 7KYU CodeWars Nth Smallest Element (Array Series # 4)


Introduction and warm-up (highly recommended): Playing With Lists/Arrays Series

Task
Given an array/list of integers, find the Nth smallest element in the array.

Notes
Array/list size is at least 3.
Array/list's numbers could be a mixture of positives , negatives and zeros.
Repetition in array/list's numbers could occur, so don't remove duplications.
Input >> Output Examples
arr=[3,1,2]            n=2    ==> return 2 
arr=[15,20,7,10,4,3]   n=3    ==> return 7 
arr=[2,169,13,-5,0,-1] n=4    ==> return 2 
arr=[2,1,3,3,1,2],     n=3    ==> return 2 
Playing with Numbers Series
Playing With Lists/Arrays Series
More Enjoyable Katas

Enjoy Learning !!

*/
import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
      Arrays.sort(arr);  
      return arr[n - 1];
    }
}
/*-----------------------------------------------------------------
import static java.util.stream.IntStream.of;

class Kata {
  static int nthSmallest(int[] arr, int n) {
    return of(arr).sorted().limit(n).skip(n - 1).findFirst().orElse(0);
  }
}
--------------------------------------------------------------------
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
	    int[] sort = Arrays.stream(arr).sorted().toArray();
        return sort[n-1]; // Do your magic!
    }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        return IntStream.of(arr).sorted().limit(n).toArray()[n-1];
    }
}
---------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        return list.get(n-1);
    }
}
-----------------------------------------------------------------------
import java.util.*;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
          list.add(num);
        } 
        Collections.sort(list);
        return list.get(n - 1);
    }
}





*/
