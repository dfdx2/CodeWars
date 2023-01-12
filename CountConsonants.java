/* 7 KYU CodeWars  Count Consonants

Complete the function that takes a string of English-language 
text and returns the number of consonants in the string.
Consonants are all letters used to write English excluding the 
vowels a, e, i, o, u.

*/
public class Consonants {
  public static int getCount(String str) {
    
    str = str.replaceAll("[^qQwWrRtTyYpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]", "");
    return str.length();
  }
}
/*-----------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'Q' || str.charAt(i) == 'q') {
        count += 1;
      }
      else if (str.charAt(i) == 'W' || str.charAt(i) == 'w') {
        count += 1;
      }
      else if (str.charAt(i) == 'R' || str.charAt(i) == 'r') {
        count += 1;
      }
      else if (str.charAt(i) == 'T' || str.charAt(i) == 't') {
        count += 1;
      }
      else if (str.charAt(i) == 'Y' || str.charAt(i) == 'y') {
        count += 1;
      }
      else if (str.charAt(i) == 'P' || str.charAt(i) == 'p') {
        count += 1;
      }
      else if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
        count += 1;
      }
      else if (str.charAt(i) == 'D' || str.charAt(i) == 'd') {
        count += 1;
      }
      else if (str.charAt(i) == 'F' || str.charAt(i) == 'f') {
        count += 1;
      }
      else if (str.charAt(i) == 'G' || str.charAt(i) == 'g') {
        count += 1;
      }
      else if (str.charAt(i) == 'H' || str.charAt(i) == 'h') {
        count += 1;
      }
      else if (str.charAt(i) == 'J' || str.charAt(i) == 'j') {
        count += 1;
      }
      else if (str.charAt(i) == 'K' || str.charAt(i) == 'k') {
        count += 1;
      }
      else if (str.charAt(i) == 'L' || str.charAt(i) == 'l') {
        count += 1;
      }
      else if (str.charAt(i) == 'Z' || str.charAt(i) == 'z') {
        count += 1;
      }
      else if (str.charAt(i) == 'X' || str.charAt(i) == 'x') {
        count += 1;
      }
      else if (str.charAt(i) == 'C' || str.charAt(i) == 'c') {
        count += 1;
      }
      else if (str.charAt(i) == 'V' || str.charAt(i) == 'v') {
        count += 1;
      }
      else if (str.charAt(i) == 'B' || str.charAt(i) == 'b') {
        count += 1;
      }
      else if (str.charAt(i) == 'N' || str.charAt(i) == 'n') {
        count += 1;
      }
      else if (str.charAt(i) == 'M' || str.charAt(i) == 'm') {
        count += 1;
      }
      else {
        count += 0;
      }
    }
    return count;
  }
}
----------------------------------------------------------------------
public class Consonants {
  public static int getCount(final String str) {
    return str.replaceAll("(?i)[aeiou\\d\\W_]", "").length();
  }
}
-----------------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();
  }
}
---------------------------------------------------------------------
import java.util.Set;

public class Consonants {  
  private static final Set<Integer> VOWELS = 
    Set.of((int) 'a', (int) 'e', (int) 'i', (int) 'o', (int) 'u');
  
  public static int getCount(String str) {
    return (int) str.chars()
                    .filter(Character::isLetter)
                    .filter(i -> !VOWELS.contains(i))
                    .count();
  }
}
---------------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    int count = 0;
    
    for (int i = 0, n = str.length(); i < n; ++i) {
      char c = str.charAt(i);
      switch (c) { 
        case 'a': 
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case ' ':
          break;
        default:
          if (Character.isLetter(c)) { ++count; }
          break;
      }
    }
    
    return count;
  }
}
----------------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    return str.toLowerCase().replaceAll("[^b-d,f-h,j-n,p-t,v-z]","").length();
  }
}
----------------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    if (str.equals("")){
      return 0;
    }
    int count = 0;
    String[] list = str.split("");
    String validStr = "qwrtypsdfghjklzxcvbnmQWRTTYPSDFGHJKLZXCVBNM";
    for (String i: list){
      if (validStr.contains(i)){
        count ++;
      }
    }
    return count;
  }
}
------------------------------------------------------------------------
public class Consonants {
  public static int getCount(String str) {
    return (int) str.chars()
                .filter(x -> Character.isAlphabetic(x) && !"aeiouAEIOU".contains(String.valueOf((char)x)))
                .count();
  }
}



*/