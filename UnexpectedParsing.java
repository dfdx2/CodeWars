/* 8KYU CodeWars Unexpected Parsing

Here is a piece of code:

public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status;
      
        if (isBusy) {
          status = "busy";
        } else {
          status = "available";
        }

        return status;
    }
}

Expected Behaviour
Function should return a dictionary/Object/Hash with "status" as a key, 
whose value can : "busy" or "available" depending on the truth value of 
the argument is_busy.

But as you will see after clicking RUN or ATTEMPT this code has several 
bugs, please fix them.

*/
import java.util.HashMap;

public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        
        HashMap<String, String> status = new HashMap<String, String>();
      
        if (isBusy == true) {
          status.put("status", "busy");
        } else {
          status.put("status", "available");
        }

        return status;
    }
  
}
/*--------------------------------------------------------------------------
import java.util.Map;

interface Kata {
  static Map <String, String> getStatus(boolean isBusy) {
    return Map.of("status", isBusy ? "busy" : "available");
  }
}
--------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;


public class Kata {

     public static Map<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> map = new HashMap<>();
        String status = isBusy ? "busy" : "available";
        map.put("status", status);
        return  map;
    }
  
}
-----------------------------------------------------------------------------
import java.util.HashMap;

public final class Kata {
  protected static final HashMap <String, String> getStatus(final boolean isBusy) {
    HashMap<String, String> status = new HashMap<>();

    if (isBusy)
      status.put("status", "busy");
    else
      status.put("status", "available");

    return status;
  }
}
-----------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Kata {

    public static Map<String, String> getStatus(boolean isBusy) {
        return isBusy?new HashMap<>(Map.of("status","busy")):new HashMap<>(Map.of("status","available"));
  
}}
--------------------------------------------------------------------------------
import java.util.HashMap;

public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();
      
        if (isBusy) {
         // status = "busy";
          status.put("status","busy");
        } else {
         // status = "available";
           status.put("status","available");
        }

        return status;
    }
  
}

*/