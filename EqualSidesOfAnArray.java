/* 6KYU CodeWars Equal Sides Of An Array

You are going to be given an array of integers. Your job is 
to take that array and find an index N where the sum of the 
integers to the left of N is equal to the sum of the integers 
to the right of N. If there is no index that would make this 
happen, return -1.

For example:

Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position 
of the array, the sum of left side of the index ({1,2,3}) and the 
sum of the right side of the index ({3,2,1}) both equal 6.

Let's look at another one.
You are given the array {1,100,50,-51,1,1}:
Your function will return the index 1, because at the 1st position 
of the array, the sum of left side of the index ({1}) and the sum of 
the right side of the index ({50,-51,1,1}) both equal 1.

Last one:
You are given the array {20,10,-80,10,10,15,35}
At index 0 the left side is {}
The right side is {10,-80,10,10,15,35}
They both are equal to 0 when added. (Empty arrays are equal to 0 in 
this problem)
Index 0 is the place where the left side and right side are equal.

Note: Please remember that in most programming/scripting languages 
the index of an array starts at 0.

Input:
An integer array of length 0 < arr < 1000. The numbers in the array 
can be any integer positive or negative.

Output:
The lowest index N where the side to the left of N is equal to the 
side to the right of N. If you do not find an index that fits these 
rules, then you will return -1.

Note:
If you are given an array with multiple answers, return the lowest 
correct index.

*/

public class Kata {
	public static int findEvenIndex(int[] arr) {
		int rightSide= 0;
		int leftSide = 0;

		for (int i = 0; i < arr.length; i++)
			rightSide += arr[i];

		for (int i = 0; i < arr.length; i++) {
			rightSide -= arr[i];
			if (rightSide == leftSide)
			  return i;
			leftSide += arr[i];
		}

		return -1;
	}
}
/*---------------------------------------------------------------------------
public class Kata {
  public static int findEvenIndex(int[] arr) {
     for(int i = 0; i < arr.length; i++){
       if(leftSum(arr, i) == rightSum(arr, i))
         return i;
     }
     
     return -1;
  }
  
  public static long leftSum(int[] arr,int idx){
    long result = 0;
    
    for(int i = 0; i < idx; i++){
      result += arr[i];
    }
    
    return result;
  }
  
  public static long rightSum(int[] arr, int idx){
    long result = 0;
    
    for(int i = idx + 1; i < arr.length; i++){
      result += arr[i];
    }
    
    return result;
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static int findEvenIndex(int[] arr) {
    int sum = 0, cSum = 0;
    for (int i = 0; i < arr.length; i++) sum += arr[i];
    for(int i = 0; i < arr.length; i++){
      if (cSum == sum - arr[i]) return i;
      cSum += arr[i];
      sum -= arr[i];
    }
    return -1;
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
	public static int findEvenIndex(int[] arr) {
		return IntStream.range(0, arr.length)
				.filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
				.findFirst().orElse(-1);
	}
}
-----------------------------------------------------------------------------
public class Kata {
  public static int findEvenIndex(int[] arr) {
    int i, j; int leftsum, rightsum; int n = arr.length;
    for ( i = 0; i < n; ++i) {
      leftsum = 0; rightsum = 0;
      for ( j = 0; j < i; j++)
        leftsum  += arr[j];
      for( j = i+1; j < n; j++)
        rightsum += arr[j];
      if (leftsum == rightsum)
        return i;
    }
    return -1;
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.*;

public class Kata {
  public static int findEvenIndex(int[] arr) {
    
    for (int i = 0; i<arr.length; i++) {
    
      int rightSum = IntStream.of(Arrays.copyOfRange(arr, i+1, arr.length)).sum();
      int leftSum = IntStream.of(Arrays.copyOfRange(arr, 0, i)).sum();
      
      if ( rightSum == 0 && i == 0 ) { return i; }
      if ( leftSum == rightSum ) { return i; }
      
    }
    return -1;
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Kata {
  public static int findEvenIndex(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> Objects.equals(
                        Arrays.stream(arr, 0, i)
                                .sum(),
                        Arrays.stream(arr, i + 1, arr.length)
                                .sum()
                ))
                .findFirst()
                .orElse(-1);
  }
}
---------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
  public static int findEvenIndex(int[] arr) {
        int s1= Arrays.stream(arr).sum(), s2=0;
        for (int i=0; i<arr.length; i++){
            if (s1-arr[i] == s2)
                return i;
            s1-=arr[i];
            s2+=arr[i];
        }
        return -1;
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
  public static int findEvenIndex(int[] arr) {
    // your code
    for(int x =0; x < arr.length ; x++){
      if( Arrays.stream(arr, 0, x).sum() == Arrays.stream(arr, x+1, arr.length).sum() ) return x;
      
    }
    return -1; 
  }
}

*/