/*  6KYU  CodeWars   String Searching With Wildcard
The method below, is the most simple string search algorithm. 
It will find the first occurrence of a word in a text string.
haystack = the whole text
needle = searchword
wildcard = _
find("strike", "i will strike down upon thee"); // return 7
The find method is already made.
The problem is to implement wildcard(s) in the needle. If you 
have a _ in the needle it will match any character in the haystack.
A normal string search algorithm will find the first occurrence 
of a word(needle) in a text(haystack), starting on index 0. Like this:
find("strike", "I will strike down upon thee"); return 7
A wildcard in the needle will match any character in the haystack. 
The method should work on any types of needle and haystack. 
You can assume the needle is shorter than(or equal to) the haystack.
find("g__d", "That's the good thing about being president"); // return 11
If no match the method should return -1

*/
public class SearchEngine {
    public static int find(String needle, String haystack) {
        if (needle.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            while (j < needle.length()) {
                if (needle.charAt(j) != '_' && needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }

                j++;
            }


            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
/*--------------------------------------------------------------------------------
import java.util.regex.*;
public class SearchEngine {
    static int find(String needle, String haystack){
        String regNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher m = Pattern.compile(regNeedle).matcher(haystack);
        if(m.find()) {
          return m.start();
        } else {
          return -1;
        }
    }
}
-------------------------------------------------------------------------------------
import java.util.regex.*;
public class SearchEngine {
  static int find(String needle, String haystack){
    Matcher m = Pattern.compile(
        Pattern.quote(needle).replace("_", "\\E.\\Q")
      ).matcher(haystack);
    return m.find() ? m.start() : -1;
  }
}
--------------------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SearchEngine {
  public static int find(String needle, String haystack) {
    needle = needle.replaceAll("([&$^?*.+|\\\\{}\\[\\]\\(\\)])", "\\\\$1");
    needle = needle.replaceAll("_", ".");
    Matcher m = Pattern.compile(needle).matcher(haystack);
    if(m.find()) return m.start();
    else return -1;
  }
}
--------------------------------------------------------------------------------------
import static java.util.regex.Pattern.compile;

class SearchEngine {
  static int find(String needle, String haystack) {
    var m = compile("\\Q" + needle.replace("_", "\\E.\\Q") + "\\E").matcher(haystack);
    return m.find() ? m.start() : -1;
  }
}
--------------------------------------------------------------------------------------

*/