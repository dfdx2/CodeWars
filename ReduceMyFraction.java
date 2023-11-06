/* 7KYU CodeWars Reduce My Fraction

Write a function which reduces fractions to their simplest form! 
Fractions will be presented as an array/tuple (depending on the 
language) of strictly positive integers, and the reduced fraction 
must be returned as an array/tuple:

input:   [numerator, denominator]
output:  [reduced numerator, reduced denominator]
example: [45, 120] --> [3, 8]
All numerators and denominators will be positive integers.

Note: This is an introductory Kata for a series... coming soon!


*/

public class Reduce{
  public static int[] myFraction(int[] fractions){
    //your code here
    return reduce(fractions);
  }
  
  public static int[] reduce(int[] t) {
    
    int counter = Math.min(t[0], t[1]);
    int result = 0;
    while (counter > 1) {
      if (t[0] % counter == 0 && t[1] % counter == 0) {
        result = counter;
        break;
      }
      else {
        counter--;
      }
    }
    t[0] /= counter;
    t[1] /= counter;
    return t;
  }
  
}
/*---------------------------------------------------------------------------
public class Reduce{
  public static int[] myFraction(int[] A){
      int g = gcd(A[0], A[1]); 
      A[1]/=g; A[0]/=g; 
      return A;
    }
   public static int gcd (int a , int b ) {  
       return b==0?a:gcd(b,a%b);
   }
}
-----------------------------------------------------------------------------
import static java.math.BigInteger.valueOf;

interface Reduce {
  static int[] myFraction(int[] fractions) {
    int gcd = valueOf(fractions[0]).gcd(valueOf(fractions[1])).intValue();
    fractions[0] /= gcd;
    fractions[1] /= gcd;
    return fractions;
  }
}
---------------------------------------------------------------------------
public class Reduce{
  public static int[] myFraction(int[] fractions){
    int simplNum = fractions[0];
    int simplDenom = fractions[1];
    int minValue = Math.min(simplNum, simplDenom);
    int maxDivisor = 1;
    for(int i = 2; i <= minValue; i++){
      if(simplNum % i == 0 && simplDenom % i == 0){
        maxDivisor = i;
      }
    }
    return new int[]{simplNum / maxDivisor, simplDenom / maxDivisor};
  }
}
----------------------------------------------------------------------
import java.util.Arrays;

public class Reduce{
  public static int[] myFraction(int[] fractions){
    // Euclid's algorithm
    int[] sortedFractions = Arrays.stream(fractions).sorted().toArray();
		
		while (sortedFractions[0] != 0) {
			int remainder = sortedFractions[1] % sortedFractions[0];
			sortedFractions[1] = sortedFractions[0];
			sortedFractions[0] = remainder;
			
		}
		int gcd = sortedFractions[1];
		
		return new int[]{fractions[0] / gcd, fractions[1] / gcd};
  }
}
-------------------------------------------------------------------------
import org.apache.commons.math3.fraction.Fraction;

public class Reduce {

    public static int[] myFraction(int[] fraction) {
        final var reducedFraction = Fraction.getReducedFraction(fraction[0], fraction[1]);
        return new int[]{reducedFraction.getNumerator(), reducedFraction.getDenominator()};
    }
}

*/