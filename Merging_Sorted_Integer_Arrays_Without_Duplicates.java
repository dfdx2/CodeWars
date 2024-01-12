/* 8KYU CodeWars Merging Sorted Integer Arrays Without Duplicates

Write a function that merges two sorted arrays into a single one. 
The arrays only contain integers. Also, the final outcome must be 
sorted and not have any duplicate.

*/

import java.util.Arrays;
import java.util.*;
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < first.length; i++) {
      if (!map.containsKey(first[i])) {
        map.put(first[i], 1);
      }
      else {
        int total = map.get(first[i]);
        map.put(first[i], total + 1);
      }
    }
    for (int i = 0; i < second.length; i++) {
      if (!map.containsKey(second[i])) {
        map.put(second[i], 1);
      }
      else {
        int total = map.get(second[i]);
        map.put(second[i], total + 1);
      }
    }
    int[] result = new int[map.size()];
    int count = 0;
    for (int key : map.keySet()) {
      result[count] = key;
      count++;
    }
    Arrays.sort(result);
    
    return result;
	}
}
/*---------------------------------------------------------------------
import java.util.stream.*;
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
	}
}
-----------------------------------------------------------------------
import static java.util.stream.IntStream.*;

public class Kata {

  public static int[] mergeArrays(int[] a, int[] b) {
    return concat(of(a), of(b)).sorted().distinct().toArray();
  }

}
------------------------------------------------------------------------
import java.util.TreeSet;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		TreeSet<Integer> set = new TreeSet<>();
        
    for (int x : first) set.add(x);
    for (int x : second) set.add(x);

    return set.stream().mapToInt(Integer::intValue).toArray();
	}
}
-----------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {
  	public static int[] mergeArrays(int[] first, int[] second) {
  		return IntStream
                .concat(IntStream.of(first), IntStream.of(second))
                .distinct()
                .sorted()
                .toArray();
  	}
}
------------------------------------------------------------------------
import static java.util.stream.IntStream.*;

class Kata {
  static int[] mergeArrays(int[] a, int[] b) {
    return concat(of(a), of(b)).sorted().distinct().toArray();
  }
}
-----------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] mergeArrays(int[] first, int[] second) {
        int[] tmpArray = new int[(first.length + second.length)];
        List<Integer> tmpList = new ArrayList<>();
        if(first.length == 0 && second.length == 0){
            return new int[] {};
        } else if(first.length == 0){
            System.arraycopy(second, 0, tmpArray, 0, second.length);
        } else if(second.length == 0){
            System.arraycopy(first, 0, tmpArray, 0, first.length);
        } else {
            System.arraycopy(first, 0, tmpArray, 0, first.length);
            System.arraycopy(second, 0, tmpArray, first.length, second.length);
        }
        return merging(tmpArray, tmpList);
    }

    private static int[] merging(int[] tmpArray, List<Integer> tmpList) {
        Arrays.sort(tmpArray);
        tmpList.add(tmpArray[0]);
        for (int i = 1; i < tmpArray.length; i++) {
            if (!checkNumberAlreadyExists(tmpArray[i], tmpList)) {
                tmpList.add(tmpArray[i]);
            }
        }

        int[] endArr = new int[tmpList.size()];
        for (int i = 0; i < endArr.length; i++) {
            endArr[i] = tmpList.get(i);
        }

        return endArr;
    }

    private static boolean checkNumberAlreadyExists(int number, List<Integer> tmpList) {
        for (Integer listNumber : tmpList) {
            if (number == listNumber) return true;
        }
        return false;
    }
}
------------------------------------------------------------------------
import java.util.*;
public class Kata {
	 public static int[] mergeArrays(int[] first, int[] second) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i: first) {
            result.add(i);
        }
        for (int i: second) {
            result.add(i);
        }
            Set<Integer> set = new HashSet<>(result);
            result.clear();
            result.addAll(set);
            int[] array = new int[result.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] += result.get(i);
            }
            Arrays.sort(array);
            return array;
        }
    }
-----------------------------------------------------------------------
import java.util.TreeSet;
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		TreeSet <Integer> treeSet =  new TreeSet<>();
    for( int number : first )
      treeSet.add( number );
    for( int number : second )
      treeSet.add( number );
    int[] finalOrder = new int[ treeSet.size() ];
    int counter = 0;
    for( int number : treeSet ){
      finalOrder[ counter ] = number;
      counter++;
    }//End for  
      
    return finalOrder;
	}
}
*/