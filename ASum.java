/* 6KYU CodeWars Build a Pile of Cubes

Your task is to construct a building which will be a pile of n cubes. 
The cube at the bottom will have a volume of, the cube above will 
have volume of and so on until the top which will have a volume of 

You are given the total volume m of the building. Being given m can 
you find the number n of cubes you will have to build?

The parameter of the function findNb

Examples:
findNb(1071225) --> 45

findNb(91716553919377) --> -1

*/

public class ASum {
	public static long findNb(long m) {
		long result = 0;
    while ((m -= ++result * result * result) > 0);
    return m == 0 ? result : -1;
	}	
}
/*-----------------------------------------------------------------
public class ASum {
	
	public static long findNb(long m) {
		long mm = 0, n = 0;
    while (mm < m) mm += ++n * n * n;
    return mm == m ? n : -1;
	}	
}
--------------------------------------------------------------------
public class ASum {
	
	public static long findNb(long m) {
	  long total = 0;
		int counter = 0;
		
		while (total < m) {		
			counter++;	
			total = total + (long) Math.pow(counter, 3);						
		}
		
		if (m == total)
			return counter;
		return -1;
	}	
}
-------------------------------------------------------------------
public class ASum {

	public static long findNb(long m) {
		long n = 0;
		long cubeSize = 0;
		for (; cubeSize < m; n++)
			cubeSize += n * n * n;
		return (cubeSize == m) ? n - 1 : -1;
	}
}
--------------------------------------------------------------------
import java.lang.Math;
public class ASum {
	
	public final static boolean isPerfectSquare(long n)
  {
  if (n < 0)
    return false;

  long tst = (long)Math.sqrt(n);
  return tst*tst == n;
  }
  
  public static long findNb(long m) {
		// your code
    long delta, n;
    m *= 4;
    if (!ASum.isPerfectSquare(m))
      return -1;
    else {
      m = (long)Math.sqrt(m);
      delta = 1 + 4*m;
      if (!ASum.isPerfectSquare(delta))
        return -1;
      else {
        n = (long) Math.sqrt(delta);
        return (n-1)/2;
      }
    }
	}	
}
--------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.function.LongSupplier;

public class ASum {
  
  private static Map<Long, Long> cubes = new HashMap<>();
  static {
    LongSupplier supplier = new LongSupplier() {
      long count = 1;
      long sum = 0L;
      
      @Override
      public long getAsLong() {
        sum += count * count * count;
        count++;
        return sum;
      }
    };
    
    for(long count = 1, num = supplier.getAsLong(); num > 0; count++, num = supplier.getAsLong()) {
      cubes.put(num, count);
    }
  }
	
	public static long findNb(long m) {
    return cubes.getOrDefault(m, -1L);
	}
  
  
}
---------------------------------------------------------------------
public class ASum {

    //solution based on Faulhaber's formula: https://en.wikipedia.org/wiki/Faulhaber%27s_formula
    public static long findNb(long m) {
        long fourthRootLong = (long)Math.sqrt(2 * Math.sqrt(m));
        if(fourthRootLong * fourthRootLong * (fourthRootLong+1) * (fourthRootLong+1) / 4 == m)
            return fourthRootLong;

        return -1;
    }
}
*/