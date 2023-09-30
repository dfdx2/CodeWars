/* 7KYU CodeWars From A - Z

Given a string indicating a range of letters, return a string which 
includes all the letters in that range, including the last letter. 
Note that if the range is given in capital letters, return the string 
in capitals also!

Examples
"a-z" ➞ "abcdefghijklmnopqrstuvwxyz"
"h-o" ➞ "hijklmno"
"Q-Z" ➞ "QRSTUVWXYZ"
"J-J" ➞ "J"
Notes
A hyphen will separate the two letters in the string.
You don't need to worry about error handling in this one 
(i.e. both letters will be the same case and the second letter 
will always be after the first alphabetically).

*/

public class Solution{
  public static String gimmeTheLetters(String s){
    String x = "abcdefghijklmnopqrstuvwxyz";
    String y = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Character ch = s.charAt(0);
    Character cd = s.charAt(2);
    if (Character.isUpperCase(ch)) {
      return y.substring(y.indexOf(ch),y.indexOf(cd) + 1);
    }
    else {
      return x.substring(x.indexOf(ch), x.indexOf(cd) + 1);
    }
  }
}
/*---------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){  
     StringBuilder sb = new StringBuilder();
     for (char c = s.charAt(0); c<=s.charAt(2); c++) 
         sb.append(c);
     return sb.toString();
    }
}
------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s) {
    String res = "";
    for (int i = s.charAt(0); i <= s.charAt(2); i++) {
      res += (char) i;
    }
    return res;
  }
}
------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){
    StringBuilder b = new StringBuilder();
    for(int i = s.charAt(0); i <= s.charAt(2); i++ ) b.append((char) i);
    return b.toString();
  }
}
------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){
    return s.charAt(0) >= 'a' ? 
      "abcdefghijklmnopqrstuvwxyz".substring(s.charAt(0) - 'a', s.charAt(2) - 'a' + 1) : 
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(s.charAt(0) - 'A', s.charAt(2) - 'A' + 1);
  }
}
---------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution{
  public static String gimmeTheLetters(String s){
    return IntStream.rangeClosed(s.charAt(0), s.charAt(2)).mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
  }
}
---------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){
  String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  return letters.substring(letters.indexOf(s.substring(0,1)),letters.indexOf(s.substring(2,3))+1); 
  }
}
-------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){
    StringBuilder result = new StringBuilder();

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char startChar = s.charAt(0);
    char endChar = s.charAt(2);

    boolean isUpperCase = Character.isUpperCase(startChar);

    int startIndex = 0;
    int endIndex = 1;

    for (int i = 0; i < alphabet.length; i++) {
      if (alphabet[i] == Character.toLowerCase(startChar)) {
        startIndex = i;
      }
      else if(alphabet[i] == Character.toLowerCase(endChar)) {
        endIndex = i;
        break;
      }

      if (alphabet[i] == Character.toLowerCase(startChar) && alphabet[i] == Character.toLowerCase(endChar)) {
        return Character.toString(!isUpperCase ? alphabet[i] : Character.toUpperCase(alphabet[i]));
      }
    }

    for (int i = startIndex; i <= endIndex; i++) {
      result.append(!isUpperCase ? alphabet[i] : Character.toUpperCase(alphabet[i]));
    }

    return result.toString();
  }
}
-----------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String str){
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int start = alphabet.indexOf(Character.toLowerCase(str.charAt(0)));
    int end = alphabet.indexOf(Character.toLowerCase(str.charAt(2)));
    String toReturn = alphabet.substring(start, end + 1);
    
    if(Character.isUpperCase(str.charAt(0))) {
      return toReturn.toUpperCase();
    }
    
    return toReturn;
  }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class Solution{
    public static String gimmeTheLetters(String s) {
        return IntStream.range(s.charAt(0), s.charAt(2) + 1)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(""));
    }
}
-------------------------------------------------------------------------------
public class Solution{
  public static String gimmeTheLetters(String s){
    var arr = s.split("-");
        StringBuilder resultString = new StringBuilder();
        for (char c = arr[0].charAt(0); c <= arr[1].charAt(0); c++){
            resultString.append(c);
        }
        return resultString.toString();
  }
}
-------------------------------------------------------------------------------
import java.util.LinkedList;
public class Solution{
   public static final String[] alphabet_min = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    public static final String[] alphabet_May = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

  public static String gimmeTheLetters(String s){
    LinkedList<String> alphabet_minus = new LinkedList<>();
    LinkedList<String> alphabet_mayus = new LinkedList<>();
    addIntoLinkedList(alphabet_minus, alphabet_min);
    addIntoLinkedList(alphabet_mayus, alphabet_May);
    String limiters[] = s.split("-");
    String inicio = limiters[0];
    String end = limiters[1];
    String cadenaAlphabet = "";
    int contador;

    if (alphabet_minus.contains(inicio) && alphabet_minus.get(alphabet_minus.indexOf(inicio)).equals(alphabet_minus.get(alphabet_minus.indexOf(inicio)).toLowerCase())) {
      contador = alphabet_minus.indexOf(inicio);
      for (int i = contador; i < alphabet_minus.size(); i++) {
        if(i<= alphabet_minus.indexOf(end)){
          cadenaAlphabet += alphabet_minus.get(i);
        }
      }
    }
    else if (alphabet_mayus.contains(inicio) && alphabet_mayus.get(alphabet_mayus.indexOf(inicio)).equals(alphabet_mayus.get(alphabet_mayus.indexOf(inicio)).toUpperCase())) {
      contador = alphabet_mayus.indexOf(inicio);
      for(int i = contador; i< alphabet_mayus.size();i++){
        if(i<=alphabet_mayus.indexOf(end)){
          cadenaAlphabet += alphabet_mayus.get(i);
        }
      }
    }
    return cadenaAlphabet;
  }

  public static LinkedList<String> addIntoLinkedList(LinkedList<String> linkedList, String[] alphabet_letters) {
        for (int i = 0; i < alphabet_letters.length; i++) {
            linkedList.add(alphabet_letters[i]);
        }
        return linkedList;
    }

}

*/