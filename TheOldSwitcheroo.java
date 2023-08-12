/* 7KYU CodeWars The Old Switcheroo

Write a function

vowel2Index(String s)
that takes in a string and replaces all the vowels [a,e,i,o,u] with 
their respective positions within that string.

E.g:

Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
Kata.Vowel2Index("Codewars is the best site in the world") == 
"C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"

Your function should be case insensitive to the vowels.

*/
public class Kata {
  public static String vowel2Index(String s) {
      String x = "";
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        x += String.valueOf(count);
        count++;
      }
      else {
        x += s.charAt(i);
        count++;
      }
    }
    return x;
  }
}
/*-------------------------------------------------------------------------
public class Kata {
  public static String vowel2Index(String s) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) sb.append(s.charAt(i));
        else sb.append(i + 1);
      }
      return sb.toString();
  }
}
---------------------------------------------------------------------------
import java.util.HashSet;
import java.util.Set;

public class Kata {

  private static Set<Character> vowels = new HashSet<>(5);
  
  static {
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
  }
  
  public static String vowel2Index(String s) {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        char character = s.charAt(i);
        if (vowels.contains(character)) {
          result.append(i + 1);
        } else {
          result.append(character);
        }
      }
      return result.toString();
  }
}
--------------------------------------------------------------------------
class Kata {
  static String vowel2Index(String s) {
    var result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append("aeiou".indexOf(s.charAt(i)) < 0 ? s.charAt(i) : i + 1 + "");
    }
    return result.toString();
  }
}
---------------------------------------------------------------------------
public class Kata {
  public static String vowel2Index(String s) {
      StringBuffer sb = new StringBuffer();
      
      for(int index = 0; index < s.length();index++){
         switch(s.charAt(index)){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
                   sb.append(index + 1);
                   break;
          default: 
                  sb.append(s.charAt(index));
                  break;
         }
      }
      
      return sb.toString();
      
  }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Kata {

    public static String vowel2Index(String s) {
        return IntStream.range(0,s.length())
                        .mapToObj(i -> "aeiouAEIOU".indexOf(s.charAt(i)) >= 0 ? String.valueOf(i+1) : String.valueOf(s.charAt(i)))
                        .collect(Collectors.joining());
    }
}
-------------------------------------------------------------------------------
import java.util.regex.*;

public class Kata {
  public static String vowel2Index(String s) {
    Pattern pattern = Pattern.compile("[aeiou]");
    Matcher matcher = pattern.matcher(s);
    StringBuffer sb = new StringBuffer();
    while(matcher.find()) {
      matcher.appendReplacement(sb, String.valueOf(matcher.end()));
    }
    matcher.appendTail(sb);
    return sb.toString();
  }
}




*/