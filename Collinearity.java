/* 8KYU CodeWars Collinearity

Theoretical Material
You are given two vectors starting from the origin (x=0, y=0) 
with coordinates (x1,y1) and (x2,y2). Your task is to find out 
if these vectors are collinear. Collinear vectors are vectors 
that lie on the same straight line. They can be directed in the 
same or opposite directions. One vector can be obtained from 
another by multiplying it by a certain number. In terms of 
coordinates, vectors (x1, y1) and (x2, y2) are collinear if 
(x1, y1) = (k*x2, k*y2) , where k is any number acting as a 
coefficient.

For more information, check out this article on collinearity.

Problem Description
Write the function collinearity(x1, y1, x2, y2), which returns 
a Boolean type depending on whether the vectors are collinear 
or not.

all coordinates are integers
-1000 <= any coordinate <= 1000
Notes
All vectors start from the origin (x=0, y=0).
Be careful when handling cases where x1, x2, y1, or y2 are zero to 
avoid division by zero errors.
A vector with coordinates (0, 0) is collinear to all vectors.
Examples
(1,1,1,1) ➞ true
(1,2,2,4) ➞ true
(1,1,6,1) ➞ false
(1,2,-1,-2) ➞ true
(1,2,1,-2) ➞ false
(4,0,11,0) ➞ true
(0,1,6,0) ➞ false
(4,4,0,4) ➞ false
(0,0,0,0) ➞ true
(0,0,1,0) ➞ true
(5,7,0,0) ➞ true

*/

public class Kata {
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
    return x1 * y2 == x2 * y1;
  }
}
/*-----------------------------------------------------------------------
public class Kata {
  
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
 
    if (x1 * y2 == x2 * y1) {
      return true;
    } else {
      return false;
    }
 }
}
-------------------------------------------------------------------------
public class Kata {
  
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
    boolean isParallelX = x1 == 0 && x2 == 0 && y1 !=0 && y2 !=0;
    boolean isParallelY = y1 == 0 && y2 == 0 && x1 !=0 && x2 !=0;
    boolean isNull = (x1 == 0 && y1 == 0) || (x2 ==0 && y2 == 0);
    boolean isOneZero = x1==0 || x2 == 0 || y2==0 || y1==0;
    
    if(isParallelX || isParallelY || isNull ){
      return true;
    }
    
    if(isOneZero)
      return false;
    
    boolean isSameCoeff = x2*y1 == x1*y2;
    if(isSameCoeff)
      return true;
    return false;
  }
}
-------------------------------------------------------------------------
public class Kata {
  
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
    // If one vector is at the origin, they are collinear
    if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) {
      return true;
    }
    // If the vectors are on an axis (either both x=0 or both y=0), they are collinear
    if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) {
      return true;
    }
    // If a divisor is zero, they are not collinear
    if (x1 == 0 || y1 == 0) {
      return false;
    } else { // If the ratio of x is equal to the ratio of y, they are collinear
      return ((double)x2/x1 == (double)y2/y1);
    }  
  }
}
-------------------------------------------------------------------------
public class Kata {
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if (x1 == 0 && x2 == 0 || y1 == 0 && y2 == 0) return true;
        double first  = (x2 == 0) ? Double.MIN_VALUE : (double) x1 / x2;
        double second = (y2 == 0) ? Double.MIN_VALUE : (double) y1 / y2;
        return first == second;
    }
}
-------------------------------------------------------------------------
public class Kata {
  
  public static boolean collinearity(long x1, int y1, int x2, int y2) {
    
    if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) return true;
    
    if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) return true;
    
    if (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
        return ((double) x1 / (double) x2) == ((double) y1 / (double) y2);
    }
    return false;
  }
}
--------------------------------------------------------------------------
public class Kata {
  
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if ( (x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0) ) { return true; }
        if ( (x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0) ) { return true; }
        if (x1 * y2  -  x2 * y1  == 0) { return true; }
        return false;
    }
}
--------------------------------------------------------------------------
public class Kata {
  
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) {
            return true;
        }
        
        // Handling the case where one of the vectors is a multiple of the other
        if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) {
            return true;
        }
        
        // Checking if the ratios between corresponding coordinates are equal
        if (x2 != 0 && y2 != 0 && (x1 * y2 == x2 * y1)) {
            return true;
        }
        
        return false;
  }
}
*/