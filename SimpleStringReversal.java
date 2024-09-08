/* 7KYU CodeWars Simple String Reversal

In this Kata, we are going to reverse a string while 
maintaining the spaces (if any) in their original place.

For example:

solve("our code") = "edo cruo"

-- Normal reversal without spaces is "edocruo". 

-- However, there is a space at index 3, so the string becomes "edo cruo"

solve("your code rocks") = "skco redo cruoy". 

solve("codewars") = "srawedoc"

More examples in the test cases. All input will be lower case 
letters and in some cases spaces.

Good luck!

*/

import static java.util.stream.IntStream.range;
class SimpleStringReversal {
    public static String solve(String s){  
      StringBuilder sb = new StringBuilder(s.replace(" ", "")).reverse();
      range(0, s.length()).filter(i -> s.charAt(i) == ' ').forEach(i -> sb.insert(i, ' '));
      return sb.toString();
     }
}
/*--------------------------------------------------------------------------------
import java.util.stream.IntStream;
class Solution{
    public static String solve(String s){
        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }
}
----------------------------------------------------------------------------------
class Solution{
    public static String solve(String s){  
      String reversed = ""; //string to return
      String noSpace = s.replaceAll(" ", ""); //removes all whitespace 
      int noSpaceCount = noSpace.length()-1; //remembers index of which character to use
      
      for(int i = 0;i<s.length();i++){ //for each character in s
        
        if(s.charAt(i)==' '){ //if it's a space, add a space
          reversed +=" ";
          
        }else{ //if not, then add one of characters from the end of the string
          reversed += String.valueOf(noSpace.charAt(noSpaceCount));
          noSpaceCount --;//decrements to next character to add
        }
        
      }
      
      return reversed;
      
    }
}
----------------------------------------------------------------------------------
class Solution{
    public static String solve(String s){  
      String chars = s.replaceAll(" ", "");
      int backward = chars.length()-1;
      String res = "";
      
      for(int i = 0;i<s.length(); i++){
        if(s.charAt(i) == ' '){
          res += " ";
        }else{
          res += chars.charAt(backward);
          backward--;
        }
      }
      
      return res;
     }
}
-----------------------------------------------------------------------------------
mport java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution{
    public static String solve(final String s){
        List<Integer> spaces = IntStream.range(0, s.length()).filter(n -> s.charAt(n) == ' ')
                               .boxed().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder(s.replace(" ","")).reverse();
        int n = 0;
        for (int i : spaces)
          sb.insert(i, ' ');
        return sb.toString();
    }
              
}
----------------------------------------------------------------------------------
class Solution{
    public static String solve(String s) {
        String reversed = new StringBuilder(s).reverse().toString().replace(" ","");
        int counter = 0;

        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                builder.append(ch);
            } else {
                builder.append(reversed.toCharArray()[counter]);
                counter++;
            }
        }

        return builder.toString();
    }
}
-----------------------------------------------------------------------------------
class Solution{
    public static String solve(String s){ 
       char c [] = s.toCharArray();
       for(int i=0,j=c.length-1; i<j;){  
          if(c[i]==' ')i++; 
          else if (c[j]==' ')j--; 
          else{  
             char ch=c[i]; 
             c[i++]=c[j]; 
             c[j--]=ch;
          }
       }
      return new String(c);
      }
}
-----------------------------------------------------------------------------------
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{
    public static String solve(String s) {
        String reversedStr = new StringBuilder(s.replace(" ", "")).reverse().toString();
        AtomicInteger index = new AtomicInteger(0);
        return Pattern.compile("[a-z]").matcher(s)
            .replaceAll(r -> String.valueOf(reversedStr.charAt(index.getAndIncrement())));
    }
}
*/