/* 6KYU CodeWars Two Sum

Write a function that takes an array of numbers (integers for the tests) 
and a target number. It should find two different items in the array that, 
when added together, give the target value. The indices of these items 
should then be returned in a tuple / list (depending on your language) 
like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any 
valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or 
greater, and all of the items will be numbers; target will always be the 
sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/

two_sum([1, 2, 3], 4) == {0, 2}

*/

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
      int[] result = new int[2];
      int x = 0;
      int y = numbers.length - 1;
      for (int i = 0; i < numbers.length; i++) {
        for (int j = numbers.length - 1; j > 0; j--) {
          if (numbers[i] + numbers[j] == target && i != j) {
            result[0] = i;
            result[1] = j;
          }
        }
      }
      return result;
    }
}
/*----------------------------------------------------------------------------
public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
       for(int i = 0; i < numbers.length; i++) {
           for(int j = i + 1; j < numbers.length; j++) {
               if(numbers[i] + numbers[j] == target){
                   return new int[]{i, j};
               }
           }
       }
      return null; 
    }
}
----------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> numToIndexMapping = new HashMap<>(numbers.length);
    for(int i = 0; i < numbers.length; i++) {
      if(numToIndexMapping.containsKey(target - numbers[i])) {
        return new int[] { i, numToIndexMapping.get(target - numbers[i]) };
      } else {
        numToIndexMapping.put(numbers[i], i);
      }
    }
    return new int[0];
  }
}
------------------------------------------------------------------------------
import java.util.*;
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int complement = 0,j=0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
  
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
          map.put(nums[i], i);
        }
return new int[] { map.get(complement), j };
    }
}
------------------------------------------------------------------------------
public class Solution {

    public static int[] twoSum(int[] numbers, int target) {
        int[] twoSumIndexes = new int[2];

        // Loop up to the one but last (inner loop will test first against the next number).
        for (int i = 0; i < numbers.length - 1; i++) {
            /*
             * Add up the current number with one of the others.
             * If the sum is equal to the target, store the indexes in question,
             * and break out of the loop.
             
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    twoSumIndexes[0] = i;
                    twoSumIndexes[1] = j;
                    break;
                }
            }
        }

        return twoSumIndexes;
    }
    
}
----------------------------------------------------------------------------
import java.util.*; 

public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
        // Create a dictionary to store the seen values and their index
        Map seenValues = new HashMap(); 
        
        // Iterate throught the list by index, if the current target - number[i] is in the dictionary, return it with i
        for (int i = 0; i < numbers.length; i++) {
          //Check if the partner value already exists in the dictionary
          if (seenValues.containsKey(target - numbers[i])) {
            return new int[]{(int)seenValues.get(target - numbers[i]), i};
          }
          
          seenValues.put(numbers[i], i);
        }
        
        return null; // Do your magic!
    }
}




*/