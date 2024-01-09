/* 7KYU CodeWars Tidy Number

Definition
A Tidy number is a number whose digits are in non-decreasing order.

Task
Given a number, Find if it is Tidy or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
Number passed is always Positive .

Return the result as a Boolean

Input >> Output Examples
tidyNumber (12) ==> return (true)
Explanation:
The number's digits { 1 , 2 } are in non-Decreasing Order (i.e) 1 <= 2 .

tidyNumber (32) ==> return (false)
Explanation:
The Number's Digits { 3, 2} are not in non-Decreasing Order (i.e) 3 > 2 .

tidyNumber (1024) ==> return (false)
Explanation:
The Number's Digits {1 , 0, 2, 4} are not in non-Decreasing Order as 0 <= 1 .

tidyNumber (13579) ==> return (true)
Explanation:
The number's digits {1 , 3, 5, 7, 9} are in non-Decreasing Order .

tidyNumber (2335) ==> return (true)
Explanation:
The number's digits {2 , 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3

*/
public class Solution {
    public static boolean tidyNumber(int number) {
      String a = String.valueOf(number);
      for (int i = 1; i < a.length(); i++) {
        int b = Integer.valueOf(a.charAt(i - 1));
        int c = Integer.valueOf(a.charAt(i));
        if (b > c) {
          return false;
        }
      }
      return true;
    }
}
/*----------------------------------------------------------------------
public class Solution {

    public static boolean tidyNumber(int n) {
      final String[] digits = (""+n).split("");
      java.util.Arrays.sort(digits);
      return String.join("",digits).equals(""+n);
    }
    
}
------------------------------------------------------------------------
public class Solution
{
    public static boolean tidyNumber(int number)
    {
        int lastDigit = number % 10;
        do
        {
          int digit = number % 10;
          if (lastDigit < digit) { return false; }
          lastDigit = digit;
        } while ((number /= 10) > 0);
        return true;
    }
}
------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static boolean tidyNumber(int number) {
        return number == Integer.valueOf(Stream.of(Integer.toString(number).split("")).sorted().collect(Collectors.joining()));
    }
}
------------------------------------------------------------------------
public class Solution {

    public static boolean tidyNumber(int n) {
      final String s = ""+n;
      char prev = s.charAt(0);
      for (char c : s.toCharArray()) {
        if (c < prev) return false;
        prev = c;
      }
      return true;
    }
    
}
------------------------------------------------------------------------
import java.util.stream.Collectors;

public class Solution
{
    public static boolean tidyNumber(int number)
    {
        return String.valueOf(number).equals(
          String.valueOf(number)
          .chars()
          .mapToObj(x -> String.valueOf((char)x))
          .sorted()
          .collect(Collectors.joining("")));
    }
}
-----------------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {
  public static boolean tidyNumber(int number){
    String num = Integer.toString(number);
    return IntStream.range(0, num.length() - 1).allMatch(i -> num.charAt(i) <= num.charAt(i + 1));
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution
{
    public static boolean tidyNumber(int number)
    {
       return Arrays.equals(Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::valueOf).sorted().toArray(),
                Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::valueOf).toArray());
    }
}
------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Solution {
  static boolean tidyNumber(int number) {
    return Integer.parseInt(of(("" + number).split("")).sorted().collect(joining())) == number;
  }
}
------------------------------------------------------------------------
import java.util.Arrays;
public class Solution
{
    public static boolean tidyNumber(int number)
    {
        return Arrays.equals(Arrays.stream(String.valueOf(number).split("")).sorted().toArray(), Arrays.stream(String.valueOf(number).split("")).toArray());
    }
}
*/