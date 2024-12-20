/* 7KYU COdeWars Difference Between Years

Write a function that receives two strings as parameter. This strings are 
in the following format of date: YYYY/MM/DD. Your job is: Take the years 
and calculate the difference between them.

Examples:
'1997/10/10' and '2015/10/10' -> 2015 - 1997 = returns 18 
'2015/10/10' and '1997/10/10' -> 2015 - 1997 = returns 18

At this level, you don't need validate months and days to calculate the difference.

*/
public class DifferenceBetweenYears {
  public static int howManyYears(String date1, String date2){
    String high = date1.substring(0,4);
    String low = date2.substring(0,4);
    return Math.max(Integer.valueOf(high), Integer.valueOf(low)) - Math.min(Integer.valueOf(high), Integer.valueOf(low));
  }
}

/*---------------------------------------------------------------------------
public class Bud {
    public static int howManyYears(String date1, String date2){
      String one = date1.substring(0,4);
      String two = date2.substring(0,4);
      int high = Math.max(Integer.valueOf(one),Integer.valueOf(two));
      int low = Math.min(Integer.valueOf(one), Integer.valueOf(two));
      return high - low;
    }
}
/*---------------------------------------------------------------------------
public class Bud {
  public static int howManyYears(String date1, String date2){
     return Math.abs(Integer.parseInt(date1.substring(0,4)) - Integer.parseInt(date2.substring(0,4)));
  }
}
------------------------------------------------------------------------------
public class Bud {
  public static int howManyYears(String date1, String date2){
    String a = date1.substring(0, 4);
    String b = date2.substring(0, 4);
    int year1 = Integer.parseInt(a);
    int year2 = Integer.parseInt(b);
    if (year1 > year2){
        return year1 - year2;
    }
    else{
      return year2 - year1; 
     }     
  }
}
--------------------------------------------------------------------------------
import static java.lang.Math.abs;

public class Bud {
  public static int howManyYears(String date1, String date2) {
    return abs(parseYear(date1) - parseYear(date2));
  }
  
  private static int parseYear(String date) {
    return Integer.parseInt(date.substring(0, 4));
  }
}
------------------------------------------------------------------------------
import static java.lang.Integer.parseInt;

interface Bud {
  static int howManyYears(String d1, String d2) {
    return Math.abs(parseInt(d1.substring(0, 4)) - parseInt(d2.substring(0, 4)));
  }
}
-------------------------------------------------------------------------------
public class Bud {
    public static int howManyYears(String date1, String date2){
       int year1 = Integer.parseInt(date1.split("/")[0]);
       int year2 = Integer.parseInt(date2.split("/")[0]);
       return Math.abs(year2 - year1);
    }
}
------------------------------------------------------------------------------
public class Bud {
    public static int howManyYears(String date1, String date2){
       int answer = Integer.parseInt(date1.substring(0, 4)) - Integer.parseInt(date2.substring(0, 4));
        return answer > 0 ? answer : answer * -1;
    }
}
--------------------------------------------------------------------------------
public class Bud {
    public static int howManyYears(String date1, String date2){
       String[] date1Arr = date1.split("/");
        String[] date2Arr = date2.split("/");

        return Math.abs(Integer.parseInt(date1Arr[0]) - Integer.parseInt(date2Arr[0]));
    }
}

*/