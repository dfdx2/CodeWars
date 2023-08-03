/* 7KYU CodeWars Find Min And Max

Implement a function that returns the minimal and the maximal 
value of a list (in this order).

*/

import java.util.Collections;
import java.util.List;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    Collections.sort(list);
    int x = list.get(0);
    int y = list.get(list.size() - 1);
    int[] result = {x, y};
    return result;
  }
}
/*-------------------------------------------------------------------------

import java.util.List;

interface MinMax {
  static int[] getMinMax(List<Integer> list) {
    var stats = list.stream().mapToInt(i -> i).summaryStatistics();
    return new int[]{stats.getMin(), stats.getMax()};
  }
}
----------------------------------------------------------------------------
import java.util.List;
import java.util.Collections;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    int min = Collections.min(list);
    int max = Collections.max(list);
    return new int[] {min, max};
  }
}
------------------------------------------------------------------------------
import java.util.List;

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        final var stats = list.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        
        return new int[]{stats.getMin(), stats.getMax()};
    }
}
--------------------------------------------------------------------------------
import java.util.*;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    return new int[]{ Collections.min(list), Collections.max(list) };
  }
}
--------------------------------------------------------------------------------
import java.util.*;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    list.sort(Comparator.naturalOrder());
    return new int[] {list.get(0), list.get(list.size()-1)};
  }
}










*/