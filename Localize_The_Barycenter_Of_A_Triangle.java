/* 8KYU CodeWars Localize The Barycenter of a Triangle

The medians of a triangle are the segments that unit the 
vertices with the midpoint of their opposite sides. The 
three medians of a triangle intersect at the same point, 
called the barycenter or the centroid. Given a triangle, 
defined by the cartesian coordinates of its vertices we 
need to localize its barycenter or centroid.

The function bar_triang() or barTriang or bar-triang, 
receives the coordinates of the three vertices A, B and C  
as three different arguments and outputs the coordinates of 
the barycenter O in an array [xO, yO]

This is how our asked function should work: the result of the 
coordinates should be expressed up to four decimals, (rounded result).

You know that the coordinates of the barycenter are given by 
the following formulas.

For additional information about this important point of a 
triangle see at: (https://en.wikipedia.org/wiki/Centroid)

Let's see some cases:

barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}

barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}

The given points form a real or a degenerate triangle but in 
each case the above formulas can be used.

Enjoy it and happy coding!!

*/

class Barycenter { 
    public static double[] barTriang(double[] x, double[] y, double[] z) {
      double[] result = new double[2];
      result[0] = Math.round((x[0] + y[0] + z[0]) * 3333.33) / 10.0e3;
      result[1] = Math.round((x[1] + y[1] + z[1]) * 3333.33) / 10.0e3;
      return result;
    }
}
/*----------------------------------------------------------------
import java.text.DecimalFormat;

class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double[] coordinates = new double[2];
        
        for(int i=0;i<2;i++){
            coordinates[i] = Double.parseDouble(new DecimalFormat("##.####").format((x[i]+y[i]+z[i])/3));
        }
        
        return coordinates;
    }
}
------------------------------------------------------------------
class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double[] res = new double[2];
        res[0] = (double)((int)Math.round((x[0]+y[0]+z[0])/3*10000))/10000;
        res[1] = (double)((int)Math.round((x[1]+y[1]+z[1])/3*10000))/10000;
        return res;
    }
}
------------------------------------------------------------------
class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double xCenter = (x[0] + y[0] + z[0]) / 3;
        double yCenter = (x[1] + y[1] + z[1]) / 3;
        xCenter = Double.parseDouble(String.format("%.4f", xCenter));
        yCenter = Double.parseDouble(String.format("%.4f", yCenter));
        return new double[]{xCenter, yCenter};
    }
}
------------------------------------------------------------------
class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
      double a = (x[0] + y[0] + z[0]) / 3;
      double b = (x[1] + y[1] + z[1]) / 3;
      
      double aa = (double)Math.round(a * 10000d) / 10000d;
      double bb = (double)Math.round(b * 10000d) / 10000d;
      
      double [] c = {aa, bb};
      return c;
    }
}
------------------------------------------------------------------
import java.math.BigDecimal;
import java.math.RoundingMode;

class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z){
                double x0 = (x[0] + y[0] + z[0]) / 3;
        double y0 = (x[1] + y[1] + z[1]) / 3;

        return new double[]{BigDecimal.valueOf(x0).setScale(4, RoundingMode.HALF_UP).doubleValue(), BigDecimal.valueOf(y0).setScale(4, RoundingMode.HALF_UP).doubleValue()};
    }
}
------------------------------------------------------------------
class Barycenter {
    
    public static double[] barTriang(double[] a, double[] b, double[] c)
    {

      double x = (a[0] + b[0]+c[0])/3.0;
      double y = (a[1] + b[1]+c[1])/3.0;
      
      x = Math.round(x*10000)/10000.0;
      y = Math.round(y*10000)/10000.0;

      double[] bot = {x,y};
      return bot;
      }

  
    }
  
*/