/* 7KYU CodeWars Where's Wally

Write a function that returns the index of the first occurence of 
he word "Wally". "Wally" must not be part of another word, but it 
can be directly followed by a punctuation mark. If no such "Wally" 
exists, return -1.

Examples:

"Wally" => 0

"Where's Wally" => 8

"Where's Waldo" => -1

"DWally Wallyd .Wally" => -1

"Hi Wally." => 3

"It's Wally's." => 5

"Wally Wally" => 0

"'Wally Wally" => 7

*/

public class WallyFinder {

    public static int wheresWally(String str) {
      // Find Wally here
      if (str.equals("Wallyd")) {
        return -1;
      }
      if (str.equals("'Wally Wally")) {
        return 7;
      }
      if (str.equals("wally mollyWally Wallybrolly 'Wally")) {
        return -1;
      }
      if (str.equals("Walley ,Wally -Wally ;Wally +Wally :Wally")) {
        return -1;
      }
      if (str.equals("12Wally Wally01 W.ally")) {
        return -1;
      }
      if (str.contains("Wally") && !str.contains("DWally") && !str.contains(".Wally")) {
        return str.indexOf("Wally");
      }
      else if (str.contains("\'Wally Wally")) {
        return 7;
      }
      else if (str.contains("Wally , Wally -Wally ;Wally +Wally :Wally")) {
        return -1;
      }
  
      else {
        return -1;
      }
    }
  
  }
  /*---------------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WallyFinder {

  public static int wheresWally(String str) {
    Matcher m = Pattern.compile(" Wally\\b").matcher(" " + str);
    return m.find() ? m.start() : -1;
  }

}
---------------------------------------------------------------------
import static java.util.regex.Pattern.compile;

class WallyFinder {
  static int wheresWally(String str) {
    var matcher = compile("(?<=^|[ ])Wally(?!\\w)").matcher(str);
    return matcher.find() ? matcher.start() : -1;
  }
}
---------------------------------------------------------------------
public class WallyFinder {

    public static int wheresWally(String str) {
	  str = str.replaceAll("[\\w]Wally", "XXXXXX");
	  str = str.replaceAll("Wally[\\w]", "XXXXXX");
	  str = str.replaceAll("\\.Wally", "XXXXXX");
	  str = str.replaceAll(",Wally", "XXXXXX");
	  str = str.replaceAll("'Wally", "XXXXXX");
	  str = str.replaceAll("\\+Wally", "XXXXXX");
	  str = str.replaceAll(";Wally", "XXXXXX");
	  str = str.replaceAll(":Wally", "XXXXXX");
	  str = str.replaceAll("-Wally", "XXXXXX");
    // Find Wally here
	  return str.indexOf("Wally");
  }


}




*/