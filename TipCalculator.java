/* 8KYU CodeWars Tip Calculator

Complete the function, which calculates how much you need to tip based 
on the total amount of the bill and the service.

You need to consider the following ratings:

Terrible: tip 0%
Poor: tip 5%
Good: tip 10%
Great: tip 15%
Excellent: tip 20%
The rating is case insensitive (so "great" = "GREAT"). If an unrecognised 
rating is received, then you need to return:

"Rating not recognised" in Javascript, Python and Ruby...
...or null in Java
...or -1 in C#
Because you're a nice person, you always round up the tip, regardless of 
the service.

*/

public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    String ex = "Excellent";
    String pr = "Poor";
    String goo = "Good";
    String gre = "Great";
    String tre = "Terrible";
    double t = 0;
    double p = Math.ceil(amount * 0.05);
    double go = Math.ceil(amount * 0.10);
    double gr = Math.ceil(amount * 0.15);
    double e = Math.ceil(amount * 0.20);
    String r = rating.toLowerCase();
    if (rating.equalsIgnoreCase(tre)) {
      return (int) t;
    }
    else if (rating.equalsIgnoreCase(pr)) {
      return (int) p;
    }
    else if (rating.equalsIgnoreCase(goo)) {
      return (int) go;
    }
    else if (rating.equalsIgnoreCase(gre)) {
      return (int) gr;
    }
    else if (rating.equalsIgnoreCase(ex)) {
      return (int) e;
    }
    else {
      return null;
    }
  }
}
/*---------------------------------------------------------------------------
public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
   
    switch(rating.toLowerCase()) {
      case "terrible": return 0;
      case "poor": return (int) Math.ceil(amount * 0.05);
      case "good": return (int) Math.ceil(amount * 0.1);
      case "great": return (int) Math.ceil(amount * 0.15);
      case "excellent": return (int) Math.ceil(amount * 0.2);
      default: return null;      
    }   
  }
}
-----------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class TipCalculator {

    private static Map<String, Integer> tips = new HashMap<>();

    static {
        tips.put("terrible", 0);
        tips.put("poor", 5);
        tips.put("good", 10);
        tips.put("great", 15);
        tips.put("excellent", 20);
    }

    public static Integer calculateTip(double amount, String rating) {
        Integer tipRating = tips.get(rating.toLowerCase());
        if (tipRating == null) return null;
        return (int) Math.ceil(tipRating * amount / 100);
    }
}
------------------------------------------------------------------------------
public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {


    if("Terrible".equalsIgnoreCase(rating))   return 0;
    if("Poor".equalsIgnoreCase(rating))       return (int)Math.ceil(0.05*amount);
    if("Good".equalsIgnoreCase(rating))       return (int)Math.ceil(0.10*amount);
    if("Great".equalsIgnoreCase(rating))      return (int)Math.ceil(0.15*amount);
    if("Excellent".equalsIgnoreCase(rating))  return (int)Math.ceil(0.20*amount);
    
    return null;

}
}
-------------------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;

public class TipCalculator {
  public static Integer calculateTip(double amount, String rating) {
    Map<String, Integer> tips = new HashMap<String, Integer>() {{
      put("terrible", 0);
      put("poor", 5);
      put("good", 10);
      put("great", 15);
      put("excellent", 20);
    }};
    if (!tips.containsKey(rating.toLowerCase())) return null; 
    return (int) Math.ceil(amount * (double) tips.get(rating.toLowerCase()) / 100);
  }
}
--------------------------------------------------------------------------------
import java.util.*;

public class TipCalculator {
  
  private static Map<String, Double> ratings = Map.of("terrible", 0.0, "poor", 0.05, "good", 0.1, "great", 0.15, "excellent", 0.2);

  public static Integer calculateTip(double a, String r) {
    return ratings.get(r.toLowerCase()) == null ? null : (int)Math.ceil(a*ratings.get(r.toLowerCase()));
  }
}
--------------------------------------------------------------------------------
public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    if (rating.equalsIgnoreCase("terrible")) return 0;
    else if (rating.equalsIgnoreCase("poor")) return (int) Math.ceil(5*amount/100);
    else if (rating.equalsIgnoreCase("good")) return (int) Math.ceil(10*amount/100);
    else if (rating.equalsIgnoreCase("great")) return (int) Math.ceil(15*amount/100);
    else if (rating.equalsIgnoreCase("excellent")) return (int) Math.ceil(20*amount/100);
    else return null;
  }
}
-----------------------------------------------------------------------------
import java.util.HashMap;

public class TipCalculator
{
  private final static HashMap<String, Double> RATINGS = new HashMap<String, Double>();
	static
	{
		RATINGS.put("TERRIBLE", 0.0);
		RATINGS.put("POOR", 0.05);
		RATINGS.put("GOOD", 0.1);
		RATINGS.put("GREAT", 0.15);
		RATINGS.put("EXCELLENT", 0.2);
	}
  
  public static Integer calculateTip(double amount, String rating)
  {
    if (!RATINGS.containsKey(rating.toUpperCase()))
		{
			return null;
		}
    
    return (int) Math.ceil(amount * RATINGS.get(rating.toUpperCase()));
  }
}

*/