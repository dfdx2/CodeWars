/*  *KYU CodeWars  Beginner Series #2 Clock 

Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since 
midnight in milliseconds.
Hour = minutes * 60
Minutes = seconds * 60
Seconds = 1

Example:
h = 0
m = 1
s = 1

result = 61000
Input constraints:

0 <= h <= 23
0 <= m <= 59
0 <= s <= 59

*/

public class Clock {
  public static int Past(int h, int m, int s) {
    return ((h * 60 * 60) + (m * 60) + s) * 1000;
  }
}
/*--------------------------------------------------------- 
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return h * 3600000 + m * 60000 + s * 1000;
  }
}
------------------------------------------------------------
import java.time.Duration;

public class Clock {
  public static int Past(int h, int m, int s) {
    return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
  }
}
---------------------------------------------------------------
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return 1000*(s+60*(m+60*h));
  }
}
--------------------------------------------------------------------


*/
