/*     7KYU CodeWars   Printer Errors 

In a factory a printer prints labels for boxes. For one kind of boxes the printer 
has to use colors which, for the sake of simplicity, are named with letters from a to m.
The colors used by the printer are recorded in a control string. For example a "good" 
control string would be aaabbbbhaijjjm meaning that the printer used three times 
color a, four times color b, one time color h then one time color a...
Sometimes there are problems: lack of colors, technical malfunction and a "bad" 
control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
You have to write a function printer_error which given a string will return the 
error rate of the printer as a string representing a rational whose numerator is 
the number of errors and the denominator the length of the control string. Don't 
reduce this fraction to a simpler expression.
The string has a length greater or equal to one and contains only letters from ato z.

Examples:
s="aaabbbbhaijjjm"
printer_error(s) => "0/14"

s="aaaxbbbbyyhwawiwjjjwwm"
printer_error(s) => "8/22"

*/
public class Printer {
    
  public static String printerError(String s) {
      // your code
    s = s.replaceAll("[^a-m]", "z");
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'z') {
        count += 1;
      }
      else {
        count += 0;
      }
    }
    return count + "/" + s.length();
  }
}
/*---------------------------------------------------------------------
public class Printer {
    
    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}

----------------------------------------------------------------------------------------
public class Printer {
    
    public static String printerError(String s) {
        long errs = s.chars().filter( ch -> ch > 'm').count();
        return errs+"/"+s.length();
    }
}
-------------------------------------------------------------------------------------------
public class Printer {
    
    public static String printerError(String s) {
        int c=0;
        for(char item:s.toCharArray())
          if(item>'m'||item<'a')c++;
        return c+"/"+s.length();
    }
}
--------------------------------------------------------------------------------------
public class Printer {
    
    public static String printerError(String s) {
        if(s == null || s.length() < 1) {
          return "";
        }
        
        int length = s.length();
        int errors = 0;
        for(char c : s.toCharArray()) {
          if(c < 'a' || c > 'm') {
            errors += 1;
          }
        }
        
        return errors + "/" + length;
    }
}
---------------------------------------------------------------------------------------





*/