/*  8KYU CodeWars Opposites Attract

Timmy & Sarah think they are in love, but around where 
they live, they will only know once they pick a flower 
each. If one of the flowers has an even number of petals 
and the other has an odd number of petals it means they 
are in love.

Write a function that will take the number of petals of 
each flower and return true if they are in love and false 
if they aren't.

*/
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return ((flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0)) ? true : false;
  }
}
/*------------------------------------------------------------------
old solution

public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    if ((flower1 % 2 == 0) && (flower2 % 2 != 0)) {
      return true;
    }
    else if ((flower1 % 2 != 0) && (flower2 % 2 == 0)) {
      return true;
    }
    else {
      return false;
    }
  }
}
------------------------------------------------------------------
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return flower1 % 2 != flower2 % 2;
  }
}
------------------------------------------------------------------
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
  return (flower1+flower2)%2!=0;
  }
}
-----------------------------------------------------------------------
public class OppositesAttract {

  public static boolean isLove(int flower1, int flower2) {
    return isEven(flower1) ? isOdd(flower2) : isEven(flower2);
  }
  
  private static boolean isEven(int num) {
    return (num & 1) == 0;
  }
  
  private static boolean isOdd(int num) {
    return !isEven(num);
  }
}
--------------------------------------------------------------
public class OppositesAttract {

  public static boolean isLove(final int a, final int b) {
    return (a-b) %2 != 0;
  }
}

*/