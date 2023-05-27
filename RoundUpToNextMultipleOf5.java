/* 7KYU CodeWars Round Up To The Next Multiple Of 5

Given an integer as input, can you round it to the next 
(meaning, "greater than or equal") multiple of 5?

Examples:

input:    output:
0    ->   0
2    ->   5
3    ->   5
12   ->   15
21   ->   25
30   ->   30
-2   ->   0
-5   ->   -5
etc.
Input may be any positive or negative integer (including 0).

You can assume that all inputs are valid integers.

*/
package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    if (number == 0) {
      return 0;
    }
    for (int i = number; i < number + 5; i++) {
      if (number % 5 != 0) {
        number++;
      }
    }
    return number;
  }
}
/*-------------------------------------------------------------------
package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {
  public static int roundToNext5(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}
---------------------------------------------------------------------
package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    return (int) (Math.ceil((float) number / 5) * 5);
  }
}
----------------------------------------------------------------
package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
        if(number % 5 == 0){
            return number;
        }else{
            number++;
            return roundToNext5(number);
        }
    }
}
------------------------------------------------------------------------
package com.codewars.hwtdstrngls;
import java.util.stream.IntStream;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    int[] kRounder = IntStream.rangeClosed(-1000000, 1000000).map(k -> k * 5).toArray();
        return number == 0 ? 0 : IntStream.of(kRounder)
                .filter(n -> n - number == 0 || (number - n < 5 && n > number))
                .findFirst().orElse(0);
  }
}
------------------------------------------------------------------------------
package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    int positive = (number % 5 > 0) ? 1 : 0;
    return number - (number % 5) + (5 * positive);
  }
}

*/