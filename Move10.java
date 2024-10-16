/* 7KYU CodeWars Move 10

Move every letter in the provided string forward 10 letters through the alphabet.

If it goes past 'z', start again at 'a'.

Input will be a string with length > 0.

abcdefghijklmnopqrstuvwxyz
klmnopqrstuvwxyzabcdefghij


*/
import java.util.*;
public class Move10 {
  public static String moveTen(String s) {
    Map<Character, Character> map = new HashMap<>();
    map.put('a', 'k');
    map.put('b', 'l');
    map.put('c', 'm');
    map.put('d', 'n');
    map.put('e', 'o');
    map.put('f', 'p');
    map.put('g', 'q');
    map.put('h', 'r');
    map.put('i', 's');
    map.put('j', 't');
    map.put('k', 'u');
    map.put('l', 'v');
    map.put('m', 'w');
    map.put('n', 'x');
    map.put('o', 'y');
    map.put('p', 'z');
    map.put('q', 'a');
    map.put('r', 'b');
    map.put('s', 'c');
    map.put('t', 'd');
    map.put('u', 'e');
    map.put('v', 'f');
    map.put('w', 'g');
    map.put('x', 'h');
    map.put('y', 'i');
    map.put('z', 'j');
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(map.get(s.charAt(i)));
    }
    return sb.toString();
  }
}
/*-----------------------------------------------------------------------------
public class MoveTen {
  public static String moveTen(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        sb.append('k');
      }
      else if (s.charAt(i) == 'b') {
        sb.append('l');
      }
      else if (s.charAt(i) == 'c') {
        sb.append('m');
      }
      else if (s.charAt(i) == 'd') {
        sb.append('n');
      }
      else if (s.charAt(i) == 'e') {
        sb.append('o');
      }
      else if (s.charAt(i) == 'f') {
        sb.append('p');
      }
      else if (s.charAt(i) == 'g') {
        sb.append('q');
      }
      else if (s.charAt(i) == 'h') {
        sb.append('r');
      }
      else if (s.charAt(i) == 'i') {
        sb.append('s');
      }
      else if (s.charAt(i) == 'j') {
        sb.append('t');
      }
      else if (s.charAt(i) == 'k') {
        sb.append('u');
      }
      else if (s.charAt(i) == 'l') {
        sb.append('v');
      }
      else if (s.charAt(i) == 'm') {
        sb.append('w');
      }
      else if (s.charAt(i) == 'n') {
        sb.append('x');
      }
      else if (s.charAt(i) == 'o') {
        sb.append('y');
      }
      else if (s.charAt(i) == 'p') {
        sb.append('z');
      }
      else if (s.charAt(i) == 'q') {
        sb.append('a');
      }
      else if (s.charAt(i) == 'r') {
        sb.append('b');
      }
      else if (s.charAt(i) == 's') {
        sb.append('c');
      }
      else if (s.charAt(i) == 't') {
        sb.append('d');
      }
      else if (s.charAt(i) == 'u') {
        sb.append('e');
      }
      else if (s.charAt(i) == 'v') {
        sb.append('f');
      }
      else if (s.charAt(i) == 'w') {
        sb.append('g');
      }
      else if (s.charAt(i) == 'x') {
        sb.append('h');
      }
      else if (s.charAt(i) == 'y') {
        sb.append('i');
      }
      else if (s.charAt(i) == 'z') {
        sb.append('j');
      }
    }
    return sb.toString();
  }
}
---------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

interface MoveTen {
  static String moveTen(String s) {
    return s.chars().mapToObj(c -> (char) (c + (c < 'q' ? 10 : -16)) + "").collect(joining());
  }
}
-------------------------------------------------------------------------------
public class MoveTen {
    private static boolean IsCapitalLatinLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static boolean IsSmallLatinLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static String moveTen(String message) {
        StringBuilder encoded = new StringBuilder();
        int shift = 10;
        shift %= 26;

        final int length = message.length();
        for (int i = 0; i < length; i++) {
            char current = message.charAt(i);

            if (IsCapitalLatinLetter(current)) {
                current += shift;
                encoded.append((char)(current > 'Z' ? current - 26 : current));
            } else if (IsSmallLatinLetter(current)) {
                current += shift;
                encoded.append((char)(current > 'z' ? current - 26 : current));
            } else {
                encoded.append(current);
            }
        }
        return encoded.toString();
    }
}
----------------------------------------------------------------------------
public class MoveTen {
    private static String a_z = "abcdefghijklmnopqrstuvwxyz";
    public static String moveTen(String s) {
        return s.chars()
                .mapToObj(c -> a_z.charAt((a_z.indexOf((char) c) + 10) % 26))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;

public class MoveTen {
  public static String moveTen(String s) {
    return s.chars().map(x -> x>112? x+10-26:x+10).mapToObj(y -> String.valueOf((char) y)).collect(Collectors.joining());
  }
}
-------------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

public class MoveTen {
  
  public static String moveTen(String s) {
    return s.chars()
          .map(c -> c - 'a')
          .map(c -> c + 10)
          .map(c -> c % 26)
          .map(c -> c + 'a')
          .mapToObj(Character::toString)
          .collect(joining(""));
  }
  
}
-----------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveTen {
  public static String moveTen(String s) {
    int minIndex = 97;
        int maxIndex = 122;
        if (s.length() == 0) throw new RuntimeException("Пустая строка!");
        int[] alphabetics = IntStream.rangeClosed(minIndex, maxIndex).toArray();
        StringBuilder result = new StringBuilder();
        List<Character> chars = s.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
        System.out.println(chars);
        for (int i = 0; i < chars.size(); i++) {
            if (!Character.isWhitespace(chars.get(i)) && chars.get(i) < minIndex || chars.get(i) > maxIndex)
                throw new RuntimeException("Введены некорректные значения слова" +
                        " (не английский алфавит)!!!");
            int charIndex = chars.get(i) + 10;
            int temp = charIndex - alphabetics[alphabetics.length - 1];
            if (temp > 0) chars.set(i, (char) alphabetics[temp - 1]);
            else if ((Character.isWhitespace(chars.get(i)))) chars.set(i, ' ');
            else chars.set(i, (char) charIndex);
            result.append(chars.get(i));
        }
        System.out.println(result);
        return result.toString();
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

public class MoveTen {
  public static String moveTen(String s) {
    return s.chars().map(item->{
      if (item > 'p'){
        return item-'p'-1+'a';
      }
      return item+10;
    }).mapToObj(i -> Character.toString(i)).collect(Collectors.joining(""));
  }
}
----------------------------------------------------------------------------
public class MoveTen {
  public static String moveTen(String s) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int letterIndex = alphabet.indexOf(s.charAt(i));
            int newPos = (letterIndex + 10) % 26;
            word.append(alphabet.charAt(newPos));
        }

        return word.toString();
  }
}

*/