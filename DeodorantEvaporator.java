/* 7KYU CodeWars Deodorant Evaporator

This program tests the life of an evaporator containing a gas.
We know the content of the evaporator (content in ml), the percentage 
of foam or gas lost every day (evap_per_day) and the threshold (threshold) 
in percentage beyond which the evaporator is no longer useful. All numbers 
are strictly positive.  The program reports the nth day (as an integer) on 
which the evaporator will be out of use.

*/
public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    
		double dc = content;
    double days = 0;
    double ct = 1000000000;
    while (ct > threshold / 100) {
      content = content - content * evap_per_day / 100;
      ct = content / dc;
      days++;
    }
    return (int) days;
	}
}
/*-------------------------------------------------------------------------------
public class DeodorantEvaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    
		double initial_content = content;
    double days = 0;
    double current_threshold = 1000000000;
    while (current_threshold > threshold/100) {
      content = content - content * evap_per_day/100;
      current_threshold = content / initial_content;
      days += 1;
    }
    return ((int)days);
    }
}
_______________________________________________________________

 * public class Evaporator { 
  
  public static int evaporator(double content, double evap_per_day, double threshold) {
  
    int nbOfDays = 0;
    double contentPercentage = 100;
    
    while(contentPercentage > threshold){
      contentPercentage *=  1- evap_per_day/100;
      nbOfDays ++;
    }

  
    return nbOfDays;
  }
}________________________________________________________________________
 * 
 * import java.lang.Math;

public class Evaporator { 
  
  public static int evaporator(double content, double evap_per_day, double threshold) {
    return (int)Math.ceil(Math.log(threshold / 100.0) / Math.log(1.0 - evap_per_day / 100.0));
  }
}________________________________________________________________________________

public class Evaporator { 
  
  public static int evaporator(double content, double evap_per_day, double threshold) {
    evap_per_day /= 100;
    threshold /= 100;
    return (int)Math.ceil(Math.log(threshold) / Math.log(1 - evap_per_day));
  }
}
-----------------------------------------------------------------------------------
public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    int n = 0;
    double end = content * (threshold / 100);
    while (content >= end){
      n++;
      content *= 1-(evap_per_day/100);
    }
		return n;
	}
}
---------------------------------------------------------------------------------
public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
		return calcEvaporation(content, evap_per_day / 100.0, content * threshold / 100.0);
	}
  
  private static int calcEvaporation(double content, double evap_per_day, double threshold) {
    return content > threshold ? calcEvaporation(content * (1 - evap_per_day), evap_per_day, threshold) + 1 : 0; 
  }
}
----------------------------------------------------------------------------------
public class Evaporator { 
	
	public static int evaporator(double content, double evapPerDay, double threshold) {
    
    EvaporatorRecipient evaporator = new EvaporatorRecipient(evapPerDay, threshold);
    
    while(evaporator.isStillUsable()) 
      evaporator.goToNextDay();
    
		return evaporator.daysPassed;
	}
  
  public static class EvaporatorRecipient {
    private int daysPassed;
    private double qtyLeftPercentage;
    private double minUsefulQtyPercentage;
    private double evapPerDay;
    
    public EvaporatorRecipient(double evapPerDay, double minUsefulQtyPercentage) {
      this.daysPassed = 0;
      this.qtyLeftPercentage = 100.0;
      this.evapPerDay = evapPerDay/100.0;
      this.minUsefulQtyPercentage = minUsefulQtyPercentage;
    }
  
    public boolean isStillUsable() {
      return this.qtyLeftPercentage >= this.minUsefulQtyPercentage;
    }
  
    public void goToNextDay() {
      this.daysPassed++;
      this.qtyLeftPercentage -= qtyEvaporatedToday();
    }
    
    public double qtyEvaporatedToday() {
      return this.qtyLeftPercentage * this.evapPerDay;
    } 

    public int daysPassed() {
      return this.daysPassed;
    } 
    
  }
  
  
}
 */