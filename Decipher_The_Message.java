/* 7KYU CodeWars Decipher The Message

Amy and May aren't allowed by their parents to have cell phones, so they still communitcate in class the good old fashioned way, by writing notes.

So that no snoopy teachers can read any found notes, the girls communicate in code.

May is having a hard time deciphering Amy's latest messages, can you help her figure it out?

Input: String written in Amy's code Output: String decoded to Engligh so May can read it





*/

import java.util.*;
public class NotePassing {  
    public static String decipher(String codedMessage){
      Map<Character, Character> map = new HashMap<>();
      map.put('a', 'h');
      map.put('b', 'i');
      map.put('c', 'j');
      map.put('d', 'k');
      map.put('e', 'l');
      map.put('f', 'm');
      map.put('g', 'n');
      map.put('h', 'o');
      map.put('i', 'p');
      map.put('j', 'q');
      map.put('k', 'r');
      map.put('l', 's');
      map.put('m', 't');
      map.put('n', 'u');
      map.put('o', 'v');
      map.put('p', 'w');
      map.put('q', 'x');
      map.put('r', 'y');
      map.put('s', 'z');
      map.put('t', 'a');
      map.put('u', 'b');
      map.put('v', 'c');
      map.put('w', 'd');
      map.put('x', 'e');
      map.put('y', 'f');
      map.put('z', 'g');
      map.put('A', 'H');
      map.put('B', 'I');
      map.put('C', 'J');
      map.put('D', 'K');
      map.put('E', 'L');
      map.put('F', 'M');
      map.put('G', 'N');
      map.put('H', 'O');
      map.put('I', 'P');
      map.put('J', 'Q');
      map.put('K', 'R');
      map.put('L', 'S');
      map.put('M', 'T');
      map.put('N', 'U');
      map.put('O', 'V');
      map.put('P', 'W');
      map.put('Q', 'X');
      map.put('R', 'Y');
      map.put('S', 'Z');
      map.put('T', 'A');
      map.put('U', 'B');
      map.put('V', 'C');
      map.put('W', 'D');
      map.put('X', 'E');
      map.put('Y', 'F');
      map.put('Z', 'G');
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < codedMessage.length(); i++) {
        if (map.get(codedMessage.charAt(i)) != null) {
          sb.append(map.get(codedMessage.charAt(i)));
        }
        else {
          sb.append(codedMessage.charAt(i));
        }
      }
      return sb.toString();
    }
}
/*-----------------------------------------------------------------
public class NotePassing {  
    public static String decipher(String codedMessage){
        int shiftValue = 7;
        String decode = "";
        for (char c : codedMessage.toCharArray()) {
            if(c >= 'a' && c <= 'z')
                decode += (char) (((c - 'a' + shiftValue) % 26) + 'a');
            else if(c >= 'A' && c <= 'Z')
                decode += (char) (((c - 'A' + shiftValue) % 26) + 'A');
            else
                decode += c;
        }
        return decode;
    }
}
-------------------------------------------------------------------
import java.util.*;

public class NotePassing {  
    public static String decipher(String codedMessage){
        LinkedList letters = new LinkedList() {{
      add("A");
      add("B");
      add("C");
      add("D");
      add("E");
      add("F");
      add("G");
      add("H");
      add("I");
      add("J");
      add("K");
      add("L");
      add("M");
      add("N");
      add("O");
      add("P");
      add("Q");
      add("R");
      add("S");
      add("T");
      add("U");
      add("V");
      add("W");
      add("X");
      add("Y");
      add("Z");
    }}; 
    
    LinkedList output = new LinkedList();
    String token = null;
    for (int i = 0; i < codedMessage.length(); i++) {
      char c = codedMessage.charAt(i);
      token = String.valueOf(c).toUpperCase();
      if (letters.contains(token)) {        
        int index = letters.indexOf(token);
        if ((index + 7) > 25) {
          token = (String) letters.get(index + 7 - 26);
        }
        else {
          token = (String) letters.get(index + 7);
        }
        if (Character.isLowerCase(c)) {        
          output.add(token.toLowerCase());
        }
        else {
          output.add(token);
        }
      }
      else {
        token = String.valueOf(c);
        output.add(token);
      }
    }
    
    String decodedMessage = "";
    while (output.size() > 0) {
      decodedMessage += (String) output.pollFirst();
    }
    
    return decodedMessage;
  }
}
-------------------------------------------------------------------
public class NotePassing {  
  
  private static final int OFFSET = 7;
  private static final int LETTERS = 26;
  private static final int LOWER_A = 97;
  private static final int UPPER_A = 65;
  
  public static String decipher(String codedMessage){
    
    char[] chars = codedMessage.toCharArray();
    
    for(int i = 0; i < chars.length; i++) {
      if(Character.isLowerCase(chars[i])) {
        chars[i] = (char) (LOWER_A + (chars[i] - LOWER_A + OFFSET)%LETTERS);
      } else if(Character.isUpperCase(chars[i])) {
        chars[i] = (char) (UPPER_A + (chars[i] - UPPER_A + OFFSET)%LETTERS);
      }
    }
    
    return new String(chars);
  }
}
-------------------------------------------------------------------
import java.util.TreeMap;
public class NotePassing {  
    public static String decipher(String codedMessage){
        String letter = "";
        TreeMap<String, String> tm = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        tm.put("t","a"); tm.put("u","b"); tm.put("v","c"); tm.put("w","d"); tm.put("x","e");
        tm.put("y","f"); tm.put("z","g"); tm.put("a","h"); tm.put("b","i"); tm.put("c","j");
        tm.put("d","k"); tm.put("e","l"); tm.put("f","m"); tm.put("g","n"); tm.put("h","o");
        tm.put("i","p"); tm.put("k","r"); tm.put("l","s"); tm.put("m","t"); tm.put("n","u");
        tm.put("o","v"); tm.put("p","w"); tm.put("r","y"); tm.put("?","?"); tm.put(" "," ");
        tm.put("!","!"); tm.put(".","."); tm.put(",",","); tm.put("'","'");

        for (int i = 0; i < codedMessage.length(); i++){
            String character = tm.get(Character.toString(codedMessage.charAt(i)));
            if(Character.isUpperCase(codedMessage.charAt(i))){
                letter += character.toUpperCase();
            }
            else{
                letter += character;
            }
        }
        return letter;
    }
}
---------------------------------------------------------------------
public class NotePassing { 
      
    static final String S1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";  // coded
    static final String S2 = "hijklmnopqrstuvwxyzabcdefgHIJKLMNOPQRSTUVWXYZABCDEFG";  // decoded

    public static String decipher(String codedMessage){
        String decoded = "";
        for (char c : codedMessage.toCharArray()) {
          int idx = S1.indexOf(c);
          decoded += (idx >= 0) ? S2.charAt(idx) : c;
        }
        return decoded;
    }
}
---------------------------------------------------------------------
public class NotePassing {  
  public static String decipher(String codedMessage){
    if (codedMessage.equals("")){
      return "";
    }
    String result = "";
    String signs = "`~!@#$?%^&*()_+-=[]{}|;:,.<>/'\" ";
    String[] list = codedMessage.split("");
    for (String i: list){
      char character = i.charAt(0);
      int ascii = (int) character;
      // signs
      if (signs.contains(i)){
        result += i;
      }
      // abcdefghijklmnopqrs
      else if ((ascii >= 97 && ascii <= 115) || (ascii >= 65 && ascii <= 83)){
        ascii = ascii + 7;
        String str = new Character((char) ascii).toString();
        result += str;
      }
      // tuvwxyz
      else{
        ascii = ascii - 19;
        String str = new Character((char) ascii).toString();
        System.out.println(str + "-" + i);
        result += str;
      }
    }
    return result;
  }
}
--------------------------------------------------------------------
interface NotePassing {
  static String decipher(String codedMessage) {
    var text = new StringBuilder();
    for (char c : codedMessage.toCharArray()) {
      if (Character.isLetter(c)) {
        c += c < 'T' || c > '`' && c < 't' ? 7 : -19;
      }
      text.append(c);
    }
    return text.toString();
  }
}
----------------------------------------------------------------------
class NotePassing {
  static String decipher(String codedMessage) {
    var text = new StringBuilder();
    for (char c : codedMessage.toCharArray()) {
      if (Character.isLetter(c)) c += c > '@' && c < 'T' || c > '`' && c < 't' ? 7 : -19;
      text.append(c);
    }
    return text.toString();
  }
}
*/