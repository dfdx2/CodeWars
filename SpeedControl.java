/* 7KYU CodeWars Speed Control

In John's car the GPS records every s seconds the distance travelled 
from an origin (distances are measured in an arbitrary but consistent 
unit). For example, below is part of a record with s = 15:

x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
The sections are:

0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
We can calculate John's average hourly speed on every section and we get:

[45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
Given s and x the task is to return as an integer the *floor* of the 
maximum average speed per hour obtained on the sections of x. If x 
length is less than or equal to 1 return 0 since the car didn't move.

Example:
With the above data your function gps(s, x) should return 74

Note
With floats it can happen that results depends on the operations order. 
To calculate hourly speed you can use:

 (3600 * delta_distance) / s.

Happy coding!

*/
public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
      System.out.println(x);
      double j = 0;
      if (x.length <= 1) {
        return 0;
      }
      double result = 0;
      for (int i = 1; i < x.length; i++) {
        result = (3600 * (x[i] - x[i - 1])) / s;
        if (result > j) {
          j = result;
        }
      }
      return (int) Math.floor(j);
    }
}
/*------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
        double maxSpeed = IntStream
          .range(0, x.length - 1)
          .mapToDouble(i -> (x[i+1] - x[i]) * 3600.0 / (double) s )
          .max().orElse(0.0);
        return (int) Math.floor(maxSpeed);
    }
}
------------------------------------------------------------------------
public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
       double maxDiff = 0.0;
        for(int i = 0; i < x.length -1; i++){
          maxDiff = Math.max(x[i+1] - x[i], maxDiff);
        }
          return (int)Math.floor(maxDiff*3600.0/s);
    }
}
--------------------------------------------------------------------------
public class GpsSpeed {
    
    public static int gps(int s, double[] x)
    {
      int max = 0;
      for (int i = 0; i < x.length - 1; i++) max = (int) Math.max(max, (x[i + 1] - x[i]) * 3600 / s);
      return max;
    }
}
-------------------------------------------------------------------------
import java.util.stream.IntStream;

public class GpsSpeed {
    
    public static int gps(int s, double[] x) {      
      return x.length <= 1 ? 0 : (int) Math.floor(IntStream.range(1, x.length)
                                                           .mapToDouble(i -> x[i] - x[i-1])
                                                           .map(i -> i * 3600.0/s)
                                                           .max()
                                                           .getAsDouble());
    }
}


*/
