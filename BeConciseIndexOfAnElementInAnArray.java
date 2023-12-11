/* 8KYU CodeWars Be Concise IV - Index Of An Element In An Array

Task
Provided is a function Kata which accepts two parameters in the 
following order: array, element and returns the index of the 
element if found and "Not found" otherwise. Your task is to 
shorten the code as much as possible in order to meet the 
strict character count requirements of the Kata. (no more than 161) 
You may assume that all array elements are unique.

*/
public class Solution{public static String kata(String[]a,String x){int i=0;while(i<a.length){if(x == a[i]){return String.valueOf(i);}i++;}return"Not found";}}

/*--------------------------------------------------------------------------------
class Solution {
  static String kata(String[] a, String s) {
    int i = java.util.List.of(a).indexOf(s);
    return i < 0 ? "Not found" : i + "";
  }
}
---------------------------------------------------------------------------------
class Solution{static String kata(String[] a, String s) {
Integer i = java.util.Arrays.asList(a).indexOf(s);
return i == -1?"Not found":i.toString();
}}
---------------------------------------------------------------------------------
public class Solution{public static String kata(String[] a,String s){for(int i=0;i<a.length;i++){if(s.equals(a[i])){return i+"";}}return "Not found";}}
---------------------------------------------------------------------------------
public class Solution{
public static String kata(String[]a,String s) {
var r="Not found";for(int i=0;i<a.length;i++){if(a[i]==s)r=String.valueOf(i);}return r;}}
----------------------------------------------------------------------------------
class Solution {
  static String kata(String[] a, String s) {
    int i = java.util.Arrays.asList(a).indexOf(s);
    return i < 0 ? "Not found" : i + "";
  }
}
----------------------------------------------------------------------------------
import java.util.Arrays;
public class Solution{public static String kata(String[] a, String s) {int r=Arrays.asList(a).indexOf(s);return r<0?"Not found":""+r;}}
----------------------------------------------------------------------------------
public class Solution{
  
  public static String kata(String[] a, String e) {
	  int i=-1;for(String s:a)if(s.equals(e))return ++i+"";return "Not found";
	}
  
}
----------------------------------------------------------------------------------
public class Solution{
    public static String kata(String[]a,String s){int i=java.util.List.of(a).indexOf(s);
        return i>=0?i+"":"Not found";
  }
  }
----------------------------------------------------------------------------------
public class Solution{public static String kata(String[] a, String s) {
int i = java.util.Arrays.asList(a).indexOf(s);
return i == -1 ? "Not found" : i + "";
}}
*/