/*  7KYU CodeWars  Vowel Count
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.

*/
public class Vowels {

  public static int getCount(String str) {
    int result = 0;
    for (int i = 0; i <= str.length() - 1; i++) {
      if (str.charAt(i) == 'a') {
        result = result + 1;
      }
      else if (str.charAt(i) == 'e') {
        result = result + 1;
      }
      else if (str.charAt(i) == 'i') {
        result = result + 1;
      }
      else if (str.charAt(i) == 'o') {
        result = result + 1;
      }
      else if (str.charAt(i) == 'u') {
        result = result + 1;
      }
      else {
        result = result + 0;
      }
    }
    return result;
  }

}


/*----------------------------------------------------------------------------
public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
--------------------------------------------------------------------------------
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    for(char c : str.toCharArray())
      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    
    return vowelsCount;
  }

}
--------------------------------------------------------------------------------------
public class Vowels {

  public static int getCount(String str) {
    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
  }

}
--------------------------------------------------------------------------------------
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for(int i = 0; i < str.length(); i++) {
        switch(str.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            vowelsCount++;
        }
    }
    return vowelsCount;
  }

}



*/