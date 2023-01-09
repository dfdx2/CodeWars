/* 8KYU CodeWars Correct the mistakes of the character recognition software

Character recognition software is widely used to digitise printed texts. 
Thus the texts can be edited, searched and stored on a computer.

When documents (especially pretty old ones written with a typewriter), 
are digitised character recognition softwares often make mistakes.

Your task is correct the errors in the digitised text. You only have 
to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.

*/

public class Correct {
  public static String correct(String string) {
    return string.replaceAll("5", "S").replaceAll("0", "O").replaceAll("1", "I");
  }
}


/*-------------------------------------------------------------------
public class CorrectMistakes {
  public static String correct(String string) {
    string = string.replaceAll("5","S");
    string = string.replaceAll("0","O");
    string = string.replaceAll("1","I");
    return string;
  }
}
---------------------------------------------------------------------
public class Correct {
  public static String correct(String string) {
    if(string ==null || string.isEmpty()) {
    return string;
    }
    
    string = string.replace("1","I").replace("0","O").replace("5","S");
  
    return string;
  }
}
-----------------------------------------------------------------------
public class Correct {
  public static String correct(String string) {
    return string.replaceAll("5","S")
                 .replaceAll("0","O")
                 .replaceAll("1","I");
            
  }
}
------------------------------------------------------------------------
public class Correct {
    public static String correct(String string) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            switch (c) {
                case '5':
                    result.append('S');
                    break;
                case '0':
                    result.append('O');
                    break;
                case '1':
                    result.append('I');
                    break;
                default:
                    result.append(c);
            }
        }

        return result.toString();
    }
}
---------------------------------------------------------------------
public class Correct {
  
  public static String correct(String string) {
    
    String[] stringLetters = string.split("");
    String answer = "";
    
    for (String s : stringLetters) {
      if (s.equals("5"))
        answer += "S";
      else if (s.equals("0"))
        answer += "O";
      else if (s.equals("1"))
        answer += "I";
      else
        answer += s;
    }
    
    return answer;
  }
}
---------------------------------------------------------------------
import java.util.HashMap;

public class Correct {
  public static String correct(String string) {
        String result = new String(string);
        HashMap<String, String> replaceMap = new HashMap<>();

        replaceMap.put("5", "S");
        replaceMap.put("0", "O");
        replaceMap.put("1", "I");

        for (var entry : replaceMap.entrySet()) {
            result = result.replace(entry.getKey(), entry.getValue());
        }

        return result;
  }
}
-----------------------------------------------------------------------
public class Correct {
  public static String correct(String string) {
    return string.codePoints().map(c -> c == '5' ? 'S' :
                                        c == '0' ? 'O' :
                                        c == '1' ? 'I' : c)
                              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                              .toString();
  }
}
-------------------------------------------------------------------
public class Correct {
  public static String correct(String string) {
    char[] chars = string.toCharArray();
    
    for (int i = 0; i < chars.length; i++) {
      switch (chars[i]) {
          case '5':
            chars[i] = 'S';
            break;
          case '0':
            chars[i] = 'O';
            break;
          case '1':
            chars[i] = 'I';
      }
    }
    
    return new String(chars);
  }
}


*/