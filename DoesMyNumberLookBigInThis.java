/* 6KYU CodeWars Does My Number Look Big In This

A Narcissistic Number (or Armstrong Number) is a positive number 
which is the sum of its own digits, each raised to the power of 
the number of digits in a given base. In this Kata, we will 
restrict ourselves to decimal (base 10).

For example, take 153 (3 digits), which is narcissistic:

    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
and 1652 (4 digits), which isn't:

    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
The Challenge:

Your code must return true or false (not 'true' and 'false') 
depending upon whether the given number is a Narcissistic number 
in base 10.

This may be True and False in your language, e.g. PHP.

Error checking for text strings or other invalid inputs is not 
required, only valid positive non-zero integers will be passed 
into the function.

*/
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
      String x = String.valueOf(number);
      int result = 0;
      while (number > 0) {
        int j = number % 10;
        result += (Math.pow(j, x.length()));
        number = number / 10;    
      }
      System.out.println(result);
      String y = String.valueOf(result);
      return x.equals(y);
    }
}
/*--------------------------------------------------------------------------------
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String strNumber = String.valueOf(number);
        char[] digits = strNumber.toCharArray();
        int sum = 0;
        for(char digit : digits)
          sum += Math.pow(Integer.parseInt(String.valueOf(digit)), digits.length);
        return sum == number ? true : false;
    }

}
-------------------------------------------------------------------------
import java.util.*;
public class NumberUtils {
  public static boolean isNarcissistic(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }
}
------------------------------------------------------------------------------
public class NumberUtils {

    public static boolean isNarcissistic(int num) {
        int length = (int) (Math.log10(num) + 1);
        int sum = 0;
        int n = num;

        while (num > 0) {
            sum += Math.pow(num % 10, length);
            num /= 10;

        }
        return sum == n;
    }

}
----------------------------------------------------------------------------
interface NumberUtils {
  static boolean isNarcissistic(int n) {
    return (n + "").chars().map(c -> (int) Math.pow(c - 48, (int) Math.log10(n) + 1)).sum() == n;
  }
}
---------------------------------------------------------------------------
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
      //Condition false by default
        boolean condicion = false;
      //number to String
        String numString = String.valueOf(number);
      //Gets the number of digits
        int numDigits = numString.length();
      //Separates the number
        char [] listaNum = numString.toCharArray();
      //Goes over all the numbers and add the result together
        int resultado = 0;
        for (char c : listaNum) {
            resultado += Math.pow(Character.getNumericValue(c), numDigits);
        }
      //Compares the original number with the final result and sets condition to true if it is the same 
        if(resultado == number)
            condicion = true;
        return condicion;
    }

}
-----------------------------------------------------------------------------
import static java.util.Set.of;

interface NumberUtils {
  static boolean isNarcissistic(int n) {
    return of(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725,
        4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153).contains(n);
  }
}
-------------------------------------------------------------------------------
interface NumberUtils {
    public static boolean isNarcissistic(int number) {
        int numberLength = String.valueOf(number).length();
        return number ==
                java.util.Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt)
                        .mapToDouble(i -> Math.pow(i, numberLength)).sum();
    }
}
---------------------------------------------------------------------------------
public class NumberUtils {

	public static boolean isNarcissistic(int number) {
    String str = String.valueOf(number);
		int res = str.chars().map(c -> c - '0').map(digit -> (int) Math.pow(digit, str.length())).sum();
		return res == number;
	}
}
*/