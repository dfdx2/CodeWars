/* 7KYU CodeWars Formatiing Decimal Places # 1

Each floating-point number should be formatted that only the first two decimal places are returned. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

Don't round the numbers! Just cut them after two decimal places!

Right examples:  
32.8493 is 32.84  
14.3286 is 14.32

Incorrect examples (e.g. if you round the numbers):  
32.8493 is 32.85  
14.3286 is 14.33

*/

public class Numbers {
    public static double twoDecimalPlaces(double number) {
      String a = String.valueOf(number);
      int b = a.indexOf('.');
      String c = a.substring(0, b + 3);
      return Double.valueOf(c);
    }
}
/*-----------------------------------------------------------------------
public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
    //Write your code here
    return (int)(number*100)/100.0;
  }
}
-------------------------------------------------------------------------
public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
    return (long)(number * 100) / 100.;
  }
}
-------------------------------------------------------------------------
import java.math.BigDecimal;
public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
        BigDecimal a = new BigDecimal(number);
        BigDecimal floored = a.setScale(2, BigDecimal.ROUND_DOWN);
        return floored.doubleValue();
  }
}
------------------------------------------------------------------------
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Numbers {
  private static final DecimalFormat df = new DecimalFormat("0.00");
  
  public static double twoDecimalPlaces(double number) {
    df.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(df.format(number));
  }
}
------------------------------------------------------------------------
public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
    //Write your code here
    return number > 0 ? Math.floor(number * 100.0) / 100.0 : Math.ceil(number * 100.0) / 100.0;
  }
}
--------------------------------------------------------------------------
public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
    String tmp = number + "";
	int position = tmp.indexOf(".");
	return Double.parseDouble(tmp.substring(0, position + 3));
  }
}
--------------------------------------------------------------------------
public class Numbers {
  
  private static final int OFFSET = 3;
  
  public static double twoDecimalPlaces(double number){
    String numberAsString = Double.toString(number);
    int decimalPoint = numberAsString.indexOf(".");
    String truncatedNumber = numberAsString.substring(0, decimalPoint + OFFSET);
    return Double.parseDouble(truncatedNumber);
  }
}
*/
