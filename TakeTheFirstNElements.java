/* 8KYU CodeWars Enumerable Magic #25 - Take The First N Elements

Create a function that accepts a list/array and a number n, 
and returns a list/array of the first n elements from the list/array.

If you need help, here's a reference:

*/
public class ZywOo {
    public static int[] take(int[] arr, int n) {
  
      if (n > arr.length) {
        return arr;
      }
      int[] result = new int[n];
      int i = 0;
      while (i < n && i < arr.length) {
        result[i] = arr[i];
        i++;
      }
      return result;
    }
}
/*---------------------------------------------------------------------------------
import java.util.Arrays;

class ZywOo {
  static int[] take(int[] arr, int n) {
    return n > arr.length ? arr : Arrays.copyOf(arr, n);
  }
}
----------------------------------------------------------------------------------
import java.util.Arrays;
public class ZywOo {
  public static int[] take(int[] arr, int n) {
     return Arrays.stream(arr).limit(n).toArray();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

public class ZywOo {
  public static int take(int[] arr, int n)[] {
    return Arrays.copyOfRange(arr, 0, Math.min(arr.length, n));
  }
}
-------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

class ZywOo {
  static int[] take(int[] arr, int n) {
    return of(arr).limit(n).toArray();
  }
}
-------------------------------------------------------------------------------
import java.util.Objects;
import java.util.Arrays;
public class ZywOo {
  public static int[] take(int[] arr, int n) {
    Objects.requireNonNull(arr, "arr should not be null");
    if (n < 0) throw new IllegalArgumentException("n should be 0 or greater");
    
    return (n > arr.length) ? arr : Arrays.copyOf(arr, n);
  }





*/