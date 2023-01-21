/*  8KYU CodeWars  Reversed Words

Complete the solution so that it reverses all of the words 
within the string passed in.

Words are separated by exactly one space and there are no 
leading or trailing spaces.

Example(Input --> Output):

"The greatest victory is that which requires no battle" --> 
"battle no requires which that is victory greatest The"

*/

public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
   String[] x = str.split("\\s");
   String backwards = "";
   for (int i = 0; i < x.length; i++) {
     if (i == x.length - 1) {
       backwards = x[i] + backwards;
     }
     else {
       backwards = " " + x[i] + backwards;
     }
   }
   return backwards;
 }
}

/*----------------------------------------------------------

import java.util.*;

public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
     List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
 }
}
--------------------------------------------------------------
import java.util.*;

public class ReverseWords {

  public static String reverseWords(String str) {
    List<String> words = Arrays.asList(str.split(" "));
    Collections.reverse(words);
    return String.join(" ", words);
  }
}
--------------------------------------------------------------
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
---------------------------------------------------------------
import java.util.Arrays;

public class ReverseWords{
 public static String reverseWords(String str){
     return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).get();
 }
}
----------------------------------------------------------------
import org.apache.commons.lang3.StringUtils;

public class ReverseWords{

 public static String reverseWords(String str){
   return StringUtils.reverseDelimited(str, ' '); // Use StringUtils to revers based on space character
 }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

  private static final String WORD_SEPARATOR = " ";

  public static String reverseWords(String sentence){
    List<String> words = Arrays.asList(sentence.split(WORD_SEPARATOR));
    Collections.reverse(words);
    return String.join(WORD_SEPARATOR, words);
  }
}





*/