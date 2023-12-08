/* 7KYU CodeWars Find The Next Perfect Square!

You might know some pretty large perfect squares. But what 
about the NEXT one?

Complete the findNextSquare method that finds the next integral 
perfect square after the one passed as a parameter. Recall that 
an integral perfect square is an integer n such that sqrt(n) is 
also an integer.

If the parameter is itself not a perfect square then -1 should 
be returned. You may assume the parameter is non-negative.

Examples:(Input --> Output)

121 --> 144
625 --> 676
114 --> -1 since 114 is not a perfect square


*/
import java.util.*;
import java.io.*;
public class NumberFun {
  public static long findNextSquare(long sq) {
      
    double test = Math.sqrt(sq);
    if (test - Math.floor(test) != 0) {
      return -1;
    }
    double next = Math.floor(Math.sqrt(sq)) + 1; 
      return (long) next * (long) next;
  }
}
/*----------------------------------------------------------------------------
public class NumberFun {
  public static long findNextSquare(long sq) {
      long root = (long) Math.sqrt(sq);
      return root * root == sq ? (root + 1) * (root + 1) : -1;
  }
}
-----------------------------------------------------------------------------
public class NumberFun {
  public static long findNextSquare(long sq) {
      return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
  }
}
-----------------------------------------------------------------------------
public class NumberFun {
  public static long findNextSquare(long sq) {
      long result; 
      double d = Math.sqrt(sq);
      
      //if your number d is a integer result will be true, if not will be -1;
      //good luck)!
      if ( d % 1  == 0) {
       result = (long) Math.pow(++d, 2);
      } else result = -1;
      
      return result;
  }
}
----------------------------------------------------------------------------
public class NumberFun {
  public static long findNextSquare(long sq) {
      if((long)Math.sqrt(sq) != Math.sqrt(sq)) return -1;
      return sq+(2*(long)Math.sqrt(sq))+1; 
  }
}
-----------------------------------------------------------------------------
public class NumberFun {
  public static long findNextSquare(long sq) {
      
      double square = Math.sqrt(sq);
      
      if (square % 1 == 0){
          square++;
          return (long) (square*square);
      } else {
          return -1;
      }
  }
}
------------------------------------------------------------------------------
import java.math.BigDecimal;

public class NumberFun {
  public static long findNextSquare(long sq) {
	      if(!isSquare(sq))
	        return -1;
          
        sq++;
	      
	      for(int i = 0; i < 90000000; i++){
	        if(isSquare(sq + i))
	          return sq+i;
	      }
	      
	      return -1;
	}
  
  private static boolean isSquare(long in){
		//double sq = Math.sqrt(in);
		BigDecimal bd = new BigDecimal(Math.sqrt(in));

		if(bd.remainder(BigDecimal.ONE) == BigDecimal.ZERO)
			return true;
		
		return false;
	}
}
-------------------------------------------------------------------------------
*/