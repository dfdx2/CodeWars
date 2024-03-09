/* 7KYU CodeWars Array Square Up B!

This is a question from codingbat

Given an integer n greater than or equal to 0, create and return 
an array with the following pattern:

squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) => [0, 1, 2, 1]
squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

0 <= n <= 1000.

*/
import static java.util.stream.IntStream.range;
public class Kata {

    public static int[] squareUp(int n) {
        return range(0, n).flatMap(x -> range(0, n).map(y -> y < n - x - 1 ? 0 : n - y)).toArray();
    }
}
/*-------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {

    public static int[] squareUp(int n) {
        return IntStream.range(0,n)
                        .flatMap( x -> IntStream.range(0,n).map( y -> y >= n-1-x ? n-y : 0 ))
                        .toArray();
    }
}
----------------------------------------------------------------------------
public class Kata {

    public static int[] squareUp(int n) {
        int[] a = new int[n*n];
        for (int r = 0; r < n; ++r) for (int c = 0; c < n; ++c) {
            if (r + c < n - 1) a[r * n + c] = 0;
            else a[r * n + c] = n - c;
        }
        return a;
    }
}
----------------------------------------------------------------------------
public class Kata {
    public static int[] squareUp(int n) {
        int[] r=new int[n*n];
        for(int j=0; j<n; j++) for(int i=0; i<n; i++) r[(j+1)*n-1-i]=i>j?0:i+1;
        return r;
    }
}
----------------------------------------------------------------------------
public class Kata {

public static int[] squareUp(int n) {
    int[]r=new int[n*n];
    for (int i=0;i<n*n;i++)
       r[i]=n-i%n>i/n+1?0:n-i%n;
    return r;
    }
}
----------------------------------------------------------------------------
public class Kata {
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int iteration = 0;
        for (int i = result.length - 1; i >= 0; i -= n){
            for (int j = 0; j < n - iteration; j++) {
                result[i - j] = j + 1;
            }
          iteration++;
        }
        return result;
    }
}
----------------------------------------------------------------------------
public class Kata {

    public static int[] squareUp(int n) {
        // initialize an n squared array
        int[] result = new int[n*n];
        
        // loop over in sequences of 4
        for(int i = 0; i < n; i++) {
            int[] temp = new int[n];
            
            // generate a 'n' array sequence pattern
            for(int j = 0; j < n; j++) {
                temp[j] = (j < n - i - 1) ? 0 : n - j;
            }
            
            // append the 'n' array sequence pattern to the result array
            System.arraycopy(temp, 0, result, i * n, temp.length);
        }
        
        return result;
    }
}
------------------------------------------------------------------------------
public class Kata {

    public static int[] squareUp(int n) {
       
       int[] result = null;
       
       if (n > 1000 || n < 0){
         return result;
       }else{
          result = new int[n*n];
       
       for(int i = 1; i <= n; i++ ){
         
         for(int j = 1, k = i*n - 1; j <= i; j++, k--){
           result[k] = j;
         }
         
       }
               
       return result;
       } 
    }
}
-----------------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static int[] squareUp(int n) {
      List<Integer> list = new LinkedList();
      for(int i=n;i>0;i--)  for(int j = 1; j<=n;j++)  list.add(j>i?0:j);
      Collections.reverse(list);
      return list.stream().mapToInt(x->x).toArray();
    }
}
*/