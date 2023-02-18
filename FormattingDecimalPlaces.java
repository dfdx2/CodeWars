/* 8KYU CodeWars Formatting Decimal Places #0

Each number should be formatted that it is rounded to two decimal places. 
You don't need to check whether the input is a valid number because only 
valid numbers are used in the tests.

Example:    
5.5589 is rounded 5.56   
3.3424 is rounded 3.34

*/

import java.text.NumberFormat;
import java.util.Formatter;
import org.apache.commons.math3.util.Precision;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    //Write your code here
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    number = Precision.round(number, 2);
    return number;
  }
}
/*-------------------------------------------------------------------------------
public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    //Write your code here
    return (Math.round(number*100))/100.0;
  }
}
--------------------------------------------------------------------------------
import java.text.*;
public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    return Double.parseDouble(String.format("%.2f", number));
  }
}
-------------------------------------------------------------------------------
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    return new BigDecimal(String.valueOf(number)).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
---------------------------------------------------------------------------------
public class Numbers {
  public static double TwoDecimalPlaces(double number) {
    return Math.round(number * 100D) / 100D;
  }
}
---------------------------------------------------------------------------------
public class Numbers
{

	
	 * Solution for "Formatting decimal places #0"
	 *
	 * @param  number  input number
	 *
	 * @return The number is rounded to two decimal places
	 
	public static double TwoDecimalPlaces(double number) {
		double scale = Math.pow(10, 2);
		double rounded = Math.round(number * scale) / scale;

		return rounded;
	}

}
------------------------------------------------------------------------------------------
import java.text.DecimalFormat;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    //Write your code here
    System.out.println(number);
    DecimalFormat df = new DecimalFormat("#.##");
    double decimalplaces = Double.valueOf(df.format(number));
    return decimalplaces;
  }
}
--------------------------------------------------------------------------------------------







*/