/* 7KYU CodeWars Find The Missing Number

The following was a question that I received during a 
technical interview for an entry level software developer 
position. I thought I'd post it here so that everyone 
could give it a go:

You are given an unsorted array containing all the integers 
from 0 to 100 inclusively. However, one number is missing. 
Write a function to find and return this number. What are 
the time and space complexities of your solution?

*/
import java.util.Arrays;
public class FindTheMissingNumber {
    public static int missingNo(int[] nums) {
      Arrays.sort(nums);
      for (int i = nums.length - 1; i > 0; i--) {
        if (nums[i] - nums[i - 1] == 2) {
          return nums[i] - 1;
        }
      }
      return nums[0] == 0 ? 100 : 0;
    }
}
/*-------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static int missingNo(int[] nums) {
      Arrays.sort(nums);
      int missing = 100;
      for (int i=1; i<nums.length; i++){
        if (nums[i-1] != nums[i]-1) missing = nums[i]-1;
        else if (nums[0]==1) missing=0;
      }
        return missing;
    }
}
---------------------------------------------------------------------
public class Kata {
    public static int missingNo(int[] nums) {
        var result = 5050;
        for (var n : nums) result -= n;
        return result;
    }
}
----------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
    public static int missingNo(int[] nums) {
        return 5050 - Arrays.stream(nums).sum();
    }
}
---------------------------------------------------------------------
public class Kata {
    public static int missingNo(int[] nums){
        int s = 0;
        for(int i : nums)
            s += i;
        return 5050 - s;
    }
}

*/