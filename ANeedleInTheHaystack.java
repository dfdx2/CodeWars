/* 8KYU CodeWars A Needle In The Haystack

Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing 
one "needle"

After your function finds the needle it should return a message (as a string) 
that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found 
the needle at position 5" 

Note: In COBOL, it should return "found the needle at position 6"

*/

public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    String x = "found the needle at position ";
    int count = 0;
    for (Object y : haystack) {
      if (y == "needle") {
        x = x + count;
        break;
      }
      else {
        count++;
      }
    }
    return x;
  }
}
/*----------------------------------------------------------------------------
public class Kata {
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
  }
}
------------------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static String findNeedle(Object[] haystack) {
    return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
  }
}
------------------------------------------------------------------------------
public class Kata {
    public static String findNeedle(Object[] haystack) {
    
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "needle be lost, yo";
    }
}
---------------------------------------------------------------------------
public class Kata {
  public static String findNeedle(Object[] haystack) {
    int i = 0;
    while(!String.valueOf(haystack[i]).equals("needle")){
      i++;
    } 
    return "found the needle at position " + i;
  }
}
---------------------------------------------------------------------------
import static java.util.Arrays.asList;

class Kata {
  static String findNeedle(Object[] haystack) {
    return "found the needle at position " + asList(haystack).indexOf("needle");
  }
}
----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static String findNeedle(Object[] haystack) {
    Object obj = "needle";
    return String.format("found the %s at position %d", obj, findObject(haystack, obj));
  }

  private static int findObject(Object[] haystack, Object object) {
    return IntStream.range(0, haystack.length)
            .filter(i -> (object == null && haystack[i] == null) || (object != null && object.equals(haystack[i])))
            .findFirst()
            .orElse(-1);
  }
}




*/