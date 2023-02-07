/* 8KYU CodeWars Beginner Series #4 Cockroach

The cockroach is one of the fastest insects. Write a function 
which takes its speed in km per hour and returns it in cm per 
second, rounded down to the integer (= floored).

For example:

1.08 --> 30
Note! The input is a Real number (actual type is language dependent) 
and is >= 0. The result should be an Integer.

*/

public class Cockroach{
  public int cockroachSpeed(double x){
    // Good Luck!
    double result = x * 27.777778;
    return (int) result;
  }
}
/*-----------------------------------------------------------------------------------------
public class Cockroach{
  public int cockroachSpeed(double x){
    return (int)(x / 0.036);
  }
}
-------------------------------------------------------------------------------------------
public class Cockroach{
  public int cockroachSpeed(double x){
    // Good Luck!
    return(int)(x*250/9);
  }
}
----------------------------------------------------------------------------------------------
public class Cockroach{
  public int cockroachSpeed(double x){
    return (int) (x * 100000)/3600;
  }
}
--------------------------------------------------------------------------------------------
public class Cockroach{
  public int cockroachSpeed(double x){
    x = x * 1000 / 36;
    x = Math.floor(x);
    return (int) x;
  }
}
-----------------------------------------------------------------------------------------
public class Cockroach{
  public int cockroachSpeed(double x){
    return (int)(x * 27.7778);
  }
}

*/