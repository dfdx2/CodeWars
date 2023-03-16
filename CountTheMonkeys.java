/* 8KYU CodeWars Count The Monkeys

You take your son to the forest to see the monkeys. You know that there 
are a certain number there (n), but your son is too young to just appreciate 
the full number, he has to start counting them from 1.

As a good parent, you will sit and count with him. Given the number (n), 
populate an array with all numbers up to and including that number, but 
excluding zero.

For example(Input --> Output):

10 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
1 --> [1]

*/

public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    int size = n;
    int[] result = new int[size];
    for (int i = 0; i < n; i++) {
      result[i] = i + 1;
    }
    return result;
  }
}
/*-------------------------------------------------------------------------
import java.util.stream.*;
public class MonkeyCounter
{
  public static int[] monkeyCount(final int n) {
    return IntStream.rangeClosed(1, n).toArray();
  }
}
---------------------------------------------------------------------------
import java.util.Arrays;

public class MonkeyCounter {
  public static int[] monkeyCount(final int n) {
    int[] counts = new int[n];
    Arrays.setAll(counts, i -> i + 1);
    return counts;
  }
}
---------------------------------------------------------------------------
public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    if (n <= 0 || n > Integer.MAX_VALUE) {
      throw new IllegalArgumentException("Illegal N.");
    }
    int[] arr = new int[n];
    for (int i = 1; i <= n; i++) {
      arr[i-1] = i;
    }
    return arr;
  }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        return IntStream.range(1, n + 1).toArray();
    }
}


*/