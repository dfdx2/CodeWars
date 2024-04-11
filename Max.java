/* 5KYU CodeWars Maximum Subarray Sum

The maximum sum subarray problem consists in finding the 
maximum sum of a contiguous subsequence in an array or 
list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

// should be 6: {4, -1, 2, 1}

Easy case is when the list is made up of only positive numbers 
and the maximum sum is the sum of the whole array. If the list 
is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that 
the empty list or array is also a valid sublist/subarray.

*/
public class Max {
  public static int sequence(int[] arr) {
    int result = 0;
    int temp = 0;
    for (int x : arr) {
      result = result > (temp = Math.max(temp + x, 0)) ? result : temp;
    }
    return result;
  }
}
/*----------------------------------------------------------------------
public class Max {

    public static int sequence(int[] arr) {
        int max_ending_here = 0, max_so_far = 0;
        for (int v : arr) {
            max_ending_here = Math.max(0, max_ending_here + v);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
------------------------------------------------------------------------
public class Max {
  public static int sequence(int[] arr) {
    int m = 0, a = 0, s = 0;
    for(int e : arr) {
      s += e;
      m = Math.min(s, m);
      a = Math.max(a, s - m);
    }
    return a;
  }
}
------------------------------------------------------------------------
public class Max {
	public static int sequence(int[] arr) {
		int cur = 0, max = 0;
		for (int i : arr) {
			cur = Math.max(0, cur + i);
			max = Math.max(max, cur);
		}
		return max;
	}
}
-------------------------------------------------------------------------
public class Max {
  public static int sequence(int[] arr) {

    int sum = 0;
    int max = 0;

    for(int a : arr) {
      sum += a;
      max = Math.max(max, sum);
      sum = Math.max(sum, 0);
    }

    return max;
  }
}
-------------------------------------------------------------------------
public class Max {
  public static int sequence(int[] arr) {
    int sumUpTo  = 0;
    int maxSum = 0;    
    for(int n : arr) {
      //sum the sequence unless the sum is less than the current element, if that occurs start summing from the current element
      sumUpTo = Math.max(n, sumUpTo + n);
      // assign maxSum as the greater of the current sum sequence and previous greatest sequence
      maxSum = Math.max(maxSum, sumUpTo);
    }
    return maxSum;
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;

public class Max {
  public static int sequence(int[] arr) {
        final int[] max = {0};
        return Arrays.stream(arr).map(i -> i = max[0] = i + max[0] > 0 ? max[0] + i : 0).max().orElse(0);  }
}
--------------------------------------------------------------------------
public class Max {
  public static int sequence(int[] arr) {
    int localMax = 0;
    int globalMax = 0;
    int i = 0, j = 0, start = 0;;
    for(int k = 0; k < arr.length; k++){  //go through the array
      localMax += arr[k];  //add the current value of the array
      if(localMax > globalMax){  
        globalMax = localMax;  //new global max was found
        j = k;
        i = start;
        
      }
      if(localMax < 0){  //if localMax < 0 just ignore the past subarray and start a new
        localMax = 0;
        start = k+1;
      }
    }
    return globalMax;
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

**
 * 
 * @author ohdoking
 *
 
public class Max {
	public static int sequence(int[] arr) {
		// exception array length == 0 
		if (arr.length == 0) {
			return 0;
		}

		AtomicInteger index = new AtomicInteger(0);

		//make two dimensional to sum array from value of standard index 
		int[][] temp = 
				IntStream
					.of(arr)
					.boxed()
					.map(value -> makeSumArray(arr, index.getAndIncrement()))
					.toArray(int[][]::new);

		//find max value in sum two dimensional array
		OptionalInt result = 
				Stream
					.of(temp)
					.flatMapToInt(x -> Arrays.stream(x))
					.max();

		//result is negative retuen 0
		return result.orElse(0) > 0 ? result.orElse(0) : 0;
	}

	
	 * return sum array from value of standard index
	 * 
	 * @param arr array
	 * @param index standard index
	 * @return
	 
	private static int[] makeSumArray(int[] arr, int index) {
		int[] sumArray = new int[arr.length];
		
		//standard index init
		sumArray[index] = arr[index];
		//make right side from standard index
		for (int i = index + 1; i < arr.length; i++) {
			sumArray[i] = sumArray[i - 1] + arr[i];
		}

		//make left side from standard index
		for (int i = index - 1; i >= 0; i--) {
			sumArray[i] = sumArray[i + 1] + arr[i];
		}

		return sumArray;
	}
}
*/