/* 7KYU CodeWars Alternate Capitalization

Given a string, capitalize the letters that occupy even indexes and 
odd indexes separately, and return as shown below. Index 0 will be 
considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases 
for more examples.

The input will be a lowercase string with no spaces.

Good luck!

If you like this Kata, please try:

Indexed capitalization

Even-odd disparity

*/

class Solution{
    public static String[] capitalize(String s){
      String[] result = new String[2];
      String x = "";
      String y = "";
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
          x += Character.toUpperCase(s.charAt(i));
        }
        else {
          x += s.charAt(i);
        }
      }
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 != 0) {
          y += Character.toUpperCase(s.charAt(i));
        }
        else {
          y += s.charAt(i);
        }
      }
      result[0] = x;
      result[1] = y;
      return result;
    }
}
/*----------------------------------------------------------------------------
class Solution{
    public static String[] capitalize(String s){
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                o += u.charAt(i);
                t += s.charAt(i);
            }else{
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }
}
-------------------------------------------------------------------------
import java.util.stream.IntStream;

class Solution{
    public static String[] capitalize(String s){
        StringBuilder sb1 = new StringBuilder(s),
                      sb2 = new StringBuilder(s.toUpperCase());
        IntStream.range(0, s.length())
                 .filter(  i -> (i&1)==0 )
                 .forEach( i -> { sb1.setCharAt(i, sb2.charAt(i));
                                  sb2.setCharAt(i, s.charAt(i)); });
        return new String[] {sb1.toString(), sb2.toString()};
    }
}
---------------------------------------------------------------------------
class Solution{
    public static String[] capitalize(String s){
    
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            String letter = s.substring(i, i+1);

            if (i % 2 == 1) {
                // Even
                builder1.append(letter.toUpperCase());
                builder2.append(letter);
            } else {
                // Odd
                builder1.append(letter);
                builder2.append(letter.toUpperCase());
            }
        }
        return new String[] { builder2.toString(), builder1.toString()};
    }
}
--------------------------------------------------------------------------
class Solution{
    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        String[] result = new String[2];
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++){
         
           if (i%2 == 0){
             sb1.append(s.toUpperCase().charAt(i));
             sb2.append(s.toLowerCase().charAt(i));
           } else {
             sb1.append(s.toLowerCase().charAt(i));
             sb2.append(s.toUpperCase().charAt(i));
           }
        }
        result[0] = sb1.toString();
        result[1] = sb2.toString();
        return result;
    }
}
--------------------------------------------------------------------------
class Solution{
    public static String[] capitalize(String s){
       StringBuilder sb = new StringBuilder(s);
       StringBuilder sb2 = new StringBuilder(s);
       for(int i = 0; i<sb.length(); i+=2) sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
       for(int i = 1; i<sb2.length(); i+=2) sb2.setCharAt(i, Character.toUpperCase(sb2.charAt(i)));
       return new String[]{sb.toString(), sb2.toString()};
    }
}
----------------------------------------------------------------------------
class Solution{
    public static String[] capitalize(String s){
          String ret = "" ;
          String ret2 = "" ;
          Integer i = 0 ;
          while (i < s.length()) {
            ret += s.substring(i,i+1).toUpperCase();
            ret2 += s.substring(i,i+1).toLowerCase();
            if (i < s.length()-1) {ret += s.substring(i+1,i+2).toLowerCase() ;}
            if (i < s.length()-1) {ret2 += s.substring(i+1,i+2).toUpperCase() ;}
            i += 2;
          }
          String[] arr = {ret, ret2};
          return arr;
    }
}
-------------------------------------------------------------------------
class Solution {
  static String[] capitalize(String s) {
    var r = new String[] {"", ""};
    for (int i = 0; i < s.length(); i++) {
      r[i & 1] += (char) (s.charAt(i) - 32);
      r[i & 1 ^ 1] += s.charAt(i);
    }
    return r;
  }
}

*/