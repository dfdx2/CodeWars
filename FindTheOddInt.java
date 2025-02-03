/* 6 KYU CodeWars Find The Odd Int

Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

*/
import java.util.*;
public class FindTheOddInt {
    public static int findIt(int[] a) {
      Arrays.sort(a);
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < a.length; i++) {
        if (!map.containsKey(a[i])) {
          map.put(a[i], 1);
        }
        else {
          int total = map.get(a[i]);
          map.put(a[i], total + 1);
        }
      }
      for (int i = 0; i < a.length; i++) {
        if (map.get(a[i]) % 2 != 0) {
          return a[i];
        }
      }
      return -1;
    }
}
/*---------------------------------------------------------------------------------
import java.util.HashMap;

public class FindOdd {
	public static int findIt(int[] a) {
  	HashMap<Integer, Integer> counter = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      if (counter.containsKey(a[i])) {
        int val = counter.get(a[i]);
        counter.put(a[i], val + 1);
      }
      else {
        counter.put(a[i], 1);
      }
    }
    for (Integer x : counter.keySet()) {
      if (counter.get(x) % 2 != 0) {
        return x;
      }
    }
    return -1;
  }
}
-----------------------------------------------------------------------------------------------
public class FindOdd {
	public static int findIt(int[] A) {
  	int xor = 0;
    for (int i = 0; i < A.length; i++) {
    	xor ^= A[i];
    }
    return xor;
  }
}
-----------------------------------------------------------------------------------------------
import static java.util.Arrays.stream;

public class FindOdd {
  public static int findIt(int[] arr) {
    return stream(arr).reduce(0, (x, y) -> x ^ y);
  }
}
----------------------------------------------------------------------------------------------
public class FindOdd {
	public static int findIt(int[] A) {
  	int odd=0;
    for (int item: A)
      {
        odd = odd ^ item;
        // XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 
        // so every pair should cancel out leaving the odd number out
        
      }
    
    return odd;
  }
}
----------------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
	public static int findIt(int[] a) {
  	Map<Integer, Integer> counts = new HashMap<>(a.length);
    for(int i : a) {
      if(!counts.containsKey(i)) counts.put(i, 1);
      else counts.put(i, counts.get(i) + 1);
    }
    for(Map.Entry<Integer, Integer> entry : counts.entrySet()) if(entry.getValue() % 2 == 1) return entry.getKey();
    return 0;
  }
}
----------------------------------------------------------------------------
public class FindOdd {
	public static int findIt(int[] A) {
    int odd = 0;
    
    for (int i : A) {
      odd ^= i;
    }
  
  	return odd;
  }
}
-----------------------------------------------------------------------------------
public class FindOdd {

  /**********************************************************************************************
  * Given an array, find the int that appears an odd number of times.
  * 
  * PRECONDITION: There will always be only one integer that appears an odd number of times.
  ***********************************************************************************************
	public static int findIt(int[] A) {
    
    // for every int in A, check if that int appears an odd number of times
    for (int i : A) { 
      
      int temp = 0; // to get the number of times I find A[i];
      
      for (int j : A)
        if (j == i)  // get the number of A[i]'s in the array
          temp++;
          
      if (temp % 2 == 1) // if it is odd
        return i; // return the number that appeared an odd number of times
    }
    return 0;
  }
}
-----------------------------------------------------------------------------------
import java.util.TreeSet;

public class FindOdd {
    public static int findIt(int[] A) {
        final TreeSet<Integer> set = new TreeSet<>();
        for (int x : A) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return set.first();
    }
}

*/