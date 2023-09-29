/* 8KYU CodeWars Is Your Period Late

In this kata, we will make a function to test whether a period is late.

Our function will take three parameters:

last - The Date object with the date of the last period

today - The Date object with the date of the check

cycleLength - Integer representing the length of the cycle in days

Return true if the number of days passed from last to today is 
greater than cycleLength. Otherwise, return false.

*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
      long result = ChronoUnit.DAYS.between(last, today);
      return (int) result > cycleLength;
    }
}
/*-------------------------------------------------------------------------
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {        
        return DAYS.between(last, today) > cycleLength;
    }
}
----------------------------------------------------------------------------
import java.time.LocalDate;

interface PeriodTime {
  static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
    return today.minusDays(cycleLength).isAfter(last);
  }
}
-----------------------------------------------------------------------------
import java.time.LocalDate;
public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
      LocalDate obj = today.minusDays(cycleLength);
      // 用第一个减去第二个时间，年相同比月份，月相同比日
      int diff = last.compareTo(obj);
      if (diff < 0)
        return true;
      else
        return false;
    }
}
---------------------------------------------------------------------------
import java.time.LocalDate;
import java.util.Date;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
      
        long days = today.toEpochDay() - last.toEpochDay();
        return days > cycleLength;
    }
}
-------------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
        return cycleLength<ChronoUnit.DAYS.between(last, today)?true:false;
    }
}
------------------------------------------------------------------------------
*/