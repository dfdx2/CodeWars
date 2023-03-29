/* 7KYU CodeWars Credit Card Mask

Usually when you buy something, you're asked whether your credit 
card number, phone number or answer to your most secret question 
is still correct. However, since someone could look over your 
shoulder, you don't want that shown on your screen. Instead, we 
mask it.

Your task is to write a function maskify, which changes all but the 
last four characters into '#'.

Examples

Maskify.Maskify("4556364607935616"); // should return "############5616"
Maskify.Maskify("64607935616");      // should return "#######5616"
Maskify.Maskify("1");                // should return "1"
Maskify.Maskify("");                 // should return ""

// "What was the name of your first pet?"
Maskify.Maskify("Skippy");                                   // should return "##ippy"
Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"

*/
public class Maskify {
    public static String maskify(String str) {
      char[] result = str.toCharArray();
      int count = 1;
      for (int i = result.length - 1; i >= 0; i--) {
        if (count > 4) {
          result[i] = '#';
        }
        count++;
      }
      str = new String(result);
      return str;
        
    }
}
/*--------------------------------------------------------------------------
public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);
    }
}
---------------------------------------------------------------------------
public class Maskify {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
---------------------------------------------------------------------------
public class Maskify {
  public static String maskify(String str) {
    char[] strChars = str.toCharArray();
    for( int i = 0; i < strChars.length - 4; i++ ) {
      strChars[i] = '#';
    }
    return new String(strChars);
  }
}
---------------------------------------------------------------------------
import java.util.Collections;

public class Maskify {
  private static final String MASK_CHAR = "#";
  private static final int UNMASK_COUNT = 4;
  
  public static String maskify(String str) {
    int len = str.length();
    if (len <= UNMASK_COUNT) {
      return str;
    }
    int maskCount = len - UNMASK_COUNT;
    return String.join("", Collections.nCopies(maskCount, MASK_CHAR))
        + str.substring(maskCount);
  }
}
------------------------------------------------------------------------------
public class Maskify {
    public static String maskify(String str) {
        return str.length()<=4 ? str : str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4);
    }
}
-------------------------------------------------------------------------------
public class Maskify {
    public static String maskify(String str) {
      if (null == str) {
        throw new IllegalArgumentException("Missing the argument.");
      }
      
      int maskLength = str.length() - 4;
      if (0 >= maskLength) {
        return str;
      }
      
      StringBuilder masked = new StringBuilder(str);
      for (int i = 0 ; i < maskLength; i++) {
        masked.setCharAt(i, '#');
      }
     
      return masked.toString();
    }
}
-----------------------------------------------------------------------------
class Maskify {
  static String maskify(String str) {
    return str.length() < 5 ? str : "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
  }
}



*/