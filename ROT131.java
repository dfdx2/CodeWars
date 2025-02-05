/* 5KYU CodeWars Rot13

ROT13 is a simple letter substitution cipher that replaces a letter 
with the letter 13 letters after it in the alphabet. ROT13 is an 
example of the Caesar cipher.

Create a function that takes a string and returns the string ciphered 
with Rot13. If there are numbers or special characters included in the 
string, they should be returned as they are. Only letters from the 
latin/english alphabet should be shifted, like in the original Rot13 
"implementation".




*/

public class ROT131 {
  public static String rot13(String str) {
    if (str.length() < 1) {
      return str;
    }
    String map = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`!@#$%^&*()-_+=<>,./?{}[]|\"\'\\;:";
    String maq = " nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM1234567890`!@#$%^&*()-_+=<>,./?{}[]|\"\'\\;:";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int a = map.indexOf(ch);
      if (a < 0) {
        continue;
      }
      char cd = maq.charAt(a);
      sb.append(cd);
    }
    System.out.println(str);
    System.out.println(sb.toString());
    return sb.toString();
  }
}
/*--------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
    public static String rot13(String str) {
        return str
                .chars()
                .mapToObj(c -> {
                    if (c >= 'a' && c <= 'z') {
                        return Character.toString((c + 13) > 'z' ? (c - 13) : c + 13);
                    }
                    if (c >= 'A' && c <= 'Z') {
                        return Character.toString((c + 13) > 'Z' ? (c - 13) : c + 13);
                    }
                    return Character.toString(c);
                })
                .collect(Collectors.joining());
    }
}
----------------------------------------------------------------------
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Kata {
    public static String rot13(String str) {
        return Stream.of(str.split(""))
          .filter(letter -> !letter.isEmpty())
          .map(Kata::replace)
          .map(String::valueOf)
          .collect(Collectors.joining());
    }
    
    private static char replace(String letter) {
        if(letter.matches("(?i)[A-M]")) return (char) (letter.charAt(0) + 13);
        else if(letter.matches("(?i)[N-Z]")) return (char) (letter.charAt(0) - 13);
        else return letter.charAt(0);
    }
}
----------------------------------------------------------------------
public class Kata {
  public static String rot13(String str) {
    return str.chars().map(c -> 'A' <= c && c <= 'Z' ? (c - 'A' + 13) % 26 + 'A' :
                                'a' <= c && c <= 'z' ? (c - 'a' + 13) % 26 + 'a' : c)
              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
  }
}
----------------------------------------------------------------------
public class Kata {
  public static String rot13(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
       char c = str.charAt(i);
       if       (c >= 'a' && c <= 'm') c += 13;
       else if  (c >= 'A' && c <= 'M') c += 13;
       else if  (c >= 'n' && c <= 'z') c -= 13;
       else if  (c >= 'N' && c <= 'Z') c -= 13;

       result.append(c);
   }
    return result.toString();
  }
}
----------------------------------------------------------------------

----------------------------------------------------------------------

----------------------------------------------------------------------

*/