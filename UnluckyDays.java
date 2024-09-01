/* 7KYU CodeWars Unlucky Days

Friday 13th or Black Friday is considered as unlucky day. 
Calculate how many unlucky days are in the given year.

Find the number of Friday 13th in the given year.

Input: Year in Gregorian calendar as integer.

Output: Number of Black Fridays in the year as an integer.

Examples:

unluckyDays(2015) == 3
unluckyDays(1986) == 1

*/

import static java.time.DayOfWeek.FRIDAY;
import static java.time.LocalDate.of;
import static java.util.stream.IntStream.range;

public class UnluckyDays {
  public static int unluckyDays(int year) {
    return range(1, 13).map(i -> of(year, i, 13).getDayOfWeek().equals(FRIDAY) ? 1 : 0).sum();
  }
}
/*----------------------------------------------------------------------------------------
import java.time.*;
import java.util.Arrays;

public class Kata {
  public static long unluckyDays(int year) {
    return Arrays.stream(Month.values())
      .map(month -> LocalDate.of(year, month, 13))
      .map(LocalDate::getDayOfWeek)
      .filter(DayOfWeek.FRIDAY::equals)
      .count();
  }
}
------------------------------------------------------------------------------------------
import java.util.Calendar;

public class Kata {
	public static int unluckyDays(int year) {
		int result = 0;
		Calendar cal = Calendar.getInstance();

		for (int i = 0; i < 12; i++) {
			cal.set(year, i, 13, 0, 0);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				result++;
			}
		}
		return result;
	}
}
------------------------------------------------------------------------------------------
import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;
import static java.util.stream.IntStream.range;

public class Kata {
  public static int unluckyDays(int year) {
    return range(1, 13).map(i -> LocalDate.of(year, i, 13).getDayOfWeek().equals(FRIDAY) ? 1 : 0).sum();
  }
}
------------------------------------------------------------------------------------------
import java.time.*;

public class Kata {
    public static int unluckyDays(int year) {
        int answer = 0;

        for (int m = 1; m <= 12; m++)
            if (LocalDate.of(year, m, 13).getDayOfWeek() == DayOfWeek.FRIDAY)
                answer++;

        return answer;
    }
}
-------------------------------------------------------------------------------------------
import java.time.*;

public class Kata {
  public static int unluckyDays(int year) {
    int counter = 0;
    
    for (int month=1; month<=12; month++) {
      if (LocalDate.of(year, month, 13).getDayOfWeek() == DayOfWeek.FRIDAY) {
        counter++;
      }
    }
    
    return counter;
  }
}
-------------------------------------------------------------------------------------------
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kata {
    public static int unluckyDays(int year) {
        int cout = 0;
        int z = 0;
        LocalDate years;
        years = LocalDate.ofYearDay(year, 2);
        if (years.isLeapYear()) {
            z = 356;
        } else z = 355;
        for (int i = 1; i < z; i++) {
            LocalDate time;
            time = LocalDate.ofYearDay(year, i);
            if (time.getDayOfWeek().equals(DayOfWeek.FRIDAY) && time.getDayOfMonth() == 13) {
                cout++;
            }
        }
        return cout;
    }
}

-------------------------------------------------------------------------------------------
import java.time.*;

public class Kata {
  public static int unluckyDays(int year) {
    int unlucky = 0;
    LocalDate ld = LocalDate.of(year, Month.JANUARY, 1);
    
    while (ld.getYear() == year) {
      unlucky += (ld.getDayOfWeek() == DayOfWeek.FRIDAY && ld.getDayOfMonth() == 13) ? 1 : 0;
      ld = ld.plusDays(1);
    }
    
    return unlucky;
  }
}
*/