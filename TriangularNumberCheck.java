/*  6KYU CodeWars Triangle Number Check

Description:
A triangle number is a number where n objects form an equilateral triangle 
(it's a bit hard to explain). For example, 6 is a triangle number because 
you can arrange 6 objects into an equilateral triangle:

  1
 2 3
4 5 6

8 is not a triangle number because 8 objects do not form an equilateral triangle:

   1
  2 3
 4 5 6
7 8

In other words, the nth triangle number is equal to the sum of the n natural 
numbers from 1 to n.

Your task:
Check if a given input is a valid triangle number. Return true if it is, false 
if it is not (note that any non-integers, including non-number types, are not 
triangle numbers).

You are encouraged to develop an effective algorithm: test cases include really 
big numbers.

Assumptions:
You may assume that the given input, if it is a number, is always positive.

Notes:
0 and 1 are triangle numbers.

*/

public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
		if (number == 0 || number == 1) {
      return true;
    }
    long sum = 0;
    for (long n = 1; sum <= number; n++) {
      sum = sum + n;
      if (sum == number) {
        return true;
      }
    }
    return false;
  }
}
/*--------------------------------------------------------------------------
public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
		return Math.sqrt(1+8*number)%1==0;
  }
}
----------------------------------------------------------------------------
public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
		 if A is a triangle number with N level, then A = (N +1)*N/2
		 then, we have : N^2 + N -2A = 0
		 solve this equation and check if N is an integer
		 to conclude whether A is a triangle number or not.
		 Delta = 1 + 8A => N = [-1+ SQRT(Delta)]/2
		
		double N = (Math.sqrt(1+number*8) - 1)/2;
		return (N == Math.round(N));
  }
}
---------------------------------------------------------------------------
public class TriangleNumbers {

	public static boolean isTriangleNumber(long number) {
    long k = 0L;
		for (long i = 0L; k < number; i++) k += i;
    return (k == number);
  }
}
---------------------------------------------------------------------------
public class TriangleNumbers {

	@SuppressWarnings("boxing")
	public static Boolean isTriangleNumber(long number) {
		int total = 0;

		for (int i = 0; total < number; i++) {
			total = total + i;
		}

		return total == number;

	}

}
------------------------------------------------------------------------
public class TriangleNumbers {
	public static Boolean isTriangleNumber(long number) {
		double check = Math.sqrt(1 + 8 * number);
    return check == Math.floor(check);
  }
}
-------------------------------------------------------------------------------
public class TriangleNumbers {

  // sum of n consecutive natural number is
  // Sum = n*(n+1)/2.
  // So, if equation n*n + n - 2*Sum = 0
  // has solve in natural number form
  // then Sum is triangle number.
  // Moreover - you may only check if
  // (1+8*Sum) is a perfect square of natural number.

	public static Boolean isTriangleNumber(long number) {
	
    double discriminant = Math.sqrt(1+8*number);
    return new Boolean(discriminant == Math.floor(discriminant));
  }
}


*/