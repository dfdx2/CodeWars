/* 7KYU CodeWars Leap Years

In this kata you should simply determine, whether a given year 
is a leap year or not. In case you don't know the rules, here they are:

years divisible by 4 are leap years
but years divisible by 100 are not leap years
but years divisible by 400 are leap years
Additional Notes:

Only valid years (positive integers) will be tested, so you don't have to 
validate them

Examples can be found in the test fixture.

*/

public class LeapYears {

	public static boolean isLeapYear(int year) {
	  return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
	}
}
/*------------------------------------------------------------------------
import static java.time.Year.of;

interface LeapYears {
  static boolean isLeapYear(int year) {
    return of(year).isLeap();
  }
}
-------------------------------------------------------------------------
interface LeapYears {
  static boolean isLeapYear(int year) {
    return year % 4 < 1 && year % 100 > 0 || year % 400 < 1;
  }
}
-------------------------------------------------------------------------
public class LeapYears {
  public static boolean isLeapYear(int year) {
    return java.time.Year.of(year).isLeap();
  }
}
--------------------------------------------------------------------------
public class LeapYears {

  public static boolean isLeapYear(int year) {
    return year % 4 != 0 ? false : year % 100 != 0 ? true : year % 400 == 0 ? true : false;
  }
}





*/