/* 7KYU CodeWars Sorted? Yes? No? How?

Complete the method which accepts an array of integers, and returns 
one of the following:

"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one 
correct answer.

*/
class Solution {
  
  public static String isSortedAndHow(int[] array) {
    String ya = "yes, ascending";
    String yd = "yes, descending";
    String n = "no";
    if (array.length < 3) {
      if (array[0] < array[1]) {
        return ya;
      }
      else {
        return yd;
      }
    }
    for (int i = 0; i < array.length - 2; i++) {
      if (array[i] < array[i + 1] && array[i + 1] < array[i + 2]) {
        return ya;
      }
      else if (array[i] > array[i + 1] && array[i + 1] > array[i + 2]) {
        return yd;
      }
    }
    return n;
  }
  
}
/*-------------------------------------------------------------------------------
import java.util.stream.IntStream;

class Solution {

    public static String isSortedAndHow(int[] array) {
        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
            return "yes, ascending";

        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
            return "yes, descending";

        return "no";
    }

}
-----------------------------------------------------------------------------------
class Solution {
  
  public static String isSortedAndHow(int[] array) {
    boolean desc = false;
		boolean asc = false;
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i-1]) asc = true;
			if(array[i] < array[i-1]) desc = true;
		}
		if(asc && !desc) return "yes, ascending";
		if(desc && !asc) return "yes, descending";
		return "no";
  }
  
}
-----------------------------------------------------------------------------
class Solution {
  
  public static String isSortedAndHow(int[] array) {
      
      boolean isAscending = ascending(array);
      boolean isDescending = descending(array);
      
      if(isAscending == true) {
          return "yes, ascending";
      } else if(isDescending == true) {
          return "yes, descending";
      } else {
          return "no";
      }
      
  }
  
  private static boolean ascending(int[] array) {
    boolean isAscending = true;
    for(int i = 0; i < array.length - 1; i++) {
        if(array[i] > array[i + 1]) {
          isAscending = false;
          break;
        }
    }
    return isAscending;
  }
  
  private static boolean descending(int[] array) {
    boolean isDescending = true;
    for(int i = 0; i < array.length - 1; i++) {
        if(array[i] < array[i + 1]) {
          isDescending = false;
          break;
        }
    }
    return isDescending;
  }
  
}
-----------------------------------------------------------------------------
class Solution {

    public static String isSortedAndHow(final int[] array) {
        final boolean ascending = array[0] < array[1];

        for (int i = 2; i < array.length; i++) {
            if (ascending ? (array[i - 1] > array[i]) : (array[i - 1] < array[i])) {
                return "no";
            }
        }

        return String.format("yes, %s", ascending ? "ascending" : "descending");
    }
}
----------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Solution {
  static String isSortedAndHow(int[] array) {
    return range(1, array.length).noneMatch(i -> array[i - 1] > array[i]) ? "yes, ascending" : 
           range(1, array.length).noneMatch(i -> array[i - 1] < array[i]) ? "yes, descending" : "no";
  }
}
------------------------------------------------------------------------------
class Solution {
  
  public static String isSortedAndHow(int[] array) {
      boolean descending = true, ascending = true;
      for (int i = 1; i < array.length; i++) {
        if (array[i-1] < array[i]) descending = false;
        else ascending = false;
      }
      return ascending  ? "yes, ascending" : 
             descending ? "yes, descending" : "no";
  }
  
}
------------------------------------------------------------------------------
class Solution {
    public static String isSortedAndHow(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) break;
            if (i == ar.length - 1) return "yes, ascending";
        }
        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i] < ar[i + 1]) break;
            if (i == 0) return "yes, descending";
        }

        return "no";
    }
}
-------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Solution {
  
  public static String isSortedAndHow(int[] array) {
    if (range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1])) {
      return "yes, ascending";
    } else if (range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1])) {
      return "yes, descending";
    } else {
      return "no";
    }
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

class Solution {
  
  public static String isSortedAndHow(int[] array) {
      
    boolean ifAscending = IntStream
                          .range(0, array.length-1)
                          .allMatch(i -> array[i] <= array[i+1]);
        
    boolean ifDescending = IntStream
                          .range(0,array.length-1)
                          .allMatch(i -> array[i] >= array[i+1]);

        return ifAscending == true ? "yes, ascending" :
              ifDescending == true ? "yes, descending" : "no";
    
  }
  
}
------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

class Solution {
  
  public static String isSortedAndHow(int[] array) {
    Integer[] originalArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

    Integer[] sortedAsc = Arrays.copyOf(originalArray, originalArray.length);
    Arrays.sort(sortedAsc);

    Integer[] sortedDesc = Arrays.copyOf(originalArray, originalArray.length);
    Arrays.sort(sortedDesc, new Comparator<Integer>() {
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    });

    boolean isAsc = Arrays.deepEquals(originalArray, sortedAsc);
    boolean isDesc = Arrays.deepEquals(originalArray, sortedDesc);

    if (isAsc) {
      return "yes, ascending";
    } else if (isDesc) {
      return "yes, descending";
    } else {
      return "no";
    }
  }
  
}
------------------------------------------------------------------------------
public class Solution {
  
  public static String isSortedAndHow(int[] array) {
    boolean desc = false;
    boolean asc = false;
    for(int i = 1; i < array.length; i++) {
      if(array[i] > array[i-1]) asc = true;
      if(array[i] < array[i-1]) desc = true;
    }
    if(asc && !desc) return "yes, ascending";
    if(desc && !asc) return "yes, descending";
    return "no";
  
  }
  
}
*/