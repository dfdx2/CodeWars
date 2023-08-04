/* 8KYU CodeWars Miles Per Gallon To Kilometers Per Liter

Sometimes, I want to quickly be able to convert miles per imperial gallon 
(mpg) into kilometers per liter (kpl).

Create an application that will display the number of kilometers per liter 
(output) based on the number of miles per imperial gallon (input).

Make sure to round off the result to two decimal points.

Some useful associations relevant to this kata:

1 Imperial Gallon = 4.54609188 litres
1 Mile = 1.609344 kilometres

*/
import org.apache.commons.math3.util.Precision;
public class Converter {
  public static float mpgToKPM(final float mpg) {
    float result = mpg / (float) 4.54609188 * (float) 1.609344;
    return Precision.round(result,2);
  }
}
/*----------------------------------------------------------------------------
import java.math.BigDecimal;

public class Converter {

    public static float mpgToKPM(final float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344f / 4.54609188f).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}
-------------------------------------------------------------------------------
public class Converter {

  private static final float LITER = 4.54609188f;
  private static final float KILOMETER = 1.609344f;
  
  public static float mpgToKPM(final float mpg) {
    return Float.parseFloat(String.format("%.2f", mpg * KILOMETER / LITER ));
  }
}
--------------------------------------------------------------------------------
public class Converter {
  public static float mpgToKPM(final float mpg) {
    float GALLON_TO_LITRE = 4.54609188f;
    float MILE_TO_KILOMETER = 1.609344f;
    
    return (float)Math.round(mpg * MILE_TO_KILOMETER /  GALLON_TO_LITRE * 100) / 100;
  }
}
---------------------------------------------------------------------------------
public class Converter {
  public static float mpgToKPM(final float mpg) {
    return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;    
  }
}





*/
