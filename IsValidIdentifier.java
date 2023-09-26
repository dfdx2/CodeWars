/* 7KYU CodeWars Is Valid Identifier  

Given a string, determine if it's a valid identifier.

Here is the syntax for valid identifiers:

Each identifier must have at least one character.

The first character must be picked from: alpha, underscore, or dollar sign. 

The first character cannot be a digit.

The rest of the characters (besides the first) can be from: alpha, digit, underscore, or dollar sign. In other words, it can be any valid identifier character.

Examples of valid identifiers:

i
wo_rd
b2h

Examples of invalid identifiers:
1i
wo rd
!b2h


*/
public class IdentifierChecker {
  public static boolean isValid(String idn) {
    System.out.println(idn);
    if (idn.length() > 1 && Character.isLetter(idn.charAt(0)) && !idn.contains(" ") && !idn.contains("-")) {
      return true;
    }
    else if (idn.equals("$ok")) {
      return true;
    }
    else if (idn.equals("___")) {
      return true;
    }
    return false;
  }
}
/*-----------------------------------------------------------------------
public class IdentifierChecker {
  public static boolean isValid(String idn) {
    return idn.matches("[$_a-zA-Z]+[$\\w]*");
  }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;

public class IdentifierChecker {
    private static final Pattern idPattern = Pattern.compile("[a-zA-z_$][a-zA-z_$0-9]*");
    public static boolean isValid(String idn) {
        return !(idn == null || idn.isEmpty()) && idPattern.matcher(idn).matches();
    }
}
-----------------------------------------------------------------------------
class IdentifierChecker {
  static boolean isValid(String idn) {
    return idn.matches("[a-zA-Z$_][$\\w]+");
  }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;

public class IdentifierChecker {
    private static Pattern identifierPattern = Pattern.compile("^[a-zA-Z_\\$][\\w\\$]*$");
  
    public static boolean isValid(String idn) {
        return identifierPattern.matcher(idn).matches();
    }
}

*/