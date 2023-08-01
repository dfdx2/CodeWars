/*  7KYU CodeWars Two Numbers Are Positive

Task:
Your job is to write a function, which takes three integers a, b, and c as 
arguments, and returns True if exactly two of of the three integers are 
positive numbers (greater than zero), and False - otherwise.

Examples:
two_are_positive(2, 4, -3) == True
two_are_positive(-4, 6, 8) == True
two_are_positive(4, -6, 9) == True
two_are_positive(-4, 6, 0) == False
two_are_positive(4, 6, 10) == False
two_are_positive(-14, -3, -4) == False

*/

public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    return ((a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || (a <= 0 && b > 0 && c > 0));
  }
}
/* ----------------------------------------------------------------------------

public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {

    int twoNull = 0;
      
      if(a > 0)
        twoNull ++;
        
      if(b > 0)
        twoNull ++;
      if (c>0)
        twoNull ++;
    
    return twoNull == 2;
  }
}
-------------------------------------------------------------------------------
interface Kata {
  static boolean twoArePositive(int a, int b, int c) {
    return a > 0 ? b > 0 != c > 0 : b > 0 && c > 0;
  }
}
-------------------------------------------------------------------------------
public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    if (a > 0 && b > 0 && c <= 0) return true;
        if (a > 0 && c > 0 && b <= 0) return true;
        if (a <= 0 && b > 0 && c > 0) return true;
        return false;
  }
}
--------------------------------------------------------------------------------
public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    int array[] = {a,b,c}, count = 0;
    for (Integer i : array)
      if (i>0) count +=1;
    return count==2;
  }
}
-------------------------------------------------------------------------------
import java.util.stream.Stream;

public class Kata {
    public static boolean twoArePositive(int a, int b, int c) {
        return Stream.of(a, b, c).filter(n -> n > 0).count() == 2;
    }
}
--------------------------------------------------------------------------------
public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    return (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) == 2;
  }
}
---------------------------------------------------------------------------------
public class Kata {
  
  public static boolean twoArePositive(int a, int b, int c) {
    return (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) == 2;
  }
}




*/