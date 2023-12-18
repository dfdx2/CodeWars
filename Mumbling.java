/* 7KYU CodeWars Mumbling

This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.

*/

public class Accumul {
    
  public static String accum(String s) {
    StringBuilder sb = new StringBuilder();
    int counter = 1;
    s = s.toLowerCase();
    char[] worker = s.toCharArray();
    for (char ch : worker) {
      for (int i = 0; i < counter; i++) {
        if (i == 0) {
          sb.append(Character.toUpperCase(ch));
        }
        else {
          sb.append(Character.toLowerCase(ch));
        }
      }
      sb.append("-");
      counter++;
    }
    return sb.toString().substring(0,sb.length() - 1);
  }
}
/*-----------------------------------------------------------------------------
public class Accumul {
    
    public static String accum(String s) {
       
       char[] stringChar = s.toCharArray();
       StringBuilder mumbling = new StringBuilder();
       int counter = 1;

       for (char letter: stringChar) {
         for (int i = 0; i < counter; i++) {
           if (i == 0) {
             mumbling.append(Character.toUpperCase(letter));
           }
           else {
             mumbling.append(Character.toLowerCase(letter));
           }
         }
         mumbling.append('-');
         counter++;
       }
       return mumbling.toString().substring(0, mumbling.length()-1);
    }
}
------------------------------------------------------------------------------
public class Accumul {

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }
}
------------------------------------------------------------------------------
public class Accumul {
  public static String accum(String s) {
    StringBuilder bldr = new StringBuilder();
    int i = 0;
    for(char c : s.toCharArray()) {
      if(i > 0) bldr.append('-');
      bldr.append(Character.toUpperCase(c));
      for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
      i++;
    }
    return bldr.toString();
  }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
    public static String accum(String s) {
        var chars = s.split("");

        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));
    }
}
------------------------------------------------------------------------------
public class Accumul {
    
    public static String accum(String s) {
      String[] letters = s.toUpperCase().split("");
      for(int i = 0; i < letters.length; ++i){
        letters[i] += letters[i].toLowerCase().repeat(i);
      }
      return String.join("-", letters);
    }
}
-------------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {

    public static final String DELIMITER = "-";

    public static String accum(String input) {
        List<String> stringList = IntStream.range(0, input.length())
                .mapToObj(i -> duplicateCharFirstUpper(input.charAt(i), i + 1))
                .collect(Collectors.toList());

        return String.join(DELIMITER, stringList);
    }

    private static String duplicateCharFirstUpper(char c, int numberOfAppearances) {
        char upperCase = Character.toUpperCase(c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(upperCase);

        for (int i = 1; i < numberOfAppearances; i++) {
            stringBuilder.append(Character.toLowerCase(c));
        }

        return stringBuilder.toString();
    }
}
-------------------------------------------------------------------------------
public class Accumul {
    
    public static String accum(String s) {
        String result = "";
        for(int i = 0; i != s.length(); i++)
        {
            for(int j = 1; j != i+2; j++)
                result = result + (j == 1 ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i));
            result = result + (i != s.length()-1 ? '-' : "");
        }
        return result;
    }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Accumul {
    public static String accum(String s) {
    	return IntStream.range(0,s.length())
    					 .mapToObj(i->Stream.generate(()->s.charAt(i)).limit(i+1).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString())
    					 .map(a->a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase())
    					 .collect(Collectors.joining("-"));
    }
}
--------------------------------------------------------------------------------
public class Accumul {
    
    public static String accum(String s) {
      char[] charArray = s.toLowerCase().toCharArray();
      String str = "";
      for(int i = 0; i < charArray.length; i++){
          for(int k = 0; k < i+1; k++){
              if( k == 0){
                  str += Character.toUpperCase(charArray[i]);
              }
              else{
                  str += charArray[i];
              }
          }
          if(i != charArray.length-1){
              str+= "-";
          }
      }
      return str;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
    
    public static String accum(String s) {
       return IntStream.range(0, s.length())
                .mapToObj(i -> accumChar(s, i))
                .collect(Collectors.joining("-"));
    }
    
    public static String accumChar(String s, Integer index) {
        return IntStream.range(0, index + 1)
                .mapToObj(i -> i == 0 ? Character.toUpperCase(s.charAt(index)) : Character.toLowerCase(s.charAt(index)))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
*/