/*
Defineed as perimeter if the length is equal to width
Defined as area if length is different than width


*/

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
      if (l == w)
        return l * w;
      else
        return (l * 2) + (w * 2);
      
    }
}
