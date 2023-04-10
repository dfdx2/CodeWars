/* 8KYU CodeWars How Do I Compare Numbers

What could be easier than comparing integer numbers? 
However, the given piece of code doesn't recognize some 
of the special numbers for a reason to be found. Your 
task is to find the bug and eliminate it.

*/

public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String)p[1];
        }
        return "nothing";
    }
    
    static final Object[][] specialNumbers = {
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
}
/*-------------------------------------------------------------------------
import java.util.Map;

class HowDoICompare {
  static String whatIs(Integer x) {
    return Map.of(42, "everything", 1764, "everything squared").getOrDefault(x, "nothing");
  }
}
----------------------------------------------------------------------------
public class HowDoICompare {
  private static final Object[][] specialNumbers = {{42, "everything"}, {1764, "everything squared"}};
  public static String whatIs(Integer x) {
    for (Object[] p : specialNumbers) if(x.equals(p[0])) return (String)p[1];
    return "nothing";
  }
}
----------------------------------------------------------------------------
import java.util.Map;

public class HowDoICompare {
  
  private static final Map<Integer, String> SPECIAL_NUMBERS = Map.ofEntries(
    Map.entry(42, "everything"),
    Map.entry(42 * 42, "everything squared")
  );
  
  public static String whatIs(Integer x) {
    return SPECIAL_NUMBERS.getOrDefault(x, "nothing");
  }
    
}
--------------------------------------------------------------------------------
public class HowDoICompare {
    public static String whatIs(Integer x) {
        return (x==42) ? "everything" : (x==1764) ? "everything squared" : "nothing";
    }
}
--------------------------------------------------------------------------------
public class HowDoICompare {
    public static String whatIs(Integer x) {
        if(x == 42 * 42) return "everything squared";
        for (Object[] p : specialNumbers) {
            if(x == 42 * 42) return (String)p[1];
            if (p[0] == x)
                return (String)p[1];
        }
        return "nothing";
    }
    
    static final Object[][] specialNumbers = {
        {0, "nothing"},
        {123, "nothing"},
        {-1, "nothing"},
        {42, "everything"},
        {42 * 42, "everything squared"}
    };
}



*/