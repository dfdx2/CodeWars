/* This program tests the life of an evaporator containing a gas.
   We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day) and the threshold (threshold) in percentage beyond which the evaporator is no longer useful. All numbers are strictly positive.
   The program reports the nth day (as an integer) on which the evaporator will be out of use.
   */

public class DeodorantEvaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    // your code
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
/*_______________________________________________________________

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












 */