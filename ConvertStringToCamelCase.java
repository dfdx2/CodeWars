/*  6KYU CodeWars Convert String To Camel Case

Complete the method/function so that it converts dash/underscore 
delimited words into camel casing. The first word within the output 
should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case). 
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"

*/
import java.lang.StringBuilder;
class ConvertStringToCamelCase {
  static String toCamelCase(String s){
    if (s.length() < 1) {
      return s;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '_' || s.charAt(i) == '-') {
        continue;
      }
      else if (s.charAt(i - 1) == '_' || s.charAt(i - 1) == '-') {
        char cd = s.charAt(i);
        cd = Character.toUpperCase(cd);
        sb.append(cd);
      }
      else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}

/*---------------------------------------------------------------------------------
import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    String pattern = "([^a-zA-Z']+)'*\\1*";
    String[] x = s.split(pattern);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < x.length; i++) {
      if (i == 0) {
        sb.append(x[i]);
      }
      else if (x[i].length() > 0) {
        sb.append(x[i].replaceFirst(x[i].substring(0,1), x[i].substring(0,1).toUpperCase()));
      }
    }
    return sb.toString();
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;

class Solution{

  static String toCamelCase(String str){
    String[] words = str.split("[-_]");
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}
--------------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}
-----------------------------------------------------------------------------
import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    String[] words = s.split("[_\\-]");
    s=words[0];
    for(int i=1; i<words.length; i++)
      s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
    return s;
  }
}




*/