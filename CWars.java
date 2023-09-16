/* 7KYU CodeWars C.CodeWars

A person's full name is usually composed of a first name, middle name 
and last name; however in some cultures (for example in South India) 
there may be more than one middle name.

Write a function that takes the full name of a person, and returns the 
initials, separated by dots ('.'). The initials must be uppercase. The 
last name of the person must appear in full, with its first letter in 
uppercase as well.

See the pattern below:

"code wars"            ---> "C.Wars"
"Barack hussein obama" ---> "B.H.Obama"
Names in the full name are separated by exactly one space (' ' ) ; 
without leading or trailing spaces. Names will always be lowercase, 
except optionally their first letter.


*/

import java.lang.*;

class CWars {

    public static String initials(String name){
      StringBuilder sb = new StringBuilder();
      String[] result = name.split(" ");
      for (int i = 0; i < result.length; i++) {
        String y = result[i];
        if (i == result.length - 1) {
          char cy = y.charAt(0);
          int z = y.length();
          sb.append(Character.toUpperCase(cy));
          sb.append(y.substring(1,z));
        }
        else {
          char ch = y.charAt(0);
          sb.append(Character.toUpperCase(ch));
          sb.append(".");
        }
      }
      return sb.toString();
    }
}
/*-----------------------------------------------------------------------------
import java.lang.*;

class CWars {

    public static String initials(String name){ 
        String result = "";
        String parts[] = name.toUpperCase().split(" ");
        for (int i = 1; i < parts.length; i++) {
          result += parts[i-1].charAt(0)+".";
        }
        return result + parts[parts.length-1].charAt(0) + parts[parts.length-1].substring(1).toLowerCase();
    }

}
------------------------------------------------------------------------------
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class CWars {
  static String initials(String name) {
    return stream(name.split(" ")).map(s -> s.substring(0, 1).toUpperCase()).collect(joining("."))
        + name.substring(name.lastIndexOf(' ') + 2);
  }
}
-----------------------------------------------------------------------------
import java.lang.*;

class CWars {

    public static String initials(String name) {
      String otherName = name.replaceAll("([^\\s])[^\\s]+", "$1").toUpperCase();
      String lastName = name.replaceAll("[\\w\\s]+[\\s][\\w]([\\w]+$)", "$1");
      String fullName = otherName + lastName;
      return fullName.replaceAll(" ", ".");
    }
}
---------------------------------------------------------------------------
import java.lang.*;

class CWars {

    public static String initials(String name){ 
        String f [] = name.split(" "); 
        for (int i = 0 ; i < f.length; i ++) {
          if (i <f.length-1) f[i] = Character.toUpperCase(f[i].charAt(0))+"";  
           else f[i] = Character.toUpperCase(f[i].charAt(0))+ f[i].substring(1 , f[i].length()); 
          }
      return String.join("." , f); 
      }
  }
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;
class CWars {
    public static String initials(String name){ 
        String[] arr = name.split(" ");
        return Arrays.stream(arr)
                .limit(arr.length - 1)
                .map(x -> Character.toUpperCase(x.charAt(0)) + ".")
                .collect(Collectors.joining())
         + Character.toUpperCase(arr[arr.length - 1].charAt(0)) + arr[arr.length - 1].substring(1);
    }
}
------------------------------------------------------------------------------
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class CWars {
    public static String initials(String name){ 
        String[] endName=name.split(" ");
        return IntStream.
        range(0,endName.length-1)
        .mapToObj(c-> endName[c].substring(0,1).toUpperCase()+".")
        .collect(Collectors.joining())
        +endName[endName.length-1].substring(0,1).toUpperCase()
        +endName[endName.length-1].substring(1).toLowerCase();    
    }

}
------------------------------------------------------------------------------
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CWars {

    public static String initials(String name){ 
        
        Pattern p = Pattern.compile("((\\w)\\w+\\s+)");
        Matcher m = p.matcher(name);
        StringBuffer buffer = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(buffer, m.group(2).toUpperCase() + ".");
        }
        p = Pattern.compile(".*?\\b((\\w)(\\w+))$");
        m = p.matcher(name);
        while (m.find()) {
            m.appendReplacement(buffer, m.group(2).toUpperCase() + m.group(3));
        }
        return buffer.toString();
    }

}

*/