/* 7KYU CodeWars Debug Sum Of Digitis Of A Number

Debug   function getSumOfDigits that takes positive integer to calculate sum of its digits. 
Assume that argument is an integer.

Example
123  => 6
223  => 7
1337 => 14

*/

public class Solution {
  public static int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  } 
}
/*------------------------------------------------------------------------------------------
interface Solution {
  static int sumOfDigits(int n) {
    return (n + "").chars().map(d -> d - 48).sum();
  }
}
--------------------------------------------------------------------------------------------
public class Solution {
    public static int sumOfDigits(int n) {
        int sum = 0;
        String[] digits = (n + "").split("");
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
------------------------------------------------------------------------------------------
class Solution {
  static int sumOfDigits(int n) {
    return n>9 ? n%10 + sumOfDigits(n/10) : n;
  }
}
-------------------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution {
  public static int sumOfDigits(int n) {
    return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();

  }
}

*/




