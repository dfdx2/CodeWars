/* 7KYU CodeWars Lucky Number

###Lucky number

Write a function to find if a number is lucky or not. If the 
sum of all digits is 0 or multiple of 9 then the number is lucky.

1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisible by 9, hence number is lucky.

Function will return true for lucky numbers and false for others.

*/

public class LuckyNumber {
  
  public static boolean isLucky(long n) {
    long result = 0;
    while (n > 0) {
      result += n % 10;
      n = n / 10;
    }
    return (result == 0 || result % 9 == 0);
  }
}
/*------------------------------------------------------------------------------
public class LuckyNumber {
  
  public static boolean isLucky(long n) {
    return n % 9 == 0;
  }
}
--------------------------------------------------------------------------------
public class LuckyNumber {  
  public static boolean isLucky(long n) {
    return getNumSum(n) % 9 == 0;
  }
  
  private static int getNumSum(long num) {
    return String.valueOf(num).chars()
                  .map(Character::getNumericValue)
                  .sum();
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;
public class LuckyNumber {
  
  public static boolean isLucky(long n) {
        return n == 0 || Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .sum() % 9 == 0;
  }
}
------------------------------------------------------------------------
public class LuckyNumber {
  
    public static boolean isLucky(long n) {
        return String.valueOf(n).chars().map(i -> i -'0').sum() % 9 == 0;
    }
}
---------------------------------------------------------------------------
public class LuckyNumber {
  
  public static boolean isLucky(long n) {
    return (Math.abs(n)+"").chars().map(i->i-'0').sum() % 9 == 0;
  }
}


*/