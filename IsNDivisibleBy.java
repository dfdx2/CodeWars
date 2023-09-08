/* 7KYU CodeWars Is N Divisible by (...)?

Create a function that checks if the first argument n is divisible 
by all other arguments (return true if no other arguments)

Example:

(6,1,3)--> true because 6 is divisible by 1 and 3
(12,2)--> true because 12 is divisible by 2
(100,5,4,10,25,20)--> true
(12,7)--> false because 12 is not divisible by 7
This kata is following kata:
http://www.codewars.com/kata/is-n-divisible-by-x-and-y

*/
public class Divisible {
    public static boolean isDivisible(int...value) {
      boolean x = true;
      for (int i = 1; i < value.length; i++) {
        if (value[0] % value[i] != 0) {
          x = false;
        }
      }
      return x;
    }
}
/*--------------------------------------------------------------------------
import java.util.Arrays;

public class Divisible{
  public static boolean isDivisible(int... values){
    return values.length <= 1 || Arrays.stream(values)
                .skip(1)
                .allMatch(i -> i != 0 && values[0] % i == 0);
  }
}
-----------------------------------------------------------------------------
public class Divisible{
  public static boolean isDivisible(int ... numbers){

  for (int i = 1; i<numbers.length; i++){
                    if(numbers[i]==0 || numbers[0]%numbers[i]!=0)

                        return false;
                    }
                    return true;
            }
        }
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Divisible {
  
  public static boolean isDivisible(int... args) {
    return IntStream.range(1, args.length)
                    .allMatch(i -> args[0] % args[i] == 0);
  }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Divisible {
  public static boolean isDivisible(final int... xs) {
    if (xs == null || xs.length == 0) throw new IllegalArgumentException();
    if (xs.length == 1) return true;
    return IntStream.of(xs).skip(1).distinct().allMatch(x -> x != 0 && xs[0] % x == 0);
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Divisible {
	public static boolean isDivisible(int ... nums) {
		
		if (Arrays.stream(nums).anyMatch(f -> f == 0))
		{
			return false;
		}
		
		return Arrays.stream(nums).allMatch(e -> nums[0] % e == 0);
	}
}




*/