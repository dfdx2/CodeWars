/*  7KYU CodeWars  Vowel Count
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.

*/
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'A' || str.charAt(i) == 'a') {
        vowelsCount += 1;
      }
      else if (str.charAt(i) == 'E' || str.charAt(i) == 'e') {
        vowelsCount += 1;
      }
      else if (str.charAt(i) == 'I' || str.charAt(i) == 'i') {
        vowelsCount += 1;
      }
      else if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
        vowelsCount += 1;
      }
      else if (str.charAt(i) == 'U' || str.charAt(i) == 'u') {
        vowelsCount += 1;
      }
      else {
        vowelsCount += 0;
      }
    }
    return vowelsCount;
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