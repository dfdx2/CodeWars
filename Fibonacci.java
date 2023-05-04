/* 7KYU CodeWars Fibonacci

Create function fib that returns n'th element of Fibonacci sequence 
(classic programming task).

*/
public class Fibonacci {
	public static long fib (int n){
 
		return (n == 0) ? 0 : (n == 1) ? 1 : fib(n - 1) + fib(n - 2);
	}
}
/*-------------------------------------------------------------------------
public class Fibonacci {
	public static long fib (int n){
		//code here 
		if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return fib(n - 1) + fib(n - 2);
    }
		
	}

}
-----------------------------------------------------------------------------
public class Fibonacci {
	public static long fib (int n) {
    if (n <= 1) {
      return n;
    }
		return fib(n - 1) + fib(n -2);
	}
}
-----------------------------------------------------------------------------
public class Fibonacci {
	public static long fib(int n) {
    long num1 = 0;
    long num2 = 1;
    System.out.println("N: " + n);
    
		for (int i = 0; i < n - 1; i++) {
      long temp = num1 + num2;
      num1 = num2;
      num2 = temp;
    }
    
		return num2;
	}

}
---------------------------------------------------------------------------
import java.util.stream.Stream;
public class Fibonacci {
	public static long fib (int n){
    return Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[0] + i[1]})
            .limit(n)
            .reduce((x, y) -> y)
            .get()[0];
	}
}
-----------------------------------------------------------------------------
import static java.util.stream.Stream.iterate;

public class Fibonacci {
  
    public static long fib(final int n) {
        return iterate(new long[]{1, 1}, a -> new long[]{a[1], a[0] + a[1]})
                .skip(n - 1).findFirst().orElseThrow()[0];
    }
}
-----------------------------------------------------------------------------
public class Fibonacci {
  public static double r5 = Math.sqrt(5);
  public static double phi = (1+r5)/2.0;
  public static double Phi = (1-r5)/2.0;
  public static double a2 = (-1/r5);
  public static double a1 = (1/r5);
	public static long fib (int n){
		//code here 
		return (long)Math.round(a1*Math.pow(phi,n) + a2*Math.pow(Phi,n));
		
	}

}
-----------------------------------------------------------------------
public class Fibonacci {
	public static long fib (int n){
		//code here 
    long[][] mat1 = {{0,1},{1,1}};
    long[][] mat2 = {{0,1},{1,1}};
    while(n>0)
    {
      if((n&1) ==1)
        mat2 = mult(mat1,mat2);
      mat1 = mult(mat1,mat1);
      n>>=1;
    }
		return mat2[0][0];
	}
  public static long[][] mult(long[][] m1, long[][] m2)
  {
    long p1 = (m1[0][0] + m1[1][1])*(m2[0][0] +m2[1][1]);
    long p2 = (m1[1][0] + m1[1][1])*m2[0][0];
    long p3 = m1[0][0]*(m2[0][1]-m2[1][1]);
    long p4 = m1[1][1]*(m2[1][0]-m2[0][0]);
    long p5 = (m1[0][0] + m1[0][1])*m2[1][1];
    long p6 = (m1[1][0]-m1[0][0])*(m2[0][0]+m2[0][1]);
    long p7 = (m1[0][1]-m1[1][1])*(m2[1][0] + m2[1][1]);
    return new long[][]{{p1+p4-p5+p7,p3+p5},{p2+p4,p1-p2+p3+p6}};
  }

}
-------------------------------------------------------------------------
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Fibonacci {

  public static Long fib (int n){
        Map<Integer, Long> map = new HashMap<Integer, Long>();
        map.put(0,0l);
        map.put(1,1l);
        for(int i=1; i<=(n-1); i++) {
            map.put(i+1,(map.get(i) + map.get(i-1)));
        }
        return map.get(n);
  } 
  
}
----------------------------------------------------------------------------
import static java.util.stream.Stream.iterate;

class Fibonacci {
  static long fib(int n) {
    return iterate(new long[] {1, 1}, i -> new long[] {i[1], i[0] + i[1]})
        .limit(n).reduce((x, y) -> y).orElse(new long[1])[0];
  }
}


*/