/* 8KYU CodeWars Quarter of the Year

Given a month as an integer from 1 to 12, return to which 
quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first 
quarter; month 6 (June), is part of the second quarter; 
and month 11 (November), is part of the fourth quarter.

*/

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        // Your code here
      if  (month <= 3) {
        return (1);
      }
      else if ((month >= 4) && (month <= 6)) {
        return (2);
      }
      else if ((month >= 7) && (month <= 9)) {
        return 3;
      }
      else {
        return 4;
      }
    }
}
/*---------------------------------------------------------
 interface Kata {
  static int quarterOf(int month) {
    return (int) Math.ceil(month / 3.);
  }
}
-------------------------------------------------------------
public class Kata {
    public static int quarterOf(int month) {
        return (month+2)/3;
    }
}
--------------------------------------------------------------
public class Kata {
    public static int quarterOf(int month) {

        switch(month){
          case 1:
            return 1;
          case 2:
            return 1;
          case 3:
            return 1;
          case 4:
            return 2;
          case 5:
            return 2;
          case 6:
            return 2;
          case 7:
            return 3;
          case 8:
            return 3;
          case 9:
            return 3;
          case 10:
            return 4;
          case 11:
            return 4;
          case 12:
            return 4;
          default:
                System.out.println("Invalid entry. The number is not between 1 - 12. Exiting... ");
          }
      return month;
       }
    }
-------------------------------------------------------------------
public class Kata {
  
  static final int Q[] = {0,1,1,1,2,2,2,3,3,3,4,4,4};

  public static int quarterOf(int m) {
    return Q[m];
  }
  
}
------------------------------------------------------------------
public class Kata {
    public static int quarterOf(int month) {
        return (month >= 1 && month <= 3) ? 1 : (month > 3 && month <= 6) ? 2 : (month > 6 && month <= 9) ? 3 : 4;
    }
}



*/