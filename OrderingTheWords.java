/* 7KYU CodeWars Ordering the words!

Description:

Given a string, you need to write a method that order every letter in this 
string in ascending order.

Also, you should validate that the given string is not empty or null. If so, 
the method should return:
"Invalid String!"

Notes

• the given string can be lowercase and uppercase.
• the string could include spaces or other special characters 
like '# ! or ,'. Sort them based on their ASCII codes

Examples

"hello world" => " dehllloorw"
"bobby"       => "bbboy"
""            => "Invalid String!"
"!Hi You!"    => " !!HYiou"

Good luck! Hope you enjoy it

*/

import java.util.Arrays;
public class Ordering {
  public String orderWord(String s){
    //your great code here:
    if (s == null) {
      return "Invalid String!";
    }
    
    char[] x = s.toCharArray();
    if (x.length == 0) {
      return "Invalid String!";
    }
    Arrays.sort(x);
    return String.valueOf(x);
  }
}
/*--------------------------------------------------------------------------
public class Ordering {
  public String orderWord(String s){
    //your great code here:
    if(s==null||"".equals(s))return "Invalid String!";
		char [] a = s.toCharArray();
		java.util.Arrays.sort(a);
		return String.valueOf(a);
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;

public class Ordering {
  public String orderWord(String s){
    //your great code here:
    if("".equals(s)|| null == s)
      return "Invalid String!";
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);         
  }
}
-------------------------------------------------------------------------------
import java.util.stream.Collectors;

public class Ordering {
  public String orderWord(String s) {
    return (s == null || s.length() == 0) ? "Invalid String!" : s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
public class Ordering {
  public String orderWord(String s){
    if (s == null || s.length() == 0) return "Invalid String!";
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    return sorted;
    
  }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class Ordering {
  public String orderWord(String s){
    //check for null and empty strings
    if (s != null && !s.isEmpty()){
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      return new String(chars);
    }
    
    return "Invalid String!";
  }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class Ordering {
  public String orderWord(String s){
        if (s == null || s.isEmpty())
            return "Invalid String!";
    
        String[] letters = s.split("");
        Arrays.sort(letters);
        return String.join("", letters);
  }
}
---------------------------------------------------------------------------------
public class Ordering {
  public String orderWord(final String s) {
    if (s == null || s.isEmpty())
      return "Invalid String!";
    return s.codePoints()
        .sorted()
        .mapToObj(Character::toChars)
        .map(String::new)
        .collect(java.util.stream.Collectors.joining());
  }
}



*/