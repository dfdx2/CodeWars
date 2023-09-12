/* 6KYU CodeWars Find The Unique Number

There is an array with some numbers. All numbers are equal except for one. 
Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

This is the first kata in series:

Find the unique number (this kata)
Find the unique string
Find The Unique


*/

import java.util.Arrays;
 public class Kata {
    public static double findUniq(double arr[]) {
      return Arrays.stream(arr)
                .distinct()
                .filter(a -> Arrays.stream(arr)
                        .filter(b -> a == b).count() == 1)
                .reduce((a, b) -> {
                    throw new IllegalStateException();
                })
                .getAsDouble();
    }
}
/*----------------------------------------------------------------------
import java.util.Arrays;
 public class Kata {
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}
--------------------------------------------------------------------------
public class Kata {
  public static double findUniq(double arr[]) {
    final double x = arr[arr[0] == arr[1] ? 0 : 2];
    for (double y : arr)
      if (y != x)
        return y;
    throw new RuntimeException("no unique number found");
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map.Entry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class Kata {
    static double findUniq(final double[] array) {
        return Arrays.stream(array).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
    }
}



*/