/* 7KYU CodeWars Digits Explosion

Given a string made of digits [0-9], return a string 
where each digit is repeated a number of times equals 
to its value.

Examples

"312" should return "333122"
"102269" should return "12222666666999999999"

*/
public class Solution {
  public static String explode(String digits) {
    StringBuilder sb = new StringBuilder();
    String j = "";
    for (int i = 0; i < digits.length(); i++) {
      char a = digits.charAt(i);
      int x = Integer.valueOf(a) - '0';
      j += a;
      j = j.repeat(x);
      sb.append(j);
      j = "";
    }
    return sb.toString();
  }
}
/*------------------------------------------------------------------------
import java.util.stream.Collectors;

public class Solution {
  public static String explode(String digits) {
      return digits.chars()
            .mapToObj(Character::toString)
            .map(e -> e.repeat(Integer.parseInt(e)))
            .collect(Collectors.joining());
  }
}
--------------------------------------------------------------------------
public class Solution {
  public static String explode(String digits) {
    // SETUP
    String result = ""; // return value
    
    // LOOP SCOOT & BOOGY
    for (int i = 0; i < digits.length(); i++) {
      String digitStr = String.valueOf(digits.charAt(i));    // digit as String
      
      for (int j = 0; j < Integer.valueOf(digitStr); j++) {  // loop digit-as-int times
        result = result + digitStr;                          // add digit-as-String to result
      }
    }
    
    // RETURN
    return result;
  }
}
--------------------------------------------------------------------------
public class Solution {
  public static String explode(String digits) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < digits.length(); ++i) {
      
      if (digits.substring(i, i + 1).equals("0")) {
        continue;
      }
      
      for (int j = 1; j <= Integer.valueOf(digits.substring(i, i + 1)); ++j) {
        sb.append(digits.charAt(i));
      }
      
    }
    
    return sb.toString();
  }
}
--------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Solution {
  public static String explode(String digits) {
    return Pattern.compile("\\d").matcher(digits).replaceAll(x -> x.group().repeat(Integer.valueOf(x.group())));
  }
}
---------------------------------------------------------------------------
public class Solution {
  public static String explode(String digits) {
    return digits
      .replaceAll("0","")
      .replaceAll("2","22")
      .replaceAll("3","333")
      .replaceAll("4","4444")
      .replaceAll("5","55555")
      .replaceAll("6","666666")
      .replaceAll("7","7777777")
      .replaceAll("8","88888888")
      .replaceAll("9","999999999");
  }
}
---------------------------------------------------------------------------
public class Solution {
  public static String explode(String digits) {
    
    if( digits.isEmpty() ) return digits;  
    
    String resultString = "";
    int currentAriety = digits.charAt(0) - '0';
    
    for( int i = 0; i < currentAriety; i++ ){
      resultString += digits.charAt(0);
    }
    
    return resultString += explode(digits.substring(1));
  
  }
}
------------------------------------------------------------------------------
public class Solution {
  public static String explode(String digits) {
    String ans = "";
		for(int i=0;i<digits.length();i++)
		{
			String s = String.valueOf(digits.charAt(i));
			ans = ans + s.repeat(Integer.valueOf(s));
		}
		
		return ans;
  }
}
*/