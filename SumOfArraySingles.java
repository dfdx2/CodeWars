/* 7KU CodeWars Sum of Array Singles

In this Kata, you will be given an array of numbers in which two numbers 
occur once and the rest occur only twice. Your task will be to return the 
sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 
occur once, and their sum is 15. Every other number occurs twice.

More examples in the test cases.

Good luck!

If you like this Kata, please try:

Sum of prime-indexed elements

Sum of integer combinations

*/
import java.util.Arrays;
class Solution{
    public static int repeats(int [] arr){
      Arrays.sort(arr);
      int result = 0;
      int x = arr.length - 1;
      int y = arr.length - 2;
      for (int i = 1; i < arr.length - 1; i++) {
        if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
          result += arr[i];
        }
      }
      if (arr[x] != arr[y]) {
        result = result + arr[x];
      }
      if (arr[0] != arr[1]) {
        result += arr[0];
      }
      return result;
    }
}
/*------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
    public static int repeats(int[] arr) {
        return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();
    }
}
---------------------------------------------------------------------------
import java.util.Set;
import java.util.HashSet;

class Solution{
    public static int repeats(int [] arr) {
      Set<Integer> numbers = new HashSet<>();
      int sum = 0;
      for (int num : arr) {
        if (numbers.contains(num)) {
          sum = sum - num;
        } else {
          sum = sum + num;
          numbers.add(num);
        }
      }
      return sum;
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static int repeats(int [] arr){
        int c = 0;
        for (int e: arr)
            c += e * (Arrays.stream(arr).filter(x -> x == e).count() == 1 ? 1 : 0);
        return c;
    }
}
----------------------------------------------------------------------------
import static java.util.stream.IntStream.of;
import static org.apache.commons.lang3.ArrayUtils.indexOf;
import static org.apache.commons.lang3.ArrayUtils.lastIndexOf;

interface Solution {
  static int repeats(int[] arr) {
    return of(arr).filter(i -> indexOf(arr, i) == lastIndexOf(arr, i)).sum();
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;

class Solution {
    public static int repeats(int[] arr) {
        int sum = 0;
        int len = arr.length;
        
        Arrays.sort(arr);

        // Check for first element
        if (arr[0] != arr[1])
            sum += arr[0];

        // Check for all the elements
        // if it is different
        // its adjacent elements
        for (int i = 1; i < len - 1; i++)
            if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1])
                sum += arr[i];

        // Check for the last element
        if (arr[len - 2] != arr[len - 1])
            sum += arr[len - 1];

        return sum;
    }
}
-----------------------------------------------------------------------------
import java.util.*;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;

class Solution{
    public static int repeats(int [] arr){
         Map<Integer, Long> unitValue = Arrays.stream(arr).boxed().collect(groupingBy(identity(), counting()));
        return unitValue.keySet().stream().filter(k -> unitValue.get(k) < 2).mapToInt(Integer::intValue).sum();
    }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


class Solution{
    public static int repeats(int [] arr){
      int sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            set.add(arr[i]);
        }
        int d = set.stream().reduce(0, Integer::sum);

        return 2 * d - sum ;
    }
}
--------------------------------------------------------------------------------
import java.util.HashSet;

class Solution{
    public static int repeats(int [] arr){
        int sum = 0;
        var h = new HashSet<Integer>();
        for (int x: arr){
          if (h.add(x))
            sum += x;
          else
            sum -= x;
        }
        
        return sum;
    }
}
------------------------------------------------------------------------------
class Solution{
    public static int repeats(int [] arr){
        int result = 0;
		    Arrays.sort(arr);
		    Stack<Integer> st = new Stack<>();
		
		    for (int i : arr) {
			    if (st.isEmpty() || i != st.peek()) {
				    st.push(i);
			    } else {
				    st.pop();
			    }
		    }
		
		    st.toArray();
		    for (Integer i : st) {
			    result += i;
		    }
		
		    return result;
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution{
    public static int repeats(int [] arr){
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        return Arrays.stream(arr).filter(e->Collections.frequency(Arrays.asList(integers), e)==1).sum();
    }
}
-----------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;


class Solution{
    public static int repeats(int [] arr){
       List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return Arrays.stream(arr).filter(value -> Collections.frequency(nums, value) == 1).sum();
    }
}



*/




