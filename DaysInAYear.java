/* 8KYU CodeWars Days In A Year

A variation of determining leap years, assuming only integers are 
used and years can be negative and positive.

Write a function which will return the days in the year and the 
year entered in a string. For example:

Input: year = 2000 ==> returns "2000 has 366 days"
There are a few assumptions we will accept the year 0, even though 
there is no year 0 in the Gregorian Calendar.

Also the basic rule for validating a leap year are as follows

Most years that can be divided evenly by 4 are leap years.

Exception: Century years are NOT leap years UNLESS they can be 
evenly divided by 400.

So the years 0, -64 and 2016 will return 366 days. Whilst 1974, 
-10 and 666 will return 365 days.

*/
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      String result;
     if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
       result = String.valueOf(year) + " has 366 days";
     }
     else {
       result = String.valueOf(year) + " has 365 days";
     }
      return result;
   }
}
/*---------------------------------------------------------------------
import static java.time.Year.of;

interface DaysInAYear {
  static String daysInTheYear(int year) {
    return year + " has " + of(year).length() + " days";
  }
}
-----------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
					int daysInYear = isLeapYear(year) ? 366 : 365;
					return year + " has " + daysInYear + " days";
				}

				private static boolean isLeapYear(int year) {
					return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
				}
  }
------------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      var absYear = Math.abs(year);
      var isCenturyYear = absYear % 100 == 0 && absYear >= 100;
      var isLeap = isCenturyYear ? absYear % 400 == 0 : absYear % 4 == 0; 
      var days = isLeap ? 366 : 365;
     
      return String.format("%d has %d days", year, days);
   }
}
-----------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      // your code here...
//       double divisor = year/4; 
//       if(divisor)
     boolean flag;
     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
       flag = true;
     }else{
       flag = false;
     }
     if (flag) {
       return(year + " has 366 days");
     } else {
       return(year + " has 365 days");
     }
   }
}
------------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      boolean isCenturyYear = true;
		  boolean isLeapYear = true;
		  
		  isCenturyYear = year % 100 == 0 ? true : false;
		  
		  if(isCenturyYear){
		    isLeapYear =  year % 400 == 0 ? true : false;
		  }
		  else{
		    isLeapYear = year % 4 == 0 ? true : false;
		  }
		  
		  if(isLeapYear){
		    return year + " has 366 days";
		  }
		  else{
		    return year + " has 365 days";
		  }
   }
}
------------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
     boolean flag;
     if((year % 4 ==0 && year % 100 != 0)||year % 400 ==0){
       flag = true;
     }else
       flag = false;
     if(flag)
       return (year + " has 366 days");
     else
       return (year + " has 365 days");
   }
}
-------------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      if (year % 400 == 0) {
        return year + " has 366 days";
      } else if (year % 4 == 0) {
        if (year % 100 == 0) {
          return year + " has 365 days";
        }
        return year + " has 366 days";
      } else {
        return year + " has 365 days";
      }      
   }
}
------------------------------------------------------------------------
public class DaysInAYear {
   public static String daysInTheYear(int year) {
      // your code here...
     if (year % 4 == 0) {
       if (year % 400 == 0) {
          return "" + year + " has 366 days";
        }
       return year % 100 == 0 ? "" + year + " has 365 days" : "" + year + " has 366 days";
     } else {
       return "" + year + " has 365 days";
     }
  }
}
*/