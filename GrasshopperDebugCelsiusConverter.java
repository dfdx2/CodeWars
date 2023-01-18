/* 8KYU Grasshopper Debug Celsius Converter

Debug celsius converter
Your friend is traveling abroad to the United States so he wrote a 
program to convert fahrenheit to celsius. Unfortunately his code 
has some bugs.

Find the errors in the code to get the celsius converter working 
properly.

To convert fahrenheit to celsius:

celsius = (fahrenheit - 32) * (5/9)
Remember that typically temperatures in the current weather conditions 
are given in whole numbers. It is possible for temperature sensors to 
report temperatures with a higher accuracy such as to the nearest tenth. 
Instrument error though makes this sort of accuracy unreliable for many 
types of temperature measuring sensors.

*/

public class GrassHopper {

   public static String weatherInfo(double temperature) {
        double c = convertToCelsius(temperature);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        return (5.0 / 9.0) * (temperature - 32);
        
    }
}
/*---------------------------------------------------------------
class GrassHopper {
  static String weatherInfo(int temp) {
    double c = (temp - 32) * 5.0 / 9;
    return c + " is " + (c > 0 ? "above " : "") + "freezing temperature";
  }
}
--------------------------------------------------------------------
public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = (temp - 32) * 5.0 / 9;
        if (c > 0) {
            return String.format("%s is above freezing temperature", c);
        } else {
            return String.format("%s is freezing temperature", c);
        }
    }
}
-------------------------------------------------------------------
public class GrassHopper {

    public static String weatherInfo(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9.0; // while according to the description 
                                                      // it should be * (5 / 9.0)
        return celsius + (celsius <= 0 
                          ? " is freezing temperature"
                          : " is above freezing temperature");
    }
    
}
--------------------------------------------------------------------
interface GrassHopper {
  static String weatherInfo(double temp) {
    return (temp = (temp - 32) * 5. / 9) + " is " + (temp > 0 ? "above " : "") + "freezing temperature";
  }
}
--------------------------------------------------------------------


*/
