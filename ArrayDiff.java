/* 6KYU CodeWars Array.diff

Your goal in this kata is to implement a difference function, 
which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in 
list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed 
from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, 
new int[] {2}) => new int[] {1, 3}

*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    Arrays.sort(b);
    for (int i : a) {
      if (Arrays.binarySearch(b, i) < 0) {
        result.add(i);
      }
    }
    int[] x2 = new int[result.size()];
    int y = 0;
    for (int j : result) {
      x2[y++] = j;
    }
    return x2;
  }
}
/*---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
  }

}
--------------------------------------------------------------------------------
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    
    for (int i = 0; i < b.length; i++)
      a = ArrayUtils.removeAllOccurences(a, b[i]);
    return a;
  }

}
----------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        loop:
        for (int num : a) {
            for (int i : b) if (num == i) continue loop;
            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


*/