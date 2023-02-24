/* 7KYU CodeWars FIXME: Hours to Seconds

The code provided is meant to return how many seconds there are in a 
given number of hours.

But it's not working properly.

Task
Fix the bug so we can all go home early.

Notes
The hours passed will be in the range 0 - 1000000

*/

public class Dinglemouse {
  // Return the number of seconds in a given number of hours
  public static long hoursToSeconds(final int hours) {
    final long ret = (long) hours * 60 * 60;
    return ret;
  }
}
/*--------------------------------------------------------------------------------
public class Dinglemouse {
  // Return the number of seconds in a given number of hours
  public static long hoursToSeconds(final int hours) {
    return hours * 3600L;
  }
}
-------------------------------------------------------------------------------------
import java.util.concurrent.TimeUnit;

public class Dinglemouse {

  // Return the number of seconds in a given number of hours
  public static long hoursToSeconds(final int hours) {
           return TimeUnit.HOURS.toSeconds(hours);

  }

}
-------------------------------------------------------------------------------------




*/