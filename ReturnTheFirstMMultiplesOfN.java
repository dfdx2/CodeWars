/*  7KYU CodeWars Return The First M Multiples Of N


Implement a function, multiples(m, n), which returns an array of the 
first m multiples of the real number n. Assume that m is a positive integer.

Ex.

multiples(3, 5.0)
should return

[5.0, 10.0, 15.0]

*/

public class Kata {
  public static int[] multiples(int m, int n) {
    int count = 1;
    int[] result = new int[m];
    for (int i = 0; i < m; i++) {
      result[i] = count * n;
      count++;
    }
    return result;
  }
}
/*-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1, m)
                .map(x -> x * n)
                .toArray();
  }
}
-------------------------------------------------------------------------------
public class Kata {
  public static int[] multiples(int m, int n) {
  
    int[] arr = new int[m];
    
    for(int i = 0; i < arr.length; i++){
      arr[i] = (i + 1) * n;
    }
    return arr;
  }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {
    public static int[] multiples(int m, int n) {
        return IntStream.iterate(n, i -> i + n).limit(m).toArray();
    }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static int[] multiples(int m, int n) {
    return IntStream.rangeClosed(1, m).map(i -> i * n).toArray();
  }
}
-------------------------------------------------------------------------------



*/