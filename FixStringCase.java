/* 7KYU CodeWars Fix String Case

In this Kata, you will be given a string that may have mixed uppercase and lowercase 
letters and your task is to convert that string to either lowercase only or uppercase 
only based on:

 * make as few changes as possible.
 * if the string contains equal number of uppercase and lowercase letters, convert the 
   string to lowercase.

For example:

solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
solve("coDE") = "code". Upper == lowercase. Change all to lowercase.

More examples in test cases. Good luck!

*/

public class Solution {
    public static String solve(final String str) {
      String x = str;
      if (str.length() < 1) {
        return str;
      }
      int lower = 0;
      int upper = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >=65 && str.charAt(i) <= 90) {
          upper += 1;
        }
        else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
          lower += 1;
        }
        else {
          upper += 0;
          lower += 0;
        }
      }
      return (lower == upper) ? x.toLowerCase() : (lower > upper) ? x.toLowerCase() : x.toUpperCase();
    }
}
/*-------------------------------------------------------------------------------------------
public class Solution {
    public static String solve(final String str) {
        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
				? str.toLowerCase()
				: str.toUpperCase();
    }
}
--------------------------------------------------------------------------------------------
public class Solution {
    public static String solve(final String str) {
        int lower = 0;
        for (Character c:str.toCharArray()) {
            if (Character.isLowerCase(c))
                lower++;
        }
        return str.length() - lower > lower ? str.toUpperCase() : str.toLowerCase();
    }
}
--------------------------------------------------------------------------------------------
public class Solution {
    public static String solve(final String str) {
        if(countBig(str) == countSmall(str)){
            return str.toLowerCase();
        }else if(countBig(str) > countSmall(str)){
            return str.toUpperCase();
        }else{
            return str.toLowerCase();
        }
    }

    public static int countBig(String str){
        int x = 0;
        for(int i = 0;i <= str.length()-1;i++){
            if(str.charAt(i) == 'A'||str.charAt(i) == 'B'||str.charAt(i) == 'C'||str.charAt(i) == 'D'||
                    str.charAt(i) == 'E'||str.charAt(i) == 'F'||str.charAt(i) == 'G'||str.charAt(i) == 'H'||
                    str.charAt(i) == 'I'||str.charAt(i) == 'J'||str.charAt(i) == 'K'||str.charAt(i) == 'L'||
                    str.charAt(i) == 'M'||str.charAt(i) == 'N'||str.charAt(i) == 'O'||str.charAt(i) == 'P'||
                    str.charAt(i) == 'Q'||str.charAt(i) == 'R'||str.charAt(i) == 'S'||str.charAt(i) == 'T'||
                    str.charAt(i) == 'U'||str.charAt(i) == 'V'||str.charAt(i) == 'W'||str.charAt(i) == 'X'||
            str.charAt(i) == 'Y'||str.charAt(i) == 'Z'){
                x = x + 1;
            }
        }
    return x;
    }

    public static int countSmall(String str){
        int x = 0;
        for(int i = 0;i <= str.length()-1;i++){
            if(str.charAt(i) == 'a'||str.charAt(i) == 'b'||str.charAt(i) == 'c'||str.charAt(i) == 'd'||
                    str.charAt(i) == 'e'||str.charAt(i) == 'f'||str.charAt(i) == 'g'||str.charAt(i) == 'h'||
                    str.charAt(i) == 'i'||str.charAt(i) == 'j'||str.charAt(i) == 'k'||str.charAt(i) == 'l'||
                    str.charAt(i) == 'm'||str.charAt(i) == 'n'||str.charAt(i) == 'o'||str.charAt(i) == 'p'||
                    str.charAt(i) == 'q'||str.charAt(i) == 'r'||str.charAt(i) == 's'||str.charAt(i) == 't'||
                    str.charAt(i) == 'u'||str.charAt(i) == 'v'||str.charAt(i) == 'w'||str.charAt(i) == 'x'||
                    str.charAt(i) == 'y'||str.charAt(i) == 'z'){
                x = x + 1;
            }
        }
        return x;
    }
}
------------------------------------------------------------------------------------------------
public class Solution {
    public static String solve(final String s) {
      String upp = s.replaceAll("[^A-Z ]", ""); 
      String low = s.replaceAll("[^a-z ]", ""); 
      return (upp.length() > low.length() ? s.toUpperCase() : s.toLowerCase() ) ;
    }
}
-------------------------------------------------------------------------------------------------
public class Solution {
  public static String solve(final String s) {
    return s.length() < 2 * s.replaceAll("[a-z]","").length() ? s.toUpperCase() :s.toLowerCase();
  }
}
-----------------------------------------------------------------------------------------------
public class Solution {
    public static String solve(final String str) {        
        return str.length()-str.replaceAll("[A-Z]","").length()<=str.replaceAll("[A-Z]","").length()?str.toLowerCase():str.toUpperCase(); //your code here
    }
}
------------------------------------------------------------------------------------------------


*/