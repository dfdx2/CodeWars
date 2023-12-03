/* 7KYU Codewars Smallest Value Of An Array

Write a function that can return the smallest value of an array or the 
index of that value. The function's 2nd parameter will tell whether it 
should return the value or the index.

Assume the first parameter will always be an array filled with at least 
1 number and no duplicates. Assume the second parameter will be a string 
holding one of two values: 'value' and 'index'.

Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0

*/
public class Arrays {

    public static int findSmallest(final int[] numbers, final String toReturn ) {
      int result = Integer.MAX_VALUE;
      int count = 0;
      if (toReturn == "value") {
        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] < result) {
            result = numbers[i];
          }
        }
      }
      if (toReturn == "index") {
        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] < result) {
            result = numbers[i];
            count = i;
          }
        }
      }
      return (toReturn == "value") ? result : count;
      }
  }

/*--------------------------------------------------------------------------
public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    int lowest = 0;
    for (int i = 1; i < numbers.length; ++i) 
      if (numbers[i] < numbers[lowest]) lowest = i;
    return (toReturn == "index") ? lowest : numbers[lowest];
    }
}
----------------------------------------------------------------------------
public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    
    int smallestIdx = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < numbers[smallestIdx]) {
        smallestIdx = i;
      }
    }
    return "index".equals(toReturn) ? smallestIdx : numbers[smallestIdx];
	}
}
---------------------------------------------------------------------------
public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    int smallestValue = numbers[0];
		 int index = 0 ;
		 for(int i =1 ;i < numbers.length;i++)
		 {
			if(numbers[i]<smallestValue)
			{
				smallestValue = numbers[i];
				index = i ;
			}
		 }
		 
		 if("index".equals(toReturn))
		 {
			 return index ;
		 }
		 else if ("value".equals(toReturn))
		 {
			 return smallestValue ;
		 }
		    
		    return 0;
	}
}
---------------------------------------------------------------------------
import java.util.*;

public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
    
    final int minValue = java.util.Arrays.stream(numbers).min().getAsInt();
    
    switch(toReturn) {
      case "value":
          return minValue;
      case "index":
        for (int i = 0; i < numbers.length; i++)
          if (numbers[i] == minValue) return i;
      default:
    }
    
    return 0;
	}
}
---------------------------------------------------------------------------
public class Arrays {
  public static int findSmallest(final int[] numbers, final String toReturn) {
    int index = 0;
    int value = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      final int n = numbers[i];
      if (n < value) {
        index = i;
        value = n;
      }
    }
    switch (toReturn) {
      case "index":
        return index;
      case "value":
        return value;
      default:
        return 0xCAFEBABE;
    }
	}
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.*;

public class Arrays {

  public static int findSmallest(final int[] nums, final String returnType) {
    return IntStream.range(0, nums.length)
                    .boxed()
                    .min(Comparator.comparing(x -> nums[x]))
                    .map(i -> 
                         "value".equals(returnType) 
                            ? nums[i]
                            : i)
                    .get();
	}
}
------------------------------------------------------------------------
public class Arrays {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int smallest = numbers[0];
        int smallestIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                smallestIndex = i;
            }
        }
        return (toReturn.equals("index")) ? smallestIndex : smallest;
    }
}
*/