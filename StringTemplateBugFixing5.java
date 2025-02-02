/* 8KYU CodeWars String Templates - Bug Fixing # 5

Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature, Help Timmy with his string template so it works as he expects!

*/
public class StringTemplateBugFixing5 {
  public static String buildString(String... args) {
    StringBuilder sb = new StringBuilder();
    for (String a : args) {
      if (a.length() < 1) {
        break;
      }
      else {
        sb.append(a);
        sb.append(", ");
      }
    }
    String result = sb.toString().trim();
    return result.equals(", ") ? "I like!" : "I like " + result.substring(0, result.length() - 1) + "!";
  }
}
/*------------------------------------------------------------------------
public class Kata 
{
    public static String buildString(String... args)
    {
      String x = "I like ";
      String y = "";
      for (String z : args) {
        y += z + ", ";
      }
      String a = "!";
      if (y.length() < 1) {
        y = "";
      }
      else {
        y = y.substring(0, y.length() - 2);
      }
      if (args == null) {
        return "";
      }
      else {  
        return x + y + a;
      }
    }
}
----------------------------------------------------------------------
public class Kata {
    public static String buildString(String... args) {
      return "I like " + String.join(", ", args) + "!";
    }
}
-----------------------------------------------------------------------
public class Kata 
{
    public static String buildString(String... args)
    {
      return String.format("I like %s!",String.join(", ", args));
    }
}
----------------------------------------------------------------------
public class Kata {
    public static String buildString(String... s) {
        return String.format("I like %s!", String.join(", ", s));
    }
}
--------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;

public class Kata 
{
    public static String buildString(String... args)
    {
        return String.format("I like %s!", Arrays.stream(args).collect(Collectors.joining(", ")));
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    
    public final static String TEMPLATE = "I like %s!"; 
    
    public static String buildString(String... args) {
      return String.format(TEMPLATE, Arrays.stream(args).collect(Collectors.joining(", ")));
    }
}
*/