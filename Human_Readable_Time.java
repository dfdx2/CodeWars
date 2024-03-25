/* 5KYU CodeWars Human Readable Time

Write a function, which takes a non-negative integer 
(seconds) as input and returns the time in a human-readable 
format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.

*/

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, seconds / 60 % 60, seconds % 60);
  }
}
/*--------------------------------------------------------------------------
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
    }
}
----------------------------------------------------------------------------
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int minutes = seconds/60;
    int hours = minutes/60;
    seconds = seconds%60;
    minutes = minutes%60;
    
    return String.format("%02d", hours) + ":" + String.format("%02d", minutes)
      + ":" + String.format("%02d", seconds);
  }
}
----------------------------------------------------------------------------
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    // Do something
    int hours = seconds / 3600;
    seconds %= 3600;
    int minutes = seconds / 60;
    seconds %= 60;
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }
}
----------------------------------------------------------------------------
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int hours = seconds/3600;
    seconds -= 3600*hours;
    int minutes = seconds/60;
    seconds -= 60*minutes;
    String time = "";
    time = less(hours, time);
    time = less(minutes, time);
    time = less(seconds, time);
    time = time.substring(0, time.length()-1);    
    return time;
  }
  
  public static String less(int x, String y){
  if (x<10){
    y += ("0"+x+":");
    } else{
    y += (x+":");
    }
    return y;
    }
}
-----------------------------------------------------------------------------
import java.util.Date;
import java.sql.Time;

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    if(seconds > 359998)
    {
        return "99:59:59";
    }
    
    Time time = new Time(seconds * 1000);
    String str[] = time.toString().split(":");
    
    final int hour = seconds / 3600;
    String hours = (hour < 10) ? "0" + String.valueOf(hour) : String.valueOf(hour);
    return hours + ":" + str[1] + ":" + str[2];
  }
}
-----------------------------------------------------------------------------
public class HumanReadableTime {
  public static String makeReadable(int s) {
    String time = String.format("%02d:%02d:%02d", (s / 3600), ((s % 3600) / 60), (s % 60));    
    return time;
  }
}
-----------------------------------------------------------------------------
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    // Do something
    if(seconds>359999){return "too big";}
    
    int hour=0,minute=0,counter=0;
    
    while(seconds>=3600)
    {
      seconds-=3600;
      counter+=1;
    }
    hour=counter;
    counter=0;
    
    while(seconds>=60)
    {
      seconds-=60;
      counter+=1;
    }
    minute=counter;
    
    if(hour<10 && minute<10 && seconds<10)
	    	return ("0"+hour+":"+"0"+minute+":"+"0"+seconds);
	  else if(hour<10 && minute<10)
	    	return ("0"+hour+":"+"0"+minute+":"+seconds);
	  else if(hour<10 && seconds<10)
	    	return ("0"+hour+":"+minute+":"+"0"+seconds);
	  else if(minute<10 && seconds<10)
	    	return (hour+":"+"0"+minute+":"+"0"+seconds);
	  else if(hour<10 )
	    	return ("0"+hour+":"+minute+":"+seconds);
	  else  if(minute<10)
	    	return (hour+":"+"0"+minute+":"+seconds);
	  else if(seconds<10)
	    	return (hour+":"+minute+":"+"0"+seconds);
	  else
	    	return (hour+":"+minute+":"+seconds);
    
    
  }
}
*/