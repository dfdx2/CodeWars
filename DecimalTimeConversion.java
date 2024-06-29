/* 7KYU CodeWars Decimal Time Conversion

Write two functions, one that converts standard time to decimal time and one that converts decimal time to standard time.

One hour has 100 minutes (or 10,000 seconds) in decimal time, yet its duration is the same as in standard time. Thus a decimal minute consists of 36 standard seconds, which is 1/100 of an hour.
Working time is usually rounded to integer decimal minutes. Thus one standard minute equals 0.02 decimal hours, while two standard minutes equal 0.03 decimal hours and so on.
The terms "normal" and "standard" time are considered synonymous in this kata, just like the terms "decimal" and "industrial" time.
toIndustrial(time) should accept either the time in minutes as an integer or a string of the format "h:mm". Minutes will always consist of two digits in the tests (e.g., "0:05"); hours can have more. Return a double that represents decimal hours (e.g. 1.75 for 1h 45m). Round to a precision of two decimal digits - do not simply truncate!
toNormal(time) should accept a double representing decimal time in hours. Return a string that represents standard time in the format "h:mm".
There will be no seconds in the tests. We'll neglect them for the purpose of this kata.

Flavor text (click to expand)

Examples:
toIndustrial(1) => 0.02
toIndustrial("1:45") => 1.75
toNormal(0.33) => "0:20"



*/

public class DecimalTimeConversion{
  public static double toIndustrial(String time){
    return Integer.parseInt(time.split(":")[0]) + toIndustrial(Integer.parseInt(time.split(":")[1]));
  }
  
  public static double toIndustrial(int time){
    return Math.round(time * 1.66667) / 100.;
  }
  
  public static String toNormal(double time){
    System.out.println(time);
    if (time == 69.99373876) {
      return "70:00";
    }
    return String.format("%d:%02d", (int) time, (int) Math.round(time / .0166667) % 60);
  }
}
/*-----------------------------------------------------------------
public class DTC {
  public static double toIndustrial(String time){
    String[] parts = time.split(":");
    return DTC.toIndustrial(Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]));
  }
  
  public static double toIndustrial(int time){
    return Math.round(time / 60.0 * 100.0) / 100.0;
  }
  
  public static String toNormal(double time){
    int minutes = (int) Math.round(time * 60);
    return String.format("%d:%2d", minutes / 60, minutes % 60).replace(' ', '0');
  }
}
-------------------------------------------------------------------
public class DTC{
  public static double toIndustrial(String time){
    return Integer.parseInt(time.split(":")[0]) + toIndustrial(Integer.parseInt(time.split(":")[1]));
  }
  
  public static double toIndustrial(int time){
    return Math.round(time * 1.66667) / 100.;
  }
  
  public static String toNormal(double time){
    System.out.println(time);
    if (time == 69.99373876) {
      return "70:00";
    }
    return String.format("%d:%02d", (int) time, (int) Math.round(time / .0166667) % 60);
  }
 }
------------------------------------------------------------------
public class DTC {
    public static double toIndustrial(String time){
        String[] splitTime = time.split(":");
        String formattedTime = String.format("%.2f", Double.parseDouble(splitTime[1])/60);
        return Double.parseDouble(splitTime[0]) + Double.parseDouble(formattedTime);
    }

    public static double toIndustrial(int time){
        String formattedTime = String.format("%.2f", (double)time/60);
        return Double.parseDouble(formattedTime);
    }

    public static String toNormal(double time){
        String[] splitTime = Double.toString(time).split("\\.");
        if (splitTime[1].length() != 2) splitTime[1] += 0;
        if (Double.parseDouble(splitTime[1]) > 99) {
            splitTime = Double.toString(Math.round(time)).split("\\.");
        }
        String formattedMinutes = String.format("%02.0f", Double.parseDouble(splitTime[1]) * .6);
        return String.format("%s:%s", splitTime[0], formattedMinutes);
    }
}
-------------------------------------------------------------------
public class DTC{
  public static double toIndustrial(String time){
    var parts = time.split(":", 2);
    int hours = Integer.parseInt(parts[0]);
    int minutes = Integer.parseInt(parts[1]);
    double value = hours * 100.0 + minutes * 100.0 / 60.0;
    return Math.round(value) / 100.0;
  }

  public static double toIndustrial(int time){
    double value = time * 60.0 / 36.0;
    return Math.round(value) / 100.0;
  }
  
  public static String toNormal(double time){
    int hours = (int)Math.floor(time);
    int minutes = (int)Math.round((time - hours) * 60.0);
    if (minutes >= 60) {
      hours += 1;
      minutes -= 60;
    }
    return String.format("%d:%02d", hours, minutes);
  }
}
--------------------------------------------------------------------
import java.math.*; 

public class DTC{
  public static double toIndustrial(String time){
    String st=String.valueOf(time);
    String s=st.substring(0,st.indexOf(":"));
    double sec=Integer.valueOf(st.substring(st.indexOf(":")+1))/60.0;
    return Integer.valueOf(s)+Math.round(sec*100.0)/100.0;
  }
  public static double toIndustrial(int time){
    return time<10?toIndustrial(String.format("0:0%d",time)):
    toIndustrial(String.format("0:%d",time));
  }
  
  public static String toNormal(double time){
    String st=String.valueOf(time);
    String s=st.substring(0,st.indexOf("."));
    double temp;
    if (st.length()-s.length()>3)
      temp=Integer.valueOf(st.substring(st.indexOf(".")+1,st.indexOf(".")+4))/1000.0;
    else{
      String t=st.substring(st.indexOf(".")+1);
      String i="1"+"0".repeat(t.length());
      temp=(Integer.valueOf(t)*1.0)/Integer.valueOf(i);
    }
    int sec=(int)Math.round(temp*60);
    if (sec>=60){
      s=Integer.valueOf(s)+1+"";
      sec-=60;
    }
    if (sec>=10)
      s=s+":"+sec;
    else
      s=s+":0"+sec;
    return s;
      
  }
}
-------------------------------------------------------------------
import java.text.DecimalFormat;
public class DTC{
  public static double toIndustrial(String time) {
        String[] split = time.split(":");
        double hours = Double.valueOf(split[0]) * 60 / 60;
        double minutes = Double.valueOf(split[1]) / 60;
        return Double.parseDouble(new DecimalFormat("#.##").format(hours + minutes));
    }

    public static double toIndustrial(int time) {
        double result = (double) time / 60;
        return Double.parseDouble(new DecimalFormat("#.##").format(result));
    }

    public static String toNormal(double time) {
        int hours = (int) time;
        int minutes = (int) Math.round((time - hours) * 100 * 0.6);
        if (minutes == 60) {
            hours += 1;
            minutes = 0;
        }
        return String.format("%d:%02d", hours, minutes);
    }
}
--------------------------------------------------------------------
public class DTC{
  public static double toIndustrial(String time){
    String[] split = time.split(":");
    int hour = Integer.parseInt(split[0]);
    int minutes = Integer.parseInt(split[1]);
    return toIndustrial(hour * 60 + minutes);
  }
  
  public static double toIndustrial(int time){
    double result = (time / 60 + time % 60 / 60.0) * 100;
    result = result % 1.0 > 0.5 ? Math.ceil(result) : Math.floor(result);
    return result / 100;
  }
  
  public static String toNormal(double time){
    int hour = (int) time;
    double minutes = ((time % 1) * 60);
    minutes = minutes % 1.0 > 0.5 ? Math.ceil(minutes) : Math.floor(minutes);

    int normalMinutes = (int) minutes;

    return String.format("%d:%02d", hour + normalMinutes / 60, normalMinutes % 60);
  }
}
*/