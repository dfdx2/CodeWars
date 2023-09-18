/* 7KYU CodeWars Simple Consecutive Pairs

In this Kata your task will be to return the count of pairs 
that have consecutive numbers as follows:

pairs([1,2,5,8,-4,-3,7,6,5]) = 3
The pairs are selected as follows [(1,2),(5,8),(-4,-3),(7,6),5]
--the first pair is (1,2) and the numbers in the pair are consecutive; Count = 1
--the second pair is (5,8) and are not consecutive
--the third pair is (-4,-3), consecutive. Count = 2
--the fourth pair is (7,6), also consecutive. Count = 3. 
--the last digit has no pair, so we ignore.
More examples in the test cases.

Good luck!

Please also try Simple time difference

*/

class Solution{
    public static int solve(int [] arr){
      int count = 0;
      for (int i = 0; i < arr.length - 1; i += 2) {
        if (arr[i] + 1 == arr[i + 1] || arr[i] - 1 == arr[i + 1]) {
          count++;
        }
      }
      return count;
    }
}
/*----------------------------------------------------------------------------
import java.util.*;
class Solution{
    public static int solve(int [] arr){
      int count = 0;
      for(int i=0; i<arr.length-1; i+=2){
        if(Math.abs(arr[i]-arr[i+1])==1){
          count++;
        }
      }
      return count;
    }
}
--------------------------------------------------------------------------------
import static java.util.stream.IntStream.iterate;

interface Solution {
  static long solve(int[] arr) {
    return iterate(1, i -> i < arr.length, i -> i + 2).filter(i -> Math.abs(arr[i - 1] - arr[i]) == 1).count();
  }
}
--------------------------------------------------------------------------------
class Solution{
    public static int solve(int [] arr){
      int c = 0;
      for (int i = 1; i < arr.length; i+=2)
        if (Math.abs(arr[i] - arr[i-1]) == 1) c++;
      return c;
    }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

class Solution{
    public static int solve(int [] arr){
        return (int) IntStream.range(0, arr.length / 2).filter(i -> Math.abs(arr[i + i] - arr[i + i + 1]) == 1).count();
    }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;
class Solution{
    public static int solve(int [] arr){
          return (int) IntStream.range(0, arr.length)
        .filter(i -> i % 2 == 1)
        .filter(i -> Math.abs(arr[i] - arr[i - 1]) == 1)
        .count();
    }
}

*/