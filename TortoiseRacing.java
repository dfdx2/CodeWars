/* 6KYU CodeWars Tortoise Racing

Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, COBOL, Erlang, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1" for others.

Examples:
(form of the result depends on the language)

race(720, 850, 70) => [0, 32, 18] or "0 32 18"
race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
Note:
See other examples in "Your test cases".

In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.

** Hints for people who don't know how to convert to hours, minutes, seconds:

Tortoises don't care about fractions of seconds
Think of calculation by hand using only integers (in your code use or simulate integer division)
or Google: "convert decimal time to hours minutes seconds"






*/
public class TortoiseRacing {
  public static int[] race(int v1, int v2, int g) {
    int time = g * 3600 / (v2 - v1);
    int[] result = new int[3];
    result[0] = time / 3600;
    result[1] = time % 3600 / 60;
    result[2] = time % 60;
    return v2 > v1 ? result : null;
  }
}
/*---------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
      int totalSecondsTaken = 0;
      if (v2 > v1 ) {
        totalSecondsTaken = (g*3600) / (v2-v1) ;
      } else {
        return null;
      }
      return new int[] {totalSecondsTaken/3600, (totalSecondsTaken % 3600)/60, totalSecondsTaken % 60};

    }
}
-----------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
		    int t = 3600 * g / (v2 - v1);
		    return new int[] { t / 3600, t % 3600 / 60, t % 60};
    }
}
-----------------------------------------------------------------------
class Tortoise {
  static int[] race(int v1, int v2, int g) {
    return v1 < v2 ? new int[] {(g = 3600 * g / (v2 - v1)) / 3600, g % 3600 / 60, g % 60} : null;
  }
}
-----------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >=v2){
            return null;
        }
        int sec = (g*3600)/(v2 - v1);
        return new int[]{sec / 3600, (sec / 60)%60, sec%60};
    }
}
-----------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {   
      if (v1>=v2) return null;      
      int time = (g*3600)/(v2-v1); //v2*time = v1*time+g for distance to be equal    
      return new int[]{time/3600,(time%3600)/60,time%60};
    }
}
-----------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        float time =  ((float) g / (float) (v2 - v1));
        return v1 >= v2 ? null : new int[]{(int) (time), (int) ((time*60)%60), (int) ((time*3600)%60)};
    }
}
-----------------------------------------------------------------------
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        
        double time = (double)g / (v2 - v1);
        double timeInSeconds = time * 3600;
        
        int hours = (int) (timeInSeconds / 60);
        int minutes = (int) (hours % 60); 
        int seconds = (int) (timeInSeconds % 60);
        
        return new int[]{hours / 60, minutes, seconds};
    }
}
*/