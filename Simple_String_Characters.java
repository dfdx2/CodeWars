/* 7KYU CodeWars Simple String Characters

In this Kata, you will be given a string and your 
task will be to return a list of ints detailing the 
count of uppercase letters, lowercase, numbers and 
special characters, as follows.

Solve("*'&ABCDabcde12345") = [4,5,5,3]. 
--the order is: uppercase letters, lowercase, numbers and special characters.

More examples in the test cases.

Good luck!

*/

public class Kata {

    public static int[] Solve(String word) {
      int[] result = new int[4];
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
          result[1]+= 1;
        }
        else if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U' || ch == 'V' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
          result[0]+= 1;
        }
        else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
          result[2]++;
        }
        else {
          result[3]++;
        }
      }
      return result;
    }
}
/*---------------------------------------------------------------------------
interface Kata {
  static int[] Solve(String word) {
    return new int[] {
        word.replaceAll("[^A-Z]", "").length(),
        word.replaceAll("[^a-z]", "").length(),
        word.replaceAll("[^0-9]", "").length(),
        word.replaceAll("[\\w]", "").length()
    };
  }
}
-----------------------------------------------------------------------------
public class Kata {

    public static int[] Solve(String word) {
      int[] array = new int[4];
      for (int i = 0; i < word.length(); i++) {
        if (Character.isUpperCase(word.charAt(i))) {
          array[0]++;
        }
        else if (Character.isLowerCase(word.charAt(i))) {
          array[1]++;
        }
        else if (Character.isDigit(word.charAt(i))) {
          array[2]++;
        }
        else {
          array[3]++;
        }
      }
      return array;
    }
}
------------------------------------------------------------------------------
public class Kata {

    public static int[] Solve(String word) {
      int AZ = 0, az = 0, d = 0, len = word.length();
      for (char ch : word.toCharArray()) {
        if (ch >= 'A' && ch <= 'Z') AZ++;
        else if (ch >= 'a' && ch <= 'z') az++;
        else if (ch >= '0' && ch <= '9') d++;
      }
      return new int[]{AZ, az, d, len - AZ - az - d};
    }

}
------------------------------------------------------------------------------
public class Kata {

    public static int[] Solve(String word) {
        int upperCase = (int) word.chars().filter(value -> Character.isUpperCase(value)).count();
        int lowerCase = (int) word.chars().filter(value -> Character.isLowerCase(value)).count();
        int number = (int) word.chars().filter(value -> Character.isDigit(value)).count();
        int specialChar = word.length() - (upperCase + lowerCase + number);
        return new int[]{upperCase, lowerCase, number, specialChar};
    }
}
------------------------------------------------------------------------------
public class Kata {

  public static int[] Solve(String s) {
    return new int[] {
      s.replaceAll("[^A-Z]","").length(),
      s.replaceAll("[^a-z]","").length(),
      s.replaceAll("[^0-9]","").length(), 
      s.replaceAll("[a-zA-Z0-9]","").length()
    };
  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
   
    public static int[] Solve(String word) {
      //enjoy coding 
       int upper=0,lower=0,number=0,other=0;
    
      for(int i=0;i<word.length();i++){
        if(Character.isUpperCase(word.charAt(i))){
          upper++;
        }
        else if(Character.isLowerCase(word.charAt(i))){
          lower++;
        }
        else if(Character.isDigit(word.charAt(i))){
          number++;
        }else{
          other++;
        }
      }
      int []out={upper,lower,number,other};
      return out;
      
    }
}
-------------------------------------------------------------------------------
public class Kata {
  public static int[] Solve(String word) {
    int[] result = new int[4];
    for (var x : word.split("")){
      if ("0123456789".contains(x)){
        result[2] = result[2] + 1;
      }
      else if (" ~!@#$%^&*()`-=_+;:<>,.? \\ // /'/' \"\" /[/] \'\' ".contains(x)){
        result[3] = result[3] + 1;
      }
      else if (x.equals(x.toLowerCase())){
        result[1] = result[1] + 1;
      }
      else if (x.equals(x.toUpperCase())){
        result[0] = result[0] + 1;
      }
    }
    return result;
  }
}
-------------------------------------------------------------------------------
public class Kata {
    public static int[] Solve(String word) {
        int a = word.replaceAll("[^A-Z]", "").length();
        int b = word.replaceAll("[^a-z]", "").length();
        int c = word.replaceAll("[^0-9]", "").length();
        int d = word.length() - (a + b + c);
        return new int[] {a, b, c, d};
    }
}
*/