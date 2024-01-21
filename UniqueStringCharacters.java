/* 7KYU CodeWars Unique String Characters

In this Kata, you will be given two strings a and b and your task 
will be to return the characters that are not common in the two strings.

For example:

solve("xyab","xzca") = "ybzc" 
--The first string has 'yb' which is not in the second string. 
--The second string has 'zc' which is not in the first string. 
Notice also that you return the characters from the first string 
concatenated with those from the second string.

More examples in the tests cases.

Good luck!

*/

import java.util.*;
class Solution{
    public static String solve(String a, String b){
      a = a.toLowerCase();
      b = b.toLowerCase();
      Map<Character, Integer> map1 = new HashMap<>();
      Map<Character, Integer> map2 = new HashMap<>();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < a.length(); i++) {
        if (!map1.containsKey(a.charAt(i))) {
          map1.put(a.charAt(i), 1);
        }
        else {
          int total = map1.get(a.charAt(i));
          map1.put(a.charAt(i), total + 1);
        }
      }
      
      for (int i = 0; i < b.length(); i++) {
        if (!map2.containsKey(b.charAt(i))) {
          map2.put(b.charAt(i), 1);
        }
        else {
          int total = map2.get(b.charAt(i));
          map2.put(b.charAt(i), total + 1);
        }
      }
      
      for (int i = 0; i < a.length(); i++) {
        if (!map2.containsKey(a.charAt(i))) {
          sb.append(a.charAt(i));
        }
      }
      for (int i = 0; i < b.length(); i++) {
        if (!map1.containsKey(b.charAt(i))) {
          sb.append(b.charAt(i));
        }
      }
      
      return sb.toString();
    }
}
/*---------------------------------------------------------------------
class Solution{
  
    public static String solve(String a, String b){
      StringBuilder sb = new StringBuilder();
      
      for (String s : (a+b).split(""))
        if (a.contains(s) ^ b.contains(s))
          sb.append(s);
      
      return sb.toString();
    }
}
-----------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static String solve(String a, String b) {
    return of((a + b).split("")).filter(c -> a.contains(c) ^ b.contains(c)).collect(joining());
  }
}
-----------------------------------------------------------------------
class Solution{
    public static String solve(String a, String b){
        String st = "";
        for (char ch : (a + b).toCharArray())
            if (a.indexOf(ch) == -1 || b.indexOf(ch) == -1) 
                st += ch;
        return st;
    }
}
-----------------------------------------------------------------------
import java.util.*;
class Solution{
   public static String solve(String a, String b) {
		return String.join("", Arrays.asList((a + b).split("")).stream().filter(x -> a.contains(x) ^ b.contains(x))
				.toArray(String[]::new));
	}
}
-----------------------------------------------------------------------
class Solution{
    public static String solve(String a, String b){
        return a.concat(b).chars()
            .filter(c -> !a.contains(Character.toString(c)) || !b.contains(Character.toString(c)))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }
}
-----------------------------------------------------------------------
class Solution{
  public static String solve(String a, String b){
    var result = "";
    for (var x : a.split("")){
      if (a.contains(x) && !b.contains(x)){
        result += x;
      }
    }
    for (var x : b.split("")){
      if (b.contains(x) && !a.contains(x)){
        result += x;
      }
    }
    return result;
  }
}
-----------------------------------------------------------------------
class Solution{
  public static String solve(String a, String b){
    String[] arr = a.split("");
    String[] barr = b.split("");
    String result1 = a;
    String result2 = b;
    for (String i: arr){
      result2 = result2.replaceAll(i, "");
    }
    for (String i: barr){
      result1 = result1.replaceAll(i, "");
    }
    return result1 + result2;
  }
}
-----------------------------------------------------------------------
import java.util.HashSet; 
class Solution{
    public static String solve(String a, String b){
     
      HashSet<Character> set = new HashSet<>();
      HashSet<Character> set2 = new HashSet<>();
      
      String res = "";
      for(char chars : b.toCharArray()){ // O(n)
        set.add(chars); 
      }
      
      for(char c : a.toCharArray()){
        if(!set.contains(c))
          res+= c; 
      }
      
      for(char t : a.toCharArray()) { 
        set2.add(t); 
      }
     
      for(char v : b.toCharArray()) {
        if(!set2.contains(v))
          res+=v;
      }

      return res;
    }
}

*/
