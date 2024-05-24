/* 7KYU CodeWars Basic Sequence Practice

A sequence or a series, in mathematics, is a string 
of objects, like numbers, that follow a particular 
pattern. The individual elements in a sequence are 
called terms. A simple example is 3, 6, 9, 12, 15, 18, 21, ..., 
where the pattern is: "add 3 to the previous term".

In this kata, we will be using a more complicated 
sequence: 0, 1, 3, 6, 10, 15, 21, 28, ... This sequence 
is generated with the pattern: "the nth term is the sum 
of numbers from 0 to n, inclusive".

[ 0,  1,    3,      6,   ...]
  0  0+1  0+1+2  0+1+2+3
Your Task
Complete the function that takes an integer n and returns 
a list/array of length abs(n) + 1 of the arithmetic series 
explained above. Whenn < 0 return the sequence with 
negative terms.

Examples

 5  -->  [0,  1,  3,  6,  10,  15]
-5  -->  [0, -1, -3, -6, -10, -15]
 7  -->  [0,  1,  3,  6,  10,  15,  21,  28]

*/

public class SequenceSum {
	public static int[] sumOfN(int n) {
    int[] result = new int[Math.abs(n) + 1];
    for (int i = 1; i < result.length; i++) {
      result[i] = result[i - 1] + (n > 0 ? i : -i);
    }
    return result;
  }
}
/*-----------------------------------------------------------
public class SequenceSum {
	public static int[] sumOfN(int n) {
    int[] result = new int[Math.abs(n) + 1];
    
    int sum = 0;
    int sign = (int) Math.signum(n);
    
    for (int i = 0; i < result.length; i++) {
    	result[i] = sum + sign * i;
      sum += sign * i;
    }
    
    return result;
  }
  
}
-------------------------------------------------------------
public class SequenceSum {
	public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n)+1];
        for(int i = 1; i < result.length; i++)
            result[i] = result[i-1] + (n > 0 ? i : -i);
        return result;
  }
}
-------------------------------------------------------------
import java.util.stream.IntStream;

public class SequenceSum {
	public static int[] sumOfN(int n) {
    int modifier = n < 0 ? -1 : 1;
    int[] range = new int[Math.abs(n) + 1];
    IntStream.rangeClosed(0, Math.abs(n)).forEach(
      i -> {range[i] = i == 0 ? 0 : range[i - 1] + i * modifier;}
    );
    return range;
  }
}
-------------------------------------------------------------
import java.util.stream.IntStream;

public class SequenceSum {

	  public static int[] sumOfN(int n) {
        return IntStream.rangeClosed(0, Math.abs(n))
                        .map(i -> n < 0 ? -i * (i + 1) / 2 : i * (i + 1)/2)
                        .toArray();
    }
}
-------------------------------------------------------------
public class SequenceSum {
  public static int[] sumOfN(int n) {
    
    int list[] = new int[Math.abs(n)+1], sum = 0;
    
    for(int i = 0; i <= Math.abs(n); i++, sum += i){
      if(n < 0) list[i] = sum * -1;
      else list[i] = sum;
    }
    
    return list; 
  }
}
-------------------------------------------------------------
import java.util.stream.IntStream;
public class SequenceSum {
	public static int[] sumOfN(int n) {
    return IntStream.rangeClosed(0,Math.abs(n)).map( i -> n < 0 ? i*(-i-1)/2 :i*(i+1)/2).toArray();
  }
}
-------------------------------------------------------------
import java.util.stream.IntStream;

public class SequenceSum {
	public static int[] sumOfN(int n) {
  
    int mod = n < 0 ? -1 : 1; // use this to make the numbers negative if need be
  
    return IntStream.rangeClosed(0, mod*n)
                    .mapToObj(x -> IntStream.rangeClosed(0, x))
                    .mapToInt(x -> mod*x.sum())
                    .toArray();
  }
}
*/