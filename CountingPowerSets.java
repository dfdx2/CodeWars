/*    7 KYU  CodeWars  Counting Power Sets
In this kata, you must create a function powers/Powers that takes an array, 
and returns the number of subsets possible to create from that list. In 
other words, counts the power sets.

For instance
powers([1,2,3]) => 8

...due to...

powers([1,2,3]) =>
[[],
 [1],
 [2],
 [3],
 [1,2],
 [2,3],
 [1,3],
 [1,2,3]]

 Your function should be able to count sets up to the size of 500, so watch out; 
 pretty big numbers occur there!
For comparison, my Haskell solution can compute the number of sets for an array 
of length 90 000 in less than a second, so be quick!
You should treat each array passed as a set of unique values for this kata.

*/

public class Powers {
    public static BigInteger powers(int[] list) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < list.length; i++) {
            result = result.add(result);
        }
        return result;
    }
}
/*
import java.math.BigInteger;

public class Powers {
  public static BigInteger powers(int[] list) {
    return BigInteger.valueOf(2).pow(list.length);
  }
}
________________________________________________________________________

import java.math.BigInteger;

public class Powers {
  public static BigInteger powers(int[] list) {
    return BigInteger.ONE.shiftLeft(list.length);
  }
}
____________________________________________________________________________

import java.math.BigInteger;
public class Powers {
  public static BigInteger powers(int[] list) {
      return new BigInteger("2").pow(list.length);
  }
}





*/