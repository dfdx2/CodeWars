/* 7KYU CodeWars Show Multiples Of 2 Numbers Within A Range 

Print all numbers up to 3rd parameter which are multiple of 
both 1st and 2nd parameter.

Python, Javascript, Java, Ruby versions: return results in a list/array

NOTICE:

Do NOT worry about checking zeros or negative values.
To find out if 3rd parameter (the upper limit) is inclusive or not, 
check the tests, it differs in each translation

*/

import java.util.*;
public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
      List<Integer> arr = new ArrayList<Integer>();
      int x = s2;
      while (x < s3) {
        if (x % s1 == 0 && x % s2 == 0) {
          arr.add(x);
          x++;
        }
        else {
          x++;
        }
      }
      return arr;
    }
}
/*----------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
      return IntStream.range(1, s3).filter(i -> i%s1==0 && i%s2==0).boxed().collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
      List<Integer> arr = new ArrayList<Integer>();
      
      for(int i=1;i<s3;i++) {
        if( (i%s1 == 0) && (i%s2 == 0)) {
          arr.add(i);
        }
      }
      
      return arr;
    }
}
--------------------------------------------------------------------------------
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Solution {

    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        return IntStream.range(1, s3)
                        .filter(i -> i % s1 == 0 && i % s2 == 0)
                        .boxed()
                        .collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------------
import java.util.*;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
      var arr = new ArrayList<Integer>();
      for (int min = Math.min(s1,s2), max = Math.max(s1,s2), i = max; i < s3; i += max)
        if (i % min ==0) arr.add(i);
      return arr;
    }

}
-------------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
  public static List<Integer> findMultiples(int s1, int s2, int s3) {
    return IntStream.range(1, s3)
                    .filter(i -> i % s1 == 0 && i % s2 == 0)
                    .boxed()
                    .collect(Collectors.toList());
  }
}
*/