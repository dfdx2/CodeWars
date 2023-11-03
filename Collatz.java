/* 6KYU Collatz

A collatz sequence, starting with a positive integern, is found by 
repeatedly applying the following function to n until n == 1 :


f(n)= n/2, if n is even
      3n+1, if n is odd
​
A more detailed description of the collatz conjecture may be found 
on Wikipedia.

The Problem
Create a function collatz that returns a collatz sequence string 
starting with the positive integer argument passed into the function, 
in the following form:

"X0->X1->...->XN"

Where Xi is each iteration of the sequence and N is the length of 
the sequence.

Sample Input
Input: 4
Output: "4->2->1"

Input: 3
Output: "3->10->5->16->8->4->2->1"
Don't worry about invalid input. Arguments passed into the function 
are guaranteed to be valid integers >= 1.

*/

public class Collatz {
  public static String collatz(int n) {
    String result = "";
    String y = "->";
    while (n >= 1) {
      if (n == 1) {
        result += String.valueOf(n);
        break;
      }
      result += String.valueOf(n);
      result += y;
      if (n % 2 == 0) {
        n = n / 2;
      }
      else {
        n = (n * 3) + 1;
      }
    }
    return result;
  }
}
/*--------------------------------------------------------------------------
public class Collatz {
  public static String collatz(int n) {
    StringBuilder sb = new StringBuilder().append(n);
    while (n != 1) {
      n = n % 2 == 0 ? n / 2 : 3 * n + 1;
      sb.append("->").append(n);
    }
    return sb.toString();
  }
}
----------------------------------------------------------------------------
public class Collatz {
  public static String collatz(int n) {
    return collatzR(n,"");
  } 
  private static String collatzR(int n,String acum) {
		if(n==1) {
			return acum+="1";
		}else {
			acum+=n+"->";
			return collatzR(n%2==0?n/2:3*n+1,acum);
		}
	}
}
------------------------------------------------------------------------------
interface Collatz {
  static String collatz(int n) {
    return n > 1 ? n + "->" + collatz(n % 2 > 0 ? 3 * n + 1 : n / 2) : "1";
  }
}
-----------------------------------------------------------------------------
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Collatz {
  public static final IntUnaryOperator COLLATZ_NEXT = i -> i % 2 == 0 ? i / 2 : 3 * i + 1;
  public static final IntPredicate COLLATZ_HAS_NEXT = i -> i > 1;
  
  public static String collatz(int seed) {
    return seed == 1 ? "1" : IntStream.iterate(seed, COLLATZ_HAS_NEXT, COLLATZ_NEXT).mapToObj(String::valueOf).collect(joining("->")).concat("->1");
  }
}
-------------------------------------------------------------------------------
public class Collatz {
  public static String collatz(int n) {
    StringBuilder result = new StringBuilder();
    int x = n;
    while(x != 1){
      result.append(x+"->");
      if(x % 2 == 0) x /= 2;
      else x = 3*x + 1;
    }
    result.append(x);
    return result.toString();
  }
}

*/