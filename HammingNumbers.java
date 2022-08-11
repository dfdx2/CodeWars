/*  4 KYU CodeWars   Hamming Numbers
A Hamming number is a positive integer of the form 2i3j5k, 
for some non-negative integers i, j, and k.

Write a function that computes the nth smallest Hamming number.

Specifically:

The first smallest Hamming number is 1 = 203050
The second smallest Hamming number is 2 = 213050
The third smallest Hamming number is 3 = 203150
The fourth smallest Hamming number is 4 = 223050
The fifth smallest Hamming number is 5 = 203051
The 20 smallest Hamming numbers are given in the Example test fixture.

Your code should be able to compute the first 5 000 
( LC: 400, Clojure: 2 000, NASM, C, D, C++, Go and Rust: 13 282 ) 
Hamming numbers without timing out.

*/
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;


public class Hamming {
    private static final SortedSet<Long> resultSet = new TreeSet<>();
    private static int nextIndex = 1;

    static {
        resultSet.add(1l);
    }

    public static long hamming(int n) {
        if (n <= 0) return -1;
        TreeSet<Long> ts = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long smallest = 1;
        for (int i = 1; i < n; i++) {
            smallest = ts.pollFirst();
            ts.add(smallest * 2);
            ts.add(smallest * 3);
            ts.add(smallest * 5);
        }
        return smallest;
    }
}
/*-------------------------------------------------------------------
 public class Hamming {
  
  public static long hamming(int n) {
    long[] h = new long[n];
    h[0] = 1;
    long x2 = 2, x3 = 3, x5 = 5;
    int i = 0, j = 0, k = 0;
 
    for (int index = 1; index < n; index++) {
      h[index] = Math.min(x2, Math.min(x3, x5));
      if (h[index] == x2) x2 = 2 * h[++i];
      if (h[index] == x3) x3 = 3 * h[++j];
      if (h[index] == x5) x5 = 5 * h[++k];
    }
    
    return h[n - 1];
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;
import java.util.TreeSet;

public class Hamming {
    public static long hamming(int n) {
        if (n <= 0) return -1;
        TreeSet<Long> ts = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long smallest = 1;
        for (int i = 1; i < n; i++) {
            smallest = ts.pollFirst();
            ts.add(smallest * 2);
            ts.add(smallest * 3);
            ts.add(smallest * 5);
        }
        return smallest;
    }
}
----------------------------------------------------------------------------

public class Hamming {

    public static long hamming(int n) {
        SortedSet<Long> set = new TreeSet<>();
        set.add((long) 1);
        long currentElem;
        for (int i = 0; i < n - 1; ++i) {
            currentElem = set.first();
            set.addAll(Arrays.asList(currentElem * 2, currentElem * 3, currentElem * 5));
            set.remove(currentElem);
        }
        return set.first();
    }

}
-----------------------------------------------------------------------------------



*/