/*  8 KYU  CodeWars  Remove String Spaces

Simple, remove the spaces from the string, 
then return the resultant string.

*/

public class Kata {
  public static String noSpace(final String x) {
      return x.replaceAll("\\s", "");
  }
}

/* -----------------------------------------------------------
class Kata {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
---------------------------------------------------------------



*/