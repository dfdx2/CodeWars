/*  5KYU Perimeter of Squares In A Rectangle
The drawing shows 6 squares the sides of which have a length 
of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the 
perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80 

Could you give the sum of the perimeters of all the squares in a 
rectangle when there are n + 1 squares disposed in the same manner 
as in the drawing:

Hint:
See Fibonacci sequence

Ref:
http://oeis.org/A000045

The function perimeter has for parameter n where n + 1 is the number of 
squares (they are numbered from 0 to n) and returns the total perimeter 
of all the squares.

perimeter(5)  should return 80
perimeter(7)  should return 216


*/
import java.math.BigInteger;
import java.util.ArrayList;

public class SumFct {
    private static final ArrayList<BigInteger> _list = new ArrayList<>();

    static {
        _list.add(BigInteger.ONE);
        _list.add(BigInteger.ONE);
    }

    public static BigInteger perimeter(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(_list.size())) >= 0) {
            BigInteger n1 = _list.get(_list.size() - 2);
            BigInteger n2 = _list.get(_list.size() - 1);
            while (n.compareTo(BigInteger.valueOf(_list.size())) >= 0) {
                BigInteger sum = n1.add(n2);
                _list.add(sum);
                n1 = n2;
                n2 = sum;
            }
        }

        return _list.stream().
                limit(n.longValue() + 1)
                .reduce(BigInteger.ZERO, BigInteger::add)
                .multiply(BigInteger.valueOf(4));
    }
}
/*-------------------------------------------------------------------------------
import java.math.BigInteger;

public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    
    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger c = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
     
    for(int i = 0; i <= n.intValue(); i++) {
      a = b;
      b = c;
      c = a.add(b);
      sum = sum.add(a);      
    }
    
    return sum.multiply(BigInteger.valueOf(4));
  }
}
--------------------------------------------------------------------------------
import java.math.BigInteger;
import java.util.stream.Stream;

public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    return Stream.generate(new FibonacciGenerator()::next).limit(n.longValueExact() + 1).reduce(BigInteger::add).get().multiply(BigInteger.valueOf(4));
  }

  private static class FibonacciGenerator {
    private BigInteger nMinusTwo = BigInteger.ONE;
    private BigInteger nMinusOne = BigInteger.ZERO;

    public BigInteger next() {
      final BigInteger n = nMinusTwo.add(nMinusOne);
      nMinusTwo = nMinusOne;
      nMinusOne = n;

      return n;
    }
  }
}
--------------------------------------------------------------------------------------------
import java.math.BigInteger;
import static java.math.BigInteger.*;

public class SumFct {
    
     // Naive solution. Iterate, sum, multiply by 4.
     
    public static BigInteger perimeter(BigInteger n) {
        BigInteger p0 = ZERO;
        BigInteger p1 = ONE;
        BigInteger sum = p1;
        for (BigInteger i = n; i.compareTo(ZERO) > 0; i = i.subtract(ONE)) {
            final BigInteger temp = p1;
            p1 = p0.add(p1);
            p0 = temp;
            sum = sum.add(p1);
        }
        return sum.shiftLeft(2);  // Multiplies by 4
    }
}
---------------------------------------------------------------------------------
import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        return Stream.iterate(new BigInteger[]{ZERO, ONE}, i -> new BigInteger[]{i[1], i[0].add(i[1])})
                .limit(n.intValueExact() + 1)
                .map(i -> i[1])
                .reduce(ZERO, BigInteger::add)
                .multiply(BigInteger.valueOf(4));
    }

}
--------------------------------------------------------------------------------------

import java.math.BigInteger;
public class SumFct {
  public static BigInteger perimeter(BigInteger terms) {
    BigInteger sum = BigInteger.valueOf(0);
    BigInteger n1 = BigInteger.valueOf(0);
    BigInteger n2 = BigInteger.valueOf(1);
    terms = terms.add(BigInteger.ONE);
    while (terms.compareTo(BigInteger.ZERO) >= 0) {
      BigInteger temp = BigInteger.ZERO;
      temp = temp.add(n1);
      temp = temp.add(n2);
      sum = temp;
      n1 = n2;
      n2 = sum;
      terms = terms.subtract(BigInteger.ONE);
    }
    sum = sum.subtract(BigInteger.ONE);
    return sum.multiply(BigInteger.valueOf(4));
  }
}



*/