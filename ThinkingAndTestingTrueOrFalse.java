/* 7KYU CodeWars Thinking & Testing: True or False

No Story

No Description

Only by Thinking and Testing

Look at the results of the testcases, and guess the code!


*/
public class ThinkingAndTestingTrueOrFalse {
  public static int testTrueFalse(int n) {
    return Integer.bitCount(n);
  }
}
/*-------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    int count = 0;
    while (n > 0) {
        count += 1;
        n = n & (n-1);
    }
    return count;
  }
}
--------------------------------------------------------------------
public class ThinkingAndTesting {
  public static int testTrueFalse(int n) {
    return Integer.toBinaryString(n).replace("0", "").length();
  }
}
---------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
   if (n < 2) {
            return n;
        } else if (n < 4) {
            return n - 1;
        } else if (n < 7){
            return Math.round((float) n / 3);
        } else {
            return Integer.bitCount(n);
        }
  }
}
--------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    String binaryString = Integer.toBinaryString(n);
    
    return binaryString.replace("0", "").length();
  }
}
---------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    
    return n <= 1 ? n : n > 1 && n <= 3 ? n - 1 : n > 3 && n <= 6 ? (int)Math.round(n / 3.0) : aboveSix(n);
  }
  
  public static int aboveSix(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
---------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    String binary = Integer.toBinaryString(n);
	    int ones = 0;
	    
	    for (int i = 0; i < binary.length(); i++) {
	    	if (binary.charAt(i) == '1') {
	    		ones++;
	    	}
	    }
	    return ones;
  }
}
--------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    // Good luck!
    String binaryS = Integer.toBinaryString(n);
    System.out.println("n = " + n  + "  binaryS = "+ binaryS); 
     int counter = 0;
    for (int i = 0; i < binaryS.length(); i++) {
      if (binaryS.substring(i,i+1).equals("1") ){
        counter++;
      }
    }
    return counter;
    
  }
}
-------------------------------------------------------------
import java.math.BigInteger;

public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    BigInteger bi = new BigInteger(""+n);
    return bi.bitCount();
  }
}
*/
