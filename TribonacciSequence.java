/*   6KYU CodeWars Tribonacci Sequence
Well met with Fibonacci bigger brother, AKA Tribonacci.

As the name may already reveal, it works basically like a Fibonacci, 
but summing the last 3 (instead of 2) numbers of the sequence to 
generate the next. And, worse part of it, regrettably I won't get to 
hear non-native Italian speakers trying to pronounce it :(

So, if we are to start our Tribonacci sequence with [1, 1, 1] as a 
starting input (AKA signature), we have this sequence:

[1, 1 ,1, 3, 5, 9, 17, 31, ...]
But what if we started with [0, 0, 1] as a signature? As starting 
with [0, 1] instead of [1, 1] basically shifts the common Fibonacci 
sequence by once place, you may be tempted to think that we would get 
the same sequence shifted by 2 places, but that is not the case and 
we would get:

[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
Well, you may have guessed it by now, but to be clear: you need to 
create a fibonacci function that given a signature array/list, 
returns the first n elements - signature included of the so seeded sequence.

Signature will always contain 3 numbers; n will always be a non-negative 
number; if n == 0, then return an empty array (except in C return NULL) and 
be ready for anything else which is not clearly specified ;)

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        List<Double> result = Arrays.stream(s).boxed().collect(Collectors.toList());
        for (int i = result.size() - 1; i < n - 1; i++) {
            result.add(result.get(i - 2) + result.get(i - 1) + result.get(i));
        }

        return result.stream().limit(n).mapToDouble(Double::doubleValue).toArray();
    }
}
/* ----------------------------------------------------------------------------------  

import java.util.Arrays;

public class Xbonacci {
  public double[] tribonacci(double[] s, int n) {

      double[] tritab=Arrays.copyOf(s, n);
      for(int i=3;i<n;i++){
        tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
      }
      return tritab;

    }
}
--------------------------------------------------------------------------------------
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      // hackonacci me
      if( n == 0 )
        return new double[0];
      double[] res = new double[n];
      for( int i = 0; i < n; i++ ) {
        if( i < 3 )
          res[i] = s[i];
        else
          res[i] = res[i-1]+res[i-2]+res[i-3];
      }
      return res;
  }
}
--------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Stream;

public class Xbonacci {

    public double[] tribonacci(double[] start, int n) {
        return Stream.iterate(start, tuple -> applySequenceRule(tuple))
            .mapToDouble(tuple -> tuple[0])
            .limit(n)
            .toArray();
    }
    
    private double[] applySequenceRule(double[] tuple) {
        return new double[]{tuple[1], tuple[2], tuple[0]+tuple[1]+tuple[2]};
    }
  
}
-------------------------------------------------------------------------------------
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      double[] r = new double[n];
      for(int i = 0; i < n && i < 3; i++) r[i] = s[i];
      for(int i = 3; i < n; i++)
        r[i] = r[i - 1] + r[i - 2] + r[i - 3];
      return r;
  }
}
-----------------------------------------------------------------------------------
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      double[] TriboNacci = new double[n];
        
        switch (n) {
            case 0:
                return TriboNacci;
            case 1:
                TriboNacci[0] = s[0];
                return TriboNacci;
            case 2:
                TriboNacci[0] = s[0];
                TriboNacci[1] = s[1];
                return TriboNacci;
        }
        
        TriboNacci[0] = s[0];
        TriboNacci[1] = s[1];
        TriboNacci[2] = s[2];

        for (int i = 3; i < n; i++) {
            TriboNacci[i] = TriboNacci[i - 3] + TriboNacci[i - 2] + TriboNacci[i - 1];
        }
        return TriboNacci;
  }
}



*/