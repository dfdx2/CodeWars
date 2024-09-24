/* 7KYU CodeWars Longest Vowel Chain

The vowel substrings in the word codewarriors are o,e,a,io. 
The longest of these has a length of 2. Given a lowercase 
string that has alphabetic characters only (both vowels and 
consonants) and no spaces, return the length of the longest 
vowel substring. Vowels are any of aeiou.

Good luck!

*/
class LongestVowelChain {
    public static int solve(String s){
     s = s.replaceAll("[^aeiou]", " ");
      String[] a = s.split(" ");
      int result = 0;
      for (int i = 0; i < a.length; i++) {
        String b = a[i];
        if (b.length() > result) {
          result = b.length();
        }
      }
      return result;
  }
}
/*----------------------------------------------------------------
import java.util.Arrays;
class Solution{
    public static int solve(String s){
     return Arrays.stream(s.split("[^aeiou]")).mapToInt(i -> i.length()).max().getAsInt();
  }
}
------------------------------------------------------------------
import static java.util.stream.Stream.of;

interface Solution {
  static int solve(String s) {
    return of(s.split("[^aeiou]")).mapToInt(String::length).max().orElse(0);
  }
}
------------------------------------------------------------------
import java.util.ArrayList;

class Solution{
    public static int solve(String s){
        var vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        var arr = s.toCharArray();
        int max = 0;
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (vowels.contains(arr[i])){
                counter++;
            }else{
                if (counter>max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter>max){
                    max = counter;
                }
        return max;
  }
}
------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static int solve(String s){
     return Arrays.stream(s.split("[^aeiou]+")).mapToInt(String::length).max().getAsInt();
  }
}
------------------------------------------------------------------
class Solution{
    public static int solve(String s){
     //..
     String[] vowelsTable = s.split("[bcdfghjklmnpqrstvwxyz]");
     int longuestVowelSubString = 0;
     for (String mySubString: vowelsTable){
       if (mySubString.length()>longuestVowelSubString){
         longuestVowelSubString = mySubString.length();
       }
     }
     return longuestVowelSubString;
  }
}
------------------------------------------------------------------
class Solution{
    public static int solve(String s){
      int maxCount = 0;
      int currentCount = 0;
      char[] chars = s.toCharArray();
      for(int i = 0; i < chars.length; i++) {
        switch(chars[i]) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              currentCount++;
              if(currentCount > maxCount) {
                maxCount = currentCount;
              }
            break;
            default:
             currentCount = 0;
        }
      }
      return maxCount;
  }
}
------------------------------------------------------------------
class Solution{
    public static int solve(String s) {
        String w = "aeiou";
        int max = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (w.indexOf(ch) != -1) max = Math.max(++c, max);
            else c = 0;
        }
        return max;
    }
}
*/