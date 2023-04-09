/* 8KYU CodeWars Count By X

Create a function with two arguments that will return an array 
of the first n multiples of x.

Assume both the given number and the number of times to count 
will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).

Examples
countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
countBy(2,5)  // should return {2,4,6,8,10}

*/
public class Kata{
  public static int[] countBy(int x, int n){
    // Your code here
    int[] result = new int[n];
    int i = 0;
    int start = 1;
    while (start <= n) {
      result[i] = start * x; 
      start++;
      i++;
    }
    return result;
  }
}
/*---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata{
  public static int[] countBy(int x, int n){
    
    return IntStream.rangeClosed(1, n)
      .map(i -> i * x)
      .toArray();
  }
}
-----------------------------------------------------------------------------
public class Kata{
  public static int[] countBy(int x, int n){
    int[] el = new int[n];
    for(int i = 0; i < n; i++)  el[i] = x * (i+1);
    return el;
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata{
  public static int[] countBy(int x, int n){
    return IntStream.iterate(x, it -> it + x).limit(n).toArray();
  }
}
----------------------------------------------------------------------------
public class Kata{
  public static int[] countBy(int x, int n){
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = x * (i + 1);
    }
    return arr;
  }
}
---------------------------------------------------------------------------
public class Kata{
  public static int[] countBy(int x, int n){
        int[] result = new int[n];
        int j = 0;
        for (int i = 1; j < n; i++) {
            if (i % x == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
  }
}
-------------------------------------------------------------------------
public class Kata{
  public static int[] countBy(int x, int n){
    return java.util.stream.IntStream.iterate(x,i->i+x).limit(n).toArray();
  }
}
------------------------------------------------------------------------
import static java.util.stream.IntStream.iterate;

interface Kata {
  static int[] countBy(int x, int n) {
    return iterate(x , i -> i + x).limit(n).toArray();
  }
}
------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata{
  public static int[] countBy(int x, int n){
    return IntStream.rangeClosed(1, n)
      .map(i -> x*i)
      .toArray();
  }
}



*/