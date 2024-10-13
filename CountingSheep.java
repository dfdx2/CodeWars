/* 
Consider an array/list of sheep where some sheep may be 
missing from their place. We need a function that counts 
the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]

  The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined

*/
public class CountingSheep {
  public static int countSheeps(Boolean[] arrayOfSheeps) {
      int result = 0;
    for (int i = 0; i < arrayOfSheeps.length; i++) {
      if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
        result++;
      }
      else {
        continue;
      }
    }
    return result;
  }
}
/*------------------------------------------------------------
import java.util.*;

public class CountingSheep {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int)Arrays.stream(arrayOfSheeps)
                  .filter(c -> c!=null && c==true)
                  .count();
    }
  }

--------------------------------------------------------------
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}
-------------------------------------------------------------------
import java.util.Arrays;
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int) Arrays.stream(arrayOfSheeps).filter( e -> e != null && e == true).count();
  }
}
---------------------------------------------------------------------
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
       if(arrayOfSheeps != null && arrayOfSheeps.length > 0){
          int count = 0;
         for(Boolean b : arrayOfSheeps){
          if(b != null){
              count += b ? 1 : 0;
           }
         }
         return count;
      }
    return 0;
    }
}
----------------------------------------------------------------------
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    int total = 0;
    for (Boolean arrayOfSheep : arrayOfSheeps) {
      if (arrayOfSheep == null) continue;
      if (arrayOfSheep == true) total += 1;
    }
    return total;
  }
}
*/