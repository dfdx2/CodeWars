/* 8KYU CodeWars Find Maximum and Minimum Values of a List

Your task is to make two functions ( max and min, or 
maximum and minimum, etc., depending on the language ) that 
receive a list of integers as input, and return the largest 
and lowest number in that list, respectively.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5

Notes

You may consider that there will not be any empty arrays/vectors.

*/

import java.util.Arrays;
import java.util.Collections;
public class Kata {

  public int min(int[] list) {
    Arrays.sort(list);
    return list[0];
  }
  
  public int max(int[] list) {
    Arrays.sort(list);
    return list[list.length - 1];
  }
}
/*----------------------------------------------------------------
import java.util.Arrays;

public class Kata {

  public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
}
-------------------------------------------------------------------
public class Kata {
  public int min(int[] list) {
    int min = list[0];
    for (int i = 1; i < list.length;i++) if (min > list[i]) min = list[i];
    return min;
  }
  public int max(int[] list) {
    int max = list[0];
    for (int i = 1; i < list.length;i++) if (max < list[i]) max = list[i];
    return max;
  }
}
--------------------------------------------------------------------
public class Kata {

  public int min(int[] list) {
    int min = list[0];
    for (int number : list) {
      if (number < min) {
        min = number;
      }
    }
    return min;
  }
  
  public int max(int[] list) {
    int max = list[0];
    for (int number : list) {
      if (number > max) {
        max = number;
      }
    }
    return max;
  }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {

  public int min(int[] list) {
    return IntStream.of(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return IntStream.of(list).max().getAsInt();
  }
}
---------------------------------------------------------------------
import java.util.Arrays;

public class Kata {

  public int min(int[] list) {
    return Arrays.stream(list)
            .min()
            .orElseThrow(RuntimeException::new);
  }
  
  public int max(int[] list) {
    return Arrays.stream(list)
              .max()
              .orElseThrow(RuntimeException::new);
  }
}
---------------------------------------------------------------
public class Kata {

  public int min(int[] list) {
    int n = Integer.MAX_VALUE;
    for (int num: list) n = num < n? num: n;
    return n;
  }
  
  public int max(int[] list) {
    int n = Integer.MIN_VALUE;
    for (int num: list) n = num > n? num: n;
    return n;
  }
}
-----------------------------------------------------------------
public class Kata {

  public int min(int[] list) {
    int min = list[0];
    for (int m : list) min = (m<min) ? m : min;
    return min;
  }
  
  public int max(int[] list) {
    int max = list[0];
    for (int m : list) max = (m>max) ? m : max;
    return max;
  }
}



*/