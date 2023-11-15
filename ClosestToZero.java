/*  7KYU CodeWars Closest To Zero

Simply find the closest value to zero from the list. Notice that 
there are negatives in the list.

List is always not empty and contains only integers. Return None 
if it is not possible to define only one of such values. And of 
course, we are expecting 0 as closest value to zero.

Examples:

[2, 4, -1, -3]  => -1
[5, 2, -2]      => None
[5, 2, 2]       => 2
[13, 0, -6]     => 0

*/

public class ClosestToZero {

	public static Integer find(int[] arr) {
		int x = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (Math.abs(arr[i]) == Math.abs(x)) {
        return null;
      }
      if (Math.abs(arr[i]) < Math.abs(x)) {
        x = arr[i];
      }
    }
    return x;
	}
}
/*---------------------------------------------------------------------------
import java.util.*; 
public class ClosestToZero {

	public static Integer find(int[] arr) { 
      int min =Integer.MAX_VALUE; 
      for (int i :arr){  
         int r1=Math.abs(i); 
         int r2=Math.abs(min); 
         if(r1==r2)return null; 
         else if (r1<r2)min=i;
       }
      return min;
    }
}
--------------------------------------------------------------------------------
import java.util.*;
import java.lang.Math;

public class ClosestToZero {

	public static Integer find(int[] arr) {
		// code here
    if(arr.length == 1) {
      return arr[0];
    }
    Integer ints =  Arrays.stream(arr).reduce((x,y) -> 0 - Math.abs(x) > 0 - Math.abs(y) ? x : y).getAsInt();
    if(ints != 0 && Arrays.stream(arr).anyMatch(x -> x == -ints)) {
      return null;
    } else {
      return ints;
    }
	}
}
----------------------------------------------------------------------------
import java.util.stream.*;
import java.util.Arrays;
import static java.lang.Math.abs;

public class ClosestToZero {

	public static Integer find(int[] arr) {
		final var result = Arrays.stream(arr).reduce(
      arr[0], 
      (x, y) -> 0 - abs(x) > 0 - abs(y)? x: y
    );
    if (result != 0 && Arrays.stream(arr).anyMatch(x -> x == -((long) result))) {
      return null;
    }
    return result;
	}

}
-----------------------------------------------------------------------------
public class ClosestToZero {
	public static Integer find(int[] arr) {
		int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (Math.abs(arr[i]) == Math.abs(result)) {
        return null;
      }
      if (Math.abs(arr[i]) < Math.abs(result)) {
        result = arr[i];
      }
    }
    return result;
	}
}
-------------------------------------------------------------------------------
import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.function.BinaryOperator;
import java.util.Optional;
import java.util.stream.IntStream;
import static java.util.Comparator.*;
import static java.lang.Math.*;

public class ClosestToZero {
  
  private static final Comparator<Integer> ABS_COMP = comparing(Math::abs);
  
	public static Integer find(int[] arr) {
    if (arr.length == 0) return null;
    
    Optional<Integer> left = findMin(arr, i -> i <= 0);
    Optional<Integer> right = findMin(arr, i -> i > 0);
    
    if (left.isEmpty()) return right.get();
    if (right.isEmpty()) return left.get();
    if (left.get() + right.get() == 0) return null;
    
    return BinaryOperator.minBy(ABS_COMP)
                         .apply(left.get(), right.get());
	}
  
  public static Optional<Integer> findMin(int[] arr, IntPredicate pred) {
    return IntStream.of(arr)
                    .filter(pred)
                    .boxed()
                    .min(ABS_COMP);
  }
}
----------------------------------------------------------------------------
import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.of;

interface ClosestToZero {
  static Integer find(int[] arr) {
    var sorted = of(arr).boxed().sorted(comparingInt(Math::abs)).toArray(Integer[]::new);
    return sorted.length < 2 ? sorted[0] : sorted[0] != -sorted[1] ? sorted[0] : null;
  }
}

*/