/* 7KYU CodeWars Age In Days

Did you ever want to know how many days old are you? Complete the function which returns your age in days. The birthday is given in the following order: year, month, day.

For example if today is 30 November 2015 then

ageInDays(2015, 11, 1) returns "You are 29 days old"
The birthday is expected to be in the past.

Suggestions on how to improve the kata are welcome!

*/

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.DAYS;
public class AgeInDays {
  public static String ageInDays(int year, int month, int day) {
    return "You are " + DAYS.between(of(year, month, day), now()) + " days old";
  }
}
/*--------------------------------------------------------------------------
import java.time.*;

public class Kata {
  public static String ageInDays(final int y, final int m, int d) {
    return String.format("You are %d days old", LocalDate.now().toEpochDay() - LocalDate.of(y, m, d).toEpochDay());
  }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kata {
  public static String ageInDays(int year, int month, int day) {
    LocalDate birth = LocalDate.of(year, month, day);
    long days = ChronoUnit.DAYS.between(birth, LocalDate.now());
    return "You are " + days + " days old";
  }
}
----------------------------------------------------------------------------
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.DAYS;

class Kata {
  static String ageInDays(int year, int month, int day) {
    return "You are " + DAYS.between(of(year, month, day), now()) + " days old";
  }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kata {
    public static String ageInDays(int year, int month, int day) {
        return "You are " + -LocalDate.now().until(LocalDate.of(year, month, day), ChronoUnit.DAYS) + " days old";
    }
}
----------------------------------------------------------------------------
import java.time.Duration;
import java.time.LocalDateTime;

public class Kata {
  public static String ageInDays(int year, int month, int day) {
        LocalDateTime date = LocalDateTime.of(year, month, day, 0, 0, 0);
        LocalDateTime dateNow = LocalDateTime.now();
        Duration duration = Duration.between(date, dateNow);
        long amountOfDays = duration.toDays();
        return String.format("You are %s days old", amountOfDays);
    }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kata {
  public static String ageInDays(int year, int month, int day) {
     LocalDate birth = LocalDate.of(year, month, day);
        return String.format("You are %d days old", ChronoUnit.DAYS.between(birth,LocalDate.now()));
  }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
public class Kata {
  public static String ageInDays(int year, int month, int day) {
        return String.format("You are %s days old", LocalDate.now().toEpochDay() - LocalDate.of(year, month, day).toEpochDay());
  }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kata {
  public static String ageInDays(int year, int month, int day) {
    LocalDate birthday = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    int days = (int) ChronoUnit.DAYS.between(birthday, today);
    return String.format("You are %d days old", days);
  }
}
----------------------------------------------------------------------------
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Kata {
    public static String ageInDays(int year, int month, int day) {
      return String.format("You are %d days old", DAYS.between(LocalDate.of(year, month, day), LocalDate.now()));
    }
}
*/