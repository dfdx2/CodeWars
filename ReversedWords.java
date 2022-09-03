/* 8KYU CodeWars  Reversed Words

Complete the solution so that it reverses all of the words 
within the string passed in.

Example(Input --> Output):

"The greatest victory is that which requires no battle" --> 
"battle no requires which that is victory greatest The"

*/

import java.util.regex.Pattern;
public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
   Pattern pattern = Pattern.compile("\\s");
   String[] temp = pattern.split(str);
   String result = "";
   for (int i = 0; i < temp.length; i++) {
     if (i == temp.length - 1) {
       result = temp[i] + result;
     }
     else {
       result = " " + temp[i] + result;
     }
   }
   return result;
 }
}
/*----------------------------------------------------------------- 
import java.util.*;

public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
     List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
 }
}
---------------------------------------------------------------------

import java.util.*;

public class ReverseWords {

  public static String reverseWords(String str) {
    List<String> words = Arrays.asList(str.split(" "));
    Collections.reverse(words);
    return String.join(" ", words);
  }
}
---------------------------------------------------------------------

public class ReverseWords{

 public static String reverseWords(String str){
     String[] str2 = str.split(" ");
     String fin = "";
     for(int i=str2.length-1;i>=0;i--){
       fin += str2[i];
       if(i>0)fin+=" ";
     }
     return fin;
 }
}
----------------------------------------------------------------------

import java.util.Arrays;

public class ReverseWords{
 public static String reverseWords(String str){
     return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).get();
 }
}
-----------------------------------------------------------------------

public class ReverseWords{

 public static String reverseWords(String str){
     String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1; i >=0; i--) {
            sb.append(s[i] + " ");
        }
        return sb.toString().trim();
    }
 }
 --------------------------------------------------------------------------
 
*/