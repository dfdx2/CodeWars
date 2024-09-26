/* 7KYU CodeWars Perpendicular Lines

You are given an input (n) which represents the amount of 
lines you are given, your job is to figure out what is the 
maximum amount of perpendicular lines you can make using 
these lines.

Note: A perpendicular line is one that forms a 90 degree angle

n will always be greater than or equal t


*/
public class PerpendicularLines {
  public static int maxBisectors(int n) {
    return (int) (.25 * n * n);
  }
}
/*-------------------------------------------------
public class Perpendicular {
    public static int maxBisectors(int n) {
        int a=n/2;
        return n/2*(n-a);
    }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    //Happy coding :D
    return (int)(0.25*n*n);
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    return (int) Math.pow(n/2, 2) + n%2*n/2;
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    return (n - (n >> 1)) * (n >> 1);
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    return (int) Math.pow((double) n/2, 2);
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    return n / 2 * (n - n / 2);
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    if (n % 2 == 0)
      return (n/2)*(n/2);
    else
      return ((n-1)/2) *((n+1)/2);
      
  }
}
---------------------------------------------------
public class Perpendicular {
  public static int maxBisectors(int n) {
    return (int)Math.floor(0.25*n*n);
  }
}
*/