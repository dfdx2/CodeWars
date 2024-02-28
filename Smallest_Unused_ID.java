/* 8KYU CodeWars Smallest Unused ID

Hey awesome programmer!

You've got much data to manage and of course you use zero-based and 
non-negative ID's to make each data item unique!

Therefore you need a method, which returns the smallest unused ID for 
your next new data item...

Note: The given array of used IDs may be unsorted. For test reasons 
there may be duplicate IDs, but you don't have to find or remove them!

Go on and code some pure awesomeness!

*/

import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

public class Kata {
    public static int nextId(int[] ids) {
         return range(0, ids.length).filter(i -> of(ids).noneMatch(j -> j == i)).findFirst().orElse(ids.length);
    }
}
/*-------------------------------------------------------------------
public class Kata {
    public static int nextId(int[] ids) {
        int minId = 0;
        for (int i = 0; i < ids.length;) {
            if (minId == ids[i]) {
                minId += 1;
                i = 0;
            } else {
                i++;
            }
        }
        return minId;
    }
}
---------------------------------------------------------------------
public class Kata {
    public static int nextId(int[] ids) {
        int minId = 0;
        for (int i = 0; i < ids.length;) {
            if (minId == ids[i]) {
                minId += 1;
                i = 0;
            } else {
                i++;
            }
        }
        return minId;
    }
}
---------------------------------------------------------------------
public class Kata {
    public static int nextId(int[] ids) {
      int largest = 0;
      int smallest = -1;
    
      for (int num: ids) {
        if (num > largest) largest = num;
      } // O(n)
      
      boolean arr[] = new boolean[largest+1];
      
      for(int i = 0; i < arr.length; i++) {
        arr[i] = false;
      }  // O(n)
      
      for (int num: ids) {
        arr[num] = true;
      } // O(n)
      
      for(int i = 0; i < arr.length; i++) {
        if (arr[i] == false) {
          smallest = i; 
          break;
        }
      } // O(n)
      
      if (smallest == -1)  smallest = arr.length;
      
      
  	  return smallest; // time complexity = O(n)
    }
}
----------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int nextId(int[] ids) {
        Arrays.sort(ids);
        
        if (ids.length == 0) {
            return 0;
        }
      
        if (ids[0] != 0) {
            return 0;
        }

        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] + 1 != ids[i + 1] && ids[i] != ids[i + 1]) {
                return ids[i] + 1;
            }
        }

        return ids[ids.length - 1] + 1;
    }
}
----------------------------------------------------------------------
public class Kata {
  public static int nextId(int[] ids) {
    int[] array = java.util.Arrays.stream(ids).distinct().sorted().toArray();
    for (int i = 0; i < array.length; i++) {
      if (array[i] != i) return i;
    }
    return array.length;
  }
}
----------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static int nextId(int[] ids) {
        // Your code here
      int solution = 0;
      Arrays.sort(ids);
      for (int i = 0; i < ids.length;i++ ){
        if (ids[i] == solution) solution++;
      }
      
    	  return solution; 
    }
}
----------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static int nextId(int[] ids) {
        var list = Arrays.stream(ids)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; ; i++) if (!list.contains(i)) return i;
        
    }
}
-----------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int nextId(int[] ids) {
		var array = Arrays
				.stream(ids)
				.distinct()
				.sorted()
				.toArray();
		return IntStream
				.range(0, array.length)
				.filter(i -> i != array[i])
				.findFirst()
				.orElse(array.length);
	}
}
*/