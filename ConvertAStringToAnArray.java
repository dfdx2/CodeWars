/* 8KYU CodeWars Convert A String To An Array

Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):

"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

*/

public class Solution {

    public static String[] stringToArray(String s) {
      //your code;
      String[] x = s.split(" ");
      return x;
    }
}
/*---------------------------------------------------------------------
public class Solution {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
-----------------------------------------------------------------------
public class Solution {

    public static String[] stringToArray(String s) {
      String str[]=s.split(" ");
      return str;
    }

}
----------------------------------------------------------------------
import java.util.ArrayList;

class Solution {

    public static String[] stringToArray(String s) {
        String temp = "";
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == ' ' || i == s.length() - 1){
                if(i == s.length() - 1) temp += s.charAt(i);
                res.add(temp);
                temp = "";
            } else temp += s.charAt(i);
        }
        String[] result = new String[res.size()];
        for(int i = 0; i < res.size(); ++i) result[i] = res.get(i);
        return result;
    }
}



*/