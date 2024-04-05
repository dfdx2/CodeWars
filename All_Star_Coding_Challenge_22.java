/* 7KYU CodeWars All Star Coding Challenge # 22

This Kata is intended as a small challenge for my students

All Star Code Challenge #22

Create a function that takes an integer argument of seconds and converts the value into a string describing how many hours and minutes comprise that many seconds.

Any remaining seconds left over are ignored.

Note:
The string output needs to be in the specific form - "X hour(s) and X minute(s)"

For example:

3600 --> "1 hour(s) and 0 minute(s)"
3601 --> "1 hour(s) and 0 minute(s)"
3500 --> "0 hour(s) and 58 minute(s)"
323500 --> "89 hour(s) and 51 minute(s)"
FUNDAMENTALS

*/

public class timeConverter{
  public static String toTime(int seconds){
    return seconds / 3600 + " hour(s) and " + seconds % 3600 / 60 + " minute(s)";
  }
}
/*-----------------------------------------------------------------------------
public class timeConverter {
  
  public static String toTime(int s) {
    return String.format("%d hour(s) and %d minute(s)", s / 3600, s % 3600 / 60);
  }  
}
-------------------------------------------------------------------------------
public class timeConverter{
  public static String toTime(int seconds){
    int h = seconds/3600;
      int m =(seconds % 3600)/60;
        String pepega = h +" hour(s) and "+m+" minute(s)";
    return pepega;
  }
}
-------------------------------------------------------------------------------
import java.time.Duration;

public class timeConverter {
    public static String toTime(final int seconds) {
        final Duration duration = Duration.ofSeconds(seconds);
        return String.format("%d hour(s) and %d minute(s)", duration.toHours(), duration.toMinutesPart());
    }
}
-------------------------------------------------------------------------------
public class timeConverter{
  public static String toTime(int seconds){
    if (seconds < 0) throw new IllegalArgumentException("seconds should not be lower 0");
    
    int hours = seconds / 3600;
    int minutes = seconds % 3600 / 60;
    
    return hours + " hour(s) and " + minutes + " minute(s)";
  }
}
--------------------------------------------------------------------------------
public class timeConverter {
        public static String toTime(int seconds) {
            int hour = seconds / 3600;
            int minute = seconds - (3600 * hour);
            minute /= 60;
            String s = hour + " " + "hour(s) and " + minute + " minute(s)";
            return s;
        }
    }
--------------------------------------------------------------------------------
public class timeConverter{
  public static String toTime(int seconds){
    int m = (seconds%3600)/60;
    int h = seconds/3600;
    return h+" hour(s) and "+m+" minute(s)";
  }
}
--------------------------------------------------------------------------------
import java.text.DecimalFormat;

public class timeConverter{
  public static String toTime(int seconds){
    return timeConverter.display(seconds);
    
  }

	private static String display(int seconds) {
		double horas = 0;
		double minutos = ((double)seconds/60);
		if(minutos>=60) {
			horas = minutos/60;
			if( horas%60 >0 ) {
				DecimalFormat decimalFormatter = new DecimalFormat("0.00000000");
				String parteFracionada  = 0 + decimalFormatter.format(horas).substring(decimalFormatter.format(horas).toString().indexOf("."));
				minutos = Double.parseDouble(parteFracionada)*60;
			}
		}
		return String.format("%d hour(s) and %d minute(s)", (int)horas, (int)minutos); 
	}
}
*/