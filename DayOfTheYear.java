/* 7KYU CodeWars Day Of The Year

Work out what number day of the year it is.

toDayOfYear([1, 1, 2000]) => 1
The argument passed into the function is an array with the format [D, M, YYYY], e.g. [1, 2, 2000] for February 1st, 2000 or [22, 12, 1999] for December 22nd, 1999.

Don't forget to check for whether it's a leap year! Three criteria must be taken into account to identify leap years:

The year can be evenly divided by 4;
If the year can be evenly divided by 100, it is NOT a leap year, unless;
The year is also evenly divisible by 400. Then it is a leap year.

*/

public class DateToInt{
  public static int toDayOfYear(int[] date){
    int one = 31;
    int two = 28;
    int three = 31;
    int four = 30;
    int five = 31;
    int six = 30;
    int seven = 31;
    int eight = 31;
    int nine = 30;
    int ten = 31;
    int eleven = 30;
    int twelve = 31;
    int result = 0;
    if (date[2] % 4 == 0 && date[2] % 100 != 0 || date[2] % 400 == 0) { 
      two = 29;
    }
    if (date[1] == 1) {
        result = date[0];
    }
    if (date[1] == 2) {
        result = date[0] + one;
    }
    if (date[1] == 3) {
        result = date[0] + one + two;
    }
    if (date[1] == 4) {
        result = date[0] + one + two + three;
    }
    if (date[1] == 5) {
        result = date[0] + one + two + three + four;
    }
    if (date[1] == 6) {
        result = date[0] + one + two + three + four + five;
    }
    if (date[1] == 7) {
        result = date[0] + one + two + three + four + five + six;
    }
    if (date[1] == 8) {
       result = date[0] + one + two + three + four + five + six + seven;
    }
    if (date[1] == 9) {
        result = date[0] + one + two + three + four + five + six + seven + eight;
    }
    if (date[1] == 10) {
        result = date[0] + one + two + three + four + five + six + seven + eight + nine;
    }
    if (date[1] == 11) {
        result = date[0] + one + two + three + four + five + six + seven + eight + nine + ten;
    }
    if (date[1] == 12) {
        result = date[0] + one + two + three + four + five + six + seven + eight + nine + ten + eleven;
    }
    return result;
  }
}
/*--------------------------------------------------------------------------------
public class DateToInt{
  public static int toDayOfYear(int[] d){
  int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  if ((d[2] % 4 == 0 && d[2] % 100 != 0) || d[2] % 400 == 0) 
      days[2]++; 
  for (int i=1;i<d[1]; i++) 
      d[0]+=days[i];
  return d[0];
    }
}
---------------------------------------------------------------------------------
import java.time.LocalDate;

public class DateToInt{
  public static int toDayOfYear(int[] date){
    return LocalDate.of(date[2], date[1], date[0]).getDayOfYear();
  }
}
---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class DateToInt{
  public static int toDayOfYear(int[] date){
    int[] month = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    
    return IntStream.range(0, date[1]).map(x -> month[x]).sum() + date[0] + ((date[2] % 400 == 0 || (date[2] % 4 == 0 && date[2] % 100 != 0)) && date[1] > 2 ? 1 : 0);
  }
}
---------------------------------------------------------------------------------
public class DateToInt{
  public static int toDayOfYear(int[] date){
    //Happy Coding!
    int day = date[0];
        int month = date[1];
        int year = date[2];

        // Array to store the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check for leap year
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            daysInMonth[2] = 29;
        }

        int dayOfYear = 0;

        // Sum up days for each month leading up to the provided date

        for(int i = 0; i < month; i++){
            dayOfYear += daysInMonth[i];
        }


        // Add the day of the month

        dayOfYear += day;

        return dayOfYear;
  }
}
-----------------------------------------------------------------------------
import java.time.LocalDate;
public class DateToInt{
  public static int toDayOfYear(int[] date){
     LocalDate localDate = LocalDate.of(date[2],date[1],date[0]);
        int dayOfYear = localDate.getDayOfYear();
        return dayOfYear;
  }
}


*/