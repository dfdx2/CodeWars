/* 8KYU CodeWars Multiply The Number

Jack really likes his number five: the trick here is 
that you have to multiply each number by 5 raised to 
the number of digits of each numbers, so, for example:

Kata.multiply(3) == 15      // 3 * 5¹
Kata.multiply(10) == 250    // 10 * 5²
Kata.multiply(200) == 25000 // 200 * 5³
Kata.multiply(0) == 0       // 0 * 5¹
Kata.multiply(-3) == -15    // -3 * 5¹


*/

public class Kata {
  public static int multiply(int number) {
    String n = String.valueOf(number);
    n = n.replaceAll("[^0123456789]", "");
    return number * (int) Math.pow(5,n.length());
  }
}
/*------------------------------------------------------
public class Kata {
  public static int multiply(int number) {
    return number * (int)Math.pow(5, (Math.abs(number) + "").length());
  }
}
---------------------------------------------------------
public class Kata {
  public static int multiply(int n) {
    return n * (int)Math.pow(5, (int)Math.log10(Math.abs(n)) + 1);
  }
}
----------------------------------------------------------
import java.util.*;
public class Kata {
  public static int multiply(int number) {
    String a=String.valueOf(Math.abs(number));
    int i = a.length();
    int n=(int)Math.pow(5, i);
    return number*n;
  }
}
---------------------------------------------------------
public class Kata {
  public static int multiply(int number) {
    return number < 0 ?  (int) Math.pow(5, String.valueOf(-number).length()) * number :
                (int) Math.pow(5, String.valueOf(number).length()) * number;
  }
}
---------------------------------------------------------
public class Kata {
public static int multiply(int number) {
		int numberOfchars = String.valueOf(Math.abs(number)).length();
		for (int i = 1; i <= numberOfchars; i++) {
			number *= 5;
		}
		return number;
	}
}
---------------------------------------------------------
public class Kata {
  public static int multiply(int number) {
    
    String lengthOfNumber = String.valueOf(Math.abs(number)) ;
    int digits = lengthOfNumber.length() ;
    int result = number * (int) ( Math.pow(5, digits) ) ;
    
    return result ;
  }
}
---------------------------------------------------------
public class Kata {
  public static int multiply(int number) {
		String pow = Integer.toString(number);
		if(number<0)
			pow = pow.substring(1);
		return number*(int)(Math.pow(5,pow.length()));
  }
}
*/