/* 8KYU CodeWars Grasshopper - Array Mean

Find Mean
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers add all of the 
numbers together and divide by the number of values in the list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers
1+3+5+7 = 16

2. Divide by the number of values in the list. In this example 
there are 4 numbers in the list.
16/4 = 4

3. The mean (or average) of this list is 4

*/

public class GrassHopper {
    
    public static int findAverage(int[] nums) {
      int result = 0;
      for (int i = 0; i < nums.length; i++) {
        result += nums[i];
      }

        return result / nums.length;
    }
}
/*------------------------------------------------------------
public class GrassHopper {
    
    public static int findAverage(int[] nums) {
      int sum = 0;
      for (int num : nums) {
        sum += num;
      }
      return sum / nums.length;
    }
}
---------------------------------------------------------------
import java.util.stream.IntStream;

public class GrassHopper {
    
    public static int findAverage(int[] nums) {
        return IntStream.of(nums).sum() / nums.length;
    }
}
----------------------------------------------------------------
import java.util.Arrays;

public class GrassHopper {
    
    public static int findAverage(int[] nums) {

        return Arrays.stream(nums).sum()/(nums.length);
    }
}
-----------------------------------------------------------------
import java.util.Arrays;

public class GrassHopper {
    
    public static int findAverage(int[] nums) {
        return (int)Arrays.stream(nums).average().orElse(0);
    }
}
-----------------------------------------------------------------
import java.util.ArrayList;
public class GrassHopper {
    
    public static int findAverage(int[] nums) {
     
     int sum = 0;
     int mean = 0;
     ArrayList<Integer> myArray = new ArrayList<Integer>();
     for(int number : nums) 
     {
       myArray.add(number) ;
     } 
     
     for(int i = 0;i<myArray.size();i++)
     {
       sum = sum + myArray.get(i);
     } 
     
     mean = sum/myArray.size();
        return mean;
    }
}
-----------------------------------------------------------------
import java.util.stream.IntStream;

public class GrassHopper {
    
    public static int findAverage(int[] nums) {

        return IntStream.of(nums).reduce(Integer::sum).orElse(0) / nums.length;
    }
}

*/