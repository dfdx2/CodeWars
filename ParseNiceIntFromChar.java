/*  8KYU CodeWars Parse Nice Int From Char Problem

You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.

*/

public class CharProblem {
  public static int howOld(final String herOld) {
  String x = herOld.substring(0,1);
    return Integer.parseInt(x);
  }
}
/*---------------------------------------------------------------
public class CharProblem {
  public static int howOld(final String herOld) {
  
  return Character.getNumericValue(herOld.charAt(0));
  }
}
----------------------------------------------------------------
public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }
}
----------------------------------------------------------------
public class CharProblem {
  public static int howOld(final String herOld) {

    String[] s = herOld.split(" ");
    return Integer.valueOf(s[0]);
  
  }
}
---------------------------------------------------------------
public class CharProblem {
  public static int howOld(final String herOld) {
    return herOld.charAt(0) - '0';
  }
}
-----------------------------------------------------------------
public class CharProblem {
  public static int howOld(final String herOld) {
    return Integer.valueOf(herOld.substring(0, 1));
  }
}



*/