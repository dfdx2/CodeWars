/* 8KYU CodeWars Gravity Flip

If you've completed this kata already and want a bigger challenge, here's the 3D 
version

Bob is bored during his physics lessons so he's built himself a toy box to help 
pass the time. The box is special because it has the ability to change gravity.

There are some columns of toy cubes in the box arranged in a line. The i-th 
column contains a_i cubes. At first, the gravity in the box is pulling the 
cubes downwards. When Bob switches the gravity, it begins to pull all the 
cubes to a certain side of the box, d, which can be either 'L' or 'R' 
(left or right). Below is an example of what a box of cubes might look 
like before and after switching gravity.

+---+                                       +---+
|   |                                       |   |
+---+                                       +---+
+---++---+     +---+              +---++---++---+
|   ||   |     |   |   -->        |   ||   ||   |
+---++---+     +---+              +---++---++---+
+---++---++---++---+         +---++---++---++---+
|   ||   ||   ||   |         |   ||   ||   ||   |
+---++---++---++---+         +---++---++---++---+
Given the initial configuration of the cubes in the box, find out how many 
cubes are in each of the n columns after Bob switches the gravity.

Examples (input -> output:
* 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
* 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]

*/

import java.util.Arrays;
public class Kata {
  public static int[] flip(char dir, int[] arr) {
    Arrays.sort(arr);
    int i = 0;
    int x = arr.length - 1;
    int[] result = new int[arr.length];
    for (int count = arr.length - 1; count >= 0; count--) {
      result[i] = arr[count];
      i++;
    }
    return (dir == 'R') ? arr : result;
  }
}
/*----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
        
    if (dir == 'L') {
          arr = Arrays.stream(arr)
                  .boxed()
                  .sorted(Collections.reverseOrder())
                  .mapToInt(Integer::intValue)
                  .toArray();
    } else{
      Arrays.sort(arr);
    }
    
    return arr;
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static int[] flip(char dir, int[] arr) {
    int tmp = 0;

        if (dir == 'R') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] < arr[j-1]) {
                        tmp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        } else if (dir == 'L') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] > arr[j-1]) {
                        tmp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }
}
------------------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
    return Arrays.stream(arr).boxed()
                 .sorted(dir=='L'? (a,b)->b-a : (a,b)->a-b)
                 .mapToInt(Integer::intValue)
                 .toArray();
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
    Arrays.sort(arr);
    int[] result = new int[arr.length];
    
    if (dir == 'R') {
      return arr;
    }
    
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[arr.length - 1 - i];
    }
    
    return result;
  }
}
-------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

interface Kata {
  static int[] flip(char dir, int[] arr) {
    return of(arr).boxed().sorted((a, b) -> dir > 77 ? a - b : b - a).mapToInt(i -> i).toArray();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
public class Kata {
  public static int[] flip(char dir, int[] arr) {
     Arrays.sort(arr);
    
    if (dir =='L')
   ArrayUtils.reverse(arr);  
    return arr;
  }
}
----------------------------------------------------------------------------------
public class Kata {
  public static int[] flip(char dir, int[] arr) {
         int [] arrL = new int[arr.length];

         for (int i = arr.length - 1; i > 0; i--) {
              for (int j = 0; j < i; j++){
                  if (arr[j] > arr[j + 1]) {
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }
         }
         if (dir == 'R') {
                return arr;
            }
         if (dir == 'L') {
                for (int i = arrL.length - 1; i >= 0; i--) {
                    arrL[i] = arr [arrL.length - i - 1];
                }
            return arrL;
            } else return null;
}
  }
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
        var comparator = switch (dir) {
            case 'R' -> Comparator.<Integer>naturalOrder();
            case 'L' -> Comparator.<Integer>reverseOrder();
            default -> throw new IllegalArgumentException();
        };
        return Arrays.stream(arr)
                     .boxed()
                     .sorted(comparator)
                     .mapToInt(i -> i)
                     .toArray();
    }
}


*/