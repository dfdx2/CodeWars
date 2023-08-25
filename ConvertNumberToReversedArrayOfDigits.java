/* 8KYU CodeWars Convert Number To Reversed Array Of Digits

Given a random non-negative number, you have to return the digits 
of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]

*/

public class Kata {
    public static int[] digitize(long n) {
      String y = String.valueOf(n);
      int[] x = new int[y.length()];
      int count = 0;
      while (n > 0) {
        x[count] = (int) (n % 10);
        n = n / 10;
        count++;
      }
      return x;
    }
}
/*-----------------------------------------------------------------------------
public class Kata {
  public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
  }
}
----------------------------------------------------------------------------------
import java.lang.Math;
public class Kata {
  public static int[] digitize(long n) {
    String s = String.valueOf(n);
    int length = s.length();
    int[] array = new int[length];
    for ( int i = 0; i < length; i++){
      array[i] = (int) (s.charAt(length - i - 1)) - 48;
    }
    return array;
  }
}
-----------------------------------------------------------------------------
public class Kata {
    public static int[] digitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}
-------------------------------------------------------------------------------
class Kata {
  static int[] digitize(long n) {
    return new StringBuilder(String.valueOf(n))
        .reverse()
        .chars()
        .map(Character::getNumericValue)
        .toArray();
  }
}




*/

