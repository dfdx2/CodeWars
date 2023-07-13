/* 7KYU CodeWars Reverse A Number

Given a number, write a function to output its reverse digits. 
(e.g. given 123 the answer is 321)

Numbers should preserve their sign; i.e. a negative number should still 
be negative when reversed.

Examples
 123 ->  321
-456 -> -654
1000 ->    1

*/

public class ReverseNumber {
	public static int reverse(int number) {
    int result = 0;
    while (number > 0) {
      int digit = number % 10;
      result = result * 10 + digit;
      number /= 10;
    }
    if (number < 0) {
      while (number < 0) {
        int digit = number % 10;
        result = result * 10 + digit;
        number /= 10;
      }
    }
    if (number < 0) {
      return (- result);
    }
    else {
      return result;
    }
	}
}
/*----------------------------------------------------------------------------
public class ReverseNumber {

	public static int reverse(int number) {
		int result = 0;
    while(number != 0) {
      result = result * 10 + number % 10;
      number = number / 10;
    }
    return result;
	}

}
-----------------------------------------------------------------------------
import java.lang.StringBuilder;

public class ReverseNumber {
  
	public static int reverse(int n) {
    return n < 0 ? -reverse(-n) : Integer.parseInt(new StringBuilder().append(n).reverse().toString());
  }
}
----------------------------------------------------------------------------
public class ReverseNumber {

	public static int reverse(int n) {
    return Integer.valueOf(new StringBuilder(""+n).reverse().toString().replace("-",""))*Integer.signum(n);
	}

}









*/