/* 7KYU CodeWars Balanced Number

A balanced number is a number where the sum of digits to 
the left of the middle digit(s) and the sum of digits to 
the right of the middle digit(s) are equal.

If the number has an odd number of digits, then there is 
only one middle digit. (For example, 92645 has one middle 
digit, 6.) Otherwise, there are two middle digits. (For 
example, the middle digits of 1301 are 3 and 0.)

The middle digit(s) should not be considered when determining 
whether a number is balanced or not, e.g. 413023 is a balanced 
number because the left sum and right sum are both 5.

The task
Given a number, find if it is balanced, and return the string 
"Balanced" or "Not Balanced" accordingly. The passed number 
will always be positive.

Examples
7 ==> return "Balanced"
Explanation:
middle digit(s): 7
sum of all digits to the left of the middle digit(s) -> 0
sum of all digits to the right of the middle digit(s) -> 0
0 and 0 are equal, so it's balanced.
295591 ==> return "Not Balanced"
Explanation:
middle digit(s): 55
sum of all digits to the left of the middle digit(s) -> 11
sum of all digits to the right of the middle digit(s) -> 10
11 and 10 are not equal, so it's not balanced.
959 ==> return "Balanced"
Explanation:
middle digit(s): 5
sum of all digits to the left of the middle digit(s) -> 9
sum of all digits to the right of the middle digit(s) -> 9
9 and 9 are equal, so it's balanced.
27102983 ==> return "Not Balanced"
Explanation:
middle digit(s): 02
sum of all digits to the left of the middle digit(s) -> 10
sum of all digits to the right of the middle digit(s) -> 20
10 and 20 are not equal, so it's not balanced.

*/

public class Solution {
    public static String balancedNum(long number) {
      
      String b = "Balanced";
      String n = "Not Balanced";
      String c = String.valueOf(number);
      int x = 0;
      int y = 0;
      int d = c.length() - 1;
      int e = c.length() / 2;
      int i = 0;
      int j = 0;
      if (c.length() <= 2) {
        return b;
      }
      if (e % 2 == 0) {
        while (i < e - 1) {
          x += Integer.valueOf(c.charAt(i));
          y += Integer.valueOf(c.charAt(d));
          d--;
          i++;
        }
      }
      if (e % 2 != 0) {
        while (i < d) {
          x += Integer.valueOf(c.charAt(i));
          y += Integer.valueOf(c.charAt(d));
          i++;
          d--;
        } 
      }
      System.out.println(number);
      return x == y ? b : n;
    }
}
/*--------------------------------------------------------------------------
import java.util.function.IntUnaryOperator;

public class Solution {
  public static String balancedNum(final long number) {
    return new Solution(number).compute();
  }
  
  private final String str;
  
  private Solution(final long number) {
    str = String.valueOf(number);
  }
  
  private String compute() { return (isSmall() || leftSum() == rightSum()) ? "Balanced" : "Not Balanced"; }
  
  private boolean isSmall()  { return str.length() < 3; }
  private int     leftSum()  { return str.chars().limit((str.length() - 1) / 2    ).map(toDigit).sum(); }
  private int     rightSum() { return str.chars().skip ( str.length()      / 2 + 1).map(toDigit).sum(); }
  
  private static final IntUnaryOperator toDigit = c -> Character.digit(c, 10);
}
----------------------------------------------------------------------------
public class Solution
{
    public static String balancedNum(long number)
    {
        var str = String.valueOf(number);
        int l = str.substring(0, str.length() / 2 - (str.length() % 2 == 0 ? 1 : 0)).chars().sum();
        int r = str.substring(str.length() / 2 + 1).chars().sum();
        return (l == r ? "" : "Not ") + "Balanced";
    }
}
----------------------------------------------------------------------------
public class Solution
{
    public static String balancedNum(long number){
      String s = ""+number;
      int left = 0;
      int right = 0;
      
      for(int i=0; i<Math.round(s.length()/2.0)-1; i++){
        left += Integer.parseInt(""+s.charAt(i));
      }
      
      for(int i=s.length()-1; i>s.length()-Math.round(s.length()/2.0); i--){
        right += Integer.parseInt(""+s.charAt(i));
      }
      
      return (right==left) ? "Balanced" : "Not Balanced";
    }
}
----------------------------------------------------------------------------
public class Solution {

    public static String balancedNum(long n) {
      String s = ""+n;
      int sum = 0, len = s.length(), mid1 = len / 2 - (len%2==0?1:0), mid2 = mid1 + (len%2==0?2:1);
      for (char c : s.substring(0,mid1).toCharArray()) sum += c - '0'; // left
      for (char c : s.substring(mid2).toCharArray()) sum -= c - '0'; // right
      return sum == 0 ? "Balanced" : "Not Balanced";
    }
    
}
-----------------------------------------------------------------------------
import java.util.*;

public class Solution{
    public static String balancedNum(long number){
        long sum = 0;
        long digit;
        double numdigits = Long.toString(number).length();
        double boundary = numdigits/2;
        
        for(int i = 0; i <= numdigits; i++, number /= 10){
            digit = number % 10;
            if(i < boundary-1){
              sum += digit;
            } else if(i > boundary){
              sum -= digit;
            } 
        }
        return sum == 0 ? "Balanced": "Not Balanced";
    }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String balancedNum(long number) {
        if (number < 100) return "Balanced"; 
        String s = String.valueOf(number);
        int sum1 = 0, sum2 = 0;
        int n = s.length();
        for (int i = 0; i < (n - 1) / 2; i++) {
            sum1 += (s.charAt(i) - '0');
            sum2 += (s.charAt(n - i - 1) - '0');
        } 
        if (sum1 == sum2) return "Balanced"; else return "Not Balanced";
    }
}
----------------------------------------------------------------------------
public class Solution {
    public static String balancedNum(long number) {
        char[] chars = Long.toString(number).toCharArray();
        int sumL = chars[0];
        int sumR = chars[chars.length - 1];
        for(int i = 1; i < chars.length / 2 + 1; i++) {
            sumL += chars[i];
            sumR += chars[chars.length - 1 - i];
        }
        return sumL == sumR ? "Balanced" : "Not Balanced";
    }
}
------------------------------------------------------------------------------
import java.util.*;

public class Solution
{
    public static String balancedNum(long number)
    {
        String n = ""+number;
        if(n.length()<3) return "Balanced";

        String n1 = null;
        String n2 = null;
        int d = n.length()/2;
        if ((n).length()%2==0) {
            n1 = n.substring(0,d-1);
            n2 = n.substring(d+1);
        } else {
            n1 = n.substring(0,d);
            n2 = n.substring(d+1);
        }
        int i1 = Arrays.stream(n1.split("")).mapToInt(Integer::valueOf).sum();
        int i2 = Arrays.stream(n2.split("")).mapToInt(Integer::valueOf).sum();

        return i1==i2?"Balanced":"Not Balanced";
    }
}
-----------------------------------------------------------------------------
public class Solution {
    public static String balancedNum(long number) {
        String numberStr = String.valueOf(number);
        int centerLength = isEven(numberStr.length()) ? 2 : 1;
        int halfLength = (numberStr.length() - centerLength) / 2;
        int leftHalfSum = numberStr.chars().limit(halfLength).sum();
        int rightHalfSum = numberStr.chars().skip(halfLength + centerLength).sum();
        boolean isBalancedNumber = leftHalfSum == rightHalfSum;
        return isBalancedNumber ? "Balanced" : "Not Balanced";
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String balancedNum(long number) {
      char[] digits = Long.toString(number).toCharArray();
      long sum = 0;
      for(int i = 0; i < digits.length - i - 2; i++) 
        sum = sum + digits[i] - digits[digits.length - i - 1];
      return sum == 0 ? "Balanced" : "Not Balanced";
    }
}
*/