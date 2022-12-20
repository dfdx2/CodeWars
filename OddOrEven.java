/* 7 KYU CodeWars  Odd or Even 

Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
Have fun!

*/

public class Codewars {
  public static String oddOrEven (int[] array) {
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      result += array[i];
    }
    return result % 2 == 0 ? "even" : "odd";
  }
}
/*---------------------------------------------------------------

public class Codewars {
  public static String oddOrEven (int[] array) {
  // your code
  int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    if (sum % 2 == 0) {
      return "even";
    }
    else {
      return "odd";
    }
  }
}
 -----------------------------------------------------------------------
import static java.util.Arrays.stream;

class Codewars {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
---------------------------------------------------------------------------
public class Codewars {
  public static String oddOrEven (int[] array) {
    int sum = 0;
    for (int n : array){
      sum += n;
    }
    return sum%2==0 ? "even" : "odd";
  }
}
-----------------------------------------------------------------------------

public class Codewars {
  public static String oddOrEven (int[] array) {
    int xor = 0;
    for (int i : array){
      xor ^= i;
    }
    return (xor & 1) == 1 ? "odd" : "even";
  }
}
-----------------------------------------------------------------------------












*/