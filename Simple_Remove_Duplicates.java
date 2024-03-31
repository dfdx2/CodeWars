/* 7KYU Simple Remove Duplicates

Remove the duplicates from a list of integers, keeping the 
last ( rightmost ) occurrence of each element.

Example:
For input: [3, 4, 4, 3, 6, 3]

remove the 3 at index 0
remove the 4 at index 1
remove the 3 at index 3
Expected output: [4, 6, 3]

More examples can be found in the test cases.

Good luck!

*/
import java.util.*;
class Solution{
    public static int [] solve(int [] arr){
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
        if (!map.containsKey(arr[i])) {
          map.put(arr[i], 1);
        }
        else {
          int total = map.get(arr[i]);
          map.put(arr[i], total + 1);
        }
      }
      int count = 0;
      int[] result = new int[map.size()];
      for (int i = 0; i < arr.length; i++) {
        if (map.get(arr[i]) >= 2) {
          int total = map.get(arr[i]);
          map.put(arr[i], total - 1);
          continue;
        }
        else {
          result[count] = arr[i];
          count++;
        }
      }
      return result;
    }
}
/*--------------------------------------------------------------------------
import java.util.LinkedList;

interface Solution {
  static int[] solve(int[] arr) {
    var unique = new LinkedList<Integer>();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (!unique.contains(arr[i])) {
        unique.addFirst(arr[i]);
      }
    }
    return unique.stream().mapToInt(i -> i).toArray();
  }
}
----------------------------------------------------------------------------
import static java.util.stream.IntStream.of;
import static org.apache.commons.lang3.ArrayUtils.reverse;

interface Solution {
  static int[] solve(int[] arr) {
    reverse(arr);
    var unique = of(arr).distinct().toArray();
    reverse(unique);
    return unique;
  }
}
-----------------------------------------------------------------------------
class Solution {
    public static int [] solve(int [] arr) {
      var list = new java.util.ArrayList<Integer>();
      for (int a : arr) { list.removeIf(elem -> elem == a); list.add(a); }
      return list.stream().mapToInt(elem -> elem).toArray();
    }
}
----------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
class Solution{
    public static int [] solve(final int [] arr) {
        final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return IntStream
            .range(0, arr.length)
            .filter(i -> i == list.lastIndexOf(arr[i]))
            .mapToObj(i -> arr[i])
            .flatMapToInt(IntStream::of)
            .toArray();
    }
}
----------------------------------------------------------------------------
import java.util.Arrays;
class Solution{
    public static int [] solve(int [] arr){
        return Arrays.stream(arr)
          .mapToObj(a -> a)
          .sorted((a,b)->-1)
          .distinct()
          .sorted((a,b)->-1)
          .mapToInt(a -> a)
          .toArray();
    }
}
----------------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;

class Solution{
    public static int [] solve(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();
      
        for (int i = 0; i < arr.length; i++) {
          map.put(arr[i], i);
        }
      
        return map.entrySet().stream()
                             .sorted(Map.Entry.comparingByValue())
                             .mapToInt(e -> e.getKey())
                             .toArray();
    }
}
-----------------------------------------------------------------------------
import java.util.*;
class Solution{
  public static int [] solve(int [] a){
    var arr = new int[a.length];
    for (var x = 0; x < a.length; x++){
      arr[x] = a[a.length-1-x];
    }
    List<Integer> list = new ArrayList();
    for (var x : arr){
      if (!list.contains(x)){
        list.add(x);
      }
    }
    int[] lst = list.stream().mapToInt(i -> i).toArray();
    var result = new int[lst.length];
    for (var x = 0; x < lst.length; x++){
      result[x] = lst[lst.length-1-x];
    }
    return result;
  }
}
*/