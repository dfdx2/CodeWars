/* 6KYU CodeWars Find The Parity Outlier

You are given an array (which will have a length of at least 3, but 
could be very large) containing integers. The array is either 
entirely comprised of odd integers or entirely comprised of even 
integers except for a single integer N. Write a method that takes 
the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)

*/
public class FindOutlier {
  static int find(int[] integers) {
    int e = 0;
    int o = 0;
    int result = 0;
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] % 2 == 0) {
        e++;
      }
      else {
        o++;
      }
    }
    for (int i = 0; i < integers.length; i++) {
      if (e == 1) {
        if (integers[i] % 2 == 0) {
          result = integers[i];
          break;
        }
      }
      if (o == 1) {
        if (integers[i] % 2 != 0) {
          result = integers[i];
          break;
        }
      }
    }
    return result;
  }
}
/*------------------------------------------------------------------------
import java.util.Arrays;

public class FindOutlier{
    public static int find(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
--------------------------------------------------------------------------------
public class FindOutlier {

    static int find(int[] integers) {
        int oddcount = 0, odd = 0, evencount = 0, even = 0;
        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evencount++;
            } else {
                odd = i;
                oddcount++;
            }
            if (evencount > 0 && oddcount > 0) {
                if (evencount > 1) {
                    return odd;
                } else if (oddcount > 1) {
                    return even;
                }
            }
        }
        return evencount > 1 ? odd : even;
    }
}
----------------------------------------------------------------------------
import java.util.Arrays;

public class FindOutlier{
  static int find(int[] integers) {
		int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();	
		return array.length == 1 ? array[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
	}
}
-----------------------------------------------------------------------------
import java.util.Arrays;

public class FindOutlier{
  static int find(int[] integers){
    int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
    int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

    return odd.length == 1 ? odd[0] : even[0];
}
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutlier
{

  static int find(int[] integers)
  {
    
    Map<String, List<Integer>> map = new HashMap<>();

    String oddKey = "Odd";
    String evenKey = "Even";

    map.put(evenKey, Arrays.stream(integers)
      .boxed()
      .filter(value1 -> value1 % 2 == 0)
      .collect(Collectors.toList()));

    map.put(oddKey, Arrays.stream(integers)
      .boxed()
      .filter(value -> value % 2 != 0)
      .collect(Collectors.toList()));

    return map.get(oddKey).size()==1 ? map.get(oddKey).get(0) : map.get(evenKey).get(0);
  
  }
}

*/