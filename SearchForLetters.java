/* 7KYU CodeWars Search for Letters

Create a function which accepts one arbitrary string as 
an argument, and return a string of length 26.

The objective is to set each of the 26 characters of the 
output string to either '1' or '0' based on the fact whether 
the Nth letter of the alphabet is present in the input
(independent of its case).

So if an 'a' or an 'A' appears anywhere in the input string 
(any number of times), set the first character of the output 
string to '1', otherwise to '0'. if 'b' or 'B' appears in the 
string, set the second character to '1', and so on for the rest 
of the alphabet.

For instance:

"a   **&  cZ"  =>  "10100000000000000000000001"
"aaaaaaa79345675"  =>  "10000000000000000000000000"
"&%#*"  =>  "00000000000000000000000000"


*/
public class SearchForLetters{
  public static String search(String line){
    String[] a = new String[26];
    for (int i = 0; i < a.length; i++) {
      a[i] = "0";
    }
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      switch (ch) {
          case 'a': a[0] = "1"; break;
          case 'b': a[1] = "1"; break;
          case 'c': a[2] = "1"; break;
          case 'd': a[3] = "1"; break;
          case 'e': a[4] = "1"; break;
          case 'f': a[5] = "1"; break;
          case 'g': a[6] = "1"; break;
          case 'h': a[7] = "1"; break;
          case 'i': a[8] = "1"; break;
          case 'j': a[9] = "1"; break;
          case 'k': a[10] = "1"; break;
          case 'l': a[11] = "1"; break;
          case 'm': a[12] = "1"; break;
          case 'n': a[13] = "1"; break;
          case 'o': a[14] = "1"; break;
          case 'p': a[15] = "1"; break;
          case 'q': a[16] = "1"; break;
          case 'r': a[17] = "1"; break;
          case 's': a[18] = "1"; break;
          case 't': a[19] = "1"; break;
          case 'u': a[20] = "1"; break;
          case 'v': a[21] = "1"; break;
          case 'w': a[22] = "1"; break;
          case 'x': a[23] = "1"; break;
          case 'y': a[24] = "1"; break;
          case 'z': a[25] = "1"; break;
          case 'A': a[0] = "1"; break;
          case 'B': a[1] = "1"; break;
          case 'C': a[2] = "1"; break;
          case 'D': a[3] = "1"; break;
          case 'E': a[4] = "1"; break;
          case 'F': a[5] = "1"; break;
          case 'G': a[6] = "1"; break;
          case 'H': a[7] = "1"; break;
          case 'I': a[8] = "1"; break;
          case 'J': a[9] = "1"; break;
          case 'K': a[10] = "1"; break;
          case 'L': a[11] = "1"; break;
          case 'M': a[12] = "1"; break;
          case 'N': a[13] = "1"; break;
          case 'O': a[14] = "1"; break;
          case 'P': a[15] = "1"; break;
          case 'Q': a[16] = "1"; break;
          case 'R': a[17] = "1"; break;
          case 'S': a[18] = "1"; break;
          case 'T': a[19] = "1"; break;
          case 'U': a[20] = "1"; break;
          case 'V': a[21] = "1"; break;
          case 'W': a[22] = "1"; break;
          case 'X': a[23] = "1"; break;
          case 'Y': a[24] = "1"; break;
          case 'Z': a[25] = "1"; break;
          default: break;
      }
    }
    String result = "";
    for (int i = 0; i < a.length; i++) {
      result += a[i];
    }
    return result;
  }
}
/*-------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Letters{
    public static String search(String line){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String lineLower = line.toLowerCase();
        return IntStream.range(0, 26)
                .mapToObj(i -> (lineLower.indexOf(alphabet[i]) >= 0 ? 1 : 0) + "")
                .collect(Collectors.joining());
    }
}
---------------------------------------------------------------------
import java.util.Arrays;
public class Letters{
  public static String search(String line){
    char[] c01=new char[26];
    Arrays.fill(c01,'0');
    line.chars()
      .filter(n->Character.isLetter(n))
      .forEach(n->c01[(n&31)-1]='1');
    return String.valueOf(c01);
  }
}
---------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Letters {
  static String search(String line) {
    return range(65, 91).mapToObj(c -> line.toUpperCase().indexOf(c) < 0 ? "0" : "1").collect(joining());
  }
}
---------------------------------------------------------------------
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Letters{
  public static String search(String line){
   		String zero = new String("0");
      List<String> list = new LinkedList<>(Arrays.asList(zero.repeat(26).split("")));
      char[] chars = line.toCharArray();
      for (char c : chars) {
        int pos = 0;
        if (Character.isLetter(c)) {
          c = Character.toLowerCase(c);
          pos = (int) c - 97;
          list.set(pos, "1");
        }
      }
      return list.stream().collect(Collectors.joining());
  }
}
---------------------------------------------------------------------
import java.util.stream.*;
import java.util.Arrays;
public class Letters{
  public static String search(String line){
   String str = "abcdefghijklmnopqrstuvwxyz";
        return Arrays.stream(str.split(""))
                .map(l -> line.toLowerCase().contains(l) ? "1": "0")
                .collect(Collectors.joining(""));
  }
}
---------------------------------------------------------------------
public class Letters{
  public static String search(String line){
    return java.util.stream.IntStream.range(0, 26)
            .mapToObj(i -> line.toLowerCase().contains("" + (char) ('a' + i)) ? "1" : "0")
            .reduce("", (a, b) -> a + b);
  }
}
---------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Letters{
  public static String search(String line){
     Map<String, Integer> alphabetString = new HashMap<>();

        alphabetString.put("a", 0);
        alphabetString.put("b", 1);
        alphabetString.put("c", 2);
        alphabetString.put("d", 3);
        alphabetString.put("e", 4);
        alphabetString.put("f", 5);
        alphabetString.put("g", 6);
        alphabetString.put("h", 7);
        alphabetString.put("i", 8);
        alphabetString.put("j", 9);
        alphabetString.put("k", 10);
        alphabetString.put("l", 11);
        alphabetString.put("m", 12);
        alphabetString.put("n", 13);
        alphabetString.put("o", 14);
        alphabetString.put("p", 15);
        alphabetString.put("q", 16);
        alphabetString.put("r", 17);
        alphabetString.put("s", 18);
        alphabetString.put("t", 19);
        alphabetString.put("u", 20);
        alphabetString.put("v", 21);
        alphabetString.put("w", 22);
        alphabetString.put("x", 23);
        alphabetString.put("y", 24);
        alphabetString.put("z", 25);


        StringBuilder lettersFoundString = new StringBuilder("00000000000000000000000000");


      Arrays.stream(line.split(""))
                .filter(word ->  !word.isEmpty() )
                .filter(character -> Character.isAlphabetic(character.charAt(0)))
                .filter(character -> alphabetString.containsKey(character.toLowerCase()))
                .forEach(character -> lettersFoundString.replace(alphabetString.get(character.toLowerCase()), alphabetString.get(character.toLowerCase()) + 1, "1"));

        return lettersFoundString.toString();
  }
}
------------------------------------------------------------------------------------
 public class Letters{
  public static String search(String line){
    StringBuilder sb = new StringBuilder("00000000000000000000000000");
    line.toLowerCase().replaceAll("[^a-z]", "")
                .chars().forEach(pos -> sb.setCharAt(pos - 'a','1'));
    return sb.toString();
  }
} 
*/