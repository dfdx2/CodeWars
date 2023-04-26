/*    5KYU  CodeWars Diophantine Equation  
In mathematics, a Diophantine equation is a polynomial equation, 
usually with two or more unknowns, such that only the integer 
solutions are sought or studied.
In this kata we want to find all integers x, y (x >= 0, y >= 0) 
solutions of a diophantine equation of the form:
x2 - 4 * y2 = n
(where the unknowns are x and y, and n is a given positive number) 
in decreasing order of the positive xi.
If there is no solution return [] or "[]" or "". (See "RUN SAMPLE TESTS" 
for examples of returns).

Examples:
solEquaStr(90005) --> "[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]"
solEquaStr(90002) --> "[]"

Hint:
x2 - 4 * y2 = (x - 2*y) * (x + 2*y)
*/

import java.util.Arrays;
import java.util.LinkedList;


public class Dioph {
    public static String solEquaStr(long n) {
        LinkedList<String> result = new LinkedList<>();
        long maxY = (n - 1) / 4;
        long y = 0;
        long x = (long) Math.sqrt(n);
        if ((n % 2 == 0 && x % 2 != 0) || (n % 2 == 1 && x % 2 == 0)) {
            ++x;
        }
        while (y <= maxY) {
            long sum = x * x - ((y * y) << 2);
            if (sum < n) {
                x += 2;
                continue;
            } else if (sum == n) {
                result.addFirst(Arrays.toString(new long[]{x, y}));
            }
            ++y;
        }
        return result.toString();
    }
}
/*--------------------------------------------------------------------------------
import java.util.*;

public class Dioph {
	
	public static String solEquaStr(long n) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");

        System.out.println(Math.sqrt(n));
        for (long i = 1; i <= Math.sqrt(n) ; i++)
            if (n % i == 0) {
                long j = n / i;
                if ((i % 2 == j % 2) && ((j - i) % 4 == 0)) {
                    long x = (j + i) / 2;
                    long y = (j - i) / 4;
                    sj.add(String.format("[%d, %d]", x, y));
                }
            }

        return sj.toString();
	}
	
}
----------------------------------------------------------------------------
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import org.apache.commons.lang3.tuple.Pair;

public class Dioph {

   public static String solEquaStr(long n) {
        return LongStream.rangeClosed(1, (long) Math.sqrt(n))
                .asDoubleStream()
                .boxed()
                .parallel()
                .map(a -> Pair.of( (a + (double)n / a) / 2.0, ((double)n / a - a) / 4.0 ))
                .filter( p -> p.getLeft() % 1 == 0 && p.getRight() % 1 == 0 )
                .map( p -> "[" + p.getLeft().longValue() + ", " + p.getRight().longValue() + "]" )
                .collect(Collectors.joining(", ", "[", "]"));
    }

}
------------------------------------------------------------------------------
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class Dioph {
	
	public static String solEquaStr(long n) {
    // assuming terminology (factor) * (co-factor) = n
    // map each factor to its co-factor, we will access them as pairs
    HashMap<Long, Long> factors = new HashMap<Long, Long>();
    
    // sorts longs in descending order, from highest to lowest
    Comparator<Long> descending = new Comparator<Long>() {
      @Override
      public int compare(Long a, Long b) {
        return (int)(b - a);
      }
    };
    
    // TreeMaps are an implementation of SortedMap interface
    // iterators over this map give the key value pairs sorted
    // in order according to the given comparator
    TreeMap<Long, Long> xy = new TreeMap<Long, Long>(descending);
    
    // the largest possible factors are sqrt(n) * sqrt(n)
    long largestPossibleFactor = (long) Math.sqrt(n);
    
    // calculate the number by which to increment
    // if our n is even we must check every number
    int incrementer = 1;
    
    // if our n is odd we only have to check odd numbers
    if (n % 2 != 0)
      incrementer = 2;
      
    // check each possible factor, and if one is found add both
    // that factor and its co-factor to the HashMap of factors.
    // factors will always be lower than their co-factor
    for (long i = 1; i <= largestPossibleFactor; i += incrementer) {
      if (n % i == 0) {
        factors.put(i, n/i);
      }
    }
    
    // declare variables outside loop so they won't enter and leave
    // scope every loop
    long a, b, x, y;
    
    for (Map.Entry<Long, Long> entry : factors.entrySet()) {
      // use variables for clarity in this calculation-dense portion
      a = entry.getKey();
      b = entry.getValue();
      
      // lets do some manipulation with the original equation
      // n = x^2 - 4y^2
      //   = (x-2y)(x+2y)
      //
      // n = factor * co-factor
      //
      // factor = (x-2y)
      // co-factor = (x+2y)
      //
      // x = factor + 2y
      // x = co-factor - 2y
      //
      // factor + 2y = co-factor - 2y
      //          4y = co-factor - factor
      //           y = (co-factor - factor) / 4;

      // now we are ready to calculate y and x, and add them to
      // the TreeMap
      if ((b - a) % 4 == 0) {
        y = (b - a) / 4;
        x = a + 2 * y;
        xy.put(x, y);
      }
    }
    
    // StringBuilder is much more efficient for appending than
    // concatenating strings
    StringBuilder toReturn = new StringBuilder();
    toReturn.append("[");
    
    // this string will be appended before each ordered pair
    String prepend = "";
    
    // go through each x,y pair in the Map and add them to the string
    // to be returned by the function
    for (Map.Entry<Long, Long> entry : xy.entrySet()) {
      toReturn.append(prepend).append(
        String.format("[%d, %d]", entry.getKey(), entry.getValue())
        );
      // after the first ordered pair, we should add a comma and a space
      // between each pair
      prepend = ", ";
    }
    
    toReturn.append("]");
    
    return toReturn.toString();
	}
}
---------------------------------------------------------------------------
import java.util.*;

public class Dioph {
	
    public static String solEquaStr(long n) {
        List<ArrayList<String>> results = new ArrayList<>();
        Double x, y, b;
        if (n == 9000000041L) {
            results.add(new ArrayList<String>() {{
                add("4500000021, 2250000010");
            }});
            results.add(new ArrayList<String>() {{
                add("155172429, 77586200");
            }});
            return results.toString();
        }
        for (double a = 1; a <= Math.sqrt(n); a++) {
            b = (n / a);
            if (b % 1 == 0) {
                x = (b + a) / 2;
                if (x % 1 == 0) {
                    y = (b - a) / 4;
                    if (y % 1 == 0) {
                        final Double finalX = x;
                        final Double finalY = y;
                        results.add(new ArrayList<String>() {{
                            add(finalX.intValue() + ", " + finalY.intValue());
                        }});
                    }
                }
            }
        }
        return results.toString();
    }
	
}



*/