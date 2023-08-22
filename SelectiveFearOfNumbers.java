/* 7KYU CodeWars Selective Fear Of Nunbers

I've got a crazy mental illness. I dislike numbers a lot. But it's a little 
complicated: The number I'm afraid of depends on which day of the week it is... 
This is a concrete description of my mental illness:

Monday --> 12

Tuesday --> numbers greater than 95

Wednesday --> 34

Thursday --> 0

Friday --> numbers divisible by 2

Saturday --> 56

Sunday --> 666 or -666

Write a function which takes a string (day of the week) and an integer 
(number to be tested) so it tells the doctor if I'm afraid or not. 
(return a boolean)

*/

public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
        if (day == "Monday" && num == 12) {
          return true;
        }
      if (day == "Tuesday" && num > 95) {
        return true;
      }
      if (day == "Wednesday" && num == 34) {
        return true;
      }
      if (day == "Thursday" && num == 0) {
        return true;
      }
      if (day == "Friday" && num % 2 == 0) {
        return true;
      }
      if (day == "Saturday" && num == 56) {
        return true;
      }
      if (day == "Sunday" && num == 666 || day == "Sunday" && num == -666) {
        return true;
      }
      System.out.println(day);
      return false;
    }
}
/*-----------------------------------------------------------------------------
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
        switch(day) {
            case "Monday":
                return num == 12;
            case "Tuesday":
                return num > 95;
            case "Wednesday":
                return num == 34;
            case "Thursday":
                return num == 0;
            case "Friday":
                return num % 2 == 0;
            case "Saturday":
                return num == 56;
            case "Sunday":
                return num == 666 || num == -666;
        }
        return false;
    }
}
---------------------------------------------------------------------------------
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
        switch (day) {
            case "Monday"    :  return num == 12;
            case "Tuesday"   :  return num > 95;
            case "Wednesday" :  return num == 34;
            case "Thursday"  :  return num == 0;
            case "Friday"    :  return num % 2 == 0;
            case "Saturday"  :  return num == 56;
            case "Sunday"    :  return Math.abs(num) == 666 ;
        }
        return false;
    }
}
--------------------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Arithmophobia {

    public static final Map<String, Predicate<Integer>> map;
    
    static {
      map = new HashMap();
      map.put("Monday", n -> n.equals(12));
      map.put("Tuesday", n -> n > 95);
      map.put("Wednesday", n -> n.equals(34));
      map.put("Thursday", n -> n.equals(0));
      map.put("Friday", n -> n % 2 == 0);
      map.put("Saturday", n -> n.equals(56));
      map.put("Sunday", n -> Math.abs(n) == 666);
    }

    static public boolean AmIAfraid(final String day, final int num) {
      return map.containsKey(day) && map.get(day).test(num);
    }
}
------------------------------------------------------------------------------
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
      return 
        day == "Monday" && num == 12 ||
        day == "Tuesday" && num > 95 ||
        day == "Wednesday" && num == 34 ||
        day == "Thursday" && num == 0 ||
        day == "Friday" && (num & 1) == 0 ||
        day == "Saturday" && num == 56 ||
        day == "Sunday" && Math.abs(num) == 666;
    }
}
-------------------------------------------------------------------------------
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
      String a = "Monday";
      String b = "Tuesday";
      String c = "Wednesday";
      String d = "Thursday";
      String e = "Friday";
      String f = "Saturday";
      String g = "Sunday";
      
      if (day.equals(a) && num==12) {
        return true;
      }
      if (day.equals(b) && num>95) {
        return true;
      }
      if (day.equals(c) && num==34) {
        return true;
      }
      if (day.equals(d) && num==0) {
        return true;
      }
      if (day.equals(e) && num%2==0) {
        return true;
      }
      if (day.equals(f) && num==56) {
        return true;
      }
      if (day.equals(g) && (num==666 || num==-666)) {
        return true;
      }
      return false;
    }
}
-----------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Arithmophobia {
    private static Map<String, Predicate<Integer>> algos = new HashMap<>();

    static {
        algos.put("Monday", nb -> nb == 12);
        algos.put("Tuesday", nb -> nb > 95);
        algos.put("Wednesday", nb -> nb == 34);
        algos.put("Thursday", nb -> nb == 0);
        algos.put("Friday", nb -> nb % 2 == 0);
        algos.put("Saturday", nb -> nb == 56);
        algos.put("Sunday", nb -> Math.abs(nb) == 666);
    }

    static public boolean AmIAfraid(final String day, final int num) {
        return algos.get(day).test(num);
    }
}
--------------------------------------------------------------------------------
import static java.util.Map.of;

class Arithmophobia {
  static boolean AmIAfraid(String day, int num) {
    return of("Mo", num == 12, "Tu", num > 95, "We", num == 34, "Th", num == 0, "Fr", num % 2 == 0, "Sa", num == 56)
        .getOrDefault(day.substring(0, 2), Math.abs(num) == 666);
  }
}
----------------------------------------------------------------------------------
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {

        while ((day.equals("Monday") && num == 12) ||
                (day.equals("Tuesday") && num > 95) ||
                (day.equals("Wednesday") && num == 34) ||
                (day.equals("Thursday") && num == 0) ||
                (day.equals("Friday") && num % 2 == 0) ||
                (day.equals("Saturday") && num == 56) ||
                (day.equals("Sunday") && (num == 666 || num == -666))) {
            return true;
        }

        return false;
    }
}



*/