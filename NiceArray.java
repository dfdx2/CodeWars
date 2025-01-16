/* 7KYU CodeWars Nice Array

A Nice array is defined to be an array where for every value n in the array, there is also an element n - 1 or n + 1 in the array.

examples:

[2, 10, 9, 3] is a nice array because

 2 =  3 - 1
10 =  9 + 1
 3 =  2 + 1
 9 = 10 - 1

[4, 2, 3] is a nice array because

4 = 3 + 1
2 = 3 - 1
3 = 2 + 1 (or 3 = 4 - 1)

[4, 2, 1] is a not a nice array because

for n = 4, there is neither n - 1 = 3 nor n + 1 = 5
Write a function named isNice/IsNice that returns true if its array argument is a Nice array, else false. An empty array is not considered nice.



*/
import java.util.*;

public class NiceArray {
    public static boolean isNice(Integer[] arr){
      Map<Integer, Integer> map = new HashMap<>();
      if (arr.length < 1) {
        return false;
      }
      for (int i = 0; i < arr.length; i++) {
        if (!map.containsKey(arr[i])) {
          map.put(arr[i], 1);
        }
        else {
          int total = map.get(arr[i]);
          map.put(arr[i], total + 1);
        }
      }
      for (int i = 0; i < arr.length; i++) {
        int j = arr[i] - 1;
        int k = arr[i] + 1;
        if (map.containsKey(j) || map.containsKey(k)) {
          continue;
        }
        else {
          return false;
        }
      }
      return true;
    }
}
/*--------------------------------------------------------------------
import java.util.*;

public class Kata{
    public static boolean isNice(Integer[] arr){
      	       return Arrays.
                      stream(arr).
                      filter(i->(Arrays.asList(arr).contains(i+1) || Arrays.asList(arr).contains(i-1))).
                      count() == arr.length && arr.length > 1;

    }
}
----------------------------------------------------------------------
import java.util.*;

public class Kata{
    public static boolean isNice(Integer[] arr){
        Set<Integer> s = new HashSet<>(Arrays.asList(arr));
        for(Integer i:s){
            if(!s.contains(i-1) && !s.contains(i+1))
                return false;
        }
        return !s.isEmpty();
    }
}
----------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata{
    public static boolean isNice(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return (!set.isEmpty() && set.stream().allMatch(i -> (set.contains(i - 1) || set.contains(i + 1))));

    }
}
----------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static boolean isNice(Integer[] arr) {
        if (arr.length == 0 || arr == null) {
            return false;
        }

        List<Integer> arrAsList = Arrays.asList(arr);

        return arrAsList.stream().allMatch(num -> arrAsList.contains(num - 1) || arrAsList.contains(num + 1));
    }
    
}
----------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Kata{
    public static boolean isNice(Integer[] arr){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        return IntStream.range(0, arr.length).noneMatch(i -> !list.contains(arr[i] + 1) && !list.contains(arr[i] - 1)) && arr.length >= 2;
    }
}
*/