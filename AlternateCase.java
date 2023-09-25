/* 7KYU CodeWars Alternate Case

Write function alternateCase which switch every letter 
in string from upper to lower and from lower to upper. 
E.g: Hello World -> hELLO wORLD

*/

class Kata {
    static String alternateCase(final String string) {
      String result = string;
      String answer = "";
      for (char c : result.toCharArray()) {
        if (Character.isUpperCase(c)) {
          answer += Character.toLowerCase(c);
        }
        else {
          answer += Character.toUpperCase(c);
        }
      }
      return answer;
    }
}
/*--------------------------------------------------------------------------------
import java.util.stream.Collectors;

class Kata {
    static String alternateCase(final String string) {
        return string.chars()
                .mapToObj(i -> new Character((char) i))
                .map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i))
                .map(i -> i.toString())
                .collect(Collectors.joining(""));
    }
}
--------------------------------------------------------------------------
class Kata {
  static String alternateCase(String string) {
    return string.chars().map(i -> Character.isLetter(i) ? (char) (i ^ 32) : i)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;
class Kata {
    static String alternateCase(final String string) {
        if (string.length() != 0) {
            return Arrays.stream(string.split(""))
                    .map(c -> Character.isUpperCase(c.charAt(0)) ? c.toLowerCase() : c.toUpperCase())
                    .collect(Collectors.joining(""));
        }

        return string;
    }
}



*/