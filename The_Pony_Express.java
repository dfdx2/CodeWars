/* 7KYU CodeWars The Pony Express

It reduced the time for messages to travel between 
the Atlantic and Pacific coasts to about 10 days, 
before it was made obsolete by the transcontinental 
telegraph.

How it worked
There were a number of stations, where:

The rider switched to a fresh horse and carried on, or
The mail bag was handed over to the next rider

Kata Task

stations is a list/array of distances (miles) from one 
station to the next along the Pony Express route.

Implement the riders method/function, to return how many 
riders are necessary to get the mail from one end to the 
other.

NOTE: Each rider travels as far as he can, but never more 
than 100 miles.

*/
public class Dinglemouse {
  public static int riders(final int[] stations) {
    int result = 1;
    int total = 0;
    for (int i = 0; i < stations.length; i++) {
      total += stations[i];
      if (total > 100) {
        result++;
        total = stations[i];
      }
    }
    return result;
  }
}
/*-------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
    int rider = 1, miles = 0;
    for (int distToNextStation : stations) {
      if (miles + distToNextStation > 100) { // change rider
        rider++;
        miles = 0;
      } 
      miles += distToNextStation;
    }
    return rider;
  }

}
---------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
        int counter = 0;
        int neededHorsemans = 1;

        for (int i = 0; i < stations.length; i++) {
            counter += stations[i];
            if (counter > 100){
                counter = stations[i];
                neededHorsemans +=1;
            }
        }
        return neededHorsemans;
}
}
---------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
      int count = 1 ; int sum=0 ; 
    for (int x : stations) {
        sum+= x ; 
        if (sum>100) {count++; sum=x;}
    }
    return count; 
}
  }
---------------------------------------------------------
import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicInteger;

class Dinglemouse {
  static int riders(int[] stations) {
    var riders = new AtomicInteger(1);
    of(stations).reduce((ml, dist) -> (ml += dist) > 100 && riders.addAndGet(1) > 0 ? dist : ml);
    return riders.get();
  }
}
---------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class Dinglemouse {

    public static int riders(final int[] stations) {
        int totalDistance = IntStream.of(stations).sum();

        int ridersNeeded = 1;

        // Only one rider is needed.
        if (totalDistance <= 100) {
            return ridersNeeded;
        }

        int mileage = 0;

        for (int i = 0; i < stations.length; i++) {
            mileage += stations[i];

            // One rider will never ride more than 100 miles.
            if (mileage > 100) {
                break;
            }

            stations[i] = 0;
        }

        // Filter zeroed values.
        int[] distancesArray = Arrays.stream(stations)
                                     .filter(station -> station != 0)
                                     .toArray();

        // Accumulate riders with recursive calls.
        return ridersNeeded + riders(distancesArray);
    }

}
---------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
    int[] riders = {0, 0};
    java.util.Arrays.stream(stations)
                    .forEach( s -> { if (riders[0]+s >= 100) {
                                         riders[1] += 1;
                                         riders[0] = riders[0]+s==100 ? 0 : s;
                                     } else riders[0] += s;
                                    });
    return riders[1] + (riders[0]!=0 ? 1:0);
  }
}
---------------------------------------------------------
public class Dinglemouse {
  public static int riders(final int[] stations) {
    int result = 1;
    int total = 0;
    for (int i = 0; i < stations.length; i++) {
      total += stations[i];
      if (total > 100) {
        result++;
        total = stations[i];
      }
    }
    return result;
  }
}
---------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
    int riders = 1, distance = 0;
    for(int next : stations) {
      if(distance + next > 100) {
        distance = 0;
        riders++;
      }
      distance += next;
    }
    return riders;
  }
}
---------------------------------------------------------
public class Dinglemouse {

  public static int riders(final int[] stations) {
    int raiders = 0;
    int miles = 0;
    for(int i = 0; i < stations.length;i++){ 
      miles += stations[i];
        if(miles>100){
          miles = 0 + stations[i];
          miles = 0 + stations[i];
          raiders++;
          }
        }
    return raiders+1;
  }

}
*/