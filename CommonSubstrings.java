/* 7KYU CodeWars Common Substrings

Given 2 strings, your job is to find out if there is a substring 
that appears in both strings. You will return true if you find a 
substring that appears in both strings, or false if you do not. 
We only care about substrings that are longer than one letter long.

#Examples:

*Example 1*
SubstringTest("Something","Fun"); //Returns false

*Example 2*
SubstringTest("Something","Home"); //Returns true
In the above example, example 2 returns true because both of the 
inputs contain the substring "me". (soMEthing and hoME)
In example 1, the method will return false because something and 
fun contain no common substrings. (We do not count the 'n' as a 
substring in this Kata because it is only 1 character long)

#Rules: Lowercase and uppercase letters are the same. So 'A' == 'a'.
We only count substrings that are > 1 in length.

#Input: Two strings with both lower and upper cases. #Output: A 
boolean value determining if there is a common substring between 
the two inputs.

*/
class CommonSubstrings {
  public static boolean SubstringTest(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    for (int i = 1; i < str2.length() - 1; i++) {
      String a = str2.substring(i, i+ 2);
      if (str1.contains(a)) {
        return true;
      }
    }
    return false;
  }
}
/*--------------------------------------------------------------------
class Kata {
  static boolean SubstringTest(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    for (int i = 0; i < str1.length() - 2; i++) {
      if (str2.contains(str1.substring(i, i + 2))) {
        return true;
      }
    }
    return false;
  }
}
----------------------------------------------------------------------
import java.util.regex.Pattern;
class Kata
{
  public static boolean SubstringTest(String str1, String str2)
  {
    boolean result  = false;
    System.out.println(str1 + ","+ str2);
    String pattern = "(\\w{2,})\\w*,\\w*(\\1)";
    Pattern ptr = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
    //try {
    result  = ptr.matcher(str1 + ","+ str2).find();
    System.out.println(" = " + result);
    return result;
  }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;
class Kata
{
  private static String[] createPairs(String s){
    return IntStream
      .range(0,s.length()-1)
      .mapToObj(i->s.substring(i,i+2))
      .sorted((a,b)->a.compareToIgnoreCase(b))
      .toArray(String[]::new);
  }
  public static boolean SubstringTest(String str1, String str2)
  {
    var charPairs1=createPairs(str1);
    var charPairs2=createPairs(str2);
    for(int i1=0,i2=0;i1<charPairs1.length&&i2<charPairs2.length;){
      var cmps=charPairs1[i1].compareToIgnoreCase(charPairs2[i2]);
      if(cmps==0){
        return true;
      }else if(cmps<0){
        ++i1;
      }else
        ++i2;
    }
    return false;
  }
}
----------------------------------------------------------------------
import java.util.*;
import static java.lang.System.*;
class Kata
{
  public static boolean SubstringTest(String str1, String str2)
  {
    Set<String> set1 = sub(str1.toLowerCase());
    Set<String> set2 = sub(str2.toLowerCase());
    set1.retainAll(set2);
    return !(set1.isEmpty());
  }
  
  public static Set<String> sub(String str) {
    
    Set<String> set = new HashSet<String>();
    int s = (str.length());
    for (int i = 0; i < s; i ++) {
      //str = str.substring(i);
      int size = str.length() - i + 1;
      for (int len = 2; len < size; len++) {
        set.add(str.substring(i,i+len));
        //System.out.println(str.substring(i,i+len));
      }
    }
    return set;
  }
}
----------------------------------------------------------------------
public class Kata
{
  
  public static boolean SubstringTest(String ss1, String ss2) {
      String s1 = ss1.toLowerCase(); String s2 = ss2.toLowerCase();
      int start = 0; int mx = 0;
      for (int i = 0; i < s1.length(); i++) {
          for (int j = 0; j < s2.length(); j++) {
              int x = 0;
              while (s1.charAt(i + x) == s2.charAt(j + x)) {
                  x++;
                  if (((i + x) >= s1.length()) || ((j + x) >= s2.length())) break;
              }
              if (x > mx) {
                  mx = x;
                  start = i;
              }
           }
      }
      //return s1.substring(start, (start + mx));
      String res = s1.substring(start, (start + mx));
      if (res.length() > 1) return true;
      return false;
  }
  
}
----------------------------------------------------------------------
class Kata {
    public static boolean SubstringTest(String str1, String str2) {
        for (int i = 0; i < str1.length() - 1; i++) {
            String sub = str1.toLowerCase().substring(i, i + 2);
            if(str2.toLowerCase().contains(sub)) {
                return true;
            }
        }
        return false;
    }
}
----------------------------------------------------------------------
import static java.util.stream.IntStream.range;
import static java.util.stream.Collectors.joining;
import static java.util.regex.Pattern.*;
class Kata
{
  public static boolean SubstringTest(String str1, String str2)
  {
    return (1<str1.length()&&1<str2.length()) 
      && compile(
          range(0,str1.length()-1)
            .mapToObj(i->str1.substring(i,i+2))
            .collect(joining("|"))
           ,CASE_INSENSITIVE
        ).matcher(str2).find();
  }
}
*/