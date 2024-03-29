/*  8KYU All Star Code Challenge 18

This Kata is intended as a small challenge for my students

All Star Code Challenge #18

Create a function that accepts 2 string arguments and returns an integer of the count of occurrences the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned.

("Hello", "o")  ==>  1
("Hello", "l")  ==>  2
("", "z")       ==>  0
Notes:

The first argument can be an empty string
The second string argument will always be of length 1

*/
public class CodeWars {
  public static int strCount(String str, char letter) {
    //write code here
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      if (letter == str.charAt(i)) {
        result += 1;
      }
    }
    return result;
  }
}
/*--------------------------------------------------------------
public class CodeWars {
  public static int strCount(String str, char letter) {
    return (int)str.chars().filter(x -> x == letter).count();
  }
}
-----------------------------------------------------------------
import org.apache.commons.lang3.StringUtils;
public class CodeWars {
  public static int strCount(String str, char letter) {
    
    return StringUtils.countMatches(str, letter);
   
  }
}
-----------------------------------------------------------------
public class CodeWars {
  public static int strCount(String str, char letter) {
    int counter = 0;
    for(char character : str.toCharArray()) {
      if(letter == character) {
        counter++;
      }
    }
    return counter;
  }
}
-------------------------------------------------------------------
import static org.apache.commons.lang3.StringUtils.countMatches;

class CodeWars {
  static int strCount(String str, char letter) {
    return countMatches(str, letter);
  }
}
-------------------------------------------------------------------
class CodeWars {
  static int strCount(String str, char letter) {
    return (int) str.chars().filter(x -> x == letter).count();
  }
}




*/