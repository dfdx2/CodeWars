/* 7KYU CodeWars Jumping Number

Definition
Jumping number is the number that All adjacent digits in it differ by 1.

Task
Given a number, Find if it is Jumping or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
Number passed is always Positive .

Return the result as String .

The difference between ‘9’ and ‘0’ is not considered as 1 .

All single digit numbers are considered as Jumping numbers.

Input >> Output Examples
jumpingNumber(9) ==> return "Jumping!!"
Explanation:
It's single-digit number

jumpingNumber(79) ==> return "Not!!"
Explanation:
Adjacent digits don't differ by 1

jumpingNumber(23) ==> return "Jumping!!"
Explanation:
Adjacent digits differ by 1

jumpingNumber(556847) ==> return "Not!!"
Explanation:
Adjacent digits don't differ by 1

jumpingNumber(4343456) ==> return "Jumping!!"
Explanation:
Adjacent digits differ by 1

jumpingNumber(89098) ==> return "Not!!"
Explanation:
Adjacent digits don't differ by 1

jumpingNumber(32) ==> return "Jumping!!"
Explanation:
Adjacent digits differ by 1

*/
public class Solution {
    public static String jumpingNumber(int number) {
      String j = "Jumping!!";
      String n = "Not!!";
      if (number < 13) {
        return j;
      }
      String a = String.valueOf(number);
      for (int i = 0; i < a.length() - 1; i++) {
        int c = Integer.valueOf(a.charAt(i));
        int d = Integer.valueOf(a.charAt(i + 1));
        int e = Math.max(c,d);
        int f = Math.min(c,d);
        if (e - f > 1) {
          return n;
        }
      }
      return j;
    }
}
/*---------------------------------------------------------------------
public class Solution {
    public static String jumpingNumber(int n) {
      final String s = ""+n;
      for (int i=1; i<s.length(); i++) if (Math.abs(s.charAt(i)-s.charAt(i-1)) != 1) return "Not!!";
      return "Jumping!!";
    }
}
-----------------------------------------------------------------------
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Solution {
  public static String jumpingNumber(final int number) {
    return isJumping(number) ? "Jumping!!" : "Not!!";
  }
  
  private static boolean isJumping(final int number) {
    final int[] digits = String.valueOf(number).chars().map(toDigit).toArray();
    return IntStream.range(1, digits.length).allMatch(i -> Math.abs(digits[i - 1] - digits[i]) == 1);
  }
  
  private static IntUnaryOperator toDigit = c -> Character.digit(c, 10);
}
-----------------------------------------------------------------------
public class Solution {
  public static String jumpingNumber(int number) {
    
    char[] arr = Integer.toString(number).toCharArray();
    for (int i = 1; i < arr.length; i++) {
      char prev = arr[i-1];
      char curr = arr[i];
      
      if (Math.abs(curr - prev) != 1)
        return "Not!!";
    }
    
    return "Jumping!!";
  }
}
-----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution
{
    public static String jumpingNumber(int number) {
    int[] numbers = new StringBuilder()
                              .append(number)
                              .chars()
                              .map(Character::getNumericValue)
                              .toArray();

        return IntStream.range(1, numbers.length)
                .allMatch(i -> numbers[i - 1] == numbers[i] + 1 || numbers[i - 1] == numbers[i] -1) ? "Jumping!!" : "Not!!";
    }
}
------------------------------------------------------------------------
public class Solution
{
    public static String jumpingNumber(int number) {
        while (number > 10) {
            int previous = number % 10;
            number = number / 10;
            if (previous - number % 10 != 1 && previous - number % 10 != -1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
  }
-----------------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {
  public static String jumpingNumber(int number) {
    String num = Integer.toString(number);
    return (num.length() == 1) ||
           (IntStream.range(0, num.length() - 1)
                     .allMatch(i -> Math.abs(num.charAt(i) - num.charAt(i + 1)) == 1)
           ) ? "Jumping!!" : "Not!!";
  }
}
-----------------------------------------------------------------------
public class Solution
{
    public static String jumpingNumber(int number)
    {
        
    String liczby =""+number;
    int count = 0;
    char[] chars = liczby.toCharArray();
    for (int i = 0; i < chars.length-1; i++) {
      if (chars[i] - chars[i+1]==1||chars[i] - chars[i+1]==-1)
      {
          count++;
      }
    }
    return count==chars.length-1? "Jumping!!":"Not!!";
    }
}
-----------------------------------------------------------------------
public class Solution
{
      public static String jumpingNumber(int number)
      {
           if (Integer.toString(number).length()==1){
            return "Jumping!!";
        }
        String numberStr = Integer.toString(number);
        boolean flag = true;
        int current = 0;
        int next = 0;
        for (int i = 1; i < numberStr.length(); i++) {
            current=Character.getNumericValue(numberStr.charAt(i));
            next=Character.getNumericValue(numberStr.charAt(i-1));
            if (current==next+1||current==next-1){
                continue;
            }
            flag=false;
            break;
        }
        if (flag){
            return "Jumping!!";
        }else {
            return "Not!!";
        }
      }
}
*/