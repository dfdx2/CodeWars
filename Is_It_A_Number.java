/*  8KYU CodeWars Is It A Number

Given a string s, write a method (function) that will return 
true if its a valid single integer or floating number or false 
if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")

*/

public class MyUtilities{
  public boolean isDigit(String s) {
      return s.matches("[-+]?\\d*\\.?\\d+");
  }
}
/*-------------------------------------------------------
public class MyUtilities{

  public boolean isDigit(String s)
  {
    try
    {
      Double.parseDouble(s);
      return true;
    }catch(Exception e)
    {
      return false;
    }
  }
}
----------------------------------------------------------
public class MyUtilities{

  private static final String NUMBER_REGEX =
      "\\s*"      // any amount of whitespace
      + "-?"      // optional negative sign
      + "\\d+"    // one or more digits
      + "(:?"     // start of factional part
        + "\\."   // literal period
        + "\\d+"  // one or more digits
      + ")?"      // fractional part is optional
      + "\\s*";   // any amount of whitespace

  public boolean isDigit(String s)
  {
      return s.matches(NUMBER_REGEX);
  }
}
----------------------------------------------------------
public class MyUtilities{

  public boolean isDigit(String s)
  {
      return s.matches("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)");
  }
}
---------------------------------------------------------
public class MyUtilities {

  public boolean isDigit(String s) {
    try {
      Double.parseDouble(s);
    }
    catch (NumberFormatException e) {
      return false;
    }
    return true;
  }
}
----------------------------------------------------------
public class MyUtilities {

  public boolean isDigit(String s) {
      return s != null && s.matches("-?[0-9.]+");
  }
}
-----------------------------------------------------------
public class MyUtilities{

  public boolean isDigit(String s)
  {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch(NumberFormatException e) {
    }
    try {
      Float.parseFloat(s);
      return true;
    }
    catch(NumberFormatException e) {
      return false;
    }
  }
}
*/