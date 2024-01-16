/* 7KYU CodeWars Minimum Steps

Task
Given an array of N integers, you have to find how many times you have to add up the smallest numbers in the array until their Sum becomes greater or equal to K.

Notes:
List size is at least 3.

All numbers will be positive.

Numbers could occur more than once , (Duplications may exist).

Threshold K will always be reachable.

Input >> Output Examples
minimumSteps({1, 10, 12, 9, 2, 3}, 6)  ==>  return (2)
Explanation:
We add two smallest elements (1 + 2), their sum is 3 .

Then we add the next smallest number to it (3 + 3) , so the sum becomes 6 .

Now the result is greater or equal to 6 , Hence the output is (2) i.e (2) operations are required to do this .

minimumSteps({8 , 9, 4, 2}, 23)  ==> return (3)
Explanation:
We add two smallest elements (4 + 2), their sum is 6 .

Then we add the next smallest number to it (6 + 8) , so the sum becomes 14 .

Now we add the next smallest number (14 + 9) , so the sum becomes 23 .

Now the result is greater or equal to 23 , Hence the output is (3) i.e (3) operations are required to do this .

minimumSteps({19,98,69,28,75,45,17,98,67}, 464)  ==>  return (8)
Explanation:
We add two smallest elements (19 + 17), their sum is 36 .

Then we add the next smallest number to it (36 + 28) , so the sum becomes 64 .

We need to keep doing this until the sum becomes greater or equal to K (464 in this case), which will require 8 Steps .

Expected Time Complexity O(n Log n)


*/

import java.util.Arrays;
public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
      Arrays.sort(numbers);
      int counter = 1;
      int result = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
        result += numbers[i];
        if (result >= k) {
          return counter;
        } 
        else {
          counter++;
        }
      }
      return -1;
    }
}
/*------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int sum = 0;
        int i = 0;
        while(sum < k) {
          sum+=numbers[i];
          i++;
        }
        return i-1;
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
     public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int total = numbers[0], count = 0;
        for (int i = 1; total < k; i++) {
            total += numbers[i];
            count++;
        }
        return count;
    }
}
--------------------------------------------------------------------------
public class Kata {

  public static int minimumSteps(int[] arr, int k) {
    java.util.Arrays.sort(arr);
    int i = 0;
    while ((k -= arr[i]) > 0) i++;
    return i;  
  }

}
--------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicInteger;

class Kata {
  static int minimumSteps(int[] numbers, int k) {
    var count = new AtomicInteger();
    of(numbers).sorted().reduce(0, (sum, n) -> sum < k && count.addAndGet(1) > 0 ? sum + n : sum + n);
    return count.addAndGet(-1);
  }
}
---------------------------------------------------------------------------
public class Kata {
    public static int minimumSteps(int[] numbers, int k) {   
      java.util.Arrays.sort(numbers);
      int a = numbers[0];
      if (a >= k) return 0;
      
      for (int i = 1 ; i< numbers.length ; i ++){
        a += numbers[i];
        if (a >= k) return i;      
      }
      
      return -1;
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int minimumSteps(int[] numbers, int k) {
    numbers = numbers.clone();
    Arrays.sort(numbers);
    
    int steps = 0;
    for(int total = numbers[steps]; steps < numbers.length - 1 && total < k; ) {
      total += numbers[++steps];
    }
    return steps;
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
    Arrays.sort(numbers);
		int i = 0;
		for (; k > 0; i++) {
			k -= numbers[i];
		}
		return i-1;
    }
}
*/