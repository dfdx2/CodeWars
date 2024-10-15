/* 8KYU CodeWars Quadrants

Task
Given a point in a Euclidean plane (x and y), return the quadrant the 
point exists in: 1, 2, 3 or 4 (integer). x and y are non-zero integers, 
therefore the given point never lies on the axes.

Examples
(1, 2)     => 1
(3, 5)     => 1
(-10, 100) => 2
(-1, -9)   => 3
(19, -56)  => 4

Quadrants
There are four quadrants:

First quadrant, the quadrant in the top-right, contains all points with positive X and Y

Second quadrant, the quadrant in the top-left, contains all points with positive X, but negative Y

Third quadrant, the quadrant in the bottom-left, contains all points with negative X, but positive Y

Fourth quadrant, the quadrant in the bottom-right, contains all points with negative X and Y

More on quadrants: Quadrant (plane geometry) - Wikipedia


*/
public class Quadrants {
  public static int quadrant(int x, int y) {
    return x > 0 && y > 0 ? 1 : x < 0 && y < 0 ? 3 : x > 0 && y < 0 ? 4 : 2;
  }
}
/*---------------------------------------------------------------------------
public class Kata {
  
    public static int quadrant(int x, int y) {
      return (x > 0 && y > 0) ? 1 : (x < 0 && y > 0) ? 2 : (x < 0 && y < 0) ? 3 : 4;
    }
}
--------------------------------------------------------------------------
public class Kata {
  
  public static int quadrant(int x, int y) {
    if ((x > 0) && (y > 0)){
      return 1;
    }
    if ((x < 0) && (y > 0)){
      return 2;
    }
    if ((x < 0) && (y < 0)){
      return 3;
    }
    return 4;
  }
}
----------------------------------------------------------------------------
public class Kata {
  
  public static int quadrant(int x, int y) {
    return x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;
  }
}
----------------------------------------------------------------------------
public class Kata {
  
  public static int quadrant(int x, int y) {
    if (x>0 && y>0) return 1;
    if (x>0 && y<0) return 4;
    if (x<0 && y>0) return 2;
    return 3;
  }
}
-----------------------------------------------------------------------------
public class Kata {
  
  public static int quadrant(int x, int y) {
    
    int result = 0;
    int dumb = 0;
    int stooped = 0;
    int retard = 0;
    int plsstop = result;
    int mf = 0;
    int thiss = 1;
    int dont = 2;
    int makes = 3;
    int sense = 4;
    int iam = x;
    int youare = y;

      if(iam > dumb && youare > stooped) {
        plsstop = thiss;
      } else if(iam < stooped && youare > retard) {
        plsstop = dont;
      } else if(iam < retard && youare < dumb) {
        plsstop = makes;
      } else if(iam > mf && youare < mf) {
        plsstop = sense;
      }
      return plsstop;
  }
}

*/
