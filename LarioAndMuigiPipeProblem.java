/* 8KYU CodeWars Lario and Muigi Pipe Problem

Issue

Looks like some hoodlum plumber and his brother has been running around 
and damaging your stages again.

The pipes connecting your level's stages together need to be fixed before 
you receive any more complaints.

Pipes list is correct when each pipe after the first index is greater (+1) 
than the previous one, and that there is no duplicates.

Task
Given the a list of numbers, return a fixed list so that the values increment 
by 1 for each index from the minimum value up to the maximum value (both included).

Example
Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8

*/

import java.util.Arrays;
public class Kata {
  public static int[] pipeFix(int[] numbers) {
    Arrays.sort(numbers);
    int x = numbers[0];
    int y = numbers[numbers.length - 1];
    int z = y - x;
    int[] result = new int[z + 1];
    int i = 0;
    while (x <= y) {
      result[i] = x;
      i++;
      x++;
    }
    return result;
  }
}
/*--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static int[] pipeFix(int[] numbers) {
    return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
}
----------------------------------------------------------------------------
public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int min = numbers[0];
    int max = numbers[numbers.length - 1];
    int size = max - min + 1;
    int[] result = new int[size];
    for (int i = 0; i < size; i++){
      result[i] = i + min;
    }
    return result;
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static int[] pipeFix(int[] numbers) {
    // @param is sorted already
    // create the newArr to return with determining its size by subtracting numbers' [0]
    // from [last] and then adding plus 1
    int[] newArr = new int[(numbers[numbers.length-1]-numbers[0])+1];
    // populate w for loop, ensuring to start from numbers[0] and consecutive incrementing
    for(int i=0;i<newArr.length;i++){
      newArr[i] = numbers[0]+i;
    }
    return newArr;
  }
}
--------------------------------------------------------------------------------
public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int lastIndex = numbers.length - 1;
    int first = numbers[0];
    int last = numbers[lastIndex];
    int len = numbers[lastIndex] - first + 1;
    int[] nums = new int[len];
    int index = 0;


    while (first <= last) {

        nums[index] = first;
        index++;
        first++;
    }


    return nums;
  }
}




*/