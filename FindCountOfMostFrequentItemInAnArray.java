/* 7KYU CodeWars Find Count Of Most Frequent Item In An Array

Complete the function to find the count of the most frequent item 
of an array. You can assume that input is an array of integers. 
For an empty array return 0

Example
input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5 

*/

import java.util.*;
public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    Map<Integer, Integer> result = new HashMap<>();
    for (int c : collection) {
      if (!result.containsKey(c)) {
        result.put(c, 1);
      }
      else {
        int total = result.get(c);
        result.put(c, total + 1);
      }
    }
    int count = 0;
    for (Map.Entry<Integer, Integer> item : result.entrySet()) {
      if ((int) item.getValue() > count) {
        count = item.getValue();
      }
    }
    return count;
  }
}
/*----------------------------------------------------------------------------
public class Kata {
   public static int mostFrequentItemCount(int[] collection) {
    int most = 0;
    for (int i = 0; i<collection.length; i++){
    int count = 0;
      for(int x : collection){
      if (x==collection[i]){
      count++;
      }  
    } if (count>most){
    most=count;
    }
    } 
    return most;
  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    if (collection.length == 0) return 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer number : collection)
      map.put(number, map.containsKey(number) ? map.get(number)+1 : 1);
    return map.values().stream().max(Integer::compareTo).get();
  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
    int maxCount = 0;
    int count;
    for (int n: collection){
		  count = counter.getOrDefault(n, 0)+1;
    	counter.put(n, count);
    	maxCount = count > maxCount ? count : maxCount;
    }
    return maxCount;
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) 
            return 0;
            
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : collection) {
            Integer i = map.get(n);
            if (i == null) {
                map.put(n, 1);
            } else {
                map.put(n, i + 1);
            }
        }
        
        return map.entrySet().stream().max((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue())).get().getValue();
    }
}




*/