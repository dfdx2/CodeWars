/* 7KYU CodeWars Speed Limit

The police have placed radars that will detect those vehicles that exceed 
the speed limit on that road. If the driver's speed is 10km/h to 19km/h 
above the speed limit, the fine will be 100 dollars, if it is exceeded by 
20km/h to 29km/h the fine will be 250 dollars and if it is exceeded by more 
than 30km/h the fine will be 500 dollars.

You will be provided with the speed limits of those roads with radar as a 
collection of speedlimits [90,100,110,120,....] and the speed of the driver 
will be the same on all roads and can never be negative and the amount of the 
fine will be accumulated example 95km/h.

Example (Speed=100, Signals=[110,100,80]-> 250)

*/

public class Kata {
  
    public static int speedLimit(final int speed, final int[] signals) {
      int total = 0;
      for (int i = 0; i < signals.length; i++) {
        if (speed >= signals[i] + 10 && speed < signals[i] + 20) {
          total += 100;
        }
        else if (speed >= signals[i] + 20 && speed < signals[i] + 30) {
          total += 250;
        }
        else if (speed >= signals[i] + 30) {
          total += 500;
        }
      }
      return total;
    }
}
/*-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static int speedLimit(int speed, int[] signals) {
        return IntStream.of(signals).map(v -> speed - v).map(over -> over < 10 ? 0 : over < 20 ? 100 : over < 30 ? 250 : 500).sum();
    }
}
-------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

interface Kata {
  static int speedLimit(int speed, int[] signals) {
    return of(signals).reduce(0, (fine, sign) -> fine + (
        speed > sign + 29 ? 500 :
        speed > sign + 19 ? 250 :
        speed > sign +  9 ? 100 : 0));
  }
}
---------------------------------------------------------------------------------
public class Kata {
  public static int speedLimit(int speed, int[] signals) {
    int total = 0;
    for(int s : signals) total += speed - s >= 10 ? speed - s >= 20 ? speed - s >= 30 ? 500 : 250 : 100 : 0;
    return total;
  }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  
    public static int speedLimit(final int speed, final int[] signals) {
      return Arrays.stream(signals)
        .map(limit -> speed < limit + 10 ? 0 : switch ((speed - limit) / 10) {
          case 1 -> 100;
          case 2 -> 250;
          default -> 500;
        })
        .sum();
    }
}
--------------------------------------------------------------------------------
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

import static org.apache.commons.lang3.Range.between;

public class Kata {

    public static int speedLimit(final int speed, final int[] signals) {
        return IntStream.of(signals)
                .map(sign -> speed - sign)
                .map(CALCULATE_FINE)
                .sum();
    }

    private static final IntUnaryOperator CALCULATE_FINE = diff ->
            between(10, 19).contains(diff) ? 100
                    : between(20, 29).contains(diff) ? 250
                    : diff >= 30 ? 500
                    : 0;
}
---------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Kata {
  
    public static int speedLimit(final int speed, final int[] signals) {
        List<Integer> fine = new ArrayList<Integer>();
         
        IntStream
                .of(signals)
                .filter(value -> (speed - value) > 9)
                .map(x -> speed - x)
                .forEach(i -> {
                    if (i >= 10 && i < 20) {fine.add(100);}
                    else if (i >= 20 && i < 30) {fine.add(250);}
                    else {fine.add(500);}
                });

        return fine.stream().reduce(0, (acc, x) -> acc + x);
    }
}


*/