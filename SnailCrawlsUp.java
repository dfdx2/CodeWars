/* 7KYU CodeWars Snail Crawls Up

The snail crawls up the column. During the day it crawls up some distance. 
During the night she sleeps, so she slides down for some distance 
(less than crawls up during the day).

Your function takes three arguments:

The height of the column (meters)
The distance that the snail crawls during the day (meters)
The distance that the snail slides down during the night (meters)
Calculate number of day when the snail will reach the top of the column.

*/
public class Kata {
    public static int snail(int column, int day, int night) {
      if (column < day) {
        return 1;
      }
      int days = 1;
      int count = 0;
      while (count <= column) {
        count += day;
        if (count >= column) {
          return days;
        }
        else {
          count = count - night;
          days++;
        }
      }
      return days;
    }
}
/*-----------------------------------------------------------------------------
public class Kata {
    public static int snail(int column, int day, int night) {
      int days = 1;
      while(day < column){
        column -= (day - night);
        days++;
      }
      return days;
    }
}
---------------------------------------------------------------------------------
public class Kata {
    public static int snail(int column, int day, int night) {
      return 1 + Math.max(0, (int)Math.ceil((float)(column - day) / (day - night)));
    }
}
----------------------------------------------------------------------------------
public class Kata {
    public static int snail(int column, int day, int night) {
    if (column <= day) return 1;
      if ((column-day)%(day - night) == 0) return (column-day)/(day - night)+1;
        else return  (column-day)/(day - night) +2;
    }
}
---------------------------------------------------------------------------------
public class Kata {
  public static int snail(int column, int day, int night) {
    for (int dist=0, n=1;; dist -= night, n++) if ((dist += day) >= column) return n;
  }
}



*/