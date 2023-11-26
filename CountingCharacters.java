/*      CodeWars Counting Characters

Define a method named countCharOccurrences that accepts a string 
and a char as inputs and returns the number of times the char 
occurs in the string as an int.

*/
interface Count {
	static int countCharOccurrences(String s, char c) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        result++;
      }
    }
    return result;
  }
}
/*----------------------------------------------------------------------
import static org.apache.commons.lang3.StringUtils.countMatches;

interface Count {
  static int countCharOccurrences(String s, char c) {
    return countMatches(s, c);
  }
}
------------------------------------------------------------------------
interface Count {
	static int countCharOccurrences(String s, char c) {
    return s.split(String.valueOf(c), -1).length - 1;
  }
}
------------------------------------------------------------------------
interface Count {
  static int countCharOccurrences(String s, char c) {
    return s.length( ) - s.replace(String.valueOf(c), "").length( );
  }
}
------------------------------------------------------------------------
interface Count {
	static int countCharOccurrences(String s, char c) {
    
    return s.length() - s.replaceAll(c+"", "").length();

  }
}
------------------------------------------------------------------------
import java.util.stream.*;

interface Count {
	static int countCharOccurrences (String s, char c) {
    return (int)s.chars ().filter (e -> e==c).count ();
  }
}
------------------------------------------------------------------------
*/
