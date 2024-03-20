/* 7KYU CodeWars Regex Validate PIN Code

ATM machines allow 4 or 6 digit PIN codes and PIN codes 
cannot contain anything but exactly 4 digits or exactly 
6 digits.

If the function is passed a valid PIN string, return true, 
else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false

*/

public class Solution {
  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }
}
/*-----------------------------------------------------------------
public class Solution {

  public static boolean validatePin(String pin) {
    return pin.matches("[0-9]{4}|[0-9]{6}");
  }

}
-------------------------------------------------------------------
public class Solution {

  public static boolean validatePin(String pin) {

    if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
      return false;
    }
    
    for (int i = 0; i < pin.length(); i++) {
      if (!Character.isDigit(pin.charAt(i))) {
        return false;
      }
    }
    return true;

  }

}
--------------------------------------------------------------------
public class Solution {

  public static boolean validatePin(String pin) {
    if (pin.length() == 4 || pin.length() == 6) 
        return pin.chars().allMatch(Character::isDigit);
    return false;
  }

}
---------------------------------------------------------------------
public class Solution {

  public static boolean validatePin(String pin) {
        if (pin.matches("\\d{4}|\\d{6}")) {
            return true;
        }
        return false;
    }

}
---------------------------------------------------------------------
public class Solution {

  public static boolean validatePin(String pin) {
    // Your code here...
    return (pin.length() == 4 || pin.length() == 6) && pin.replaceAll("[0-9]","").length() == 0;
  }

}
---------------------------------------------------------------------
import java.util.regex.*;

public class Solution {

  public static boolean validatePin(String pin) {
    Pattern pattern = Pattern.compile("^([0-9]{4}|[0-9]{6})$");
    Matcher match = pattern.matcher(pin);
    if(match.matches()) return true;
    else return false;
  }

}
---------------------------------------------------------------------
public class Solution {
  public static boolean validatePin(String pin) {
    boolean b = true;
    if ((pin.length() == 4) | (pin.length() == 6)) 
      for (int i = 0; i < pin.length(); i++) 
        switch (pin.charAt(i)) {
          case '0': break;
          case '1': break;
          case '2': break;
          case '3': break;
          case '4': break;
          case '5': break;
          case '6': break;
          case '7': break;
          case '8': break;
          case '9': break;
          default : {
            b = false;
            break;
          }
        }
    else b = false;
    return b;
  }
}

*/