/* 7KYU CodeWars  Square Every Digit

Welcome. In this kata, you are asked to square every 
digit of a number and concatenate them.

For example, if we run 9119 through the function, 
811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer

*/

public class SquareDigit {

   private static int BASE = 10;
  
  public int squareDigits(int n) {
    if (n < BASE) {
      return n * n;
    }
    int digit = n % BASE;
    int sd = digit * digit;
    return sd + (sd < BASE ? BASE : BASE * BASE) * squareDigits(n / BASE);
  }
}
/*--------------------------------------------------------------------
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }

}
----------------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
  
    String strDigits = String.valueOf(n);    
    String result = "";
    
    for (char c : strDigits.toCharArray()) {
      int digit = Character.digit(c, 10);
      result += digit * digit;
    }
    
    return Integer.parseInt(result);
  }

}
------------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
    
    //Use StringBuffer due to performance
    final StringBuffer result = new StringBuffer();
    int x = 0;
    
    //As long as we have digits left.
    while (n > 0) {
      
      //Take the next digit (we are in the decimal system).
      x = n % 10;
      
      //Delete this digit.
      n = n / 10;
      
      //Insert at the first position is necessary otherwise we would get a wrong order.
      result.insert(0, x * x);
    }
    
    return Integer.parseInt(result.toString());
  }

}
-------------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
      if (n < 10) return n * n;
      else {
        int h = squareDigits(n / 10);
        int l = n % 10;
        return Integer.parseInt(h + "" + l * l);
      }
  }

}
-------------------------------------------------------------------
import java.util.LinkedList;

public class SquareDigit {

  public int squareDigits(int n) {
    StringBuilder sb = new StringBuilder();
    String num = String.valueOf(n);
    for (char c: num.toCharArray()) {
      int curr = c - '0';
      curr *= curr;
      sb.append(curr);
    }
    return Integer.valueOf(sb.toString());
  }

}
-----------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
    // Look mom, no strings!
    int output = 0;
    for (int i = 0, l = (int) Math.log10(n) + 1; i < l; i++) {
        int digit = (int) ((n / Math.pow(10, l - i - 1)) % 10);
        int k = (digit * digit);
        int j = k == 0 ? 1 : (int) (Math.log10(k) + 1);
        output *= Math.pow(10, j);
        output += digit * digit;
    }
    return output;
  }

}
------------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
    char[] c = Integer.toString(n).toCharArray();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < c.length; i++){
      int p = Character.digit(c[i], 10);
      sb.append(p*p);
    }
    
    return Integer.parseInt(sb.toString());
  }

}
--------------------------------------------------------------------
public class SquareDigit {
  public int squareDigits(int n) {
    int factor10=1;
    int result=0;
    while (n!=0) {
      int digit = n % 10;
      digit*=digit;
      n/= 10;
      result += digit*factor10;
      factor10*= digit<10? 10 : 100;
    }
    return result;
  }
}
--------------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int n) {
		String s = n + "";
		String[] digits = s.split("");
		String output = "";
		
		for (String str : digits) {
			int i = Integer.parseInt(str);
			output +=  i * i;
		}
		
		return Integer.parseInt(output);
  }

}
-----------------------------------------------------------------
public class SquareDigit {

  public int squareDigits(int num) {
      char[] digitsArray = Integer.toString(num).toCharArray();
      String output = "";
      
      for (char digit : digitsArray) {
          num = Character.getNumericValue(digit);
          output += num*num;
      }
      
      return Integer.parseInt(output);
  }

}


*/