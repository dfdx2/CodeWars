/* CodeWars Time Conversion

Given a time in 12-hour AM/PM format, convert it to 
military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, 
and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM 
on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Input Format

A single string containing a time in 12-hour clock 
format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01 <= hh <= 12 
and 00 <= mm,ss <= 59.

Output Format

Convert and print the given time in 24-hour format, 
where 00 <= hh <= 23.

Sample Input

07:05:45PM

Sample Output

19:05:45

*/

public class Time {

  public static String convertTime(String time){
    String y = time.substring(time.length() - 2, time.length());
    String x = time.substring(0, 2);
    if (y.equals("PM")) {
      int i = Integer.valueOf(x);
      if (i < 12) {
        i += 12;  
        String j = String.valueOf(i) + time.substring(2, time.length() - 2);
        return j;
      }
      else {
        return time.substring(0, time.length() - 2);
      }
     }
    if (time.equals("12:00:00AM")) {
      return "00:00:00";
    }
    if (x.equals("12") && y.equals("AM")) {
      String a = "00";
      return a + time.substring(2, time.length() - 2);
    }
    return time.substring(0, time.length() - 2);
  }
}
/*-----------------------------------------------------------------------
import static java.time.format.DateTimeFormatter.ofPattern;

public class Time {

  // Let Java do all the work :-)
  public static String convertTime(String time) {
    return ofPattern("HH:mm:ss").format(ofPattern("hh:mm:ssa").parse(time));
  }
}
---------------------------------------------------------------------------
public class Time {

  public static String convertTime(String time){
     String t2 = (Integer.parseInt(time.substring(0,2)) + 12) + time.substring(2, 8);
        if (time.contains("PM") && Integer.parseInt(time.substring(0, 2)) >= 12 || time.contains("AM")) {
            t2 = time.substring(0, 8);
        }
        if (time.contains("AM") && time.substring(0, 2).equals("12")){
            t2 = "00" + time.substring(2, 8);
        }
        return t2;
  }
}
---------------------------------------------------------------------------
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

	private static DateTimeFormatter INPUT_FORMAT =  DateTimeFormatter.ofPattern("hh:mm:ssa");
	private static DateTimeFormatter OUTPUT_FORMAT =  DateTimeFormatter.ofPattern("HH:mm:ss");
	
	public static String convertTime(String time) {
	 return OUTPUT_FORMAT.format(INPUT_FORMAT.parse(time));
	}
	

}
-----------------------------------------------------------------------------
public class Time {

  public static String convertTime(String time){
    if(time.substring(8).equals("PM") && !(time.substring(0,2).equals("12")))
      time=(Integer.parseInt(time.substring(0,2))+12)+time.substring(2,8);
    else if(time.substring(8).equals("AM") && (time.substring(0,2).equals("12")))
      time="00"+time.substring(2,8);
    else
      time=time.substring(0,8);
    return time;
  }
}
------------------------------------------------------------------------------
public class Time {

  public static String convertTime(String time){
    if(time.contains("AM")) {
      return time.substring(0,2).replace("12","00") + time.substring(2).replace("AM", "").trim();
    }
    
    return time.substring(0,2).replace(time.substring(0,2), String.valueOf(Integer.valueOf(time.substring(0,2))+12))
          .replace("24","12") + time.substring(2).replace("PM", "").trim();
  }
}
--------------------------------------------------------------------------------
public class Time {

  public static String convertTime(String time){
    String hour = time.substring(0,2);
        String constTime = time.substring(2,8);
        String format = time.substring(8,10);
        if (format.equals("AM")) {
            return hour.equals("12") ?  "00"+ constTime :  hour+constTime;
        }       
        else {
            String newHour =  String.valueOf(Integer.parseInt(hour) + 12);
            return hour.equals("12") ? "12" + constTime : newHour+constTime;
        }
  }
}

*/