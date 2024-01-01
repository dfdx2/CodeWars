/* 6KYU CodeWars CamelCase Method

Write a method (or function, depending on the language) that 
converts a string to camelCase, that is, all words must have 
their first letter capitalized and spaces must be removed.

Examples (input --> output):
"hello case" --> "HelloCase"
"camel case word" --> "CamelCaseWord"
Don't forget to rate this kata! Thanks :)

*/

public class Solution {

    public static String camelCase(String str) {
      StringBuilder sb = new StringBuilder();
      if (str.length() < 1) {
        return str;
      }  
      String[] x = str.split(" ");
      for (String y : x) {
        if (y.length() < 1) {
          continue;
        }
        char c = y.charAt(0);
        c = Character.toUpperCase(c);
        sb.append(c);
        y = y.substring(1, y.length());
        sb.append(y);
      }
      String cheese = sb.toString();
      System.out.println(cheese);
      return sb.toString();
    }
}
/*---------------------------------------------------------------------
public class Solution {
    public static String camelCase(String str) {
        // your code here
        String[] strings = str.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String string : strings) {
            if (string.length()>0){
                stringBuilder.append(string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
            }

        }
        return new String(stringBuilder);

    }
}
-----------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static String camelCase(String str) {
        return (str == null || str.isEmpty())?"":Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1,s.length()))
                .collect(Collectors.joining());
    }

}
-------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

import java.util.Arrays;

public class Solution {

    /** @return upper camel case formatted string 
    public static String camelCase(final String string) {

        return Arrays.stream(string.split("\\s+"))
                .filter(s -> !s.isEmpty())
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .collect(joining());
    }
}
-----------------------------------------------------------------------
import java.lang.Object;
import org.apache.commons.lang3.text.WordUtils;

public class Solution {
    public static String camelCase(String str) {
        str = WordUtils.capitalize(str);
        str = str.replaceAll(" ","");
        return str;
    }

}
----------------------------------------------------------------------
import org.apache.commons.lang3.text.WordUtils;

public class Solution {

    public static String camelCase(String str) {
		  String result = "";	
		  for(String s : str.trim().split(" ")){
			  result += WordUtils.capitalize(s);
		  }
		  return result;    
    }

}
-------------------------------------------------------------------------
import org.apache.commons.lang3.text.WordUtils;

public class Solution {

    public static String camelCase(String str) {
        return WordUtils.capitalize(str).replace(" ","");
    }

}
-------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static String camelCase(String str) {
        return str == null || str.isEmpty() ? "" : Arrays.asList(str.split(" ")).stream()
          .map(str1 -> str1.trim().length() > 0 ? str1.substring(0, 1).toUpperCase() + str1.substring(1, str1.length()).toLowerCase() : "")
          .collect(Collectors.joining(""));
    }

}
*/