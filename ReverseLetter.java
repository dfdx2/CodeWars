/*  7KYU CodeWars Simple Fun # 176: Reverse Letter

Task
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str
A string consists of lowercase latin letters, digits and symbols.

[output] a string

*/

public class Kata {
    public static String reverseLetter(final String str) {
      String goofy = str.replaceAll("[^a-zA-Z]", "");
      char c;
      String result = "";
      for (int i = 0; i < goofy.length(); i++) {
        c = goofy.charAt(i);
        result = c + result;
      }
      return result;
    }
}

/*----------------------------------------------------------

public class Kata {
    public static String reverseLetter(final String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}

----------------------------------------------------------------
public class Kata {
    public static String reverseLetter(final String str) {
        String someString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                someString = str.charAt(i) + someString;
            }
        }
        return someString;
    }
}



----------------------------------------------------------------

public class Kata {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("(?i)[^a-z]","")).reverse().toString();
    }
}
---------------------------------------------------------------
class Kata {
  static String reverseLetter(String str) {
    return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
  }
}


---------------------------------------------------------------


*/