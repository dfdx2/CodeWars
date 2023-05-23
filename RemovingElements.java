/* 8KYU CodeWars Removing Elements

Take an array and remove every second element from the array. 
Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!

*/

import java.util.ArrayList;
import java.util.List;
class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    // happy coding
    ArrayList<Object> result = new ArrayList<Object>();
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        result.add(arr[i]);
      }
    }
    Object[] r1 = result.toArray();
    return r1;    
  }
}
/*----------------------------------------------------------------------------
import java.util.*;
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    List<Object> list = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      if(i%2==0){
         list.add(arr[i]);
      }
    }
    return list.toArray();
  }
}
-------------------------------------------------------------------
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    Object[] output = new Object[(arr.length + 1) / 2];
    
    for (int i = 0; i < output.length; i++) {
        output[i] = arr[i * 2];
    }
    
    return output;
  }
}
----------------------------------------------------------------------------
import static java.util.stream.Stream.iterate;

interface Kata {
  static Object[] removeEveryOther(Object[] arr) {
    return iterate(0, i -> i < arr.length, i -> i + 2).map(i -> arr[i]).toArray();
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();
  }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
  
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] res = IntStream.range(0, arr.length)
                .filter(n->n % 2 == 0)
                .mapToObj(x -> arr[x])
                .collect(Collectors.toList())
                .toArray();
        return res;
}
  }


*/