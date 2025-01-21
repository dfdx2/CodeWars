/* 5KYU CodeWars ROT13

How can you tell an extrovert from an introvert at NSA?
Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.

I found this joke on USENET, but the punchline is scrambled. Maybe you can decipher it?
According to Wikipedia, ROT13 is frequently used to obfuscate jokes on USENET.

For this task you're only supposed to substitute characters. Not spaces, punctuation, numbers, etc.

Test examples:

"EBG13 rknzcyr." -> "ROT13 example."

"This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"


*/
class ROT13 {
  
   public static String rot13(String message) {
     String map = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_-+=:;<>?,./äöü";
     String mal = " NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm1234567890!@#$%^&*()_-+=:;<>?,./äöü";
     StringBuilder sb = new StringBuilder();
     for (char ch : message.toCharArray()) {
       int j = map.indexOf(ch);
       sb.append(mal.charAt(j));
     }
     return sb.toString();
   }
}
/*-------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

interface Solution {
  static String rot13(String message) {
    return message.chars().mapToObj(c -> "" + (char) c)
        .map(c -> "" + (char) (c.charAt(0) + (c.matches("(?i)[A-M]") ? 13 : c.matches("(?i)[N-Z]") ? -13 : 0)))
        .collect(joining());
  }
}
---------------------------------------------------------------------------
interface Solution {
  static String rot13(String message) {
    var in = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    var out = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
    var encoded = new StringBuilder();
    for (char c : message.toCharArray()) {
      int i = in.indexOf(c);
      if (i >= 0) {
        c = out.charAt(i);
      }
      encoded.append(c);
    }
    return encoded.toString();
  }
}
---------------------------------------------------------------------------
class Solution {
    public static char convert(char a){
    
		int x = a;
		if(x>=97 && x<=122){
		  x = x<=109 ? x+13 : x-13 ;
		}
		else if(x>=65 && x<=90){
		  x = x<=77? x+13 : x-13;
		}
		return (char) x;
  }
	
   public static String rot13(String message) {
     StringBuilder str = new StringBuilder();
     for(char x : message.toCharArray()){
       str.append(convert(x));
     }
     return str.toString();
   }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
  private static final Map<String, String> CHAR_MAPPING = new HashMap<>();

    static {
        IntStream.rangeClosed('A', 'M').forEach(key -> CHAR_MAPPING.put(String.valueOf((char) key), String.valueOf((char) (key + 13))));
        IntStream.rangeClosed('N', 'Z').forEach(key -> CHAR_MAPPING.put(String.valueOf((char) key), String.valueOf((char) (key - 13))));
        IntStream.rangeClosed('a', 'm').forEach(key -> CHAR_MAPPING.put(String.valueOf((char) key), String.valueOf((char) (key + 13))));
        IntStream.rangeClosed('n', 'z').forEach(key -> CHAR_MAPPING.put(String.valueOf((char) key), String.valueOf((char) (key - 13))));
    }
  
   public static String rot13(String message) {
      return Arrays.stream(message.split("")).map(key -> CHAR_MAPPING.getOrDefault(key, key)).collect(Collectors.joining());

   }
}
---------------------------------------------------------------------------
class Solution {
  public static String rot13(String message) {
    return message.chars()
        .mapToObj(c -> String.valueOf((char) ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M') ? c + 13 :
                                              (c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z') ? c - 13 : c)))
        .collect(java.util.stream.Collectors.joining());
   }
}
---------------------------------------------------------------------------
class Solution {
  
   public static String rot13(String s) { 
     int index =13 ; 
     char c1 [] = new char [26]; 
     char c2 [] = new char [26]; 
     for (char ch1='A',ch2='a'; ch1<='Z'; ch1++,ch2++){  
        c1[index]=ch1; 
        c2[index]=ch2; 
        index=(index+1)%26;
      }
     char r [] = s.toCharArray(); 
     for (int i=0; i<r.length; i++){  
           if(r[i]>='A'&&r[i]<='Z')r[i]=c1[r[i]-'A'];
           else if (r[i]>='a'&&r[i]<='z') r[i]=c2[r[i]-'a'];
      }
     return new String(r);
     }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.regex.*;
class Solution {
  
   public static String rot13(String message) {
     return Pattern.compile("[a-zA-Z]").matcher(message).replaceAll(m -> {
            char ch = m.group().charAt(0);
            int base = Character.isUpperCase(ch) ? 'A' : 'a';
            ch = (char) ((ch - base + 13) % 26 + base);
            return String.valueOf(ch);
        });
   }
}
----------------------------------------------------------------------------
import java.util.stream.Collector;

class Solution {
   public static String rot13(String message) {
     return message.chars()
       .mapToObj(c -> (char) (c >= 'A' && c <= 'M' || c >= 'a' && c <= 'm' ? c + 13 : 
                               c >= 'N' && c <= 'Z' || c >= 'n' && c <= 'z' ? c - 13 : c))
       .collect(Collector.of(
    StringBuilder::new,
    StringBuilder::append,
    StringBuilder::append)).toString();
   }
}   
*/