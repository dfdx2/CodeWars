/* 7KYU CodeWars Bingo (Or Not)

For this game of BINGO, you will receive a single array of 10 numbers 
from 1 to 26 as an input. Duplicate numbers within the array are possible.

Each number corresponds to their alphabetical order letter 
(e.g. 1 = A. 2 = B, etc). Write a function where you will win the 
game if your numbers can spell "BINGO". They do not need to be in 
the right order in the input array. Otherwise you will lose. Your 
outputs should be "WIN" or "LOSE" respectively.

*/

package com.codewars.julesnuggy;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        int b = 0; // b = 2
        int x = 0; // i = 9
        int n = 0; // n = 14
        int g = 0; // g = 7
        int o = 0; // o = 15
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
          if (numberArray[i] == 2) {
            b++;
          }
          if (numberArray[i] == 9) {
            x++;
          }
          if (numberArray[i] == 14) {
            n++;
          }
          if (numberArray[i] == 7) {
            g++;
          }
          if (numberArray[i] == 15) {
            o++;
          }
        }
      return (b > 0 && x > 0 && n > 0 && g > 0 && o > 0) ? "WIN" : "LOSE";
    }
}
/*---------------------------------------------------------------------------------
package com.codewars.julesnuggy;

import java.util.ArrayList;
import java.util.List;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            list.add(numberArray[i]);
        }
        if (list.contains(2) && list.contains(9) && list.contains(14) && list.contains(7) && list.contains(15)) {
            return "WIN";
        } 
        return "LOSE";
    }
}
--------------------------------------------------------------------------------
package com.codewars.julesnuggy;

import java.util.*;
import java.util.stream.*;

public class BingoOrNot {
    
    private static final Set<Integer> BINGO = "BINGO".chars().map( c -> c-64 ).boxed().collect(Collectors.toSet());
    
    public static String bingo(int[] arr){
        return Arrays.stream(arr)
                     .filter(BINGO::contains)
                     .distinct()
                     .count() == BINGO.size() ? "WIN" : "LOSE";
    }
}
---------------------------------------------------------------------------------
package com.codewars.julesnuggy;
import java.util.Arrays;

public class BingoOrNot {
    public static String bingo(int[] a) {
        return Arrays.stream(new int[]{2, 7, 9, 14, 15}).allMatch(n -> Arrays.stream(a).anyMatch(i -> i == n)) ? "WIN" : "LOSE";
    }
}
----------------------------------------------------------------------------------
package com.codewars.julesnuggy;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
      int[] checker = {2, 9, 14, 7, 15};
      int count = 0;
      
      for(int item : checker)
        for(int val: numberArray)
          if(item == val) {
            count++;
            break;
          }
      return (count == checker.length) ? "WIN" : "LOSE";
    }
}
-------------------------------------------------------------------------
package com.codewars.julesnuggy;

public class BingoOrNot {

  public static String bingo(int[] n) {
    int x = 0, m = 49796;
    for (int a : n) if (((x |= 1<<a) & m) == m) return "WIN";
    return "LOSE";
  }

}
--------------------------------------------------------------------------
package com.codewars.julesnuggy;
import java.util.HashMap;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        HashMap<Character, Boolean> bingo = new HashMap<>();
        bingo.put('b', false);
        bingo.put('i', false);
        bingo.put('n', false);
        bingo.put('g', false);
        bingo.put('o', false);
        
        for (int i : numberArray) 
            if (bingo.containsKey((char)(i-1+'a'))) 
                bingo.put((char)(i-1+'a'), true);
        
        return bingo.containsValue(false) ? "LOSE" : "WIN";
    }
}
---------------------------------------------------------------------------
package com.codewars.julesnuggy;
import java.util.*;


public class BingoOrNot {
    static Set<Integer> b;
    static  {
        b = new HashSet<>();
        b.add(2);
        b.add(7);
        b.add(9);
        b.add(14);
        b.add(15);
    }
    public static String bingo(int[] numberArray){
        Set<Integer> h = new HashSet<>();
        for(int i : numberArray)
          if(b.contains(i))
            h.add(i);
        return h.size() == 5 ? "WIN" : "LOSE" ;
    }
}


*/