/*  8 KYU CodeWars  Area or Perimeter

You are given the length and width of a 
4-sided polygon. The polygon can either be 
a rectangle or a square.
If it is a square, return its area. If it 
is a rectangle, return its perimeter.

Example(Input1, Input2 --> Output):

6, 10 --> 32
3, 3 --> 9
Note: for the purposes of this kata you will 
assume that it is a square if its length and 
width are equal, otherwise it is a rectangle.

*/
public class Solution {
  public static int areaOrPerimeter (int l, int w) {
      // code away...
    int result;
    return result = (l != w) ? ((l * 2) + (w * 2)) : l * w;
  }
}
/*
--------------------------------------------------------------
previous solution
public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
      if (l == w)
        return l * w;
      else
        return (l * 2) + (w * 2);
      
    }
}
----------------------------------------------------------------

public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }
}

*/