/* 7KYU CodeWars Find The Stray Number

You are given an odd-length array of integers, in which all of them 
are the same, except for one single number.

Complete the method which accepts such an array, and returns that 
single different number.

The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3

*/
import java.util.*;
class FindTheStrayNumber {
  static int stray(int[] numbers) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (!map.containsKey(numbers[i])) {
        map.put(numbers[i], 1);
      }
      else {
        int total = map.get(numbers[i]);
        map.put(numbers[i], total + 1);
      }
    }
    for (int i = 0; i < numbers.length; i++) {
      if (map.get(numbers[i]) == 1) {
        return numbers[i];
      }
    }
    return -1;
  }
}
/*---------------------------------------------------------------------------
class Solution {
    static int stray(int[] numbers) {
      int result = 0;
      for (int i = numbers.length - 1; i > 1; i--) {
        if (numbers[i] != numbers[i - 1] && numbers[i] != numbers[i - 2]) {
          result = numbers[i];
        }
        else if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) {
          result = numbers[0];
        }
      }
      return result;
    }
}
------------------------------------------------------------------------
class Solution {
  static int stray(int[] numbers) {
    if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
    for (int i : numbers) if (i != numbers[0]) return i;
    return 0;
  }
}
--------------------------------------------------------------------------
import java.util.*;

class Solution {
  static int stray(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
  }
}
---------------------------------------------------------------------------
class Solution {
  static int stray(int[] numbers) {
    int x = numbers[0];
    int y = numbers[1];
    for(int z:numbers){
      if(z!=x || z!=y){
        return z;
      }
    }
    return 0;
  }
}



*/