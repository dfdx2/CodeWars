/* 7KYU CodeWars Fizz Buzz Cuckoo Clock

You've always loved both Fizz Buzz katas and cuckoo clocks, and when you walked by a garage sale and saw an ornate cuckoo clock with a missing pendulum, and a "Beyond-Ultimate Raspberry Pi Starter Kit" filled with all sorts of sensors and motors and other components, it's like you were suddenly hit by a beam of light and knew that it was your mission to combine the two to create a computerized Fizz Buzz cuckoo clock!

You took them home and set up shop on the kitchen table, getting more and more excited as you got everything working together just perfectly. Soon the only task remaining was to write a function to select from the sounds you had recorded depending on what time it was:

Your plan
When a minute is evenly divisible by three, the clock will say the word "Fizz".
When a minute is evenly divisible by five, the clock will say the word "Buzz".
When a minute is evenly divisible by both, the clock will say "Fizz Buzz", with two exceptions:
On the hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo bird will come out and "Cuckoo" between one and twelve times depending on the hour.
On the half hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo will come out and "Cuckoo" just once.
With minutes that are not evenly divisible by either three or five, at first you had intended to have the clock just say the numbers ala Fizz Buzz, but then you decided at least for version 1.0 to just have the clock make a quiet, subtle "tick" sound for a little more clock nature and a little less noise.
Your input will be a string containing hour and minute values in 24-hour time, separated by a colon, and with leading zeros. For example, 1:34 pm would be "13:34".

Your return value will be a string containing the combination of Fizz, Buzz, Cuckoo, and/or tick sounds that the clock needs to make at that time, separated by spaces. Note that although the input is in 24-hour time, cuckoo clocks' cuckoos are in 12-hour time.

Some examples
"13:34"       "tick"
"21:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
"11:15"       "Fizz Buzz"
"03:03"       "Fizz"
"14:30"       "Cuckoo"
"08:55"       "Buzz"
"00:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
"12:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
Have fun!




*/

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
      String f = "Fizz";
      String b = "Buzz";
      String fb = "Fizz Buzz";
      String c = "Cuckoo ";
      String t = "tick";
      int h = Integer.valueOf(time.substring(0,2));
      int hf = Integer.valueOf(time.substring(3, time.length()));
      if (h == 00 && hf == 00) {
        return c.repeat(12).trim();
      }
      else if (h == 12 && hf == 00) {
        return c.repeat(12).trim();
      }
      if (hf == 00 && h > 12) {
        return c.repeat(h - 12).trim();
      }
      if (hf == 30) {
        return c.trim();
      }
      if (hf % 15 == 0 && hf != 30) {
        return fb;
      }
      else if (hf % 5 == 0 && hf != 30) {
        return b;
      }
      else if (hf % 3 == 0 && hf != 30) {
        return f;
      }
      return t;
    }
}
/*----------------------------------------------------------------------------
public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        final String parts [] = time.split(":");
        final int hr = Integer.valueOf(parts[0]);
        final int min = Integer.valueOf(parts[1]);
        final int cuckooCount = min==0 ? hr%12==0?12:hr%12 : min==30 ? 1 : 0;
        if (cuckooCount > 0) {         
          String cuckoos = "";
          for (int i=0; i< cuckooCount; i++) {
            cuckoos += "Cuckoo ";
          }
          return cuckoos.trim();
        }
        return min%15==0 ? "Fizz Buzz" : min%5==0 ? "Buzz" : min%3==0 ? "Fizz" : "tick";
    }
}
-------------------------------------------------------------------------------
import java.time.LocalTime;

class FizzBuzzCuckooClock {
  static String fizzBuzzCuckooClock(String time) {
    var clock = LocalTime.parse(time);
    if (clock.getMinute() == 0) {
      return "Cuckoo" + " Cuckoo".repeat(clock.getHour() % 12 == 0 ? 11 : clock.getHour() % 12 - 1);
    }
    return clock.getMinute() % 30 == 0 ? "Cuckoo" :
           clock.getMinute() % 15 == 0 ? "Fizz Buzz" :
           clock.getMinute() % 3 == 0 ? "Fizz" :
           clock.getMinute() % 5 == 0 ? "Buzz" : "tick";
  }
}
------------------------------------------------------------------------------
enum WORDS {
    TICK("tick"),
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZBUZZ("Fizz Buzz"),
    CUCKOO("Cuckoo");
    private final String name;
    WORDS(String n) {
        name = n;
    }
    String getName() {
        return this.name;
    }
}

public class FizzBuzzCuckooClock {

    public static String fizzBuzzCuckooClock(String time) {
        String[] t = time.split(":");
        int min = Integer.parseInt(t[1]);
        int hr = Integer.parseInt(t[0]);
        if (min == 0) {
            hr = (hr == 0) ? 12 : (hr > 12) ? hr % 12 : hr;
            return (WORDS.CUCKOO.getName() + " ").repeat(hr).trim();
        }
        if (min == 30) return WORDS.CUCKOO.getName();
        if (min % 15 == 0) return WORDS.FIZZBUZZ.getName();
        if (min % 3 == 0) return WORDS.FIZZ.getName();
        if (min % 5 == 0) return WORDS.BUZZ.getName();
        return WORDS.TICK.getName();
    }
}
--------------------------------------------------------------------------------
import org.apache.commons.lang3.StringUtils;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        String[] dividedTime = time.split(":");
        String output = "";
        if(dividedTime[1].equals("00")){
          int hour = Integer.parseInt(dividedTime[0]);
          int twelveHour = getTwelveHour(hour);
          output = StringUtils.repeat("Cuckoo"," ",twelveHour);
        }
        else if(dividedTime[1].equals("30")){
          output = "Cuckoo";
        }
        else{
          int minute = Integer.parseInt(dividedTime[1]); 
          if(minute % 3 == 0){
            output = "Fizz";
          }
          if(minute % 15 == 0){
            output += " ";
          }
          if(minute % 5 == 0){
            output += "Buzz";
          }
          if(output.equals("")){
            output = "tick";
          }
        }
        return output;
    }
    
    private static int getTwelveHour(int hour){
      int twelveHour = 0;
      if(hour == 0){
        twelveHour = 12;
      }
      else if(hour > 12){
        twelveHour = hour - 12;
      }
      else{
        twelveHour = hour;
      }
      return twelveHour;
    }
}
-------------------------------------------------------------------------------
import java.time.LocalTime;

public class FizzBuzzCuckooClock {
  static String fizzBuzzCuckooClock(String time) {
    LocalTime localTime = LocalTime.parse(time);
    if (localTime.getMinute() == 0) {
      return "Cuckoo ".repeat(localTime.getHour() % 12 == 0 ? 12 : localTime.getHour() % 12).trim();
    }
    return localTime.getMinute() % 30 == 0 ? "Cuckoo" 
      : localTime.getMinute() % 15 == 0 ? "Fizz Buzz" 
        : localTime.getMinute() % 3 == 0 ? "Fizz" 
          : localTime.getMinute() % 5 == 0 ? "Buzz" 
            : "tick";
  }
}
--------------------------------------------------------------------------------
public class FizzBuzzCuckooClock {
  public static String fizzBuzzCuckooClock(String time) {
    int minute = Integer.parseInt(time.substring(3,5));
    
    var sb = new StringBuilder();
    if (minute == 0) {
      int hour24 = Integer.parseInt(time.substring(0,2));
      int hour12 = (hour24 % 12 == 0 ? 12 : hour24 % 12);
      for (int i = 0; i < hour12; ++i) { sb.append("Cuckoo "); }
      
    } else if (minute == 30) {
      sb.append("Cuckoo ");
    } else {
      if (minute % 3 == 0) { sb.append("Fizz "); }
      if (minute % 5 == 0) { sb.append("Buzz "); }
    }
    
    if (sb.length() == 0) {
      return "tick";
    } else {
      sb.setLength(sb.length() - 1);
      return sb.toString();
    }
  }
}
----------------------------------------------------------------------------------
*/