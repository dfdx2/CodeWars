/* 7KYU CodeWars How Many Consecutive Numbers Are Needed?

Write a function that takes an array of unique integers and 
returns the minimum number of integers needed to make the 
values of the array consecutive from the lowest number to 
the highest number.

Example

[4, 8, 6] --> 2
Because 5 and 7 need to be added to have [4, 5, 6, 7, 8]

[-1, -5] --> 3
Because -2, -3, -4 need to be added to have [-5, -4, -3, -2, -1]

[1] --> 0
[]  --> 0

*/
import java.util.Arrays;
public class HowManyConsecutiveNumbersAreNeeded {
    public static int consecutive(final int[] arr) {
      Arrays.sort(arr);
      return arr.length > 0 ? arr[arr.length - 1] - arr[0] - arr.length + 1 : 0; 
    }
}