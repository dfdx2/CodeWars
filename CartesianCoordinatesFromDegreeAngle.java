/* 7 KYU CodeWars Cartesian coordinates from degree angle 

Write a simple function that takes polar coordinates 
(an angle in degrees and a radius) and returns the equivalent 
cartesian coordinates (rounded to 10 places).

For example:

coordinates(90,1)
=> (0.0, 1.0)

coordinates(45, 1)
=> (0.7071067812, 0.7071067812)

*/

import java.awt.geom.Point2D;
import java.text.DecimalFormat;

public class CoordinatesInspector {
    public Point2D coordinates(Double degrees, Double radius) {
        double radians = Math.toRadians(degrees);
        double x = Double.valueOf(new DecimalFormat("#.##########").format(Math.cos(radians) * radius));
        double y = Double.valueOf(new DecimalFormat("#.##########").format(Math.sin(radians) * radius));
        return new Point2D.Double(x, y);
    }
}
/*--------------------------------------------------------------------------------
import java.awt.geom.Point2D;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
    
    Double x = radius * Math.cos( Math.toRadians(degrees));
    Double y = radius * Math.sin( Math.toRadians(degrees));
    
    String x_string = String.format("%.10f", x);
    String y_string = String.format("%.10f", y);
    
    x = Double.parseDouble(x_string);
    y = Double.parseDouble(y_string);
        
    return new Point2D.Double(x, y);
  }

}
-----------------------------------------------------------------------------------
import java.awt.geom.Point2D;
import java.math.BigDecimal;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
    Double radians = degrees * Math.PI / 180.0;
    return new Point2D.Double(round(radius * Math.cos(radians), 10), round(radius * Math.sin(radians), 10));
  }
  
  public Double round(Double d, int p) {
    return new BigDecimal(d).setScale(p,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().doubleValue();
  }

}
--------------------------------------------------------------------------------------
import java.awt.geom.Point2D;
import java.lang.Math;

public class CoordinatesInspector {
  private static double tenk = 10000000000.0;

  public Point2D coordinates(Double degrees, Double radius) {
      return new Point2D.Double(Math.round(tenk * Math.cos(Math.toRadians(degrees)) * radius) / tenk,
                                Math.round(tenk * Math.sin(Math.toRadians(degrees)) * radius) / tenk);
    
  }

}
---------------------------------------------------------------------------------------
import java.awt.geom.Point2D;

class CoordinatesInspector {
  Point2D.Double coordinates(Double degrees, Double radius) {
    return new Point2D.Double(
        Math.round(radius * Math.cos(Math.toRadians(degrees)) * 10e9) / 10e9,
        Math.round(radius * Math.sin(Math.toRadians(degrees)) * 10e9) / 10e9);
  }
}
------------------------------------------------------------------------------------
import java.awt.geom.Point2D;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
    degrees *= Math.PI / 180;
    return new Point2D.Double(Math.round(Math.cos(degrees) * radius * 1e10) / 1e10, Math.round(Math.sin(degrees) * radius * 1e10) / 1e10);
  }

}
-------------------------------------------------------------------------------------
import java.awt.geom.Point2D;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
        double x = radius * Math.cos(Math.toRadians(degrees));
        double y = radius * Math.sin(Math.toRadians(degrees));
        
        DecimalFormat df = new DecimalFormat("#.##########");
        
        return new Point2D.Double(Double.parseDouble(df.format(x)),
                Double.parseDouble(df.format(y)));
  }

}
----------------------------------------------------------------------------------
import java.awt.geom.Point2D;
import java.util.*;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
    degrees = Math.toRadians(degrees);
    double x = Math.round((radius*Math.cos(degrees))*10000000000.0)/10000000000.0;
    double y = Math.round((radius*Math.sin(degrees))*10000000000.0)/10000000000.0;
    return new Point2D.Double(x,y);
  }

}
-----------------------------------------------------------------------------------


*/