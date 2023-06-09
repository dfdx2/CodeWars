/* 7KYU CodeWars Largest Elements

Write a program that outputs the top n elements from a list.

Example:

largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})
// => new int[]{6, 7}


*/

import java.util.Arrays;
public class Solution {
  
   public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
     int[] result = new int[n];
     int count = 0;
     for (int i = arr.length - n; i < arr.length; i++) {
       result[count] = arr[i];
       count++;
     }
     return result;
   }
}
/*-----------------------------------------------------------------------------
import java.util.*;
public class Solution {
  
   public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
     return Arrays.copyOfRange(arr,arr.length-n,arr.length);
   }
}
-----------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

interface Solution {
  static int[] largest(int n, int[] arr) {
    return of(arr).sorted().skip(arr.length - n).toArray();
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
public class Solution {
  
   public static int[] largest(int n, int[] arr) {
        //new array to not modify input array
        int [] array= arr.clone();
        Arrays.sort(array);
        int [] output = new int[n];
        int i2=0;
        for(int i=arr.length-n; i<arr.length;i++){
            output[i2]=array[i];
            i2++;
        }

        return output;
   }
}
-----------------------------------------------------------------------------

import java.util.Arrays;

public class Solution {
  
   public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
   return Arrays.copyOfRange(arr, arr.length - n, arr.length);
   }
}

*/