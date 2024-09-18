/* 7KYU CodeWars Exclamation marks series #5: Remove all exclamation marks from the end of words

Task

Remove all exclamation marks from the end of words. Words are separated 
by a single space. There are no exclamation marks within a word.

Examples

remove("Hi!") === "Hi"
remove("Hi!!!") === "Hi"
remove("!Hi") === "!Hi"
remove("!Hi!") === "!Hi"
remove("Hi! Hi!") === "Hi Hi"
remove("!!!Hi !!hi!!! !hi") === "!!!Hi !!hi !hi"

*/
public class rAEP {
  public static String removeBang(String str) {
    return str.replaceAll("\\b!+", "");
  }
}
/*---------------------------------------------------------------------
public class R {
  public static String removeBang(String str) {
    return str.replaceAll("\\b!+", "");
  }
}
-----------------------------------------------------------------------
class R {
  static String removeBang(String str) {
    if(str.isEmpty()) return str;
    var words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      while (words[i].charAt(words[i].length() - 1) == '!') {
        words[i] = words[i].substring(0, words[i].length() - 1);
      }
    }
    return String.join(" ", words);
  }
}
-----------------------------------------------------------------------
public class R {
  public static String removeBang(String str) {
    String retStr = "";
    for(String s: str.split(" ")) {
      retStr += s.replaceAll("!+$","") + " ";
    }
    return retStr.trim();
  }
}
-----------------------------------------------------------------------
public class R {
  public static String removeBang(String str) {
    String[] arr_str = str.split(" ");
    StringBuilder sb = new StringBuilder();
    
    for(String strln : arr_str){
      sb.append(strln.replaceAll("!+$", "") + " ");
    }
      
    return sb.toString().trim();
  }
}
-----------------------------------------------------------------------
public class R {
  public static String removeBang(String str) {
    str+= " ";
    while(str.contains("! ")){
      str = str.replaceAll("! "," ");
    }
  return str.trim();
  }
}
-----------------------------------------------------------------------
public class R {
  public static String removeBang(String str) {
    if (str == null) {
      return str;
    }
    return str.replaceAll("\\b!+", "");
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class R {

    public static String removeBang(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.stream(str.split(" "))
                     .map(i -> rmWord(i))
                     .collect(Collectors.joining(" "));
    }
    
    private static String rmWord(String word) {
        if (word.endsWith("!")) {
            return rmWord(word.substring(0, word.length()-1));
        } else {
            return word;
        }
    }
}
*/