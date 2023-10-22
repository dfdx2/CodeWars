/* 7KYU CodeWars Simple String Reversal II

In this Kata, you will be given a string and two indexes (a and b). 
Your task is to reverse the portion of that string between those two 
indices inclusive.

solve("codewars",1,5) = "cawedors" -- elements at index 1 to 5 inclusive 
are "odewa". So we reverse them.

solve("cODEWArs", 1,5) = "cAWEDOrs" -- to help visualize.

Input will be lowercase and uppercase letters only.

The first index a will always be lower that than the string length; the 
second index b can be greater than the string length. More examples in 
the test cases. Good luck!

Please also try:

Simple time difference

Simple remove duplicates

*/

class Solution{
    public static String solve(String s, int a, int b){
      StringBuilder sb = new StringBuilder();
      int x = 0;
      if (b > s.length() - 1) {
        x = s.length() - 1;
      }
      else {
        x = b;
      }
      String y = s.substring(a, x + 1);
      sb.append(y).reverse();
      String q = s.substring(0, a);
      String r = s.substring(x + 1, s.length());
      return q + sb.toString() + r;
    }
}
/*-----------------------------------------------------------------------------
class Solution{
    public static String solve(String s, int a, int b){
        if(b+1>s.length()) b=s.length()-1;
    return s.substring(0,a)+ new StringBuilder(s.substring(a,b+1))
      .reverse().toString()+s.substring(b+1);
    }
}
-------------------------------------------------------------------------------
interface Solution {
  static String solve(String s, int a, int b) {
    return s.substring(0, a) + new StringBuilder(s.substring(a, b = Math.min(b + 1, s.length()))).reverse() + s.substring(b);
  }
}
--------------------------------------------------------------------------------
class Solution{
    public static String solve(String s, int a, int b){
        b = Math.min(b, s.length()-1);
        return new StringBuilder(s.substring(a, b+1))
                                .reverse()
                                .insert(0, s.substring(0, a))
                                .append(s.substring(b+1))
                                .toString();
    }
}
------------------------------------------------------------------------------
class Solution{
    public static String solve(String s, int a, int b){
        //..
       StringBuilder outputBuilder = new StringBuilder(s);
       if(b >= outputBuilder.length()) {
          b = outputBuilder.length() - 1;
       }
       char[] reversChars = outputBuilder.substring(a, b + 1).toCharArray();
       String reversWord = "";
       for(int i = reversChars.length - 1; i >= 0; i--) {
         reversWord += reversChars[i];
       }
       outputBuilder.delete(a, b + 1);
       return outputBuilder.insert(a, reversWord).toString();
    }
}
------------------------------------------------------------------------------
class Solution{
    public static String solve(String s, int a, int b){
        String partOfString = s.substring(a, b > s.length() ? s.length() : b + 1);
        StringBuilder sb = new StringBuilder(partOfString);
        return s.replace(partOfString, sb.reverse());
        
    }
}
-----------------------------------------------------------------------------
class Solution{
    public static String solve(String s, int a, int b){
        if(b > s.length() - 1) b = s.length() - 1;
        StringBuilder rev = new StringBuilder(s.substring(a, b+1));
        rev = rev.reverse();
        return s.substring(0, a) + rev.toString() + s.substring(b+1, s.length());
    }
}



*/