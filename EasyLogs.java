/* 8KYU Easy Logs 

Add two logs with base X, with the value of A and B. 
Example log A + log B where the base is X.

*/

public class EasyLogs {

  public static double logs(double x, double a, double b) {
    
    return (Math.log(a) / Math.log(x) + Math.log(b) / Math.log(x));
  }
}
/*-------------------------------------------------------------- 
public class EasyLogs {

  public static double logs(double x, double a, double b) {
    return Math.log(a*b)/Math.log(x);
  }

}
-----------------------------------------------------------------


*/