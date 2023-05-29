/* 8KYU CodeWars Multiple Of index

Return a new array consisting of elements which are multiple of their 
own index in input array (length > 1).

Some cases:
[22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]

[68, -1, 1, -7, 10, 10] => [-1, 10]

[-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68] => [-85, 72, 0, 68]

*/

public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    //your code;
    int count = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] % i == 0) {
        count++;
      }
    }
    int[] result = new int[count];
    int x = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] % i == 0) {
        result[x] = array[i];
        x++;
      }
    }
    return result;
  }
}
/*-----------------------------------------------------------------------------------
import java.util.stream.*;

public class ZywOo {
  public static int[] multipleOfIndex(int[] a) {
    return IntStream.range(1,a.length).filter(i->a[i]%i==0).map(i->a[i]).toArray();
  }
}
------------------------------------------------------------------------------------
import java.util.ArrayList;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                temp.add(array[i]);
            }
        }
        int[] done = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            done[i] = temp.get(i);
        }
        return done;
    }
}
---------------------------------------------------------------------------
public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    //your code;
         int k = 0;
    int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
             //     nums[k] = array[i];
            //    System.out.println(nums[k]);
            //      k++;
              count++;
            }
        }
    int nums[] = new int[count];
     for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                  nums[k] = array[i];
            //    System.out.println(nums[k]);
                k++;
    }
       }
        return nums;
  }
}
----------------------------------------------------------------------------
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
        // create predicate that checks if the input variable is the input
        IntPredicate isMultipleOfIndex = (i) -> {
            if (i == 0) {
                return array[i] == 0;
            }
            
            return array[i] % i == 0;
        };
        
        // create IntStream of indices to pass into predicate
        return IntStream.range(0, array.length)
                .filter(isMultipleOfIndex)
                .map(i -> array[i])
                .toArray(); 

  }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class ZywOo {
  //Thanks Java Syntax
  public static int multipleOfIndex(int array [] ) [] {
    return IntStream.range(1, array.length)
                    .filter(i -> array[i] % i == 0)
                    .map(i -> array[i])
                    .toArray();
  }
}


*/