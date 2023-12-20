/* 7KYU CodeWars Automorphic Number (Special Numbers Series #6)

Definition

A number is called Automorphic number if and only if its square ends 
in the same digits as the number itself.

Task

Given a number determine if it Automorphic or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
The number passed to the function is positive

Input >> Output Examples

autoMorphic (25) -->> return "Automorphic" 

Explanation:
25 squared is 625 , Ends with the same number's digits which are 25 .

autoMorphic (13) -->> return "Not!!"

Explanation:
13 squared is 169 , Not ending with the same number's digits which are 69 .

autoMorphic (76) -->> return "Automorphic"

Explanation:
76 squared is 5776 , Ends with the same number's digits which are 76 .

autoMorphic (225) -->> return "Not!!"

Explanation:
225 squared is 50625 , Not ending with the same number's digits which are 225 .

autoMorphic (625) -->> return "Automorphic"

Explanation:
625 squared is 390625 , Ends with the same number's digits which are 625 .

autoMorphic (1) -->> return "Automorphic"

Explanation:
1 squared is 1 , Ends with the same number's digits which are 1 .

autoMorphic (6) -->> return "Automorphic"

Explanation:
6 squared is 36 , Ends with the same number's digits which are 6

*/
public class Solution {
    public static String autoMorphic(int number) {
      int j = number * number;
      String l = String.valueOf(number);
      String k = String.valueOf(j);
      int m = l.length();
      String n = k.substring(k.length() - m, k.length());
      System.out.println("number" + number + " Substring " + n);
      return number == Integer.valueOf(n) ? "Automorphic" : "Not!!";
    }
}
/*----------------------------------------------------------------------------
public class Solution {
    public static String autoMorphic(int n) {
      return (n*n+"").endsWith(""+n)?"Automorphic":"Not!!";
    }
}
------------------------------------------------------------------------------
class Solution {
  static String autoMorphic(int number) {
    return (number * number + "").endsWith(number + "") ? "Automorphic" : "Not!!";
  }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String autoMorphic(int number)
    {
        String sq = number * number + "";
        return sq.matches(".*" + number) ? "Automorphic" : "Not!!";
    }
}
-------------------------------------------------------------------------------
import java.math.BigInteger;

public class Solution {

    public static String autoMorphic(int number) {
        return BigInteger.valueOf(number).pow(2).toString().endsWith(String.valueOf(number)) ? "Automorphic" : "Not!!";
    }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String autoMorphic(int number) {
        return ("" + (number * number)).endsWith("" + number) ? "Automorphic" : "Not!!";
    }
}
--------------------------------------------------------------------------------
public class Solution
{
    public static String autoMorphic(int number)
    {
        String square = String.valueOf(number * number);
        return square.endsWith("" + number) ? "Automorphic" : "Not!!";
    }
}
-------------------------------------------------------------------------------
public class Solution {
    public static String autoMorphic(int num){
        return String.valueOf(num*num).endsWith(String.valueOf(num)) ? "Automorphic" : "Not!!";
    }
}
------------------------------------------------------------------------------
public class Solution
{
    public static String autoMorphic(int number) {

        return getLastNumbers(number) == number ? "Automorphic" : "Not!!";
    }

    public static int getLastNumbers(int number) {
        String num = "" + number;
        String squareValueOfN = "" + (number * number);
        String lastNumbers = "";
        for (int i = squareValueOfN.length() <= 1 ? 0 : squareValueOfN.length()-num.length(); i < squareValueOfN.length(); i++) {
            lastNumbers += squareValueOfN.charAt(i);
        }
        return Integer.parseInt(lastNumbers);
    }
}
-------------------------------------------------------------------------------
public class Solution {
    public static String autoMorphic(int number) {
        final int dividend = number * number - number;
        int numberLength = 1;
        while ((number /= 10) > 0) numberLength++;
        final int divider = (int) Math.pow(10, numberLength);
        if ((dividend % divider) == 0) return "Automorphic";
        return "Not!!";
    }
}
-------------------------------------------------------------------------------
public class Solution
{
    public static String autoMorphic(int number)
    {
        int squr = (int)(Math.pow(number, 2));
        String s = String.valueOf(squr);
        String n = String.valueOf(number);
        return (s.endsWith(n)) ? "Automorphic" : "Not!!";
    }
}
*/