/* 7KYU CodeWars Credit Card Issuer Checking

Given a credit card number we can determine who the issuer/vendor is with a few basic knowns.

Complete the function getIssuer() that will use the values 
shown below to determine the card issuer for a given card 
number. If the number cannot be matched then the function 
should return the string Unknown.

| Card Type  | Begins With          | Number Length |
|------------|----------------------|---------------|
| AMEX       | 34 or 37             | 15            |
| Discover   | 6011                 | 16            |
| Mastercard | 51, 52, 53, 54 or 55 | 16            |
| VISA       | 4                    | 13 or 16      |

Examples

getIssuer(4111111111111111) == "VISA"
getIssuer(4111111111111) == "VISA"
getIssuer(4012888888881881) == "VISA"
getIssuer(378282246310005) == "AMEX"
getIssuer(6011111111111117) == "Discover"
getIssuer(5105105105105100) == "Mastercard"
getIssuer(5105105105105106) == "Mastercard"
getIssuer(9111111111111111) == "Unknown"

*/
public class Kata {
    public static String getIssuer(String cardNumber) {
      String v = "VISA";
      String a = "AMEX";
      String d = "Discover";
      String m = "Mastercard";
      String u = "Unknown";
      String starta = cardNumber.substring(0,4);
      String start = cardNumber.substring(0,2);
      int ln = cardNumber.length();
      return (start.equals("34") || start.equals("37") && ln == 15) ? a : (cardNumber.charAt(0) == '4' && ln == 13 || cardNumber.charAt(0) == '4' && ln == 16) ? v : (starta.equals("6011") && ln == 16) ? d : (start.equals("51") || start.equals("52") || start.equals("53") || start.equals("54") || start.equals("55") && ln == 16) ? m : u;
    }
}
/*-----------------------------------------------------------------------------
import static java.util.regex.Pattern.matches;

public class Kata { 

  public static String getIssuer(String cn) {
    if (matches("^3[4|7].{13}$", cn)) return "AMEX";
    if (matches("^6011.{12}$", cn)) return "Discover";
    if (matches("^5[1-5].{14}$", cn)) return "Mastercard";
    if (matches("^4.{12}(...)?$", cn)) return "VISA";
    return "Unknown";
  }
}
------------------------------------------------------------------------------
public class Kata { 

  public static String getIssuer(String cn) {
    return
      cn.matches("^3[4|7].{13}$")   ? "AMEX"
    : cn.matches("^6011.{12}$")     ? "Discover"
    : cn.matches("^5[1-5].{14}$")   ? "Mastercard"
    : cn.matches("^4.{12}(...)?$")  ? "VISA"
    : "Unknown";
  }
}
-------------------------------------------------------------------------------
public class Kata {
  public static String getIssuer(String cardNumber) {
    if (cardNumber.startsWith("34") || cardNumber.startsWith("37") && cardNumber.length() == 15){
      return "AMEX";
    }
    else if (cardNumber.startsWith("6011") && cardNumber.length() == 16){
      return "Discover";
    }
    else if (cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16) ){
      return "VISA";
    }
    else if (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") ||
             cardNumber.startsWith("54") || cardNumber.startsWith("55") && cardNumber.length() == 16){
      return "Mastercard";
    }
    return "Unknown";
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String getIssuer(String cardNumber) {
    // Your code here!
    
    String visa = "4+(\\d{15}|\\d{12})";
    String amex = "(34|37)+\\d{13}";
    String discover = "6011+\\d{12}";
    String mastercard = "(51|52|53|54|55)+\\d{14}";
    
    String result = "Unknown";
    if (cardNumber.matches(visa)) return "VISA";
    if (cardNumber.matches(amex)) return "AMEX";
    if (cardNumber.matches(discover)) return "Discover";
    if (cardNumber.matches(mastercard)) return "Mastercard";
    
    return result;
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static String getIssuer(String cardNumber) {
    if ((cardNumber.startsWith("34") || cardNumber.startsWith("37")) && cardNumber.length() == 15) {
      return "AMEX";
    } else if (cardNumber.startsWith("6011") && cardNumber.length() == 16){
      return "Discover";
    } else if (Arrays.asList("51", "52", "53", "54", "55").contains(cardNumber.substring(0, 2)) && cardNumber.length() == 16){
      return "Mastercard";
    } else if (cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16)){
      return "VISA";
    } else {
      return "Unknown";
    }
  }
}
----------------------------------------------------------------------------------
import java.util.Map;

public class Kata {
    
    private static Map<String, String> regexps = Map.of(
            "AMEX",       "^3[4|7]\\d{13}",
            "Discover",   "^6011\\d{12}",
            "Mastercard", "^5[1-5]\\d{14}",
            "VISA",       "^4(\\d{12}|\\d{15})");

    public static String getIssuer(String cardNumber) {
        return regexps.entrySet()
                .stream()
                .filter(entry -> cardNumber.matches(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("Unknown");
    }
}
--------------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Kata {
	  public static String getIssuer(String cardNumber) {
	    Pattern patternAMEX = Pattern.compile("(^(34)|^(37))\\d{13}");
	    Pattern patternDISCOVER = Pattern.compile("(^(6011))\\d{12}");
	    Pattern patternMASTERCARD = Pattern.compile("(^(51)|^(52)|^(53)|^(54)|^(55))\\d{14}");
	    Pattern patternVISA = Pattern.compile("((^(4))(\\d{12}|\\d{15}))");
	    if(patternAMEX.matcher(cardNumber).matches()) {
	    	return "AMEX";
	    }
	    else if(patternDISCOVER.matcher(cardNumber).matches()) {
	    	return "Discover";
	    }
	    else if(patternMASTERCARD.matcher(cardNumber).matches()) {
	    	return "Mastercard";
	    }
	    else if(patternVISA.matcher(cardNumber).matches()) {
	    	return "VISA";
	    }
	    return "Unknown";
	  }
	}
*/