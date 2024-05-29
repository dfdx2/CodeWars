/* 7KYU CodeWars Zebulan's Nightmare

Zebulan has worked hard to write all his python 
code in strict compliance to PEP8 rules. In this 
kata, you are a mischievous hacker that has set 
out to sabotage all his good code.

Your job is to take PEP8 compatible function names 
and convert them to camelCase. For example:

zebulansNightmare('camel_case') == 'camelCase'
zebulansNightmare('zebulans_nightmare') == 'zebulansNightmare'
zebulansNightmare('get_string') == 'getString'
zebulansNightmare('convert_to_uppercase') == 'convertToUppercase'
zebulansNightmare('main') == 'main'

*/

public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String y = functionName;
    String a = "";
    String b = "";
    String c = "";
    String[] x = y.split("_");
    StringBuilder sb = new StringBuilder();
    String z = x[0];
    sb.append(z);
    if (x.length <= 1) {
      return z;
    }
    for (int i = 1; i < x.length; i++) {
      a = x[i];
      char ch = Character.toUpperCase(a.charAt(0));
      b = a.substring(1, a.length());
      c += ch + b;
      sb.append(c);
      a = "";
      b = "";
      c = "";
    }
    return sb.toString();
  }
}
/*-----------------------------------------------------------------------
public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String[] words = functionName.split("_");
    StringBuilder builder = new StringBuilder();
    builder.append(words[0]);
    for (int i = 1; i < words.length; i++){
      builder.append(String.valueOf(words[i].charAt(0)).toUpperCase());
      builder.append(words[i].substring(1));
    }
    return builder.toString();
  }
}
-------------------------------------------------------------------------
public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String[] s = functionName.split("_");
    String ans = s[0];
    for (int i = 1; i < s.length; i++) ans += s[i].substring(0,1).toUpperCase() + s[i].substring(1);
    return ans;
  }
}
-------------------------------------------------------------------------
public class ZebulansNightmare{
    public static String zebulansNightmare(String name) {
        char[] chars = name.toCharArray();
        for (int i = 1; i < chars.length; i += 1) {
            if (chars[i - 1] == '_') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars).replaceAll("_", "");
    }
}
-------------------------------------------------------------------------
class ZebulansNightmare {
  static String zebulansNightmare(String functionName) {
    String[] words = functionName.split("_");
    for (int i = 1; i < words.length; i++) {
      words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
    }
    return String.join("", words);
  }
}
-------------------------------------------------------------------------
public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    char[] charArray = functionName.toCharArray();
      
      for(int i = 0; i < charArray.length; i++){
         if(charArray[i] == '_'){
            if(i < charArray.length){
               charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
         }
      }
      String newString = new String(charArray);
      return newString.replaceAll("_", "");
  }
}
-------------------------------------------------------------------------
public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
       return functionName.contains("_") ? zebulansNightmare(functionName
               .replaceFirst("_(.)", String.valueOf(functionName.charAt(functionName.indexOf("_") + 1)).toUpperCase())) : functionName;
   }
}
-------------------------------------------------------------------------
import java.util.Arrays;

public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String[] words = functionName.split("_");
    
    for(int i=0; i<words.length;i++){
      words[i]= i==0 ? words[i].toLowerCase() : words[i].substring(0,1).toUpperCase()+words[i].substring(1);
    }
    
    return String.join("", words);
    
  }
}
------------------------------------------------------------------------
import java.util.regex.Pattern;
public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String result = Pattern.compile("_([a-z])").matcher(functionName).replaceAll(m -> m.group(1).toUpperCase());
    return result;
  }
}
*/