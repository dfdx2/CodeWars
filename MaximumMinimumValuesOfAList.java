/* 8KYU CodeWars Find Maximum and Minimum Values Of A List

Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively. Each function returns one number.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5

Notes
You may consider that there will not be any empty arrays/vectors.

*/
import java.util.Arrays;
public class MaximumMinimumValuesOfAList {

  public int min(int[] list) {
    Arrays.sort(list);
    return list[0];
  }
  
  public int max(int[] list) {
    Arrays.sort(list);
    return list[list.length - 1];
  }
}
/*--------------------------------------------------------------------
public class Kata {

  public int min(int[] list) {
    int i;
    int minimum = list[0];
    for (i=1; i < list.length; i++)
      if (list[i] < minimum) {
        minimum = list[i];
      }
    
    return minimum;
  }
  
  public int max(int[] list) {
    int a;
    int maximum = list[0];
    for (a = 1; a < list.length; a++) 
      if (list[a] > maximum) {
       maximum = list[a];
      }
    return maximum;
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;

public class Kata {

  public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
}
-----------------------------------------------------------------------
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
-----------------------------------------------------------------------
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
-----------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {

  public int min(int[] list) {
    return IntStream.of(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return IntStream.of(list).max().getAsInt();
  }
}
------------------------------------------------------------------------
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
-----------------------------------------------------------------------
import java.util.Arrays;


public class Kata {

  public int min(int[] list) {
    Arrays.sort(list);
    return list[0];
  }
  
  public int max(int[] list) {
    Arrays.sort(list);
      int arrayLength = list.length;
    return list[arrayLength-1];
  }
}
-------------------------------------------------------------------------
import java.util.TreeSet;
public class Kata {

  public int min(int[] list) {
    TreeSet<Integer> setMin = new TreeSet<>();
    for(Integer i : list) {
      setMin.add(i);
    }
    return setMin.first();
  }
  
  public int max(int[] list) {
    TreeSet<Integer> setMax = new TreeSet<>();
    for(Integer i : list) {
      setMax.add(i);
    }
    return setMax.last();
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Kata {

  public int min(int[] list) {
    return Collections.min(Arrays.stream(list).boxed().toList());
  }
  
  public int max(int[] list) {
    return Collections.max(Arrays.stream(list).boxed().toList());
  }
}
*/