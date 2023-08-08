/* 7KYU CodeWars Averages Of Numbers

#Get the averages of these numbers

Write a method, that gets an array of integer-numbers and return an 
array of the averages of each integer-number and his follower, if 
there is one.

Example:

Input:  [ 1, 3, 5, 1, -10]
Output:  [ 2, 4, 3, -4.5]
If the array has 0 or 1 values or is null, your method should return 
an empty array.

Have fun coding it and please don't forget to vote and rank this kata! :-)

*/
public class Kata
{
  public static double[] averages(int[] numbers){ 
    if (numbers == null) {
      return new double [0];
    }
    if (numbers.length < 2) {
      return new double [0];
    }
    
    
    double[] result = new double[numbers.length - 1];
    int c = 0;
    for (int i = 1; i < numbers.length; i++) {
      result[c] = (numbers[i - 1] + numbers[i]) / 2.0;
      c++;
    }
    return result;
  }
}
/*--------------------------------------------------------------------------
public class Kata {
  public static double[] averages(final int[] numbers) {
    final double res[] = new double[(numbers == null || numbers.length == 0) ? 0 : numbers.length - 1];
    for (int i = 0; i < res.length; i++) res[i] = (numbers[i]+numbers[i+1]) / 2.0;
    return res;
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata
{
    public static double[] averages(int[] numbers)
    {
        return numbers == null || numbers.length<2 
                ? new double[0] 
                : IntStream.range(0, numbers.length-1).mapToDouble(i -> (numbers[i] + numbers[i+1])/2d).toArray();
    }
}
------------------------------------------------------------------------------
public class Kata
{
  public static double[] averages(int[] numbers)
  {
    if (numbers == null || numbers.length < 2) return new double[] {};
    double [] ans = new double [numbers.length - 1];
    for (int i = 0; i < ans.length; i++) ans[i] = (numbers[i] + numbers[i + 1]) / 2.0;
    return ans;
  }
}
------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Kata {
  static double[] averages(int[] nums) {
    return nums != null ? range(0, nums.length - 1).mapToDouble(i -> (nums[i] + nums[i + 1]) / 2.).toArray() : new double[0];
  }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static double[] averages(int[] numbers) {
    if (numbers == null || numbers.length < 2) return new double[0];
    return IntStream.range(1, numbers.length)
                    .mapToDouble(i -> (numbers[i - 1] + numbers[i]) / 2.0)
                    .toArray();
  }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static double[] averages(int[] numbers) {
    return IntStream.range(1, numbers != null ? numbers.length : 0)
                    .mapToDouble(i -> (numbers[i] + numbers[i - 1]) / 2.0)
                    .toArray();
  }
}




*/