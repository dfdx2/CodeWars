/* 8KYU CodeWars Leonardo Dicaprio And Oscars

You have to write a function that describe Leo:

def leo(oscar):
  pass

if oscar was (integer) 88, you have to return "Leo finally 
won the oscar! Leo is happy".

if oscar was 86, you have to return "Not even for Wolf of wallstreet?!"

if it was not 88 or 86 (and below 88) you should return "When will 
you give Leo an Oscar?"

if it was over 88 you should return "Leo got one already!"

*/
public class Kata
{
  public static String leo(final int oscar)
  {
    return (oscar == 88) ? "Leo finally won the oscar! Leo is happy" : oscar == 86 ? "Not even for Wolf of wallstreet?!" : oscar > 88 ? "Leo got one already!" : "When will you give Leo an Oscar?";
  }
}
/*-----------------------------------------------------------------
public class Kata
{
  public static String leo(final int oscar)
  {
    if (oscar == 88) {
      return ("Leo finally won the oscar! Leo is happy");
    }
    else if (oscar == 86) {
      return ("Not even for Wolf of wallstreet?!");
    }
    else if ( oscar > 88) {
      return ("Leo got one already!");
    }
    else {
      return ("When will you give Leo an Oscar?");
    }
    
  }
}
--------------------------------------------------------------------
public class Kata {

  public static String leo(final int oscar) {
    String s;
    switch (oscar) {
      case 88: s="Leo finally won the oscar! Leo is happy"; break;
      case 86: s="Not even for Wolf of wallstreet?!"; break;
      default:
        s = oscar<88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
    }
    return s;
  }
}
------------------------------------------------------------------------
public class Kata{
  public static String leo(final int oscar) {
    if (oscar == 88) return "Leo finally won the oscar! Leo is happy";
    if (oscar == 86) return "Not even for Wolf of wallstreet?!";
    if (oscar < 88) return "When will you give Leo an Oscar?";
    return "Leo got one already!";
  }
}
-----------------------------------------------------------------------
public class Kata
{
  public static String leo(final int oscar)
  {
    String result = "";
    if (oscar == 88) {
      result = "Leo finally won the oscar! Leo is happy";
    } else if (oscar == 86) {
      result = "Not even for Wolf of wallstreet?!";
    } else if (oscar < 88) {
      result = "When will you give Leo an Oscar?";
    } else {
      result = "Leo got one already!";
    }
    
    return result;
  }
}
-----------------------------------------------------------------------
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Kata
{
  public final static LinkedHashMap<Predicate<Integer>, String> LEO_MAP; static {//TODO use immutable
    LEO_MAP = new LinkedHashMap<>(); //top checks take priority 
    LEO_MAP.put(i->i==88,"Leo finally won the oscar! Leo is happy"); 
    LEO_MAP.put(i->i==86,"Not even for Wolf of wallstreet?!");
    LEO_MAP.put(i->i<88,"When will you give Leo an Oscar?");
    LEO_MAP.put(i->i>88,"Leo got one already!");
  }
  public static String leo(final int oscar)
  {
    return LEO_MAP.entrySet().stream().filter(e->e.getKey().test(oscar)).findFirst().get().getValue();
  }
}
----------------------------------------------------------------------
public class Kata
{
  public static String leo(final int oscar) {
    
      String messageIfItWill88 = "Leo finally won the oscar! Leo is happy";
      String messageIfItWill86 = "Not even for Wolf of wallstreet?!";
      String messageIfItWasnt88or86 = "When will you give Leo an Oscar?";
      String messageIfItWillOver88 = "Leo got one already!";
        
      if (oscar == 88 ) 
          return messageIfItWill88;
      if (oscar == 86)
          return messageIfItWill86;
      if (oscar > 88)
          return messageIfItWillOver88;
      else
          return messageIfItWasnt88or86;
      }
}



*/