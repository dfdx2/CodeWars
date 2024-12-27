/* 7KU CodeWars Email Address Obfuscator

Many people choose to obfuscate their email address when 
displaying it on the Web. One common way of doing this is 
by substituting the @ and . characters for their literal 
equivalents in brackets.

Example 1:
user_name@example.com
=> user_name [at] example [dot] com

Example 2:
af5134@borchmore.edu
=> af5134 [at] borchmore [dot] edu

Example 3:
jim.kuback@ennerman-hatano.com
=> jim [dot] kuback [at] ennerman-hatano [dot] com
Using the examples above as a guide, write a function that takes an 
email address string and returns the obfuscated version as a string 
that replaces the characters @ and . with [at] and [dot], respectively.

Notes
Input (email) will always be a string object. Your function should 
return a string.
Change only the @ and . characters.
Email addresses may contain more than one . character.
Note the additional whitespace around the bracketed literals in the examples!

*/
public class EmailAddressObfuscator { 
  public static String obfuscate(String email) {
    return email.replace("@", " [at] ").replace(".", " [dot] ");
  }
}
/*----------------------------------------------------------------------------
public class EmailObfuscator {
    public static String obfuscate(String email) {
      email = email.replace("@", " [at] ");
      email = email.replace(".", " [dot] ");
      return email;    
    }
}
-----------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {

        return email.replace("@", " [at] ").replace(".", " [dot] ");
    }
}
--------------------------------------------------------------------------------
public class EmailObfuscator {
    public static String obfuscate(String email) {
      return email.replace("@", " [at] ").replaceAll("\\.", " [dot] ");
    }
}
------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {
    email=email.replace("@" , " [at] ");
    email=email.replace(".", " [dot] ");
    

        return email;
    }
}
--------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {
      String obfuscated = "";
        for(int i = 0; i < email.length(); i++) {
          if(email.charAt(i) == '.')
            obfuscated += " [dot] ";
          else if(email.charAt(i) == '@')
           obfuscated += " [at] ";
          else
           obfuscated += email.substring (i,i + 1);
        }
        return obfuscated;
    }
}
--------------------------------------------------------------------------------
class EmailObfuscator {
  static String obfuscate(String email) {
    return email.replace("@", " [at] ").replace(".", " [dot] ");
  }
}
-------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {
      if (email == null){
        return email;
      }
      return email.replaceAll("\\.", " [dot] ").replaceAll("@", " [at] ");        
    }
}
---------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {
        return new String(email.replace("@", " [at] ").replace(".", " [dot] "));
    }
}
-------------------------------------------------------------------------------
import java.util.regex.Pattern;

public class EmailObfuscator {
    
    private static final Pattern OBFUSCTION_PATTERN = Pattern.compile("(@)|(\\.)");

    public static String obfuscate(String email) {
        return OBFUSCTION_PATTERN.matcher(email).replaceAll(matching -> switch (matching.group()) {
            case "@" -> " [at] ";
            case "." -> " [dot] ";
            default -> throw new IllegalStateException();
        });
    }
}
--------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {

         if(null == email || "".equals(email.trim())) {
            return "";
        }
        return email.replaceAll("@"," [at] ").replaceAll("\\."," [dot] " );
    }
}
--------------------------------------------------------------------------------
public class EmailObfuscator {
    
    public static String obfuscate(String email) {
        if(email == null || email == "") return null;
        String result = "";
        for(int i = 0; i < email.length(); i++){
          if(email.charAt(i) == '.') result+=" [dot] ";
          else if (email.charAt(i) == '@') result+=" [at] ";
          else result+=email.charAt(i);
        }
        return result;
    }
}
*/