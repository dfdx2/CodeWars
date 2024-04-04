/* 7KYU CodeWars Powers Of i

Your Task
Complete the function pofi that returns i to the power of a 
given non-negative integer in its simplest form, as a string 
(answer may contain i).


*/

public class Kata {
  public static String pofi(int n) {
    return (n % 4 > 1 ? "-" : "") + (n % 2 == 0 ? "1" : "i");
  }  
}
/*-------------------------------------------------------------
public class Kata {

  public static String pofi(int n) {
    return new String[] {"1","i","-1","-i"}[n%4];
  }
    
}
---------------------------------------------------------------
public class Kata {

  public static String pofi(int n) {
		String result;
		switch (n % 4) {
		case 0: {return "1";}
		case 1: {return "i";}
		case 2: {return "-1";}	
		}
		return "-i";
	}
    
}
---------------------------------------------------------------
public class Kata {
  private static final String[] POWERS_OF_I = new String[] {"1", "i", "-1", "-i"};
  public static String pofi(int n) {
    return POWERS_OF_I[n % 4];
  }
}
----------------------------------------------------------------
import static java.util.List.of;

class Kata {
  static String pofi(int n) {
    return of("1", "i", "-1", "-i").get(n % 4);
  }
}
----------------------------------------------------------------
public class Kata {

  public static String pofi(int n) {
    int a=n%4;
    switch(a)
    {
      case 0:
        return "1";
      case 1:
        return "i";
      case 2:
        return "-1";
      case 3:
        return "-i";
    }
    return "";
  }
    
}
*/