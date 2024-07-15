/* 6KYU CodeWars Consecutive Strings

You are given an array(list) strarr of strings and an integer k. 
Your task is to return the first longest string consisting of k 
consecutive strings taken in the array.

Examples:

strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

Concatenate the consecutive strings of strarr by 2, we get:

treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
The first that came is "folingtrashy" so 
longest_consec(strarr, 2) should return "folingtrashy".

In the same way:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", 
"theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array, if n = 0 or k > n or k <= 0 
return "" (return Nothing in Elm, "nothing" in Erlang).

Note

consecutive strings : follow one after another without an interruption

*/
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
class ConsecutiveStrings {
    
    public static String longestConsec(String[] strarr, int k) {
      String result = "";
      for (int i = 0; k > 0 && i <= strarr.length - k; i++) {
        String y = stream(strarr, i, i + k).collect(joining());
        if (y.length() > result.length()) {
          result = y;
        }
      }
      return result;
    }
}
/*-----------------------------------------------------------------
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
-------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }

        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
-------------------------------------------------------------------
class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        
        if(k < 1 || strarr.length < k || strarr.length == 0){
          return "";
        }
        
        int startIndex = 0;
        int max = strarr[0].length();
        int sum = 0;
        
        for(int i = 0; i < strarr.length; i++){
          sum += strarr[i].length();
          
          if(i > k - 1){
            sum -= strarr[i - k].length();
          }
          
          if(sum > max){
            max = sum;
            startIndex = i - k + 1;
          }
        }
        
        String result = "";
        for (int i = startIndex; i < startIndex + k; i++){
          result += strarr[i];
        }
        return result;
    }
}
-------------------------------------------------------------------
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        String longest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder candidate = new StringBuilder();
            for (int j = 0; j < k; j++) {
                candidate.append(strarr[i + j]);
            }
            if (candidate.length() > longest.length()) {
                longest = candidate.toString();
            }
        }
        return longest;
    }
}
-------------------------------------------------------------------
import java.util.stream.*;
class LongestConsec {
  public static String longestConsec(String[] strarr, int k) {
    String maxStr = "";
    for (int i=0; i<=strarr.length-k; i++) {
      String current = IntStream.range(i, i+k).mapToObj(j -> strarr[j]).collect(Collectors.joining());
      if (current.length() > maxStr.length()) maxStr = current;
    }
    return maxStr;
  }
}
-------------------------------------------------------------------
import java.util.Arrays;

class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        String ans = "", test = "";
        if (k > 0) {
            for (int i = 0 ; i < strarr.length+1-k ; i++) {
                test = String.join("", Arrays.copyOfRange(strarr, i, i+k));
                ans = ans.length() < test.length() ? test : ans;
            }
        }
        return ans;    
    }
}
-------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class LongestConsec {

  public static String longestConsec(String[] strArr, int k) {
    return (k > 0 && strArr.length > 0 && k <= strArr.length) ?
      IntStream.rangeClosed(0, strArr.length - k)
        .mapToObj(i -> IntStream.range(0, k).mapToObj(j -> strArr[i + j]).collect(Collectors.joining()))
        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
        .findFirst().get()
      : "";
  }
}
*/